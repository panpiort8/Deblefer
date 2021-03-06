package com.example.deblefer.Classes;

import com.example.deblefer.Cards.Figure;
import com.example.deblefer.Cards.FiguresSet;
import com.example.deblefer.Statistics.Statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StatisticsTest {
    @Test
    public void testStatistics(){
        List<Statistics> stats = new ArrayList<>();
        Collection<Figure> figures = FiguresSet.getModifableFigures();
        Iterator<Figure> iterator = figures.iterator();
        Double[] tab = new Double[]{123d, 12d, 0.213, 31.123, 0.123123, 123.1231, 2131.0, 0d, 0d};
        for(Double i : tab)
            for(Double j : tab)
                stats.add(new Statistics(iterator.next(), i, j,0,null));
        System.out.println(stats);
    }
}