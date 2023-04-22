package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Instrument;
import com.example.Repository.InstrumentRepository;
import com.example.Service.InstrumentService;

@Repository
public class InstrumentServiceImpl implements InstrumentService {
	@Autowired
	InstrumentRepository instrumentRepository;

	public Instrument addInstrument(Instrument Instrument) {
		// TODO Auto-generated method stub
		return instrumentRepository.save(Instrument);
	}

	public List<Instrument> getAllInstrument() {
		// TODO Auto-generated method stub
		return instrumentRepository.findAll();
	}

	public void deleteInstrument(int id) {
		// TODO Auto-generated method stub
		instrumentRepository.deleteById(id);
	}

	public Instrument UpdateInstrument(Instrument Instrument) {
		// TODO Auto-generated method stub
		Instrument _Instrument = instrumentRepository.findById(Instrument.getIid()).get();
		_Instrument.setIname(Instrument.getIname());
		_Instrument.setItype(Instrument.getItype());
		_Instrument.setPrice(Instrument.getPrice());
		return null;
	}

	@Override
	public List<Instrument> getAlLInstrument() {
		// TODO Auto-generated method stub
		return null;
	}

}
