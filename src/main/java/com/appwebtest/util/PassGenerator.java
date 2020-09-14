package com.appwebtest.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGenerator {
    public static void main(String... args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(8);

        //El String que mandamos al metodo encode es el password que queremos encriptar
        System.out.println(bCryptPasswordEncoder.encode("admin"));
    }
}
