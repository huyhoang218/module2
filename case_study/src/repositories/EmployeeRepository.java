package repositories;

import models.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static final String SRC_EMPLOYEE = "C:\\codegym\\module2\\session\\case_study\\src\\data\\employees.csv";
    private static List<Employee> employees = new ArrayList<>();
    private static EmployeeRepository instance;

    private EmployeeRepository() {}

    public synchronized static EmployeeRepository getInstance() {
        if (instance == null) {
            instance = new EmployeeRepository();
        }
        return instance;
    }
    static {
        employees.add(new Employee(1, "Hoang", 18, "Nam Dinh", 29));
        employees.add(new Employee(2, "Huy", 20, "Ha Noi", 30));
        employees.add(new Employee(3, "Dao", 17, "HCM", 28));
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        writeFile(employees, false);
    }

    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }

    public Employee searchById(int code) {
        for (Employee employee : employees) {
            if (employee.getId() == code) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.remove(i);
                break;
            }
        }
        writeFile(employees, false);
    }

    public void editEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.set(i, employee);
                break;
            }
        }
        writeFile(employees, false);
    }

    private void writeFile(List<Employee> employees, boolean append) {
        File file = new File(SRC_EMPLOYEE);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (Employee employee : employees) {
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException exception) {
            System.err.println("Lỗi ghi File");
        }
    }

}
