
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Prompt {
  public VDMSeq instructions;
  public VDMSeq context;
  public VDMSeq examples;
  public VDMSeq constraints;
  public VDMSeq outputFormat;
  /* Prompt.vdmpp 18:12 */
  public void cg_init_Prompt_1() {

    /* Prompt.vdmpp 21:9 */
    instructions = SeqUtil.seq();
    /* Prompt.vdmpp 22:9 */
    context = SeqUtil.seq();
    /* Prompt.vdmpp 23:9 */
    examples = SeqUtil.seq();
    /* Prompt.vdmpp 24:9 */
    constraints = SeqUtil.seq();
    /* Prompt.vdmpp 25:9 */
    outputFormat = SeqUtil.seq();
  }
  /* Prompt.vdmpp 18:12 */
  public Prompt() {

    cg_init_Prompt_1();
  }
  /* Prompt.vdmpp 28:12 */
  public Boolean isValid() {

    Boolean andResult_3 = false;

    if (instructions.size() > 0L) {
      if (outputFormat.size() > 0L) {
        andResult_3 = true;
      }
    }

    /* Prompt.vdmpp 30:9 */
    return andResult_3;
  }

  public String toString() {

    return "Prompt{"
        + "instructions := "
        + Utils.toString(instructions)
        + ", context := "
        + Utils.toString(context)
        + ", examples := "
        + Utils.toString(examples)
        + ", constraints := "
        + Utils.toString(constraints)
        + ", outputFormat := "
        + Utils.toString(outputFormat)
        + "}";
  }

  public static class Token implements VDMRecord {
    public Object type;
    public String value;

    public Token(final Object _type, final String _value) {

      type = _type != null ? _type : null;
      value = _value != null ? _value : null;
    }

    public boolean equals(final Object obj) {

      if (!(obj instanceof Token)) {
        return false;
      }

      Token other = ((Token) obj);

      return (Utils.equals(type, other.type)) && (Utils.equals(value, other.value));
    }

    public int hashCode() {

      return Utils.hashCode(type, value);
    }

    public Token copy() {

      return new Token(type, value);
    }

    public String toString() {

      return "mk_Prompt`Token" + Utils.formatFields(type, value);
    }
  }
}
