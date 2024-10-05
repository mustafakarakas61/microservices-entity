package com.mustafa.product_ms.controller;

import com.mustafa.product_ms.dto.ProductDTO;
import com.mustafa.product_ms.entity.Product;
import com.mustafa.product_ms.exception.ProductRuntimeException;
import com.mustafa.product_ms.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        if (id == null || id <= 0) {
            throw new ProductRuntimeException("Geçerli bir değer sağlanılmadı.");
        }
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());

        return productService.addProduct(product);
    }
}
