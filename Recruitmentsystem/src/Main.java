import java.util.Scanner;

public class Main extends Person {
        private static reviewer reviewer;
        private static interviewer interviewer;
        private static candidate candidate;
        Main(String name, int phoneno, String emailid) {
            super(name, phoneno, emailid);
        }
        public static void main(String[] args) {
            position position = new position();
            position.position(1, "intern", true);
            position.position(2, "trainee", true);
            position.position(3, "devloper", true);
            position.position(4, "tech lead", false);
//Candidate candidate = new Candidate();
            candidate.candidate("suma", 2345, "suma@gmail.com");
            candidate.candidate("chitti", 8976, "chitti@gmail.com");
            candidate.candidate("lakshmi", 9878, "lakshmi@gmil.com");
            candidate.candidate("naz", 4563, "naz@gmail.com");
            candidate.candidate("latha", 2876, "latha@gmail.com");
            candidate.candidate("samreen", 8967, "samreen@gmail.com");
            candidate.candidate("sam", 7865, "sam@gmail.com");
            candidate.candidate("naziya", 7896, "naziya@gmail.com");
            hiringmanager hiringmanager = new hiringmanager();
            Person person = new Person();
            reviewer[] reviewers = new reviewer[9];
            reviewers[0] = new reviewer("priya", 7330, "priya@gmail.com");
            reviewers[1] = new reviewer("suma", 2345, "suma@gmail.com");
            reviewers[2] = new reviewer("lakshmi", 9878, "lakshmi@gmil.com");
            interviewer interviewer1 = new interviewer();
            interviewer interviewer2 = new interviewer();
            interviewer interviewer3 = new interviewer();
            reviewers[3] = interviewer1;
            reviewers[4] = interviewer2;
            reviewers[5] = interviewer3;
            interviewer[] interviewers = new interviewer[6];
            interviewers[0] = interviewer1;
            interviewers[1] = interviewer2;
            interviewers[2] = interviewer3;
            hiringmanager[] hiringmanagers = new hiringmanager[3];
            hiringmanagers[0] = new hiringmanager("lakshmi", 9878, "lakshmi@gmail.com");
            hiringmanagers[1] = new hiringmanager("priya", 7330, "priya@gmail.com");
            hiringmanagers[2] = new hiringmanager("sam", 7865, "sam@gmail.com");
            reviewers[6] = hiringmanagers[0];
            reviewers[7] = hiringmanagers[1];
            reviewers[8] = hiringmanagers[2];
            interviewers[3] = hiringmanagers[0];
            interviewers[4] = hiringmanagers[1];
            interviewers[5] = hiringmanagers[2];
            candidate[] candidates = new candidate[9];
            candidates[0] = new candidate("priya", 7330, "priya@gmail.com");
            candidates[1] = new candidate("suma", 2345, "suma@gmail.com");
            candidates[2] = new candidate("chitti", 8976, "chitti@gmail.com");
            candidates[3] = new candidate("lakshmi", 9878, "lakshmi@gmil.com");
            candidates[4] = new candidate("naz", 4563, "naz@gmail.com");
            candidates[5] = new candidate("latha", 2876, "latha@gmail.com");
            candidates[6] = new candidate("samreen", 8967, "samreen@gmail.com");
            candidates[7] = new candidate("sam", 7865, "sam@gmail.com");
            candidates[8] = new candidate("naziya", 7896, "naziya@gmail.com");
            position openPosition = position;
            Report report = new PdfReport();
            report.generateReport();
            Report report1 = new HtmlReport();
            report1.generateReport();


            PositionStatus[] positionStatuses = PositionStatus.values();
            for (PositionStatus positionStatus : positionStatuses) {
                System.out.println("position status:" + positionStatus.getCode());
            }
            PositionStatus positionStatus;
            positionStatus = PositionStatus.YET_TO_START;


            CandidateStatus[] candidateStatuses = CandidateStatus.values();
            for (CandidateStatus candidateStatus : candidateStatuses) {
                System.out.println("candidate status:" + candidateStatus.getCode());

            }

            for (candidate candidate : candidates) {
                System.out.println("--------------------------");
                boolean applied = candidate.apply(position);
                report.applyEvent(candidate, position);
                if (!applied) {
                    System.out.println("-----------------------");
                    System.out.println("Processing candidate " + candidate.getName());


                    continue;
                }
// review the candidate
                int trueCount = 0;
                int falseCount = 0;
                for (reviewer reviewer : reviewers) {
                    boolean out = reviewer.review(openPosition,candidate);
                    report.reviewEvent(reviewer , candidate);
                    PersistReview persistReview = new InnermemoryPersistReview();
                    PersistReview.persistReviewdata(reviewer, candidate, openPosition, out);
                    System.out.println("persist review----" + reviewer.review(openPosition, candidate));
                    if (out) {
                        System.out.println("in First Round");
                        trueCount++;
                    } else {
                        System.out.println( "did not clear round");
                        falseCount++;
                    }
                }
                if (trueCount < falseCount) {
                    System.out.printf("candidate didnt clear review round" + candidate.getName());
                    continue;
                }
                trueCount = 0;
                falseCount = 0;
                for (interviewer interviewer : interviewers) {
                    System.out.println("int interview process");
                    System.out.println("for candidate interview" + candidate.getName());
                    boolean out1 = interviewer.interview(openPosition, candidate);
                    report.intervieweEvent(interviewer , candidate);
                    PersistInterview persistInterview = new InnermemoryPersistinterview();
                    persistInterview.persistInterviewData(interviewer, candidate, openPosition, out1);
                    System.out.println("persist interview---" + interviewer.interview(openPosition, candidate));
                    if (out1) {
                        System.out.println("in secound round");
                        trueCount++;
                    } else {
                        System.out.println("didnt clear second round");
                        falseCount++;
                    }
                }
                if (trueCount < falseCount) {
                    System.out.println("Candidate " + candidate.getName() + " didn't clear interview round.");
                    continue;
                }
                hiringmanagers[0].hire();
                report.HireEvent(hiringmanager , candidate);
                Persisthiringmanager persistHiringManager = new InnermemoryPersisthiringmanager();
                persistHiringManager.persisthiringmanagerData(hiringmanager, candidate, position, hiringmanager.hire(openPosition, candidate));
                System.out.println("persist hiringmanger---" + hiringmanager.hire(openPosition, candidate));
                System.out.println("hired the candidate" + candidate.getName() + "position" + openPosition.pname);
            }
        }
    }


  /*  Main(String name, int phoneno, String emailid) {
        super(name, phoneno, emailid);
    }
    public static void main(String[] args) {
        position position = new position();
        candidate candidate = new candidate();
        reviewer reviewer = new reviewer();
        interviewer interviewer = new interviewer();
        hiringmanager hiringmanager = new hiringmanager();
        Person person = new Person();

        System.out.println("Postions        &&     Codes-----------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Intern          &&       1-----------------------");
        System.out.println("Trainee         &&       2-----------------------");
        System.out.println("Developer       &&       3-----------------------");
        System.out.println("Tech Lead       &&       4-----------------------");

        Scanner myObj = new Scanner(System.in);
        int input;
        System.out.println("Enter Position code from above list:");
        input = Integer.parseInt(myObj.nextLine());
        position openPosition = position.getOpenPosition(input);
        if (openPosition != null)
        {
            String name;
            String emailid = Person.emailid;
            int phoneno = Person.phoneno;
            System.out.println("Enter Name:");
            name = myObj.nextLine();
            candidate openCandidate = candidate.apply(name);
            Boolean isReviewSuccess = reviewer.review(openPosition, openCandidate);
            if (isReviewSuccess) {
                System.out.println("Your Resume is short listed..Please wait for interview result...!");
                Boolean isInterviewSuccess = interviewer.interview(openPosition, openCandidate);
                if (isInterviewSuccess) {
                    System.out.println("Candidate is selected. Pending at Hiring manager for salary confirmation!");
                    int salary = hiringmanager.hire();
                    System.out.println("enter phoneno:");
                    name = myObj.nextLine();
                    System.out.println("enter emailid:");
                    name = myObj.nextLine();
                    System.out.println("Salary: " + salary);
                    System.out.println("congratulations.......");

                } else {
                    System.out.println("Candidate is not selected. Please try next time..");
                }
            } else {
                System.out.println("Your Resume is not short listed");
            }
        } else {
            System.out.println("No openings for the position / enter above position codes only");
        }
    }
} */