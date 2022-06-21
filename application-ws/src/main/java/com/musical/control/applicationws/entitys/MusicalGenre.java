package com.musical.control.applicationws.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class MusicalGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long idMusicalGenre;

    @NotBlank
    private String musicalGenreName;

    public MusicalGenre(Long idMusicalGenre, String musicalGenreName) {
        this.idMusicalGenre = idMusicalGenre;
        this.musicalGenreName = musicalGenreName;
    }

    public Long getIdMusicalGenre() {
        return idMusicalGenre;
    }

    public void setIdMusicalGenre(Long idMusicalGenre) {
        this.idMusicalGenre = idMusicalGenre;
    }

    public String getMusicalGenreName() {
        return musicalGenreName;
    }

    public void setMusicalGenreName(String musicalGenreName) {
        this.musicalGenreName = musicalGenreName;
    }
}
