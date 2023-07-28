public class InnermemoryPersistReview implements PersistReview{

    String[] reviews = new String[25];
    int numReviews;
    @Override
    public boolean persistReviewData(reviewer reviewer, candidate candidate, position position, boolean reviewResult) {
        String review = reviewer.getName() + " :" + candidate.getName() + " :" + position.getName() +": " + reviewResult;
        reviews[numReviews++] = review;
        return true;
    }
}
