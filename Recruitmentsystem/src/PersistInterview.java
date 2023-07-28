public interface PersistInterview {
    static void persistInterviewdata(interviewer interview, candidate candidate, position position1, boolean out) {
    }

    boolean persistInterviewData(interviewer interview, candidate candidate, position position1, boolean interviewResult);
}
