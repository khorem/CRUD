package sn.ecpi.demo.service;

import sn.ecpi.demo.entity.Product;

import java.util.List;

public interface ProductServiceImpl {
    Product createProduct(Product product);

    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
