package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CONTEXTQuote implements Quote {
  private static int hc = 0;
  private static CONTEXTQuote instance = null;

  public CONTEXTQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static CONTEXTQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new CONTEXTQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof CONTEXTQuote;
  }

  public String toString() {

    return "<CONTEXT>";
  }

  @Override
  public CONTEXTQuote copy() {

    return getInstance();
  }
}
