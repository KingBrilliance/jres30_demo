package com.hundsun.jres3_demo.consumer.entity;

import lombok.Data;

@Data
public class Response<T>{
    private String message;
    private T data;
    private String code;


    private Response(){

    }

    public static<T> Response responseBySuccess(String message,T data){
        Response<T> response = new Response<T>();
        response.setData(data);
        response.setCode(200+"");
        response.setMessage(message);
        return response;
    }
}
