import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main{
    public static void main(String[] args){
        try{
            String className = "ReflectionExample";
            String methodName = "outputEverything";

            Class <?> classSample = Class.forName(className);

            Constructor<?> constructor = classSample.getConstructor(String.class, int.class);
            Object instance = constructor.newInstance("NameSample", 20);

            Method method = classSample.getMethod(methodName);

            method.invoke(instance);

        }catch (ClassNotFoundException e){
            System.err.println("Class not found: " + e.getMessage());

        }catch (NoSuchMethodException e){
            System.err.println("Method not found: " + e.getMessage());

        }catch (Exception e){
            System.err.println("An error has occured: " + e.getMessage());

        }
    }
}