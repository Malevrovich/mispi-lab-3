package com.example.lab3.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;


@Entity

@Table(name = "shot")
public class Shot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long id;

    public float x;

    public float y;

    public int r;

    public boolean shot;
    public boolean equals(Object dot){
        if (this == dot)
            return true;

        if (dot == null)
            return false;

        if (!(dot instanceof Shot))
            return false;
        Shot shot1 = (Shot)dot;


        return this.x == shot1.x && this.y == shot1.y && this.r == shot1.r;

    }

    public Shot(float x, float y, int r, boolean shot) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.shot = shot;
    }

    public Shot() {
        x = 0;
        y = 0;
        r = 0;
        shot = true;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }
}
