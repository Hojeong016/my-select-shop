package com.sparta.myselectshop.exception;

public class ProductNotFoundException extends RuntimeException{

    //부모로 메세지 전달
    public ProductNotFoundException(String message) {
        super(message);
    }

}