public class MegaBytesConverter {
    // write code here

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = kiloBytes / 1024;
        int remainedKiloBytes = kiloBytes % 1024;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainedKiloBytes + " KB");
        }

    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2050);
    }
}
