public abstract class Report {
    private int numofCandidates;
    private int numofPositions1;
    private int numberOfReviews;
    private int numOfInterviews;
    private int numOfHires;

    public void applyEvent(candidate candidate, position position1) {
        numofCandidates++;
        System.out.println("numof candidates applied:" + numofCandidates +"," + candidate.getName());
        numofPositions1++;
        System.out.println("numof positions:" + numofPositions1 + "," + position1.getPname());

    }

    public void reviewEvent(reviewer reviewer, candidate candidate) {
        numberOfReviews++;
        System.out.println("numof reviweing done:" + numberOfReviews + "," + reviewer.getNumberOfReviews());
    }

    public void intervieweEvent(interviewer interviewer, candidate candidate) {
        numOfInterviews++;
        System.out.println("numof interviewes done:" + numOfInterviews + "," + interviewer.getNumoOfInterviewers());
    }

    public void HireEvent(hiringmanager hiringManager, candidate candidate) {
        numOfHires++;
        System.out.println("numof hires:" + numOfHires + "," + hiringManager.getNumOfHires());
    }



    public abstract boolean generateReport();






}

