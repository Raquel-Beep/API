package org.serratec.raquel.config;

import org.hibernate.annotations.ConcreteProxy;
import org.springframework.context.annotation.Bean;

@Configuration
public class SwaggerConfig {
    
    @Bean

    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gerenciamento de Tarefas")
                        .version("1.0")
                        .description("API para gerenciar tarefas, incluindo criação, leitura, atualização e exclusão.")
                        .contact(new Contact()
                                .name("Raquel Serratec")
                                .email()
}
