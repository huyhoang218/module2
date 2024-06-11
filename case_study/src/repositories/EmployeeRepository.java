package repositories;
import models.modelPerson.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static final String SRC_EMPLOYEE = "C:\\codegym\\module2\\session\\case_study\\src\\data\\employees.csv";
    private static List<Employee> employees = new ArrayList<>();
    private static EmployeeRepository instance;

    private EmployeeRepository() {
        readEmployee();
    }

    public synchronized static EmployeeRepository getInstance() {
        if (instance == null) {
            instance = new EmployeeRepository();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        writeEmployee(employee, true);
    }

    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }

    public Employee searchById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
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
        writeAllEmployee(employees, false);
    }

    public void editEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.set(i, employee);
                break;
            }
        }
        writeAllEmployee(employees, false);
    }

    private void writeEmployee(Employee employee, boolean append) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(SRC_EMPLOYEE, append))) {
            bufferedWriter.write(employee.toString());
            bufferedWriter.newLine();
        } catch (IOException exception) {
            System.err.println("Lỗi ghi file");
        }
    }

    private void writeAllEmployee(List<Employee> employees, boolean append) {
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

    public List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(SRC_EMPLOYEE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                employeeList.add(new Employee(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), temp[3], Double.parseDouble(temp[4].replace(",", "."))));

            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tìm thấy");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        }
        return employeeList;
    }

}
