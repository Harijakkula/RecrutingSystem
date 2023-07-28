public class reviewer extends Person{

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    private int numberOfReviews;
    public reviewer(String name, int phoneno, String emailid) {
        super(name , phoneno, emailid);
    }public reviewer() {
    }
    public String getName()    {

        return name;
    }
    public void setname(){
        this.name = name;
    }
    public void setName(String name)    {

        this.name=name;
    }




    public boolean review(final position openPosition, candidate candidate) {
        System.out.println("in review method of Reviewer class for candidate " + candidate.getName());
        int asciiValue = 0;
        for(char ch: candidate.getName().toCharArray()) {
            asciiValue += ch;
        }


        return asciiValue%2 != 0;
    }
}