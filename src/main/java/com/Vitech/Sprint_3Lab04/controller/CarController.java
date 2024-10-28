package com.Vitech.Sprint_3Lab04.controller;

import com.Vitech.Sprint_3Lab04.entity.Car;
import com.Vitech.Sprint_3Lab04.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    List<Car> carList = new ArrayList<>();








    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAll(){
        return ResponseEntity.ok().body(carService.findAll());
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getById(@PathVariable int id , @RequestBody Car car){
        return ResponseEntity.ok().body(carService.finById(id,car));
    }

    @PostMapping("/addCar")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        return ResponseEntity.ok().body(carService.save(car));
    }

    @DeleteMapping("/deleteCar/{id}")
    public ResponseEntity<String> deleteById (@PathVariable int id){
        return ResponseEntity.ok().body(carService.delete(id));
    }

    @PutMapping("/updateCar/{id}")
    public ResponseEntity<Car> updateById(@PathVariable int id,@RequestBody Car car){
        return ResponseEntity.ok().body(carService.update(id,car));
    }

    @PutMapping("/test")
    public ResponseEntity<Car> listadoCocheEjemplo(){
        Car carTest = new Car();
        carTest.setId(1);
        carTest.setBrand("Toyota");
        carTest.setModel("Auris");
        carTest.setMilleage(100000);
        carTest.setPrice(16000.99);
        carTest.setYear(2016);
        carTest.setDescription("mu bonito");
        carTest.setColour("White");
        carTest.setFuelType("Gasolina");
        carTest.setNumDoors(4);


        carList.add(carTest);
        return ResponseEntity.ok().body(carService.save(carTest));
    }



}
