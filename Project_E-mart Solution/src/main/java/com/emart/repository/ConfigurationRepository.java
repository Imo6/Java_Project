package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entities.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration,Integer> 
{

}
