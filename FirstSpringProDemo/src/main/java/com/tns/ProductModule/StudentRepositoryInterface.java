package com.tns.ProductModule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryInterface extends JpaRepository<Student, Integer> 
{
}