package com.Vitech.Sprint_3Lab04.service;

import com.Vitech.Sprint_3Lab04.entity.Car;

import java.util.List;

public interface CarService {

     List<Car> findAll();

     Car finById(int id , Car car);

     Car save(Car car);

     String delete(int id);

     Car update(int id , Car car);

}
