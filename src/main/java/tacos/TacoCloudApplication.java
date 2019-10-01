package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Относительно габлонный класс в котором осуществляеться создание и запросы контекста Spring.
 *
 */

@SpringBootApplication // Эквивалент композиции аннотаций: @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args); // Создает загрузчик приложения создавая spring context
    }

}
