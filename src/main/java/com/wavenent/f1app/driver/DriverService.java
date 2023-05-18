package com.wavenent.f1app.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public List<Driver> getDrivers() {
        return driverRepository.findAll();
    }

    public List<Driver> createDriver(List<Driver> driver) {
        return driverRepository.saveAll(driver);
    }
}
