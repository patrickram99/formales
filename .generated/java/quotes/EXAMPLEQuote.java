package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class EXAMPLEQuote implements Quote {
  private static int hc = 0;
  private static EXAMPLEQuote instance = null;

  public EXAMPLEQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static EXAMPLEQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new EXAMPLEQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof EXAMPLEQuote;
  }

  public String toString() {

    return "<EXAMPLE>";
  }

  @Override
  public EXAMPLEQuote copy() {

    return getInstance();
  }
}
