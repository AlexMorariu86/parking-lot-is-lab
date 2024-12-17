package com.parking.parkinglot.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.PrimitiveIterator;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String licensePlate;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    private String parkingSpot;

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    private Collection<Car> cars;

    @OneToMany(mappedBy = "owner")
    public Collection<Car> getCars(){
        return cars;
    }

}