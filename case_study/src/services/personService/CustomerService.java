package services.personService;

import models.modelPerson.Customer;
import services.exception.InvalidNameException;
import services.iServices.ICustomerService;

import java.util.List;

public class CustomerService
        implements ICustomerService
{
    private static CustomerService instance;

    private CustomerService() {}

    public synchronized static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }
    @Override
    public boolean add(Customer employee) throws InvalidNameException {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public Customer searchById(int code) {
        return null;
    }

    @Override
    public void removeEmployee(Customer employee) {

    }

    @Override
    public boolean editEmployee(int id, Customer newEmployee) throws InvalidNameException {
        return false;
    }

    @Override
    public List<Customer> searchByName(String name) {
        return List.of();
    }
}
