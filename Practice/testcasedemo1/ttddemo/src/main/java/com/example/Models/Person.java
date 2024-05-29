package com.example.Models;
import lombok.Data;

@Data 
public class Person {
    private String name;
    private String phone_no;
    private String email;
    private Address addr;
} 
