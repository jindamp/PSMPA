package com.pavan.utils;

import com.pavan.models.Keys;

import java.security.*;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class ECC {
    public KeyFactory kf;
    public PublicKey pubKey;
    public PrivateKey prvKey;

    public static void test() {
        /*try {
            Provider p1 = Security.getProvider("SunEC");
            System.out.println(p1.getName());

            KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
            System.out.println(kpg.getAlgorithm());
            ECGenParameterSpec ecsp = new ECGenParameterSpec("sect163r2");   //sect163r2
            kpg.initialize(256);   //ecsp
            KeyPair kyp = kpg.genKeyPair();


            //PublicKey pubKey = kyp
            PublicKey pubKey = kyp.getPublic();
            byte[] pubKeyArray = pubKey.getEncoded();
            //pubKey.toString()
            int zz = pubKey.toString().length();
            System.out.println("Size of key" + zz + "and key is " + pubKey.toString());

            PrivateKey privKey = kyp.getPrivate();
            byte[] pvtKeyArray = privKey.getEncoded();
            int pp = pubKey.toString().length();
            System.out.println("Size of key" + pp + "and key is " + privKey.toString());


        } catch (Exception e) {
            System.out.print(e);
        }*/
    }

    public PublicKey getPubKey(byte[] pkey) throws Exception {
        return kf.generatePublic(new X509EncodedKeySpec(pkey));
    }

    public PrivateKey getPvtKey(byte[] pvkey) throws Exception {
        return kf.generatePrivate(new PKCS8EncodedKeySpec(pvkey));
    }

    public Keys generateKeys() throws Exception {
        Provider p1 = Security.getProvider("SunEC");
        System.out.println(p1.getName());

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        System.out.println(kpg.getAlgorithm());
        ECGenParameterSpec ecsp = new ECGenParameterSpec("sect163r2");   //sect163r2
        kpg.initialize(256);   //ecsp
        KeyPair kyp = kpg.genKeyPair();

        pubKey = kyp.getPublic();
        prvKey = kyp.getPrivate();

        Keys key = new Keys();
        key.setPrivateKeyArray(prvKey.getEncoded());
        key.setPublicKeyArray(pubKey.getEncoded());
        return key;
    }
}
