public class Person {
    String name;
    static String emailid;
    static int phoneno;
    public Person(String name, int phoneno, String emailid) {
        this.name = name;
        this.phoneno = phoneno;
        this.emailid = emailid;
    }

    public Person() {

    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int phoneno, String emailid) {
    }


}
