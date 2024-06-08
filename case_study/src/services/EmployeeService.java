package services;

import models.Employee;
import repositories.EmployeeRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    public static final String REGEX_NAME =
            "^[A-ZÁÀÃẢẠĂẮẰẴẲẶÂẤẦẪẨẬĐÉÈẼẺẸÊẾỀỄỂỆÍÌĨỈỊÓÒÕỎỌÔỐỒỖỔỘƠỚỜỠỞỢÚÙŨỦỤƯỨỪỮỬỰÚÙŨỦỤƯỨỪỮỬỰÝỲỸỶỴ]" +
            "[a-záàãảạăắằẵẳặâấầẫẩậđéèẽẻẹêếềễểệíìĩỉịóòõỏọôốồỗổộơớờỡởợúùũủụưứừữửựúùũủụưứừữửựýỳỹỷỵ]+" +
            "(\\s[A-ZÁÀÃẢẠĂẮẰẴẲẶÂẤẦẪẨẬĐÉÈẼẺẸÊẾỀỄỂỆÍÌĨỈỊÓÒÕỎỌÔỐỒỖỔỘƠỚỜỠỞỢÚÙŨỦỤƯỨỪỮỬỰÚÙŨỦỤƯỨỪỮỬỰÝỲỸỶỴ]" +
            "[a-záàãảạăắằẵẳặâấầẫẩậđéèẽẻẹêếềễểệíìĩỉịóòõỏọôốồỗổộơớờỡởợúùũủụưứừữửựúùũủụưứừữửựýỳỹỷỵ]*){0,24}$";
    private EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
    private static EmployeeService instance;

    private EmployeeService() {}

    public synchronized static EmployeeService getInstance() {
        if (instance == null) {
            instance = new EmployeeService();
        }
        return instance;
    }
    @Override
    public boolean add(Employee employee) {

        for (Employee e : employeeRepository.getAll()) {
            if (e.getId() == employee.getId())
                return false;
        }

        if (employee.getName().matches(REGEX_NAME)) {
            employeeRepository.addEmployee(employee);
        } else {
            return false;
        }

        return true;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public Employee searchById(int code) {
        return employeeRepository.searchById(code);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeRepository.removeEmployee(employee);
    }

    @Override
    public boolean editEmployee(Employee employee) {

        for (Employee e : employeeRepository.getAll()) {
            if (e.getId() == employee.getId() && employee.getName().matches(REGEX_NAME)) {
                employeeRepository.editEmployee(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> searchByName(String name) {
        List<Employee> employees = getAll();
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        int left = 0;
        int right = employees.size() - 1;
        List<Employee> result = new ArrayList<>();

        while (left <= right) {
            int mid = (left + right) / 2;
            if (employees.get(mid).getName().contains(name)) {
                result.add(employees.get(mid));
                return result;
            } else if (employees.get(mid).getName().compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
