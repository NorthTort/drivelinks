package com.example.drivelinks.repositories;

import com.example.drivelinks.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

    //We get the driver from the database by phone number
    Optional<Driver> findByPhone(Integer phone);
}
