public class InnermemoryPersistinterview implements PersistInterview{
    String[] interviews = new String[25];
    int numInterviews;
    @Override
    public boolean persistInterviewData(interviewer interview, candidate candidate, position position, boolean interviewResult) {
        String inteview = interview.getName() + " :" + candidate.getName() + " :" + position.getName() +": " + interviewResult;
        interviews[numInterviews++] = inteview;
        return true;
    }
}
