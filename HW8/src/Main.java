import java.lang.reflect.*;
public class Main {
    public static void printClassInfo(Class<?> classItem) {

        System.out.println("Class Name: " + classItem.getName());

        // Вывод модификаторов доступа
        int modifiers = classItem.getModifiers();
        System.out.println("Modifiers: " + Modifier.toString(modifiers));

        // Вывод суперкласса
        Class<?> superClass = classItem.getSuperclass();
        if (superClass != null) {
            System.out.println("Superclass: " + superClass.getName());
        }

        // Вывод интерфейсов
        Class<?>[] interfaces = classItem.getInterfaces();
        if (interfaces.length > 0) {
            System.out.print("Implemented Interfaces: ");
            for (Class<?> iface : interfaces) {
                System.out.print(iface.getName() + ", ");
            }
            System.out.println();
        }

        // Вывод полей
        Field[] fields = classItem.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println("  " + field.getName() + " : " + field.getType().getName());
            }
        }

        // Вывод методов
        Method[] methods = classItem.getDeclaredMethods();
        if (methods.length > 0) {
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.print("  " + Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName() + "(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++) {
                    System.out.print(parameterTypes[i].getName());
                    if (i < parameterTypes.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println(")");
            }
        }
    }

    public static void main(String[] args) {

        Class<?> classItem = ReflectionExample.class;
        printClassInfo(classItem);
    }
}

