
package Project;

public class Triangle extends Super{
    
    double length,weight;
    Triangle(double length,double weight)
    {
        this.length=length;
        this.weight = weight;
    }
    @Override
    double area()
    {
        System.out.print("Triangle Area is :");
        return length*weight;
    }
    
}
