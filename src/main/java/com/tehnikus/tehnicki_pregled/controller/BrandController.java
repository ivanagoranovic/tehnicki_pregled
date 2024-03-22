package com.tehnikus.tehnicki_pregled.controller;

import com.tehnikus.tehnicki_pregled.dto.BrandDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tehnikus.tehnicki_pregled.service.BrandService;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    private final BrandService brandService;


    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public ResponseEntity<BrandDto> createBrand(@RequestBody BrandDto dto){
        BrandDto brand = brandService.createBrand(dto);
        return new ResponseEntity<>(brand, HttpStatus.CREATED);

    }
}
