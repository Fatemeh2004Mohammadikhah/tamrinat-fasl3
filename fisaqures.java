public class fisaqures {
      private int m,n;
    public fisaqures(int m1,int n1) {
        m=m1;
        n=n1;
    }
    public String mohasebe()
    {
        int side1= (m*m)-(n*n);
        int side2=2*m*n;
        int Hypotenuse=(m^2)+(n^2);
        return "side1:"+side1+"side2:"+side2+"Hypotenuse"+Hypotenuse;
    }
}
