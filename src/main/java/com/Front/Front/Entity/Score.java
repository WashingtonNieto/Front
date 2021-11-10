package com.Front.Front.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Score implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    private Integer stars;

    public Score(Integer idScore, Integer stars) {
        this.idScore = idScore;
        this.stars = stars;
    }

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
