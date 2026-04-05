package org.example.homework6;

import org.example.homework6.config.AppConfig;
import org.example.homework6.service.PlaySessionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PlaySessionService service =
                context.getBean(PlaySessionService.class);

        service.checkBalance("hung", 3000, "VIP");
        service.checkBalance("hung", 3000, "NORMAL");
        service.checkBalance("", 3000, "VIP");
        service.checkBalance("hung", -100, "VIP");
        service.checkBalance("hung", 10000, "VIP");
    }
}