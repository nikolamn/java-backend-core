package com.niko.wiring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// spring boot automatically (because of the @ComponentScan (which is included
// in @SBApplication)) @binds properties from application.properties 
// or application.yml into POJO
//
@Component
@ConfigurationProperties(prefix = "app.greeting")
public class GreetingProperties {
	
	// default value used if property is not set
	private String prefix = "Hello";

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}


