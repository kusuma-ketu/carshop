package com.main.carshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.carshop.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {}