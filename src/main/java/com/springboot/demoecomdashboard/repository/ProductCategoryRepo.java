package com.springboot.demoecomdashboard.repository;

import com.springboot.demoecomdashboard.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "productCategoryRepo")
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long> {
    List<ProductCategory> findByBestCategory(boolean bestCategory);
}
