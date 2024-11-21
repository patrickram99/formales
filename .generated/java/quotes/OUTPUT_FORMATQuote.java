package quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class OUTPUT_FORMATQuote implements Quote {
  private static int hc = 0;
  private static OUTPUT_FORMATQuote instance = null;

  public OUTPUT_FORMATQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static OUTPUT_FORMATQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new OUTPUT_FORMATQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof OUTPUT_FORMATQuote;
  }

  public String toString() {

    return "<OUTPUT_FORMAT>";
  }

  @Override
  public OUTPUT_FORMATQuote copy() {

    return getInstance();
  }
}
