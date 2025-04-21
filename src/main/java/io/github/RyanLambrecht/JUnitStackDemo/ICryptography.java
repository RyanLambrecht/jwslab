package io.github.RyanLambrecht.JUnitStackDemo;

public interface ICryptography {
    String hmacSHA256(String message, String secret);
    String encode(String rawString);
    String decode(String encodedString);
}
