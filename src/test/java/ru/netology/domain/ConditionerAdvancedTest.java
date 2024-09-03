package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ConditionerAdvancedTest {

    @Test
    public void createConditioner() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Морозко";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldChangeTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(20);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(15);
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}
