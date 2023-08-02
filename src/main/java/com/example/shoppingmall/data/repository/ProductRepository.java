package com.example.shoppingmall.data.repository;

import com.example.shoppingmall.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findById(int number);

    Optional<List<Product>> findAllByBrand(String brand);

    //Page<MainPageProductDto> getMainProductPage();
}
