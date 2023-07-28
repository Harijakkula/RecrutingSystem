public class candidate extends Person{
    private position openPosition;

    public void candidate(String name) {

        }
        public candidate(String name, int phoneno, String emailid) {
        super(name,phoneno,emailid);
    }
    public candidate() {

        }
        public static void candidate(String name, int phoneno, String emailid) {

        }
        public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
   

    public boolean apply (position position)  {
        if (position.is_open()) {
            this.openPosition = position;
            return true;

        } else {
            System.out.println("position not open");
            return false;

        }
    }
}