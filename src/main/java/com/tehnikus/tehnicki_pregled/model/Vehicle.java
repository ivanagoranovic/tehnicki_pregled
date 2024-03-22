package com.tehnikus.tehnicki_pregled.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
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

}
