package dev.keerthana.productcatalogservice.controllers;

import dev.keerthana.productcatalogservice.services.myFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myFirstController
{
myFirstService MyFirstService ;
public myFirstController(myFirstService MyFirstService)
{
    this.MyFirstService = MyFirstService;
}
@GetMapping("/")
public String sayHi()
{
    return "hey ";
}
}
