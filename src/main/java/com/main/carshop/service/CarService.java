package com.main.carshop.service;

import com.main.carshop.model.Car;
import com.main.carshop.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void delete(Long id) {
        return carRepository.deleteById(id);
    }
}