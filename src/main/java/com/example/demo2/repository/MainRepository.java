package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.MainModel;

public interface MainRepository extends JpaRepository<MainModel,Long>{
    
}
