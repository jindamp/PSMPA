package com.pavan.models;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * Created by Pavan on 16-Sep-16.
 */
public class Keys {
    private byte[] publicKeyArray;
    private byte[] privateKeyArray;
    private PublicKey publicKey;
    public PrivateKey privateKey;


    public Keys() {
    }

    public byte[] getPublicKeyArray() {
        return publicKeyArray;
    }

    public void setPublicKeyArray(byte[] publicKeyArray) {
        this.publicKeyArray = publicKeyArray;
    }

    public byte[] getPrivateKeyArray() {
        return privateKeyArray;
    }

    public void setPrivateKeyArray(byte[] privateKeyArray) {
        this.privateKeyArray = privateKeyArray;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }
}
