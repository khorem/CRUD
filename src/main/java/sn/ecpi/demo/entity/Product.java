package sn.ecpi.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "products")
@NoArgsConstructor
@ToString

@Getter @Setter
public class Product {

    @Id
    @GeneratedValue

    private Long id;

    @Column (nullable = false)
    private String sku;

    @Column (nullable = false)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;

    @CreationTimestamp
    private LocalDateTime dateCreated;
    @CreationTimestamp
    private LocalDateTime lastUpdated;
}
