package com.example.shatter.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")

public class PruebaController {


    @GetMapping("/Salida")
   public String Salida(){

       return "HolaInnuendo";
   }
}
