package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    byte myChallengeByte = 10;
	    short myChallengeShort = 20;
	    int myChallengeInt = 50;
	    long myChallengeLong = 50000L + 10L * (myChallengeByte + myChallengeShort + myChallengeInt);

        System.out.println(myChallengeLong);

    }
}
