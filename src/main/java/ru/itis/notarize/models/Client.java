package ru.itis.notarize.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client extends User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String fullName;
    private String city;
    private Integer age;

    public Client(String username,
                  String password,
                  Role role,
                  String fullName,
                  String city,
                  Integer age) {
        super(username, password, role);
        this.fullName = fullName;
        this.city = city;
        this.age = age;
    }
}