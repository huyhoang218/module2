package services.iServiceClothing;

import models.modelClothing.Product;

import java.util.List;

public interface IProductService<T extends Product>{
    T searchByCode(String code);

    boolean checkStock(T product);

    boolean addProduct(T product);

    List<T> getAll();

    void removeProduct(T product);

    boolean editProduct(String code, T product);
}
