package com.tuhin.SpringDemoFirst.Service;

import com.tuhin.SpringDemoFirst.Model.Product;
import com.tuhin.SpringDemoFirst.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// File to create or store values

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),
//    new Product(102,"tshirt",1000),new Product(103,"pant",1000)));

//    private int returnInd(int prodId){
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if(products.get(i).getId() == prodId){
//                index = i;
//            }
//        }
//        return index;
//    }


    public List<Product> getProducts(){

        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProducts(Product prod){
        repo.save(prod);
    }

    public void setProducts(Product prod){
        repo.save(prod);
    }

    public void delProducts(int prodId){
        repo.deleteById(prodId);
    }
}
