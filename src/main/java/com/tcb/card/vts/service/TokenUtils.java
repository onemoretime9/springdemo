package com.tcb.card.vts.service;

import java.util.Base64;

public class TokenUtils {
    public String decode(String encryptedData){
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        String data = decodedData.toString();
        return data;
    }
}
