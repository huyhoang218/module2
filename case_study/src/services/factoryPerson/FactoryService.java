package services.factoryPerson;

import services.iServices.IService;
import services.personService.EmployeeService;

public class FactoryService {
    private FactoryService() {
    }

    public static IService getService(TypeName nameService) {
        switch (nameService) {
            case EMPLOYEE:
                return EmployeeService.getInstance();
            default: {
                throw new IllegalArgumentException("Không có đối tượng được khởi tạo");
            }
        }
    }
}
