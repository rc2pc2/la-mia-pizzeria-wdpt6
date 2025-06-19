package org.lessons.java.wdpt6.pizzeria.la_mia_pizzeria.controller;

import java.util.Optional;

import org.lessons.java.wdpt6.pizzeria.la_mia_pizzeria.model.Pizza;
import org.lessons.java.wdpt6.pizzeria.la_mia_pizzeria.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
    
    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public String index(Model model){
        model.addAttribute("pizzas", pizzaRepository.findAll());
        return "pizzas/index";
    }
    
    @GetMapping("/{id}")
    public String show(@PathVariable(name = "id") Integer id, Model model){
        //  Optional<Pizza> pizzaAttempt = pizzaRepository.findById(id);
        //  Pizza pizza = pizzaAttempt.get();
        Pizza pizza = pizzaRepository.findById(id).get();
        model.addAttribute("pizza", pizza);
        return "pizzas/show";
    }
}
