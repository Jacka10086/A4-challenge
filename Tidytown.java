import java.util.ArrayList;
import java.util.Scanner;

public class TidyTown {
    public static void main(String[] args) {
        TidyTown tidyTown = new TidyTown();
        tidyTown.registerVolunteers();
    }
    private ArrayList<String> volunteers;

    public TidyTown() {
        volunteers = new ArrayList<>();
    }

    public void registerVolunteers() {
        Scanner scanner = new Scanner(System.in);
      

        while (true) {
            System.out.print("Enter a name or xxx to finish > ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("xxx")) {
                break;
            }
            insertInOrder(name);
        }

        System.out.println("\n Tidytown Volunteers");
        System.out.println("------------------- \n");
        displayNames();
    }

    private void insertInOrder(String name) {
        if (volunteers.isEmpty()) {
            volunteers.add(name);
            return;
        }

        int i = 0;
        while (i < volunteers.size() && name.compareToIgnoreCase(volunteers.get(i)) > 0) {
            i++;
        }
        volunteers.add(i, name);
    }

    private void displayNames() {
        for (String volunteer : volunteers) {
            System.out.println(volunteer);
        }
    }

    
}
