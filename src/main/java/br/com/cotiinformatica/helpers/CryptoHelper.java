package br.com.cotiinformatica.helpers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoHelper {

    /*
     * Método para criptografar um valor
     * usando algoritmo SHA256
     */
    public String getSha256(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(value.getBytes());

            // converter para hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar SHA-256", e);
        }
    }
}
