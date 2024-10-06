import java.util.LinkedList;
import java.util.Scanner;

record PlacesWithDistance(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d km)", name, distance);
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList<PlacesWithDistance> placesToVisit = new LinkedList<>();

        PlacesWithDistance adelaide = new PlacesWithDistance("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
//        addPlace(placesToVisit, new PlacesWithDistance("Adelaide", 1374));
        addPlace(placesToVisit, new PlacesWithDistance("adelaide", 1374));
        addPlace(placesToVisit, new PlacesWithDistance("Alice Springs", 2771));
        addPlace(placesToVisit, new PlacesWithDistance("Brisbane", 917));
        addPlace(placesToVisit, new PlacesWithDistance("Darwin", 3972));
        addPlace(placesToVisit, new PlacesWithDistance("Melbourne", 877));
        addPlace(placesToVisit, new PlacesWithDistance("Perth", 3923));

        placesToVisit.addFirst(new PlacesWithDistance("Sydney", 0));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F" :
                    System.out.println("User wants to get forward");
                    if (!forward) {
                        forward = true;
                        if(iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }

                    if(iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case "B" :
                    System.out.println("User wants to go backwards");
                    if (forward) {
                        forward = false;
                        if(iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                    }
                    if(iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case "L" :
                    System.out.println(placesToVisit);
                    break;

                case "M" :
                    printMenu();
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }

    }

    public static void addPlace(LinkedList<PlacesWithDistance> list, PlacesWithDistance placesWithDistance) {

        if (list.contains(placesWithDistance)) {
            System.out.println("Found a duplication: " + placesWithDistance);
            return;
        }

        for(PlacesWithDistance p : list) {
            if(p.name().equalsIgnoreCase(placesWithDistance.name())) {
                System.out.println("Found duplicate: " + placesWithDistance);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace: list) {
            if( placesWithDistance.distance() < listPlace.distance()) {
                list.add(matchedIndex, placesWithDistance);
                return;
            }
            matchedIndex++;
        }

        list.add(placesWithDistance);
    }

    private static void printMenu() {

        System.out.println("""
                Available actions (select a word or letter) :
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
