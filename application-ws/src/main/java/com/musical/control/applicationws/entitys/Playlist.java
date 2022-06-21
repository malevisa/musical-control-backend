package com.musical.control.applicationws.entitys;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long idPlaylist;

    @NotBlank
    private String playlistName;

    @ManyToOne
    private User fkUser;

    public Playlist(Long idPlaylist, String playlistName, User fkUser) {
        this.idPlaylist = idPlaylist;
        this.playlistName = playlistName;
        this.fkUser = fkUser;
    }

    public Long getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Long idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public User getFkUser() {
        return fkUser;
    }

    public void setFkUser(User fkUser) {
        this.fkUser = fkUser;
    }
}
