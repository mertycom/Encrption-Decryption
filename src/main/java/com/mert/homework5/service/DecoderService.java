package com.mert.homework5.service;

import com.mert.homework5.model.Coder;
import com.mert.homework5.util.CommonData;

public class DecoderService implements Coder {

    @Override
    public String crypt(String message, String key) {
        String pass = key.substring(0, 1);
        String decryptedMessage = "";
        int messageIndex = 0;
        int keyIndex = 0;

        while (messageIndex < message.length()) {
            int iterate = Integer.valueOf(pass);
            char decryptedChar = message.charAt(messageIndex);
            for (int i = 0; i < iterate; i++) {
                decryptedChar = CommonData.getInstance().getTemplate().getDecoderMap().get(decryptedChar);
            }
            decryptedMessage += decryptedChar;
            messageIndex++;
            keyIndex++;
            if (keyIndex == key.length()) {
                keyIndex = 0;
            }
            pass = String.valueOf(key.charAt(keyIndex));
        }
        return decryptedMessage;
    }
}
