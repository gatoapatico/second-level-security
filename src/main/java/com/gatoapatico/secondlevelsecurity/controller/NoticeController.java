package com.gatoapatico.secondlevelsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
    @GetMapping("/notices")
    public String getNotices() {
        return "This are the news!";
    }
}
