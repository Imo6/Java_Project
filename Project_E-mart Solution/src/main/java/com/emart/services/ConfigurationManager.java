package com.emart.services;

import java.util.List;
import java.util.Optional;

import com.emart.entities.Configuration;

public interface ConfigurationManager
{
	void addConfiguration(Configuration c);
	List<Configuration> getConfigurations();
	void delete(int id);
	Optional<Configuration> getConfiguration(int id);

}
