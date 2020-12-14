package com.roulette.roulette.config.repository;

import com.roulette.roulette.model.RouletteModel;

public interface RouletteInterface {
    void createRoulette(RouletteModel roulette);
    void openRoulette(String id);
    void betOnNumber(String idRoulette, int number, int amount);
    void betOnColour(String idRoulette, String colour, int amount);
    void closeRoulette(String id);
}
