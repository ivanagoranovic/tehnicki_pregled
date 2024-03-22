package com.tehnikus.tehnicki_pregled.dto;

import com.tehnikus.tehnicki_pregled.model.VehicleType;

public record VehicleDto(
        Long id,
        VehicleType type,
        String user,
        String brand,
        String numberPlatesOnVehicle,
        Long enginePower,
        Long cubicCapacity
) {


}
