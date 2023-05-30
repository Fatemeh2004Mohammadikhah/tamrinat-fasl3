import java.util.Scanner;

public class Mainclass
{
    public static void main(String[] args)
{
    Scanner reader=new Scanner(System.in);
    int m,n;
    System.out.println("Enter M:");
    m=reader.nextInt();
    System.out.println("Enter n:");
    n=reader.nextInt();
    fisaqures f=new fisaqures(m,n);
    System.out.println(f.mohasebe());
}
}
