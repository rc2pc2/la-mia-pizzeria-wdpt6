package org.lessons.java.wdpt6.pizzeria.la_mia_pizzeria.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pizzas")
public class Pizza implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;
    
    @Lob
    private String description;
    
    @Lob
    private String imageUrl;

    @NotNull
    private float price;

    public Pizza(){}

    public Integer getId(){
        return this.id;
    }
    
    public float getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public String getImageUrl(){
        return this.imageUrl;
    }

    public void setId(Integer id){
        this.id = id;
    }
    
    public void setPrice(float price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

}
