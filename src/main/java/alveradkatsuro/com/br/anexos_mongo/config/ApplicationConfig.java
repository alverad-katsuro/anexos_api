package alveradkatsuro.com.br.anexos_mongo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import alveradkatsuro.com.br.anexos_mongo.config.properties.CorsProperties;

@Configuration
@EnableConfigurationProperties(value = { CorsProperties.class })
public class ApplicationConfig {

}
