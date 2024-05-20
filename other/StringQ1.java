package other;
public class StringQ1 {    

	public static void main(String[] args) {
		String hello = "Hello";
        String lo = "lo";
        System.out.println((hello=="Hello")+" ");
        System.out.println((Other.hello==hello)+" ");
        System.out.println((other.Other.hello==hello)+" ");
        System.out.println((hello==("Hel"+"lo"))+" ");
        System.out.println((hello==("Hel"+lo))+" ");
        System.out.println(hello==("Hel"+lo).intern());

}
}
class Other{
    static String hello = "Hello";
}

