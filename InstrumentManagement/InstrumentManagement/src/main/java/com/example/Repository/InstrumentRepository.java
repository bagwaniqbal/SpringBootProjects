package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Instrument;

public interface InstrumentRepository  extends JpaRepository<Instrument, Integer>{

}
