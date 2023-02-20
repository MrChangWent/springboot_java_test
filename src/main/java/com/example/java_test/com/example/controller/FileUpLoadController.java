package com.example.java_test.com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUpLoadController {

    @PostMapping("/upload")
    public String up(String nickname, MultipartFile filename, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        System.out.println(filename.getOriginalFilename());
        System.out.println(filename.getContentType());
        System.out.println(System.getProperty("user.dir"));
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(filename, path);
        return "Done";
    }

    private void saveFile(MultipartFile filename, String path) throws IOException {

        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(path + filename.getOriginalFilename());
        filename.transferTo(file);
    }
}
