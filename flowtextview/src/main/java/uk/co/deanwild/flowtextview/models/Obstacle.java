package uk.co.deanwild.flowtextview.models;

/**
* Created by Dean on 24/06/2014.
*/
public class Obstacle {
    public int topLeftx;
    public int topLefty;
    public int bottomRightx;
    public int bottomRighty;

    @Override
    public String toString()
    {
        return "TLx " + topLeftx + " TLy " + topLefty + " BRx " + bottomRightx + " BRy " + bottomRighty;
    }
}
