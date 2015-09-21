package edu.upenn.cis573.travelingsalesman;

import android.graphics.Point;
import java.util.ArrayList;

/**
 * Created by linjie on 9/20/15.
 */
public class Stroke {
    protected ArrayList<Point> coordinates = new ArrayList<Point>();
    protected Point p1;
    protected int color;
    protected int width;
    protected boolean isValid = false;

    public Stroke() { }

    public Stroke(int color, int width) {
        this.color = color;
        this.width = width;
    }

    public void addPoint(int x, int y) {
        coordinates.add(new Point(x, y));
    }

    public void addPoint(Point p) {
        coordinates.add(p);
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void clearAll() {
        coordinates.clear();
    }

    public int getWidth() {
        return this.width;
    }

    public int getColor() {
        return this.color;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public ArrayList<Point> getCoordinates() {
        return this.coordinates;
    }

    public Point getStartPoint() {
        return coordinates.get(0);
    }

    public Point getEndPoint() {
        return coordinates.get(coordinates.size()-1);
    }

}
