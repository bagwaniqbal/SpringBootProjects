package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Instrument;

@Service
public interface InstrumentService 
{
	//Crud methods
	
	public Instrument addInstrument(Instrument instrument);
	public List<Instrument> getAlLInstrument();
	public void deleteInstrument(int id);
	public Instrument UpdateInstrument(Instrument instrument);
}
