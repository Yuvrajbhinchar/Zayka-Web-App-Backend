package com.zayka.Zayka.entity;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

public class Restaurant {

    @Id
    private Object restaurantId;
    private String ownerId;
    private String restaurantName;
    private String restaurantImage;
    private List<String> cuisineType;
    private String description;
    private String contact;
    private String email;
    private String addressId;
    private Map<String , Map<String,String>> openingHoures;

}
