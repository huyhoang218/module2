package services;

public class FactoryService {
    private FactoryService() {}

    public static IService getService(TypeName nameService) {
        switch (nameService) {
            case EMPLOYEE:
                return EmployeeService.getInstance();
            case CUSTOMER:

            default: {
                throw new IllegalArgumentException("Không có đối tượng được khởi tạo");
            }
        }
    }
}
