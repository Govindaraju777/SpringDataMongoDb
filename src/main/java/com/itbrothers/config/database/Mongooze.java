package com.itbrothers.config.database;

import org.mongeez.MongeezRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;

import com.mongodb.MongoClient;

@Configuration
//@ComponentScan(basePackages="com.itbrothers_test")
//@Profile({"env_developerPC","embeddedMongo","!test"})
@Profile("env_developerPC")
public class Mongooze {
	
	/*@Value("${spring.data.mongodb.host}")
    private String mongoHost;
	@Value("${spring.data.mongodb.port}")
    private int mongoPort;*/
	
	@Value("${spring.data.mongodb.database}")
	private String mongoTestDatabase;
	
	@Bean(name="mongeez")
	@Autowired
	public MongeezRunner test(MongoClient mongoClinet){
		//MongoClient mongoClinet = new MongoClient(mongoHost,mongoPort);
		
		MongeezRunner mongeezRunner = new MongeezRunner();
		mongeezRunner.setMongo(mongoClinet);
		mongeezRunner.setExecuteEnabled(true);
		mongeezRunner.setDbName(mongoTestDatabase);
		mongeezRunner.setFile(  new ClassPathResource("data/mongodb/integrationTest/mongeez_migrationScripts.xml"));
		return mongeezRunner;
		
	}
	
	
}
