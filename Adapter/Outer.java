
public class Outer {
	
	private class Inner{
		public void showInner() {
			System.out.println("Inside Inner Class ");
		}
	}
	public void showOuter() {
		System.out.println("Calling Inner Class Method ");
		Inner in = new Inner();
		in.showInner();
	}
	public static void main(String[] Args) {
		Outer out = new Outer();
		out.showOuter();
	}
}
 
