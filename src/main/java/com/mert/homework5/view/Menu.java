package com.mert.homework5.view;

import com.mert.homework5.util.CommonData;

public class Menu {

    public static void showMenu(String key) {
        while (true) {
            System.out.println("Please enter content");
            String content = CommonData.getInstance().getScanner().nextLine();
            System.out.println("What do you want to do?");
            System.out.println("1- Encode your content");
            System.out.println("2- Decode your content");
            System.out.println("0- Exit");

            String selection = CommonData.getInstance().getScanner().nextLine();
            if (processSelection(selection,content,key))
                break;
        }
        System.out.println("Bye....");
    }

    public static boolean processSelection(String selection, String content,String key) {
        if (selection.equals("0"))
            return true;

        switch (selection.charAt(0)) {
            case '1':
                String encrypted = CommonData.getInstance()
                        .getEncoderService()
                        .crypt(content,key);
                System.out.println(encrypted);
                break;
            case '2':
                String decrypted = CommonData.getInstance()
                        .getDecoderService()
                        .crypt(content,key);
                System.out.println(decrypted);
                break;
            default:
                System.out.println("Please enter a correct value");
                break;
        }
        return false;
    }
}
