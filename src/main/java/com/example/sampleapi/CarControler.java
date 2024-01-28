package com.example.sampleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.LineNumberInputStream;
import java.util.List;

@RestController
public class CarControler {

    @Autowired
    private CarService service;

    @GetMapping("car")
    public ResponseEntity<List<CarModel>> getAll(){
        List<CarModel> carList = service.getAll();
        return ResponseEntity.ok(carList);
    }

    @PostMapping("car")
    public ResponseEntity<Void> saveCar(@RequestBody CarModel carModel){
        service.saveCar(carModel);
        return ResponseEntity.ok().build();
    }
}
