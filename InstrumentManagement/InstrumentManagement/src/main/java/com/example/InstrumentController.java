package com.example;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Entity.Instrument;
import com.example.Service.InstrumentService;



public class InstrumentController 
{
	@Autowired
	InstrumentService InstrumentService;

	@GetMapping(value="/Instruments")
	public List<Instrument> getAllInstrument()
	{
		return InstrumentService.getAlLInstrument();
	}
	
	@PostMapping(value="/Instruments")
	public Instrument addNewInstrument(@Valid @RequestBody Instrument Instrument) 
	{
		return InstrumentService.addInstrument(Instrument);
	}
	
	@DeleteMapping(value="/Instruments/{id}")
	public String deleteInstrument(@PathVariable int id)
	{
		InstrumentService.deleteInstrument(id);
		return "Instrument is Deleted";
	}
	
	@RequestMapping(value ="/bbok", produces ="application/jason", method=RequestMethod.PUT)
	public Instrument updateInstrument(@Valid @RequestBody Instrument Instrument)
	{
		return InstrumentService.UpdateInstrument(Instrument);
	}
}
