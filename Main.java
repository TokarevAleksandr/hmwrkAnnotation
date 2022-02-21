package sample;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = Foobar.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method mtd : methods) {
            if(mtd.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnn = mtd.getAnnotation(MyAnnotation.class);
                int rezult = (Integer)mtd.invoke(null, myAnn.a(), myAnn.b());
                System.out.println(rezult);
            }

        }
    }
}
