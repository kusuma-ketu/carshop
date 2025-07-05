package com.main.carshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.carshop.model.Car;
import com.main.carshop.repository.CarRepository;

@Service 
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }
}