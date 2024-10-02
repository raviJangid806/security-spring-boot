package com.securityPractice.springboot.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mobileNumber;
    @Column(unique = true)
    private String email;

    @OneToOne(mappedBy = "user")
    private Login login;
}
