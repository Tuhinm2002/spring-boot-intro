package com.tuhin.SpringDemoFirst.Controller;

import com.tuhin.SpringDemoFirst.Model.Product;
import com.tuhin.SpringDemoFirst.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
//        System.out.println(prod.toString());
        service.addProducts(prod);
    }

    @PutMapping("/products")
    public void setProducts(@RequestBody Product prod){
        service.setProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void delProducts(@PathVariable int prodId){
        service.delProducts(prodId);
    }
}
