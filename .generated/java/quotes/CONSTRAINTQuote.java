package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CONSTRAINTQuote implements Quote {
  private static int hc = 0;
  private static CONSTRAINTQuote instance = null;

  public CONSTRAINTQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static CONSTRAINTQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new CONSTRAINTQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof CONSTRAINTQuote;
  }

  public String toString() {

    return "<CONSTRAINT>";
  }

  @Override
  public CONSTRAINTQuote copy() {

    return getInstance();
  }
}
