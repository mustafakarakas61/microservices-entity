package com.mustafa.product_ms.repository;

import com.mustafa.product_ms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
