package io.github.RyanLambrecht.JUnitStackDemo;

import io.github.RyanLambrecht.JUnitStackDemo.Cryptography;

public class Main {
    public static void main(String[] args) {
        String header = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
        String payload = "eyJoaW50IjoiaHR0cHM6Ly93d3cueW91dHViZS5jb20vd2F0Y2g_dj0tdEpZTi1lRzF6ayJ9";
        String knownSignature = "JCDI5aHlUEs6avrcpTOJ43YPQwcbPaFbJPpXBDaKCDc";

        Cryptography coder = new Cryptography();

//        String decodedPayload = coder.decode(payload);
//        System.out.println("Decoded payload: " + decodedPayload);

        String data = header + "." + payload;

        // List of possible secrets to try
        System.out.println(coder.hmacSHA256(data, "News of the World"));
    }
}
