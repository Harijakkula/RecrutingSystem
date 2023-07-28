public interface PersistReview {
    static void persistReviewdata(reviewer reviewer, candidate candidate, position position1, boolean out) {
    }

    boolean persistReviewData(reviewer reviewer, candidate candidate, position position1, boolean reviewResult);
}
