package com.example.deblefer.Classes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticsGeneratorTest {
    @Test
    public void statisticsGeneratorTest(){
        long startTime = System.currentTimeMillis();
        List<Card> unused = new ArrayList<>(Deck.getModifableDeckAsList());
        List<Card> hand = new ArrayList<>();
        List<Card> table = new ArrayList<>();
        Collections.sort(unused);

        hand.add(unused.get(unused.size()-51)); unused.remove(unused.size()-51);
        hand.add(unused.get(unused.size()-50)); unused.remove(unused.size()-50);
        table.add(unused.get(unused.size()-32)); unused.remove(unused.size()-32);
        table.add(unused.get(unused.size()-45)); unused.remove(unused.size()-45);
        table.add(unused.get(unused.size()-14)); unused.remove(unused.size()-14);
     //   table.add(unused.get(unused.size()-20)); unused.remove(unused.size()-20);


        List<Statistics> stats = new ArrayList<>(StatisticsGenerator.getStatistics(3,hand,table,unused));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time: "+elapsedTime);
        double one = 0;
        System.out.println();
        System.out.println("STATISTICS:");
            for(Statistics s : stats){
            System.out.println(s);
            System.out.println(s.getUsedCards());
            one+=s.getChanceOfGetting();
        }
        System.out.println();
        System.out.println("TABLE:"+table);
        System.out.println("HAND: "+hand);
        assertTrue(one<1.001 && one>.999);

    }
}