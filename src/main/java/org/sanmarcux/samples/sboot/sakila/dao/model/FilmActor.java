package org.sanmarcux.samples.sboot.sakila.dao.model;

// Generated 20/10/2012 11:23:03 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Date;

/**
 * FilmActor generated by hbm2java
 */
@Entity
@Table(name = "film_actor", catalog = "sakila")
public class FilmActor implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private FilmActorId id;
    private Actor actor;
    private Film film;
    private Date lastUpdate;

    public FilmActor() {
    }

    public FilmActor(FilmActorId id, Actor actor, Film film, Date lastUpdate) {
        this.id = id;
        this.actor = actor;
        this.film = film;
        this.lastUpdate = lastUpdate;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "actorId", column = @Column(name = "actor_id", nullable = false)),
            @AttributeOverride(name = "filmId", column = @Column(name = "film_id", nullable = false))})
    public FilmActorId getId() {
        return this.id;
    }

    public void setId(FilmActorId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "actor_id", nullable = false, insertable = false, updatable = false)
    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "film_id", nullable = false, insertable = false, updatable = false)
    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", nullable = false, length = 19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
