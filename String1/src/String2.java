
public class String2 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = a.concat(" World");
		System.out.println(a);
		System.out.println(b);
		StringBuilder c = new StringBuilder("Hi");
		c.append("How");
		System.out.println(c);
		String s="abc,yy,hh,rr-tt";
		String[] arr=s.split(",");
		String s3="aaa";
		String s2=s3.join(":", arr);
		System.out.println(s2);
		String s11="Happy Life";
	}

}
