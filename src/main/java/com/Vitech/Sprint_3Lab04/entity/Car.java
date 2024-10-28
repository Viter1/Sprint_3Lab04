package com.Vitech.Sprint_3Lab04.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // usa AUTO_INCREMENT en lugar de secuencia
    private Integer id;
    private String brand;
    private String model;
    private Integer milleage;
    private Double price;
    private Integer year;
    private String description;
    private String colour;
    private String fuelType;
    private Integer numDoors;

}
