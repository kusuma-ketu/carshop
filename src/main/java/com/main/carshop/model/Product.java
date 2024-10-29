package com.main.carshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistene.Id;

@Entity
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
}

publc void setName(string name) {
    this.name = name;
}
public void setDescription(string description) {
    this.description = description;
}
public void setPrice(int price) {
    this.price = price;
}
public Long getId() {
    return this.id;
}
public string getName() {
    return this.name;
}
public string getDescription() {
    return this.description;
}
public double getPrice() {
    return this.price;
}