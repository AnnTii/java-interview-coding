package by.andd3dfx.interview.exam;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class PlatformerTest {

  @Test
  public void jumpTest() {
    Platformer platformer = new Platformer(6, 3);
    assertThat("3 expected", platformer.position(), is(3));

    platformer.jumpLeft();
    assertThat("1 expected", platformer.position(), is(1));

    platformer.jumpRight();
    assertThat("4 expected", platformer.position(), is(4));

    platformer.jumpRight();
    assertThat("4 expected", platformer.position(), is(4));

    platformer.jumpLeft();
    assertThat("0 expected", platformer.position(), is(0));

    platformer.jumpRight();
    assertThat("5 expected", platformer.position(), is(5));

    platformer.jumpLeft();
    assertThat("5 expected, could not jump more", platformer.position(), is(5));
    platformer.jumpRight();
    assertThat("5 expected, could not jump more 2", platformer.position(), is(5));
  }
}