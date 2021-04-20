package br.eti.gadelha.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	19/06/2020
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@Configuration
@EnableSwagger2
public class ConfigSwagger {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2);
    }
}