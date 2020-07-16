class Vehicle{
    int wheels;
    String color;
    Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        
    }
    Vehicle(){
        wheels = 10;
        color = "Yellow";
        
    }
}
public class ConstructorOverloading
{
	public static void main(String[] args) {
		Vehicle vobj = new Vehicle(2,"Orange");
		Vehicle vobj1 = new Vehicle();
		System.out.println("Color of the vechile is  "+vobj.color+", And the no of wheels are "+vobj.wheels);
		System.out.println();
		System.out.println("Color of the vechile is  "+vobj1.color+", And the no of wheels are "+vobj1.wheels);
	}
}
