package com.Vitech.Sprint_3Lab04.service.impl;

import com.Vitech.Sprint_3Lab04.entity.Car;
import com.Vitech.Sprint_3Lab04.repository.CarRepository;
import com.Vitech.Sprint_3Lab04.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;




    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car finById(int id , Car car) {
        Optional<Car> existingProduct = carRepository.findById(id);

        if (existingProduct.isPresent()){
            car.setId(id);
            return car;
        }
        return null;
    }

    @Override
    public Car save(Car car){
        return carRepository.save(car);
    }

    @Override
    public String delete(int id){
        carRepository.deleteById(id);
        return "Product " + id + " deleted successfully";
    }


    @Override
    public Car update(int id , Car car){
        Optional<Car> existingProduct = carRepository.findById(id);

        if (existingProduct.isPresent()){
            car.setId(id);
            return carRepository.save(car);
        }
        return null;
    }
}
