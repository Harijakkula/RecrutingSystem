import java.lang.reflect.*;

public class PositionReflection {
    public static void main(String[] args) {
        Class<position> position1Class = position.class;
        int modifires = position1Class.getModifiers();
        System.out.println("candidate modifires : " + Modifier.toString(modifires));


        Field[] fields = position1Class.getDeclaredFields();
        if (fields.length > 0) {
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
                System.out.println("fields : " + field);
                System.out.println("field name : " + field.getName() + ";type :" + field.getType());
            }
        }
        Constructor[] constructors = position1Class.getDeclaredConstructors();
        if (constructors.length > 0) {
            for (int i = 0; i < constructors.length; i++) {
                System.out.println("constructors : " + constructors[i]);
            }
        }
        Method[] methods = position1Class.getDeclaredMethods();
        if (methods.length > 0) {
            for (int i = 0; i < methods.length; i++) {
                System.out.println("methods : " + methods[i]);
                System.out.println("method names : " + methods[i].getName());
                System.out.println("method return name : " + methods[i].getReturnType());
                System.out.println("method modifires : " + Modifier.toString(methods[i].getModifiers()));
                Parameter[] parameters = methods[i].getParameters();
                if (parameters.length > 0) {
                    for (int j = 0; j < parameters.length; j++)
                        System.out.println("parameters : " + parameters[j]);
                }
            }
            System.out.println("super class :" + position1Class.getSuperclass());
        }
    }
}