package com.tehnikus.tehnicki_pregled.mapper;

import com.tehnikus.tehnicki_pregled.dto.VehicleDto;
import com.tehnikus.tehnicki_pregled.model.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
    @Mapping(target = "type", expression = "java(vehicle.getType())")
    @Mapping(target = "user", expression = "java(vehicle.getUser().getUsername())")
    @Mapping(target = "brand", expression = "java(vehicle.getBrand().getName())")
    public VehicleDto modelToDto(Vehicle vehicle);

    @Mapping(target = "type", source = "dto.type")
    @Mapping(target = "user.username", source = "dto.user")
    @Mapping(target = "brand.name", source = "dto.brand")
    public Vehicle dtoToModel(VehicleDto dto);
}
