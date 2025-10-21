package br.com.matheusleao.todolist.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Lista de Tarefas")
                        .description("Documentação da API de To-Do List com Spring Boot")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Matheus Leão Lagunaz")
                                .url("https://github.com/MatheusLeaoLagunaz/todo-list")));
    }
}

