import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args){
        Class<candidate> candidateClass = candidate.class;
        Method[] methods = candidateClass.getDeclaredMethods();
        if(methods.length > 0){
            for (int i = 0; i < methods.length; i++){
                System.out.println("methods : " + methods[i]);
                System.out.println("method names : " + methods[i].getName());
                System.out.println("method return name : " + methods[i].getReturnType());
                System.out.println("method modifires : " + Modifier.toString(methods[i].getModifiers()));
                Parameter[] parameters = methods[i].getParameters();
                if(parameters.length > 0){
                    for (int j = 0; j< parameters.length;j++ )
                        System.out.println("parameters : " + parameters[j]);
                }
            }
        }

    }

    public static void main2(String[] args) {

        Class<candidate> candidateClass = candidate.class;
        Field[] fields = candidateClass.getDeclaredFields();
        if (fields.length > 0){
            for (int i =0; i < fields.length;i++){
                Field field  = fields[i];
                field.setAccessible(true);
                System.out.println("fields : " + field);
                System.out.println("field name : " + field.getName() + ";type :" + field.getType());
            }
        }
    }
    public static void main1(String[] args){
        Class<candidate> candidateClass = candidate.class;
        int modifires = candidateClass.getModifiers();
        System.out.println("candidate modifires : " + Modifier.toString(modifires));

        Field[] fields = candidateClass.getDeclaredFields();
        if (fields.length > 0){
            for (int i =0; i < fields.length;i++){
                Field field  = fields[i];
                System.out.println("fields : " + field);
            }
        }

        Constructor[] constructors = candidateClass.getDeclaredConstructors();
        if( constructors.length > 0){
            for (int i = 0; i < constructors.length ; i++){
                System.out.println("constructors : " + constructors[i]);
            }
        }
        Method[] methods = candidateClass.getDeclaredMethods();
        if(methods.length > 0){
            for (int i = 0; i < methods.length; i++){
                System.out.println("methods : " + methods[i]);
            }
        }

        System.out.println("super class :" + candidateClass.getSuperclass());
    }
}
