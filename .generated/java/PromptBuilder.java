
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PromptBuilder {
  private Prompt currentPrompt = new Prompt();
  /* PromptBuilder.vdmpp 7:12 */
  public void cg_init_PromptBuilder_1() {

    /* PromptBuilder.vdmpp 9:9 */
    return;
  }
  /* PromptBuilder.vdmpp 7:12 */
  public PromptBuilder() {

    cg_init_PromptBuilder_1();
  }
  /* PromptBuilder.vdmpp 11:12 */
  public PromptBuilder addInstruction(final Prompt.Token tok) {

    /* PromptBuilder.vdmpp 14:9 */
    currentPrompt.instructions =
        SeqUtil.conc(currentPrompt.instructions, SeqUtil.seq(Utils.copy(tok)));
    /* PromptBuilder.vdmpp 15:9 */
    return this;
  }
  /* PromptBuilder.vdmpp 18:12 */
  public PromptBuilder addContext(final Prompt.Token tok) {

    /* PromptBuilder.vdmpp 21:9 */
    currentPrompt.context = SeqUtil.conc(currentPrompt.context, SeqUtil.seq(Utils.copy(tok)));
    /* PromptBuilder.vdmpp 22:9 */
    return this;
  }
  /* PromptBuilder.vdmpp 25:12 */
  public PromptBuilder addExample(final Prompt.Token tok) {

    /* PromptBuilder.vdmpp 28:9 */
    currentPrompt.examples = SeqUtil.conc(currentPrompt.examples, SeqUtil.seq(Utils.copy(tok)));
    /* PromptBuilder.vdmpp 29:9 */
    return this;
  }
  /* PromptBuilder.vdmpp 32:12 */
  public PromptBuilder addConstraint(final Prompt.Token tok) {

    /* PromptBuilder.vdmpp 35:9 */
    currentPrompt.constraints =
        SeqUtil.conc(currentPrompt.constraints, SeqUtil.seq(Utils.copy(tok)));
    /* PromptBuilder.vdmpp 36:9 */
    return this;
  }
  /* PromptBuilder.vdmpp 39:12 */
  public PromptBuilder addOutputFormat(final Prompt.Token tok) {

    /* PromptBuilder.vdmpp 42:9 */
    currentPrompt.outputFormat =
        SeqUtil.conc(currentPrompt.outputFormat, SeqUtil.seq(Utils.copy(tok)));
    /* PromptBuilder.vdmpp 43:9 */
    return this;
  }
  /* PromptBuilder.vdmpp 46:12 */
  public Prompt build() {

    /* PromptBuilder.vdmpp 48:9 */
    return currentPrompt;
  }

  public String toString() {

    return "PromptBuilder{" + "currentPrompt := " + Utils.toString(currentPrompt) + "}";
  }
}
