package org.example.homework6.service;

import org.springframework.stereotype.Component;

@Component("sound")
public class SoundAlertService implements AlertService {

    @Override
    public void alert(String username) {
        System.out.println("sound phát âm thanh cảnh báo cho : " + username);
    }
}