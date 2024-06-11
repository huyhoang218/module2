package controllers;

import services.factoryPerson.FactoryService;
import services.factoryPerson.TypeName;
import services.iServices.ICustomerService;
import views.CustomerView;

public class CustomerCotroller {
    CustomerView customerView = CustomerView.getInstance();
    ICustomerService customerService = (ICustomerService) FactoryService.getService(TypeName.CUSTOMER);

}
