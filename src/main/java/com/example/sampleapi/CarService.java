package com.example.sampleapi;

import java.util.List;

public interface CarService {

    void saveCar(CarModel carModel);

    List<CarModel> getAll();
}
