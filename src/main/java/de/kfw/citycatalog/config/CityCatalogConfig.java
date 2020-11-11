package de.kfw.citycatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.kfw.citycatalog.repository.CityRepository;
import de.kfw.citycatalog.service.CityService;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "de.kfw")
public class CityCatalogConfig {

    @Bean
    public CityRepository cityRepository() {
        return new CityRepository();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public CityService cityService(final CityRepository cityRepository,
                                   final ObjectMapper objectMapper) {
        return new CityService(cityRepository, objectMapper);
    }

}
