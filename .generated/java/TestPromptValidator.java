
import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestPromptValidator {
  private PromptValidator validator = new PromptValidator();
  private PromptBuilder builder = new PromptBuilder();
  /* TestPromptValidator.vdmpp 10:12 */
  public Boolean testValidPrompt() {

    /* TestPromptValidator.vdmpp 14:13 */
    Prompt.Token instruction =
        new Prompt.Token(quotes.INSTRUCTIONQuote.getInstance(), "Write a story about a hero.");
    /* TestPromptValidator.vdmpp 15:13 */
    Prompt.Token context =
        new Prompt.Token(
            quotes.CONTEXTQuote.getInstance(), "The story should be set in a medieval world.");
    /* TestPromptValidator.vdmpp 16:13 */
    Prompt.Token example =
        new Prompt.Token(quotes.EXAMPLEQuote.getInstance(), "Example: A knight saves a village.");
    /* TestPromptValidator.vdmpp 17:13 */
    Prompt.Token constraint =
        new Prompt.Token(quotes.CONSTRAINTQuote.getInstance(), "The story must include a dragon.");
    /* TestPromptValidator.vdmpp 18:13 */
    Prompt.Token outputFormat =
        new Prompt.Token(quotes.OUTPUT_FORMATQuote.getInstance(), "Output as a short story.");
    /* TestPromptValidator.vdmpp 21:13 */
    Prompt prompt =
        builder
            .addInstruction(Utils.copy(instruction))
            .addContext(Utils.copy(context))
            .addExample(Utils.copy(example))
            .addConstraint(Utils.copy(constraint))
            .addOutputFormat(Utils.copy(outputFormat))
            .build();
    /* TestPromptValidator.vdmpp 30:9 */
    return validator.validate(prompt);
  }
  /* TestPromptValidator.vdmpp 34:12 */
  public Boolean testInvalidPromptMissingInstruction() {

    /* TestPromptValidator.vdmpp 38:13 */
    Prompt.Token context =
        new Prompt.Token(
            quotes.CONTEXTQuote.getInstance(), "The story should be set in a medieval world.");
    /* TestPromptValidator.vdmpp 39:13 */
    Prompt.Token example =
        new Prompt.Token(quotes.EXAMPLEQuote.getInstance(), "Example: A knight saves a village.");
    /* TestPromptValidator.vdmpp 40:13 */
    Prompt.Token constraint =
        new Prompt.Token(quotes.CONSTRAINTQuote.getInstance(), "The story must include a dragon.");
    /* TestPromptValidator.vdmpp 41:13 */
    Prompt.Token outputFormat =
        new Prompt.Token(quotes.OUTPUT_FORMATQuote.getInstance(), "Output as a short story.");
    /* TestPromptValidator.vdmpp 44:13 */
    Prompt prompt =
        builder
            .addContext(Utils.copy(context))
            .addExample(Utils.copy(example))
            .addConstraint(Utils.copy(constraint))
            .addOutputFormat(Utils.copy(outputFormat))
            .build();
    /* TestPromptValidator.vdmpp 52:9 */
    return !(validator.validate(prompt));
  }
  /* TestPromptValidator.vdmpp 56:12 */
  public Boolean testInvalidPromptMissingOutputFormat() {

    /* TestPromptValidator.vdmpp 60:13 */
    Prompt.Token instruction =
        new Prompt.Token(quotes.INSTRUCTIONQuote.getInstance(), "Write a story about a hero.");
    /* TestPromptValidator.vdmpp 61:13 */
    Prompt.Token context =
        new Prompt.Token(
            quotes.CONTEXTQuote.getInstance(), "The story should be set in a medieval world.");
    /* TestPromptValidator.vdmpp 62:13 */
    Prompt.Token example =
        new Prompt.Token(quotes.EXAMPLEQuote.getInstance(), "Example: A knight saves a village.");
    /* TestPromptValidator.vdmpp 63:13 */
    Prompt.Token constraint =
        new Prompt.Token(quotes.CONSTRAINTQuote.getInstance(), "The story must include a dragon.");
    /* TestPromptValidator.vdmpp 66:13 */
    Prompt prompt =
        builder
            .addInstruction(Utils.copy(instruction))
            .addContext(Utils.copy(context))
            .addExample(Utils.copy(example))
            .addConstraint(Utils.copy(constraint))
            .build();
    /* TestPromptValidator.vdmpp 74:9 */
    return !(validator.validate(prompt));
  }
  /* TestPromptValidator.vdmpp 78:12 */
  public Boolean testGrammarRules() {

    /* TestPromptValidator.vdmpp 82:13 */
    Prompt.Token instruction =
        new Prompt.Token(quotes.INSTRUCTIONQuote.getInstance(), "Write a story about a hero.");
    /* TestPromptValidator.vdmpp 83:13 */
    Prompt.Token outputFormat =
        new Prompt.Token(quotes.OUTPUT_FORMATQuote.getInstance(), "Output as a short story.");
    /* TestPromptValidator.vdmpp 84:13 */
    Prompt.Token example =
        new Prompt.Token(quotes.EXAMPLEQuote.getInstance(), "Example: A knight saves a village.");
    /* TestPromptValidator.vdmpp 87:13 */
    Prompt prompt =
        builder
            .addInstruction(Utils.copy(instruction))
            .addOutputFormat(Utils.copy(outputFormat))
            .addExample(Utils.copy(example))
            .build();
    /* TestPromptValidator.vdmpp 94:9 */
    return !(validator.validate(prompt));
  }
  /* TestPromptValidator.vdmpp 98:12 */
  public VDMSeq runTests() {

    /* TestPromptValidator.vdmpp 101:9 */
    return SeqUtil.seq(
        testValidPrompt(),
        testInvalidPromptMissingInstruction(),
        testInvalidPromptMissingOutputFormat(),
        testGrammarRules());
  }
  /* TestPromptValidator.vdmpp 1:7 */
  public TestPromptValidator() {}

  public String toString() {

    return "TestPromptValidator{"
        + "validator := "
        + Utils.toString(validator)
        + ", builder := "
        + Utils.toString(builder)
        + "}";
  }
}
