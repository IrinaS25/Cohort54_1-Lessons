package storeOfMusicalInstruments.main.service;

import storeOfMusicalInstruments.main.model.Instrument;
import storeOfMusicalInstruments.main.repository.InstrumentsRepository;

import java.util.ArrayList;

public class InstrumentsService {

    private InstrumentsRepository instrumentsRepository;

    public InstrumentsService(InstrumentsRepository instrumentsRepository) {
        this.instrumentsRepository = instrumentsRepository;
    }

    public void addInstrument(Instrument instrument) {
        instrumentsRepository.addInstrument(instrument);
    }
    public ArrayList<Instrument> getAllInstruments() {
        return instrumentsRepository.getAllInstruments();
    }
}
