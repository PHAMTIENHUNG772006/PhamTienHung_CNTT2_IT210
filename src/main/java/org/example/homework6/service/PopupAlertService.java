package org.example.homework6.service;


import org.springframework.stereotype.Component;

@Component("popup")
public class PopupAlertService implements AlertService {

    @Override
    public void alert(String username) {
        System.out.println("Popup Cảnh báo hết tiền cho :" + username);
    }
}