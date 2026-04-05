package org.example.homework6.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PlaySessionService {

    private final AlertService popup;
    private final AlertService sound;

    public PlaySessionService(
            @Qualifier("popup") AlertService popup,
            @Qualifier("sound") AlertService sound
    ) {
        this.popup = popup;
        this.sound = sound;
    }

    public void checkBalance(String username, double balance, String zone) {

        if (username == null || username.isBlank()) {
            System.out.println("Username không hợp lệ");
            return;
        }

        if (balance < 0) {
            System.out.println("Balance không hợp lệ");
            return;
        }

        if (balance < 5000) {
            if ("VIP".equalsIgnoreCase(zone)) {
                popup.alert(username);
            } else {
                sound.alert(username);
            }
        } else {
            System.out.println("Không có cảnh báo");
        }
    }
}