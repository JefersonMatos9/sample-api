package com.example.sampleapi;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private static List<CarModel> carList = new ArrayList<>();

    public static void addCar(CarModel carModel){
        carList.add(carModel);
    }

    public static List<CarModel> getCarList(){
        return carList;
    }
}
