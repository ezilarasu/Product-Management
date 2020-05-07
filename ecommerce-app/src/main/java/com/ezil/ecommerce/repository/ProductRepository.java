package com.ezil.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ezil.ecommerce.entity.Product;

@RepositoryRestResource()
public interface ProductRepository extends JpaRepository<Product, Long> {

}
