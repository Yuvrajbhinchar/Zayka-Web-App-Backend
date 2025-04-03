package com.zayka.Zayka.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    @Id
    private Object addressId;
    private String houseNumber;
    private String Street;
    private String city;
    private String state;
    private String postalCode;
    private String countery;

}
