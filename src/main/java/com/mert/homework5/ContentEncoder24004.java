package com.mert.homework5;

import com.mert.homework5.service.FileReaderService;
import com.mert.homework5.view.Menu;

public class ContentEncoder24004 {
    private static final String KEY = "24004";

    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();
        fileReaderService.readFileToTemplate();
        Menu.showMenu(KEY);
    }
}
