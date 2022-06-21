package com.musical.control.applicationws.entitys;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long idMusic;

    @NotBlank
    private String musicName;

    @NotNull
    @ManyToOne
    private MusicalGenre fkMusicalGenre;

    @NotBlank
    private String singerName;

    @NotNull
    @ManyToOne
    private User fkUser;

    @NotNull
    @ManyToOne
    private Instrument fkInstrument;

    public Music(Long idMusic, String musicName, MusicalGenre fkMusicalGenre, String singerName, User fkUser, Instrument fkInstrument) {
        this.idMusic = idMusic;
        this.musicName = musicName;
        this.fkMusicalGenre = fkMusicalGenre;
        this.singerName = singerName;
        this.fkUser = fkUser;
        this.fkInstrument = fkInstrument;
    }

    public Long getIdMusic() {
        return idMusic;
    }

    public void setIdMusic(Long idMusic) {
        this.idMusic = idMusic;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public MusicalGenre getFkMusicalGenre() {
        return fkMusicalGenre;
    }

    public void setFkMusicalGenre(MusicalGenre fkMusicalGenre) {
        this.fkMusicalGenre = fkMusicalGenre;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public User getFkUser() {
        return fkUser;
    }

    public void setFkUser(User fkUser) {
        this.fkUser = fkUser;
    }

    public Instrument getFkInstrument() {
        return fkInstrument;
    }

    public void setFkInstrument(Instrument fkInstrument) {
        this.fkInstrument = fkInstrument;
    }
}
