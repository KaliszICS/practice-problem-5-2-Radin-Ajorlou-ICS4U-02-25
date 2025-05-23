class Circle{

    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double diameter(){
        return this.radius * 2;
    }

    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }
}