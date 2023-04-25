package com.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.entities.Configuration;
import com.emart.repository.ConfigurationRepository;
@Service
public class ConfigurationManagerImpl implements ConfigurationManager
{
	@Autowired
	ConfigurationRepository repository;
	
	@Override
	public void  addConfiguration(Configuration c)
	{
		repository.save(c);
		
		
	}
	@Override
	public List<Configuration> getConfigurations() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
		
	}
	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	@Override
	public Optional<Configuration> getConfiguration(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
}
