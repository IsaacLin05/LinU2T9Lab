public class RightTriangleRunner {
    public static void main(String[] args)
    {
        RightTriangle rightTriangle1= new RightTriangle(3,4);
        System.out.println(rightTriangle1.Hypotenuse());
        RightTriangle rightTriangle2= new RightTriangle(6.5, 10.7);
        System.out.println(rightTriangle2.Hypotenuse());



        RightTriangle rightTriangle3= new RightTriangle(43.2, 104.2);
        System.out.println(rightTriangle3.Hypotenuse());
        System.out.println(rightTriangle3.getInfo());
    }
}
