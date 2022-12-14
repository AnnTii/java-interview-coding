package by.andd3dfx.interview;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import by.andd3dfx.interview.UserInput;
import org.junit.Test;

public class UserInputTest {

  @Test
  public void testTextInput() {
    UserInput.TextInput input = new UserInput.TextInput();
    input.add('1');
    input.add('a');
    input.add('0');

    assertThat("Unexpected string", input.getValue(), is("1a0"));
  }

  @Test
  public void testNumericInput() {
    UserInput.TextInput input = new UserInput.NumericInput();
    input.add('1');
    input.add('a');
    input.add('0');

    assertThat("Unexpected string", input.getValue(), is("10"));
  }
}