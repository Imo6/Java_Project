package com.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.entities.Configuration;
import com.emart.services.ConfigurationManager;

@RestController  
@CrossOrigin("http://localhost:3000")
public class ConfigurationController
{
	@Autowired
	ConfigurationManager manager;
	
	
	 @GetMapping(value = "api/configurations")
	 public List<Configuration> getConfigurations()
	 {
		  return manager.getConfigurations(); 
		
	 }
	
	 @GetMapping(value = "api/configurationById/{cid}")
	 public Optional<Configuration> getConfiguration(@PathVariable int cid)
	 {
		Optional<Configuration> c=manager.getConfiguration(cid);
		return c;
	 }
	 

	 @DeleteMapping(value = "api/configurations/{cid}")
	 public void removepro(@PathVariable int cid)
	 {
		manager.delete(cid);
	 }

	 @PostMapping(value = "api/configurations")
	 public void addConfiguration(@RequestBody Configuration config)
	 {
		System.out.println("addconfig called");
		manager.addConfiguration(config);
	 }
}