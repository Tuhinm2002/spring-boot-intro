package com.tuhin.SpringDemoFirst.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Product {

    private String name;
    @Id
    private int id;
    private int price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
