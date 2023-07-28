public enum CandidateStatus {

    CANDIDATE_APPLIED("applied"),CANDIDATE_REVIEWED("reviewed"),CANDIDATE_INTERVIEWED("interviewed"),CANDIDATE_HIRED("hired"),REJECTED("rejected");

    String code;

    CandidateStatus(String code) {
        this.code=code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    void setCandidateApplied(){
        CandidateStatus candidateStatus = CandidateStatus.CANDIDATE_APPLIED;
    }

    void setCandidateReviewed(){
        CandidateStatus candidateStatus = CandidateStatus.CANDIDATE_REVIEWED;
    }

    void setCandidateInterviewed(){
        CandidateStatus candidateStatus = CandidateStatus.CANDIDATE_INTERVIEWED;
    }

    void setCandidateHired(){
        CandidateStatus candidateStatus = CandidateStatus.CANDIDATE_HIRED;
    }

    void setRejected(){
        CandidateStatus candidateStatus = CandidateStatus.REJECTED;
    }
}