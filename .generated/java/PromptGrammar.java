
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PromptGrammar {
  private VDMSet rules =
      SetUtil.set(
          SeqUtil.seq(
              quotes.INSTRUCTIONQuote.getInstance(),
              quotes.CONTEXTQuote.getInstance(),
              quotes.EXAMPLEQuote.getInstance(),
              quotes.CONSTRAINTQuote.getInstance(),
              quotes.OUTPUT_FORMATQuote.getInstance()),
          SeqUtil.seq(
              quotes.INSTRUCTIONQuote.getInstance(),
              quotes.CONTEXTQuote.getInstance(),
              quotes.CONSTRAINTQuote.getInstance(),
              quotes.OUTPUT_FORMATQuote.getInstance()),
          SeqUtil.seq(
              quotes.INSTRUCTIONQuote.getInstance(),
              quotes.EXAMPLEQuote.getInstance(),
              quotes.OUTPUT_FORMATQuote.getInstance()));
  /* PromptGrammar.vdmpp 14:12 */
  public void cg_init_PromptGrammar_1() {

    /* PromptGrammar.vdmpp 16:9 */
    return;
  }
  /* PromptGrammar.vdmpp 14:12 */
  public PromptGrammar() {

    cg_init_PromptGrammar_1();
  }
  /* PromptGrammar.vdmpp 18:12 */
  public Boolean isValidPrompt(final Prompt prompt) {

    {
      /* PromptGrammar.vdmpp 21:13 */
      final VDMSeq tokenSequence = createTokenSequence(prompt);
      Boolean existsExpResult_1 = false;
      /* PromptGrammar.vdmpp 22:39 */
      VDMSet set_1 = Utils.copy(rules);
      for (Iterator iterator_1 = set_1.iterator(); iterator_1.hasNext() && !(existsExpResult_1); ) {
        VDMSeq rule = ((VDMSeq) iterator_1.next());
        Boolean andResult_2 = false;

        if (Utils.equals(tokenSequence.size(), rule.size())) {
          Boolean forAllExpResult_1 = true;
          /* PromptGrammar.vdmpp 24:36 */
          VDMSet set_2 = SetUtil.range(1L, tokenSequence.size());
          for (Iterator iterator_2 = set_2.iterator();
              iterator_2.hasNext() && forAllExpResult_1;
              ) {
            Number i = ((Number) iterator_2.next());
            forAllExpResult_1 =
                Utils.equals(((Prompt.Token) Utils.get(tokenSequence, i)).type, Utils.get(rule, i));
          }
          if (forAllExpResult_1) {
            andResult_2 = true;
          }
        }

        existsExpResult_1 = andResult_2;
      }
      /* PromptGrammar.vdmpp 22:13 */
      return existsExpResult_1;
    }
  }
  /* PromptGrammar.vdmpp 28:13 */
  private VDMSeq createTokenSequence(final Prompt prompt) {

    /* PromptGrammar.vdmpp 31:13 */
    VDMSeq result = SeqUtil.seq();
    /* PromptGrammar.vdmpp 32:9 */
    if (prompt.instructions.size() > 0L) {
      result = SeqUtil.conc(Utils.copy(result), prompt.instructions);
    }

    /* PromptGrammar.vdmpp 34:9 */
    if (prompt.context.size() > 0L) {
      result = SeqUtil.conc(Utils.copy(result), prompt.context);
    }

    /* PromptGrammar.vdmpp 36:9 */
    if (prompt.examples.size() > 0L) {
      result = SeqUtil.conc(Utils.copy(result), prompt.examples);
    }

    /* PromptGrammar.vdmpp 38:9 */
    if (prompt.constraints.size() > 0L) {
      result = SeqUtil.conc(Utils.copy(result), prompt.constraints);
    }

    /* PromptGrammar.vdmpp 40:9 */
    if (prompt.outputFormat.size() > 0L) {
      result = SeqUtil.conc(Utils.copy(result), prompt.outputFormat);
    }

    /* PromptGrammar.vdmpp 42:9 */
    return Utils.copy(result);
  }
  /* PromptGrammar.vdmpp 45:12 */
  public void addRule(final VDMSeq newRule) {

    /* PromptGrammar.vdmpp 47:9 */
    rules = SetUtil.union(Utils.copy(rules), SetUtil.set(Utils.copy(newRule)));
  }

  public String toString() {

    return "PromptGrammar{" + "rules := " + Utils.toString(rules) + "}";
  }
}
