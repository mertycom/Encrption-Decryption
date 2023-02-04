package com.mert.homework5.model;

import java.util.HashMap;

public class CharacterTemplate {
    private HashMap<Character, Character> encoderMap = new HashMap<>();
    private HashMap<Character, Character> decoderMap = new HashMap<>();

    public HashMap<Character, Character> getEncoderMap() {

        return encoderMap;
    }

    public HashMap<Character, Character> getDecoderMap() {

        return decoderMap;
    }

    public void put(Character key,Character value){
        encoderMap.put(key,value);
        decoderMap.put(value,key);
    }

}
