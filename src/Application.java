import com.applications.world.hello.Compiler;

public class Application {

    // Compiler class is a facade, it can add two numbers with following
    // expression: 1 + 2
    // all other operations are not supported
    public static void main(String[] args) {

        try {
            System.out.println(Compiler.compile("1 + 2"));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
