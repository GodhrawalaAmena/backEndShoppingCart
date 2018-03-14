package com.niit.configure;

import java.util.Properties;
import javax.activation.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.niit.")
@EnableTransactionManagement

public class applicationContextConfigure {
	
	@Bean(name="dataSource")
	public DataSource getH2DataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 
		try{
			
			dataSource.setUrl("");
			
			dataSource.setDriverClassName("");
			
			dataSource.setUsername("");
			
			dataSource.setPassword("");
		}
	}
	
	

}
