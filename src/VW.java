
public class VW extends Vehicle
{
	public void Drive()
	 {
		System.out.println("VW Drive"); 
	 }
	 public static void main(String[] args) {

		 Vehicle v = new BMW();
		 Vehicle vw = new VW();
		 
		 v.Drive();
		 vw.Drive();
		 
		 
	 }
}
	