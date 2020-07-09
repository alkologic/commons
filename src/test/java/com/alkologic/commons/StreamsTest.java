package com.alkologic.commons;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import lombok.val;

public class StreamsTest {

  private static final String text = "some text";

  @Test
  public void testInputOutput() throws IOException {
    val outStream = new ByteArrayOutputStream();
    Streams.ouput(outStream, text);

    InputStream targetStream = new ByteArrayInputStream(outStream.toByteArray());    
    assertEquals(text, Streams.input(targetStream));
  }

}
