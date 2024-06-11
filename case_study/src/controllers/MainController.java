package controllers;

import models.User;
import models.modelClothing.Product;
import models.modelPerson.Employee;
import services.ProductService;
import services.factoryPerson.FactoryService;
import services.iServiceClothing.IProductService;
import services.iServices.IEmployeeService;
import services.factoryPerson.TypeName;
import services.exception.InvalidNameException;
import services.userService.UserService;
import views.*;

import java.util.List;

public class MainController {
    public static void main(String[] args) {
        ManagerView managerView = ManagerView.getInstance();
        EmployeeView employeeView = EmployeeView.getInstance();
        IEmployeeService employeeService = (IEmployeeService) FactoryService.getService(TypeName.EMPLOYEE);
        ProductView productView = ProductView.getInstance();
        IProductService productService = ProductService.getInstance();
        UserView userView = UserView.getInstance();
        UserService userService = UserService.getInstance();

        Employee employee;
        List<Employee> employees;
        Product product;
        List<Product> products;
        User user;

        int choose = userView.view();

        switch (choose) {
            case 1: {
                boolean isRegister = false;
                do {
                    try {
                        user = userView.registerView();
                        isRegister = userService.registerUser(user);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
                } while (!isRegister);
                employeeView.showNotification(true);
            }
            case 2: {
                boolean isLogin = false;
                int count = 0;
                do {
                    count++;
                    try {
                        user = userView.loginView();
                        isLogin = userService.loginUser(user);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
                } while (!isLogin && count < 3);

                if (!isLogin) {
                    employeeView.showNotification(false);
                    return;
                } else {
                    employeeView.showNotification(true);
                }
                break;
            }
            case 0:
                return;
        }

        int option = managerView.managerView();

        int choice;
        int id;
        String name;
        boolean result = false;

        switch (option) {
            case 1: {
                while (true) {
                    choice = employeeView.view();
                    switch (choice) {
                        case 1: {
                            employee = employeeView.viewOperation();
                            try {
                                result = employeeService.add(employee);
                            } catch (InvalidNameException | RuntimeException e) {
                                System.err.println(e.getMessage());
                            }
                            employeeView.showNotification(result);
                            break;
                        }
                        case 2: {
                            id = employeeView.inputID();
                            employee = employeeService.searchById(id);
                            if (employee == null) {
                                employeeView.showNotification(false);
                            } else {
                                do {
                                    employee = employeeView.viewOperation();
                                    try {
                                        result = employeeService.editEmployee(id, employee);
                                    } catch (InvalidNameException | RuntimeException e) {
                                        System.err.println(e.getMessage());
                                    }
                                    employeeView.showNotification(result);
                                } while (!result);
                            }
                            break;
                        }
                        case 3: {
                            id = employeeView.inputID();
                            employee = employeeService.searchById(id);

                            if (employee == null) employeeView.showNotification(false);
                            else {
                                boolean isConfirm = employeeView.confirmDelete(employee);
                                if (isConfirm) {
                                    employeeService.removeEmployee(employee);
                                    employeeView.showNotification(true);
                                }
                            }
                            break;
                        }
                        case 4: {
                            employees = employeeService.getAll();
                            employeeView.displayAllEmployee(employees);
                            break;
                        }
                        case 5: {
                            name = employeeView.inputName();
                            employees = employeeService.searchByName(name);
                            if (employees.isEmpty())
                                employeeView.showNotification(false);
                            else {
                                employeeView.displayAllEmployee(employees);
                                employeeView.showNotification(true);
                            }
                            break;
                        }
                        case 0:
                            break;
                    }
                }
            }
            case 2: {
                while (true) {
                    choice = productView.view();
                    switch (choice) {
                        case 1: {
                            product = productView.viewOperation();
                            result = productService.addProduct(product);
                            employeeView.showNotification(result);
                            break;
                        }
                        case 2: {
                            String code = productView.inputCode();
                            product = productService.searchByCode(code);
                            if (product == null) {
                                employeeView.showNotification(false);
                            } else {
                                product = productView.viewOperation();
                                result = productService.editProduct(code, product);
                                employeeView.showNotification(result);
                            }
                            break;
                        }
                        case 3: {
                            String code;
                            code = productView.inputCode();
                            product = productService.searchByCode(code);

                            if (product == null) employeeView.showNotification(false);
                            else {
                                boolean isConfirm = productView.confirmDelete(product);
                                if (isConfirm) {
                                    productService.removeProduct(product);
                                    employeeView.showNotification(true);
                                }
                            }
                            break;
                        }
                        case 4: {
                            products = productService.getAll();
                            productView.displayAllProduct(products);
                            break;
                        }
                        case 5: {
                            String code = productView.inputCode();
                            product = productService.searchByCode(code);

                            if (product == null) {
                                employeeView.showNotification(false);
                            } else {
                                boolean isStock = productService.checkStock(product);
                                if (isStock) {
                                    productView.showStockProduct(product);
                                } else {
                                    productView.productSoldOut(product);
                                }
                            }
                            break;
                        }
                        case 0:
                            break;
                    }
                }
            }
            case 0:
                return;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
    }
}
