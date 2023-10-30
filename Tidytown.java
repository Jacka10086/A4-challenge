package Assignments.Com410.A4;
import java.util.ArrayList;
import java.util.Scanner;

public class TidyTown {

    public static void main(String[] args) {

        ArrayList<String> volunteers = new ArrayList<String>();
        boolean finished = false;
        Scanner keyboard = new Scanner(System.in);
        String name;
        int pos;

        do {
            System.out.print("Enter a name or xxx to finish > ");
            name = keyboard.nextLine();
            if (name.equals("xxx"))
                finished = true;
            else {
                pos = 0;
                while (pos < volunteers.size() && name.compareTo(volunteers.get(pos)) > 0) pos++;
                volunteers.add(pos, name);
            }
        } while (!finished);

        System.out.println("\nTidytown Volunteers\n-------------------\n");
        for (String person : volunteers) {
            System.out.println(person);
        }
    }

}
