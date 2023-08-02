package com.example.shoppingmall.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Integer productID;
    private String productName;
    //private String imgUrl;
    private Integer price;
    private Integer stock;
    private String brand;


}
