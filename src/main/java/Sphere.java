class Sphere extends Circle{
    public Sphere(double r){
        super(r);
    }

    @Override
    public double area(){
        return 4 * Math.PI * this.radius * this.radius;
    }

    public double volume(){
        return (4.0 / 3) * Math.PI * this.radius * this.radius * this.radius;
    }
}