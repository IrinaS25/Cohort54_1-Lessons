package storeOfMusicalInstruments.main.repository;

import storeOfMusicalInstruments.main.model.Instrument;

import java.util.ArrayList;

public class InstrumentsRepository {
    private ArrayList<Instrument> instruments = new ArrayList<>();

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }
    public ArrayList<Instrument> getAllInstruments() {
        return instruments;
    }
}
