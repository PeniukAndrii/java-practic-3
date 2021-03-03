package com.example.javapractic3.dao;


import com.example.javapractic3.models.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberDAO extends JpaRepository<Number,Integer> {

}
