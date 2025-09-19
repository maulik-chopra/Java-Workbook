import java.util.Scanner;
public class AreaApp {
    public static void main(String[] args){
        System.out.println("Maulik,24csu302");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        int l=sc.nextInt();
        System.out.print("Enter breadth: ");
        int b=sc.nextInt();
        Area a=new Area(l,b);
        System.out.println("Area: "+a.returnArea());
        sc.close();
    }
}
