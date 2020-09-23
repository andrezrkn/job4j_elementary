package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Check;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void monoTTTT() {
        boolean[] input = {true, true, true, true};
        boolean resultArray = Check.mono(input);
        boolean expectArray = true;
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void monoTTTF() {
        boolean[] input = {true, true, true, false};
        boolean resultArray = Check.mono(input);
        boolean expectArray = false;
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void monoTFTT() {
        boolean[] input = {true, false, true, true};
        boolean resultArray = Check.mono(input);
        boolean expectArray = false;
        assertThat(resultArray, is(expectArray));
    }
}