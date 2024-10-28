package com.Vitech.Sprint_3Lab04.repository;

import com.Vitech.Sprint_3Lab04.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {



}
