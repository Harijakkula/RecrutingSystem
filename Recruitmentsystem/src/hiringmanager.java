import java.util.Random;
public class hiringmanager extends interviewer{
    public int getNumOfHires() {
        return numOfHires;
    }

    public void setNumOfHires(int numOfHires) {
        this.numOfHires = numOfHires;
    }

    private int numOfHires;
    public hiringmanager(String name, int phoneno, String emailid) {
        super();
    }
    public hiringmanager() {
        super();
    }
    public int hire() {
        Random r = new Random(System.currentTimeMillis());
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    public String getName()    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override public boolean interview(position openPosition, candidate candidate)
    {
        System.out.println("harikrishna is reviewing candidate:" + candidate.getName());
        return super.interview(openPosition, candidate);
    }
    @Override public boolean review(position openPosition, candidate candidate) {
        System.out.println("harikrishna is revewing candidate:" + candidate.getName());
        return super.review(openPosition, candidate);
    }

    public boolean hire(position openPosition, candidate candidate) {
        return false;
    }

}