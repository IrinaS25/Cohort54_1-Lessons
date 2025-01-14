package storeOfMusicalInstruments.main;

import storeOfMusicalInstruments.main.controller.InstrumentsController;

import javax.sound.midi.Instrument;

public class MusicStoreApp {
    public static void main(String[] args) {

        InstrumentsController instrumentsController = new InstrumentsController();
        instrumentsController.run();

    }
}
