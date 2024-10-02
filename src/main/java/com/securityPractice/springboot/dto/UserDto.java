package com.securityPractice.springboot.dto;

import jakarta.persistence.Entity;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private String name;
    private String mobileNumber;
    private String email;
    private String password;
    private String role;
}
