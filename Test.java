import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        
        double height,base,length,weight;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Height :");
        height = scan.nextDouble();
        System.out.print("Enter Base :");
        base = scan.nextDouble();
        System.out.print("Enter Weight :");
        weight = scan.nextDouble();
        System.out.print("Enter Length :");
        length = scan.nextDouble();
        System.out.println();
        Super[] s = new Super[2];
        
        s[0] = new Rectangle(base,height);
        s[1] = new Triangle(length,weight);
        
        for (Super x : s) {
            System.out.println(x.area());
        }
        
    }
    
}
