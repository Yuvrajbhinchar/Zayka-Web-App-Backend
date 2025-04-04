package com.zayka.Zayka.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@Document
public class User {
   @Id
   private Object userId;
   @Indexed(unique = true)
   private String username;
   private String password;
   private String email;
   private String role;
   private String gender;
   private Address addressId;
   private Map<String, String> defaultAddressId;
   private String contact;
   private Date DOB;
   private String picture;
   private List<String> orderdId;
   private boolean enabled = true;
   private LocalDateTime createdAt;
   private LocalDateTime updatedAt;


}

