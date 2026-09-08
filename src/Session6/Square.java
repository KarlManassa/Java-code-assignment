package Session6;

import Session4.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }
}