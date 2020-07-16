class Vehicle{
    int wheels;
    String color;
    Vehicle(int wheels){
        this.wheels = wheels;
        color = "Orange";
        
    }
}
public class PNPConstructor
{
	public static void main(String[] args) {
		Vehicle vobj = new Vehicle(2);
		System.out.println("Color of the vechile is  "+vobj.color+", And the no of wheels are "+vobj.wheels);
	}
}
