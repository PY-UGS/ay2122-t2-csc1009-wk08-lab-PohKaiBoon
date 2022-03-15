public class CircleWithException  {
 
    private double radius;

    public CircleWithException(double radius) {
        if (radius <=0) {
            throw new IllegalArgumentException("Radius must be positive number!!");
        }
        else {
            this.radius= radius;
        }
        
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {

        return this.radius*2;
    }

    public double getArea() throws Exception {

        double area= Math.PI*this.radius*this.radius;
        if (area>1000) {
            throw new Exception("Area more than 1000!!");
        }
        return area;
    }


}
