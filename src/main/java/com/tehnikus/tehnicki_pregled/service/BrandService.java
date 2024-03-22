package com.tehnikus.tehnicki_pregled.service;

import com.tehnikus.tehnicki_pregled.dto.BrandDto;
import com.tehnikus.tehnicki_pregled.mapper.BrandMapper;
import com.tehnikus.tehnicki_pregled.model.Brand;
import com.tehnikus.tehnicki_pregled.repository.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandService {

    private final BrandMapper brandMapper;
    private final BrandRepository brandRepository;

    public BrandService(BrandMapper brandMapper, BrandRepository brandRepository) {
        this.brandMapper = brandMapper;
        this.brandRepository = brandRepository;
    }

    public BrandDto createBrand(BrandDto dto) {
        Brand brand = brandMapper.dtoToModel(dto);
        brandRepository.save(brand);
        return brandMapper.modelToDto(brand);
    }
}
