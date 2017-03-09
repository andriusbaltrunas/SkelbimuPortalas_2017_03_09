package com.kcs.auto.adverts.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by andriusbaltrunas on 3/9/2017.
 */
public class SecurityUtils {

    public static String getHashSetPassword(String password) {
        StringBuilder sb = new StringBuilder();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = password.getBytes();
            md.update(bytes);

            for (int i = 0; i < md.digest().length; i++) {
                sb.append(Integer.toString((md.digest()[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
