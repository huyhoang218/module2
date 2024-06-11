package services;

import models.modelClothing.Product;
import repositories.ProductRepository;
import services.iServiceClothing.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private static ProductService instance;
    private ProductRepository productRepository = ProductRepository.getInstance();

    private ProductService() {
    }

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
    public boolean checkStock(Product product) {
        if (product.getStock() > 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean addProduct(Product product) {
        productRepository.addProduct(product);
        return true;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void removeProduct(Product product) {
        productRepository.removeProduct(product);
    }

    @Override
    public boolean editProduct(String code, Product product) {
        for (Product p : productRepository.getAll()) {
            if (p.getCode().equals(code)) {
                if (product.getCode().equals(code)) {
                    productRepository.editProduct(product);
                    return true;
                }
            }
        }
        return false;
    }
}
