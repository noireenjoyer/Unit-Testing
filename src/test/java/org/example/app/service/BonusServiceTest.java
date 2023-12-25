package org.example.app.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BonusServiceTest {

    @Test
    void testCalculationWithExpectedResult() {

        BonusService bonusService = new BonusService();
        double sales = 1000.0;
        double expectedBonus = 100.0;

        double actualBonus = bonusService.calcBonus(sales);

        assertEquals(expectedBonus, actualBonus, 0.01); // Delta for double comparison
    }

    @Test
    void testCalculationWithUnexpectedResult() {

        BonusService bonusService = new BonusService();
        double sales = -500.0;
        String expectedResult = "Incorrect value!";

        String actualResult = bonusService.getRes(sales);

        assertEquals(expectedResult, actualResult);
    }
}
