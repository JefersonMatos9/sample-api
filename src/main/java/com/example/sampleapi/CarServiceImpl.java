package com.example.sampleapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public void saveCar(CarModel carModel) {
        CarRepository.addCar(carModel);
    }

    @Override
    public List<CarModel> getAll() {
        return CarRepository.getCarList();
    }
}
