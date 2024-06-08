package controllers;

import models.Employee;
import services.FactoryService;
import services.IEmployeeService;
import services.TypeName;
import views.EmployeeView;
import views.ManagerView;

import java.util.List;

public class MainController {
    public static void main(String[] args) {
        ManagerView managerView = ManagerView.getInstance();
        EmployeeView employeeView = EmployeeView.getInstance();
        IEmployeeService employeeService = (IEmployeeService) FactoryService.getService(TypeName.EMPLOYEE);

        Employee employee;
        List<Employee> employees;

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
                            result = employeeService.add(employee);
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
                                    try {
                                        employee = employeeView.viewOperation();
                                        result = employeeService.editEmployee(id, employee);
                                        employeeView.showNotification(result);
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("Nhập thông tin không hợp lệ");
                                    }

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
                            if (name.isEmpty())
                                employeeView.showNotification(false);
                            else {
                                employeeView.displayAllEmployee(employees);
                                employeeView.showNotification(true);
                            }
                            break;
                        }
                        case 0:
                            return;
                        default:
                            throw new IllegalStateException("Unexpected value: " + choice);
                    }
                }
            }
            case 2:
            case 3:
            default:
        }
    }
}
