package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.Matchers.is;

public class SwitchWeekTest {

    @Test
    public void sunday() {
        int day = 7;
        Assert.assertThat(SwitchWeek.nameOfDay(7), is("Воскресенье"));
    }
}