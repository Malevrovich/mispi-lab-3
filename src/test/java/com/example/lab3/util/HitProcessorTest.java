package com.example.lab3.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.example.lab3.util.HitProcessor;

import java.util.Random;


public class HitProcessorTest {
    static HitProcessor hitProcessor;

    @BeforeAll
    public static void init() {
        hitProcessor = new HitProcessor();
    }

    @Test
    public void testDotInFigure(){
        assertTrue(hitProcessor.processHit(-1.0f,-1.0f,2.0f));
        assertTrue(hitProcessor.processHit(-1.0f,1.0f,4.0f));
        assertTrue(hitProcessor.processHit(1.0f,-1.0f,3.0f));
    }
    @Test
    public void testDotNotInFigure(){
        assertFalse(hitProcessor.processHit(1.0f,0.35f,0.5f));
        assertFalse(hitProcessor.processHit(1.0f,-0.35f,0.5f));
        assertFalse(hitProcessor.processHit(-1.0f,-0.35f,0.5f));
    }
    @RepeatedTest(300)
    public void testDotNotInArea(){
        Random random = new Random();
        float r = random.nextFloat()*6+1,x=random.nextFloat()*7-3,y=random.nextFloat()*9-5;
        x = x < 0 ? x - r : x + r;
        y = y < 0 ? y - r : y + r;
        if (x != 0 && y != 0)
            assertFalse(hitProcessor.processHit(x, y, r));
    }


}