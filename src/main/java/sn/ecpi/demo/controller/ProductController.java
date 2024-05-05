package sn.ecpi.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.ecpi.demo.entity.Product;
import sn.ecpi.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor

public class ProductController {

    private ProductService productService;

    // Create
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    // Read
    @GetMapping("read/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Update
    @PutMapping("update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // Delete
    @DeleteMapping("delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
