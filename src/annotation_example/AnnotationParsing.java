package annotation_example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author Richa
 */
public class AnnotationParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (Method method : AnnotationParsing.class.getClassLoader()
                    .loadClass(("annotation_example.Annotation_example")).getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method.isAnnotationPresent(annotation_example.MethodInfo.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method + "' : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(annotation_example.MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }

                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
