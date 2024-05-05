package sn.ecpi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ecpi.demo.entity.Product;


public interface ProductRepository extends JpaRepository <Product, Long> {
}
