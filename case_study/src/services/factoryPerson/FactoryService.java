package services.factoryPerson;

import services.iServices.IService;
import services.personService.CustomerService;
import services.personService.EmployeeService;

public class FactoryService {
    private FactoryService() {}

    public static IService getService(TypeName nameService) {
        switch (nameService) {
            case EMPLOYEE:
                return EmployeeService.getInstance();
            case CUSTOMER:
                return CustomerService.getInstance();
            default: {
                throw new IllegalArgumentException("Không có đối tượng được khởi tạo");
            }
        }
    }
}
