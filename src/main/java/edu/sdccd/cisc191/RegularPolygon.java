package edu.sdccd.cisc191;

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){

    }

    public RegularPolygon(int sides, double lengthOfSides){
        n = sides;
        side = lengthOfSides;
    }

    public RegularPolygon(int sides, double lengthOfSides, double xPos, double yPos){
        n = sides;
        side = lengthOfSides;
        x = xPos;
        y = yPos;
    }

    public String getPerimeter(){
        double perimeter;
        perimeter = side * n;

        return "perimeter: " + perimeter;
    }

    public String getArea(){
        double area;
        area = ( n * (side * side) / (4 * Math.tan(Math.PI / n)));

        return "area: " + area;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
