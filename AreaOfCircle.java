import java.util.*;

class  AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");		
		float radius=sc.nextFloat();

		float result=3.142f*(radius*radius);
        
		System.out.println("Area of circle ="+result);
	}
}
