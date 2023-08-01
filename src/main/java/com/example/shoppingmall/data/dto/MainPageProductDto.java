package com.example.shoppingmall.data.dto;

import com.example.shoppingmall.data.constant.Soldout;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainPageProductDto {
    private Integer productID;
    private String productName;
    private String productDetail;
    private String imgUrl;
    private Integer price;
    private String brand;
    private Soldout isSoldout;

}
