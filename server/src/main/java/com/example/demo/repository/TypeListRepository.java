package com.example.demo.repository;

import com.example.demo.entity.TypeList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface TypeListRepository extends JpaRepository<TypeList, Long> {
    
}