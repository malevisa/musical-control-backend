package com.musical.control.applicationws.entitys;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class MusicPlaylist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long idMusicPlaylist;

    @NotNull
    @ManyToOne
    private Music fkMusic;

    @NotNull
    @ManyToOne
    private Playlist fkPlaylist;

}
