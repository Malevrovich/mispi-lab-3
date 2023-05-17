package com.example.lab3.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named("HitProcessor")
@ApplicationScoped
public class HitProcessor {
    public boolean processHit(float x, float y, float r) {
        if(x <= 0 && y <= 0) {
            return x >= -r / 2 && y >= -r;
        } else if(x <= 0 && y > 0) {
            return x >= -r / 2 && y <= 2 * x + r;
        } else if(x > 0 && y <= 0) {
            return x * x + y * y <= r * r / 4;
        }
        return false;
    }
}
