public class interviewer extends reviewer{
    public int getNumoOfInterviewers() {
        return numoOfInterviewers;
    }

    public void setNumoOfInterviewers(int numoOfInterviewers) {
        this.numoOfInterviewers = numoOfInterviewers;
    }

    private int numoOfInterviewers;
    public interviewer(String name, int phoneno,String emailid){
        super(name, phoneno, emailid);
    }
    public interviewer() {
        super();
    }

    @Override public boolean review(position openPosition, candidate candidate) {
        System.out.println("krishna reviewing candidate:" + candidate.getName());
        return super.review(openPosition, candidate);
    }


    public boolean interview(position openPosition, candidate candidate) {
        System.out.println("in interview method of Interviewer class for candidate " + candidate.getName());
        int asciiValue = 0;
        for(char ch: candidate.getName().toCharArray()) {
            asciiValue += ch;
        }

        int num = asciiValue/10;
        int reminder = asciiValue%10;
        while(num > 0 || reminder > 9) {
            if(num == 0) {
                num = reminder;
                reminder = 0;
            }
            num = num/10;
            reminder += num%10;
        }

        return reminder%2 != 0;
    }
}


