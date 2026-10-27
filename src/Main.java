import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Problem> problems = new ArrayList<>();
        problems.add(new Problem(1, "Two Sum", "Arrays", "Easy", "Solved"));
        problems.add(new Problem(2, "Binary Search", "Searching", "Easy", "Attempted"));
        problems.add(new Problem(3, "Valid Anagrams", "Strings", "Easy", "Not Started"));

        System.out.println("Welcome to CodeTrack");
        System.out.println("-------------------------");

        for (Problem problem : problems) {
            problem.display();
            System.out.println("-----------------------------");
        }

        System.out.println("Total Problems :" +problems.size());
    }
    }
