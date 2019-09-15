
package cs.jfl;

import java.sql.Date;

public class HelloWorld {
    final Date a;

    public HelloWorld() {
        a = null;
    }

    String f() {
        return "Hello World !";
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        String s = hw.f();
        System.out.println(s);
    }
}
