
    public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        /* Returns the area of the circle with given radius
           Area of a circle = pi * r ^ 2
           Use Math.PI for pi and use the pow method
         */
        public double area() {
            return (Math.PI * (radius) * (radius)); /* implement this method! */
        }


        /* Returns the circumference of the circle with given radius
           Circumference of a circle = pi * 2 * r
           Use Math.PI for pi
         */
        public double circumference() {
            return radius * 2 * Math.PI; /* implement this method! */
        }


        /* Setter method to update the radius of the circle to newRadius
         */
        public void setRadius(double newRadius) {
            radius = newRadius;/*s implement this method! */
        }


        /* Returns a String that includes info about the circle,
           including its radius, area, and circumference on separate lines;
           see example output below (Reminder: the new line escape
           sequence \n allows you to include new lines in Strings!)
           Note that this method should return a string -- it should NOT
           do any printing. This method should call your other methods!
         */
        public String getInfo() {
          String getInfo;
          double a =  area();
          double b =  circumference();
          double c =  radius;
          getInfo="Area = " + a + "\n" + "Circumference = " + b + "\n" + "Radius = " + c;
          return getInfo;

            /* implement this method! */
        }
    }

