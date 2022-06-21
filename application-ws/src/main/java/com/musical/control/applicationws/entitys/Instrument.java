package com.musical.control.applicationws.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long idInstrument;

    @NotBlank
    private String instrumentName;

    public Instrument(Long idInstrument, String instrumentName) {
        this.idInstrument = idInstrument;
        this.instrumentName = instrumentName;
    }

    public Long getIdInstrument() {
        return idInstrument;
    }

    public void setIdInstrument(Long idInstrument) {
        this.idInstrument = idInstrument;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }
}
