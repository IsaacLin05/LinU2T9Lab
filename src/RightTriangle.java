public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height)
    {
        this.base=base;
        this.height=height;
    }

    public double Hypotenuse()
    {
        double c = Math.sqrt((Math.pow(base, 2)+(Math.pow(height, 2))));
        return c;
    }

    public String getInfo()
    {
     String info;
     double a = height;
     double b = base;
     double c = Hypotenuse();
     info = "Height = " + a + "\n" + "Base = " + b + "\n" + "Hypotenuse = " + c;
        return info;

    }
}
