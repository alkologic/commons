
package com.alkologic.commons;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Streams {
  public static void ouput(OutputStream os, String text) throws IOException {
    DataOutputStream wr = new DataOutputStream(os);
    
    wr.writeBytes(text);
    wr.flush();
    wr.close();    
  }

  public static String input(InputStream is) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(is));
    String inputLine;
    StringBuffer sb = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
      sb.append(inputLine);
    }
    in.close();

    return sb.toString();
  }
}
