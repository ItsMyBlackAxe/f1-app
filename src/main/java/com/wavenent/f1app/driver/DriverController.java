package com.wavenent.f1app.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/drivers")
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping
    public List<Driver> getDrivers (){
        return this.driverService.getDrivers();
    }

    @PostMapping
    public List<Driver> createDriver (@RequestBody List<Driver> driver){
        return this.driverService.createDriver(driver);

    }
}
