package com.tehnikus.tehnicki_pregled.mapper;

import com.tehnikus.tehnicki_pregled.dto.BrandDto;
import com.tehnikus.tehnicki_pregled.model.Brand;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandMapper {

    public BrandDto modelToDto(Brand brand);
    public Brand dtoToModel(BrandDto dto);

}
