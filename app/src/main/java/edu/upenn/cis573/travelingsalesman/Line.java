package edu.upenn.cis573.travelingsalesman;

import android.graphics.Point;

/**
 * Created by linjie on 9/20/15.
 */
public class Line {
    protected Point p1;
    protected Point p2;
    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getStartPoint() {
        return p1;
    }

    public Point getEndPoint() {
        return p2;
    }

    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        double dist = Math.sqrt(dx*dx + dy*dy);
        return dist;
    }

}
