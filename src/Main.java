
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Problem> problems = new ArrayList<>();

        problems.add(new Problem(
                1, "Two Sum", "Arrays", "Easy", "Solved"
        ));

        problems.add(new Problem(
                2, "Binary Search", "Searching", "Easy", "Attempted"
        ));

        while (true) {
            System.out.println("\n===== CodeTrack =====");
            System.out.println("1. View all problems");
            System.out.println("2. Add a problem");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    for (Problem p : problems) {
                        p.display();
                        System.out.println("----------------");
                    }
                    break;

                case 2:
                    System.out.print("Enter problem title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter topic: ");
                    String topic = sc.nextLine();

                    System.out.print("Enter difficulty: ");
                    String difficulty = sc.nextLine();

                    int id = problems.size() + 1;

                    problems.add(new Problem(
                            id, title, topic, difficulty, "Not Started"
                    ));

                    System.out.println("Problem added successfully!");
                    break;

                case 3:
                    System.out.println("Thank you for using CodeTrack!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}