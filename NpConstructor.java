class Vehicle{
    int wheels;
    String color;
    Vehicle(){
        wheels = 2;
        color = "yellow";
    }
}
public class NpConstructor
{
	public static void main(String[] args) {
		Vehicle vobj = new Vehicle();
		System.out.println("Color of the vechile is  "+vobj.color+", And the no of wheels are "+vobj.wheels);
	}
}
