package Rectngle;

public class Rectngle {
    private double length;
    private double width;
    public Rectngle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }

}
