package org.version_release;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/com/acme/app.properties")
public class AppConfig {

}
