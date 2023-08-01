package com.example.shoppingmall.data.entity;

import com.example.shoppingmall.data.constant.Soldout;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString// (exclude="", "") // exclude한 값을 제외하고 출력을 할 수 있음
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productID; // Long을 쓰는 경우 많다. Long이 범위 더 넓음

    @Column(nullable = false)
    private String productName;

    @Lob // DB에서 255개 이상의 문자를 저장하고 싶을 때 지정, Large Object의 약자
    private String productDetail;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private String brand;

    @Column
    private Soldout isSoldout;

}
