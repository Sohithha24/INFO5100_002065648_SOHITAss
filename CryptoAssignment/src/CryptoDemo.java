public class CryptoDemo {
    public static void main(String[] args) {
        try {
            // Create Alice and Bob
            Person alice = new Person();
            Person bob = new Person();

            // Symmetric Encryption/Decryption
            String symmetricMessage = "Hello Bob!";
            byte[] aesEncrypted = CryptoUtils.encryptAES(symmetricMessage, alice.getAESKey());
            String aesDecrypted = CryptoUtils.decryptAES(aesEncrypted, alice.getAESKey());
            System.out.println("AES Decrypted Message: " + aesDecrypted);

            // Asymmetric Encryption/Decryption
            String asymmetricMessage = "Hello Alice!";
            byte[] rsaEncrypted = CryptoUtils.encryptRSA(asymmetricMessage, bob.getRSAKeyPair().getPublic());
            String rsaDecrypted = CryptoUtils.decryptRSA(rsaEncrypted, bob.getRSAKeyPair().getPrivate());
            System.out.println("RSA Decrypted Message: " + rsaDecrypted);

            // Signing and Signature Validation
            String signMessage = "This is a signed message.";
            byte[] signature = CryptoUtils.signMessage(signMessage, alice.getRSAKeyPair().getPrivate());
            boolean isValid = CryptoUtils.validateSignature(signMessage, signature, alice.getRSAKeyPair().getPublic());
            System.out.println("Signature valid: " + isValid);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

