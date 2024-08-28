public class Main {

    public static void main(String[] args) {

        int playersPosition = calculateHighScorePosition(1500);
        displayScorePosition("Tim", playersPosition);

        playersPosition = calculateHighScorePosition(1000);
        displayScorePosition("Bob", playersPosition);

        playersPosition = calculateHighScorePosition(500);
        displayScorePosition("George", playersPosition);

        playersPosition = calculateHighScorePosition(100);
        displayScorePosition("Peter", playersPosition);

        playersPosition = calculateHighScorePosition(25);
        displayScorePosition("Robert", playersPosition);
    }

    public static void displayScorePosition(String playersName, int playersPosition){
        System.out.println(playersName + " managed to get into position "
                + playersPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playersScore){

        int position = 4;
        if(playersScore >= 1000){
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }

        return position;
    }
}
