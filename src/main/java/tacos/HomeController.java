package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 *
 * Даныый класс предназначен для написания контроллера.
 * контроллер - это класс который отправляет запросс в браузер и получает ответ
 * в виде некой информации.
 * (Что то вроде страницы в интернете)
 *
 *
 */

@Controller //Обозначение контроллера. С помощью данной аннотации Spring добавляет данный класс в контекст в виде бина HomeController.
public class HomeController {

    @GetMapping("/") // данная аннотация указывает на то куда будет посылаться запрос и, что в итоге она получит от сервера
                    // наример если мы отправим запрос в www.google.com/ = получим домашнюю страницу гугла.
    public String home(){
    return "home";
    }
}
