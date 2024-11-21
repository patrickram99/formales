
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PromptValidator {
  private PromptGrammar grammar = new PromptGrammar();
  /* PromptValidator.vdmpp 7:12 */
  public void cg_init_PromptValidator_1() {

    /* PromptValidator.vdmpp 9:9 */
    return;
  }
  /* PromptValidator.vdmpp 7:12 */
  public PromptValidator() {

    cg_init_PromptValidator_1();
  }
  /* PromptValidator.vdmpp 11:12 */
  public Boolean validate(final Prompt prompt) {

    Boolean andResult_1 = false;

    if (prompt.isValid()) {
      if (grammar.isValidPrompt(prompt)) {
        andResult_1 = true;
      }
    }

    /* PromptValidator.vdmpp 13:9 */
    return andResult_1;
  }

  public String toString() {

    return "PromptValidator{" + "grammar := " + Utils.toString(grammar) + "}";
  }
}
