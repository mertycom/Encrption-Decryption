package com.mert.homework5;

import com.mert.homework5.service.DecoderService;
import com.mert.homework5.service.EncoderService;
import com.mert.homework5.service.FileReaderService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ContentEncoder24004Test {

    @BeforeAll
    public void testInit(){
        FileReaderService readerService = new FileReaderService();
        readerService.readFileToTemplate();
    }

    @Test
    public void testCrypt() {
        EncoderService service = new EncoderService();
        String message = "test";
        String key = "3";
        String expectedEncryptedMessage = "/5j/";
        String actualEncryptedMessage = service.crypt(message, key);
        assertEquals(expectedEncryptedMessage, actualEncryptedMessage);
    }

    @Test
    public void testDeCrypt() {
        DecoderService service = new DecoderService();
        String message = "/5j/";
        String key = "3";
        String expectedEncryptedMessage = "test";
        String actualEncryptedMessage = service.crypt(message, key);
        assertEquals(expectedEncryptedMessage, actualEncryptedMessage);
    }

}
