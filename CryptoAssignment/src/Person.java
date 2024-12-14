import javax.crypto.SecretKey;
import java.security.KeyPair;

public class Person {
    private KeyPair rsaKeyPair;
    private SecretKey aesKey;

    public Person() throws Exception {
        this.rsaKeyPair = CryptoUtils.generateRSAKeyPair();
        this.aesKey = CryptoUtils.generateAESKey();
    }

    public KeyPair getRSAKeyPair() {
        return rsaKeyPair;
    }

    public SecretKey getAESKey() {
        return aesKey;
    }
}
