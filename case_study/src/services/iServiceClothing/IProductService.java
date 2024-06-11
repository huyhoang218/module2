package services.iServiceClothing;

import models.modelClothing.Product;

public interface IProductService<T extends Product>{
    T searchByCode(String code);
    boolean checkStock(String code);
    boolean addProduct(T product);
}
