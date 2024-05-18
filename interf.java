interface test{
    void m1();
    void m2();
    void m3();

}
 abstract public class interf implements test {
    
    public void m1(){
        System.out.println("I am implementing m1 in class interf");
    } 
    public void m2(){
        System.out.println("I am implementing m2 in class interf");
    } 
    // public void m3(){
    //     System.out.println("Declared");
    // }

    public static void main(String[] args) {
    }
    
}
 class Demo extends interf{
    public void m3(){
        System.out.println("I am implementing m3 in class Demo");   
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
        d.m2();
        d.m3();
    }
}