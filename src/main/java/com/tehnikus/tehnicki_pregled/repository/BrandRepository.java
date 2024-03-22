package com.tehnikus.tehnicki_pregled.repository;

import com.tehnikus.tehnicki_pregled.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
