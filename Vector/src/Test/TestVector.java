package Test;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector(10,20);
		System.out.println("Capacity: "+v.capacity());
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size: "+v.size());
		for(int i=0; i<10; i++)
		{
			v.add(i+20);
		}
		System.out.println(v);
		System.out.println("Size : "+v.size());
		System.out.println("Capacity : "+v.capacity());
		
	

	}

}
