package annotation_example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richa
 */
public class Annotation_example {

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException raises FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        genericsTest();
    }

    @Override
    @MethodInfo(author = "Richa", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Overriden toString method";
    }

    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    /**
     * @throws FileNotFoundException raises FileNotFoundException
     */
    @SuppressWarnings({"unchecked", "deprecation"})
    @MethodInfo(author = "Richa", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        System.out.println(l);
        oldMethod();
    }
}
