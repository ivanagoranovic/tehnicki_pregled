package com.tehnikus.tehnicki_pregled.dto;

import com.tehnikus.tehnicki_pregled.model.VehicleType;
import lombok.Data;

@Data
public class VehicleDto {

    private Long id;

    private VehicleType type;

    private String user;

    private String brand;

    private String numberPlatesOnVehicle;
    private Long enginePower;
    private Long cubicCapacity;
}
