package org.example.app.service;

import org.example.app.utils.Rounder;

public class BonusService {
    private static final double BONUS_RATE = 10.0;

    public BonusService() {
    }

    public String getRes(double sales) {
        return sales > 0.0 ? Rounder.roundValue(this.calcBonus(sales)) : "Incorrect value!";
    }

    public double calcBonus(double sales) {
        return sales * 10.0 / 100.0;
    }
}
