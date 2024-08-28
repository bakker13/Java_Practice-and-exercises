public class PlayingCat {
    // write code here

    public static boolean isCatPlaying(boolean summer, int temperature){

        if(temperature >= 25 && temperature <= 35){
            return true;
        } else if (summer == true && temperature >= 25 && temperature <= 45){
            return true;
        } else {
            return false;
        }

    }
}

/*
public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
*/