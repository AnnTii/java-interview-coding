package by.andd3dfx.numeric;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IntDividerTest {

    @Test
    public void divide() {
        assertThat(IntDivider.divide(5, 2), is(2));
        assertThat(IntDivider.divide(36, 4), is(9));
        assertThat(IntDivider.divide(45, 7), is(6));
        assertThat(IntDivider.divide(500, 2), is(250));
        assertThat(IntDivider.divide(100, 1), is(100));
    }

    @Test
    public void divide2() {
        assertThat(IntDivider.divide2(5, 2), is(2));
        assertThat(IntDivider.divide2(36, 4), is(9));
        assertThat(IntDivider.divide2(45, 7), is(6));
        assertThat(IntDivider.divide2(500, 2), is(250));
        assertThat(IntDivider.divide2(100, 1), is(100));
    }
}
