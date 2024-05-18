import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;
import java.sql.SQLRecoverableException;

public class TypeCast {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat(" World");
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
        long pid = ManagementFactory.getRuntimeMXBean().getPid();
        System.out.println("Process ID: " + pid);

    }
}
