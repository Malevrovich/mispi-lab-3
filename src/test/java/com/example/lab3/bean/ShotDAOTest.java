package com.example.lab3.bean;

import com.example.lab3.bean.ShotDAO;
import com.example.lab3.models.Shot;
import com.example.lab3.util.HitProcessor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.List;


public class ShotDAOTest{
	static ShotDAO shotDao = new ShotDAO();

    @Test
    public void testShotAdded(){
    	Shot shot = new Shot();
    	shotDao.addShot(shot);
    	List<Shot> shots = shotDao.getShots();
    	assertEquals(shot, shots.get(shots.size() - 1));
    }
}