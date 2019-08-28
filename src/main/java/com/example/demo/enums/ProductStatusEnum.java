package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0,"Commodity shelves"),
    DOWN(1, "off the shelves ")
    ;

    private Integer code;

    private String message;
    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}


