package com.mert.homework5.service;

import com.mert.homework5.model.Coder;
import com.mert.homework5.util.CommonData;

public class EncoderService implements Coder {

    @Override
    public String crypt(String message, String key) {
        // Extract the first digit of the key and store it in the pass variable
        String pass = key.substring(0, 1);
        // Initialize the encryptedMessage variable to an empty string
        String encryptedMessage = "";
        // Initialize the index of the message to be encrypted
        int messageIndex = 0;
        // Initialize the index of the key to be used for encryption
        int keyIndex = 0;

        // Repeat the loop until all characters in the message have been encrypted
        while (messageIndex < message.length()) {
            // Convert the pass digit to an integer and store it in the iterate variable
            int iterate = Integer.valueOf(pass);
            // Get the character at the current messageIndex and store it in encryptedChar
            char encryptedChar = message.charAt(messageIndex);
            // Repeat the loop iterate number of times to encrypt the character
            for (int i = 0; i < iterate; i++) {
                // Look up the encrypted character in the encoder map and store it back in encryptedChar
                encryptedChar = CommonData.getInstance().getTemplate().getEncoderMap().get(encryptedChar);
            }
            // Add the encrypted character to the encryptedMessage
            encryptedMessage += encryptedChar;
            // Increment the messageIndex to process the next character in the message
            messageIndex++;
            // Increment the keyIndex to use the next character in the key
            keyIndex++;
            // If all characters in the key have been used, reset the keyIndex to 0
            if (keyIndex == key.length()) {
                keyIndex = 0;
            }
            // Update the pass digit with the next character in the key
            pass = String.valueOf(key.charAt(keyIndex));
        }
        // Return the encrypted message
        return encryptedMessage;
    }
}
