package com.alkologic.commons;

import static org.junit.Assert.*;
import org.junit.Test;

public class SignerTest {

  @Test
  public void testSignHMACDigest() {
    assertEquals("104152c5bfdca07bc633eebd46199f0255c9f49d",
        Signer.signHMACDigest("HmacSHA1", "data", "key"));
  }

}
