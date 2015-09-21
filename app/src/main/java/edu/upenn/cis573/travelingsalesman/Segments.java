package edu.upenn.cis573.travelingsalesman;

import android.graphics.Color;
import android.graphics.Point;
import java.util.*;
/**
 * Created by linjie on 9/20/15.
 */
public class Segments {


    protected ArrayList<Line> list = new ArrayList<Line>();
    protected int color = Color.RED;
    protected int width = 10;

    public boolean isCircuit() {
        // detects whether the segments form a circuit
        boolean isCircuit = true;
        HashSet<Line> set = new HashSet<Line>();
        for (Line li: list) {
            set.add(li);
        }
        if (list.size() > 0) {
            Point start = list.get(0).getStartPoint();
            Point next = list.get(0).getEndPoint();
            set.remove(list.get(0));
            boolean flag = false;
            while (set.size() != 0 && !next.equals(start) && !flag) {
                for (Line li: set) {
                    if (li.getStartPoint().equals(next)) {
                        next = li.getEndPoint();
                        flag = false;
                        set.remove(li);
                        break;
                    } else if (li.getEndPoint().equals(next)) {
                        next = li.getStartPoint();
                        set.remove(li);
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
            }
            if (flag) {
                isCircuit = false;
            }
            if (next.equals(start) && set.size() != 0) {
                isCircuit = false;
            }
            if (set.size() == 0 && !next.equals(start)) {
                isCircuit = false;
            }
            if (set.size() == 0 && next.equals(start)) {
                isCircuit = true;
            }

        }

        return isCircuit;
    }
    
    public void addItem(Line line) {
        list.add(line);
    }

    public void clearAll() {
        list.clear();
    }

    public Line getLast() {
        return list.get(list.size() - 1);
    }

    public void removeLast() {
        list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ArrayList<Line> getList() {
        return this.list;
    }

}
