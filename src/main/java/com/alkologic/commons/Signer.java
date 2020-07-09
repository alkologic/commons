package com.alkologic.commons;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Signer {

  public static String signHMACDigest(String alg, String msg, String key) {
    Mac shaMac;
    try {
      shaMac = Mac.getInstance(alg);
      SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), alg);
      shaMac.init(keySpec);

    } catch (NoSuchAlgorithmException | InvalidKeyException e) {
      throw new AssertionError(e);
    }

    final byte[] macData = shaMac.doFinal(msg.getBytes());
    return Hex.bytesToHex(macData).toLowerCase();
  }
}
