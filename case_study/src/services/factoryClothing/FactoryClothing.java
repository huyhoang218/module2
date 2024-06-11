package services.factoryClothing;

import services.ProductService;
import services.iServiceClothing.IProductService;

public class FactoryClothing {
    private FactoryClothing() {}
    public static IProductService getClothingService(TypeName name) {
        switch (name) {
            case SHIRT:
                return ProductService.getInstance();
            default:
                throw new IllegalArgumentException("Không có đối tượng được khởi tạo");
        }
    }
}
