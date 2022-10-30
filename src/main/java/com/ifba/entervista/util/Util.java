package com.ifba.entervista.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.ifba.entervista.model.User;

public class Util {

    public static String Kripto(String pass) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(1, md.digest(pass.getBytes()));

        return hash.toString(16);
    }

    public static String compareKripto(String pass, User user) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(1, md.digest(pass.getBytes()));

        if (hash.toString(16).equals(user.getPassword())) {
            return "true";
        } else {
            return "false";
        }
    }

}
