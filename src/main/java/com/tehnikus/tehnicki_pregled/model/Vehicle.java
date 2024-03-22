package com.tehnikus.tehnicki_pregled.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "enum('CAR', 'MOTORCYCLE', 'TRAILER', 'TRUCK', 'TRACTOR')")
    @Enumerated(EnumType.STRING)
    private VehicleType type;

    @ManyToOne
    @JoinColumn(columnDefinition = "id")
    private User user;

    @ManyToOne
    @JoinColumn(columnDefinition = "id")
    private Brand brand;

    @Column(unique = true)
    private String numberPlatesOnVehicle;

    private Long enginePower;
    private Long cubicCapacity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getNumberPlatesOnVehicle() {
        return numberPlatesOnVehicle;
    }

    public void setNumberPlatesOnVehicle(String numberPlatesOnVehicle) {
        this.numberPlatesOnVehicle = numberPlatesOnVehicle;
    }

    public Long getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Long enginePower) {
        this.enginePower = enginePower;
    }

    public Long getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(Long cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
}
