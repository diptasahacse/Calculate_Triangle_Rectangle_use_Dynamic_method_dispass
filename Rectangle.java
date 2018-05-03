public class Rectangle extends Super{
    
    double base,hight;
    
    
    Rectangle(double base,double hight)
    {
        this.base = base;
        this.hight = hight;
    }
    @Override
    double area()
    {
        System.out.print("Rectangle Area is :");
        return .5*base*hight;
    }
    
    
}
