package sn.ecpi.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.ecpi.demo.entity.Product;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod(){
        //create product
        Product product = new Product();
        product.setName("product 1");
        product.setDescription("product 1 description");
        product.setSku("100ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");

        //save product
        Product savedObject = productRepository.save(product);

        //display product info
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());
    }

    @Test
    void updateUsingSaveMethod(){
        // find oe retrieve an entity by id
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        //update entity information
        product.setName("updated product 1");
        product.setDescription("updated product 1 desc");

        //save updated entity
        productRepository.save(product);
    }

    @Test
    void findByIdMethod(){
        Long id = 1L;

        Product product = productRepository.findById(id).get();
    }

    @Test
    void saveAllMethod(){

        //create product
        Product product = new Product();
        product.setName("product 2");
        product.setDescription("product 2 description");
        product.setSku("100ABCD");
        product.setPrice(new BigDecimal(200));
        product.setActive(true);
        product.setImageUrl("product2.png");

        //create product
        Product product3 = new Product();
        product.setName("product 3");
        product.setDescription("product 3 description");
        product.setSku("100ABCDE");
        product.setPrice(new BigDecimal(300));
        product.setActive(true);
        product.setImageUrl("product3.png");

        productRepository.saveAll(List.of(product, product3));

    }

    @Test
    void findAllMethod(){

        List<Product> products = productRepository.findAll();

        products.forEach((p) ->{
            System.out.println(p.getName());
        });
    }

    @Test
    void deleteByIdMethod(){
        Long id = 1L;

        productRepository.deleteById(id);
    }

    @Test
    void deleteMethod(){
        //find an entity by id
        Long id = 2L;
        Product product = productRepository.findById(id).get();

        //delete(entity)
        productRepository.delete(product);
    }
}