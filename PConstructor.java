class Vehicle{
    int wheels;
    String color;
    Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
    }
}
public class PConstructor
{
	public static void main(String[] args) {
		Vehicle vobj = new Vehicle(2,"Orange");
		System.out.println("Color of the vechile is  "+vobj.color+", And the no of wheels are "+vobj.wheels);
	}
}