package services;

import models.modelClothing.Product;
import repositories.ProductRepository;
import services.iServiceClothing.IProductService;

public class ProductService implements IProductService {
    private static ProductService instance;
    private ProductRepository productRepository = ProductRepository.getInstance();

    private ProductService() {}

    public synchronized static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductService();
        }
        return instance;
    }

    @Override
    public Product searchByCode(String code) {
        return productRepository.searchByCode(code);
    }

    @Override
    public boolean checkStock(String code) {
        return false;
    }

    @Override
    public boolean addProduct(Product product) {
        productRepository.addProduct(product);
        return true;
    }
}
