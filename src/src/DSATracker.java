import java.util.*;

public class DSATracker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dsa problem = new dsa();
        System.out.println("----DSA TRACKER----");
        System.out.println("1.Add Problem");
        System.out.println("2.Delete Problem");
        System.out.println("3.Search Problem");
        System.out.println("4.View All Problem");
        System.out.println("5.Add Statistics");
        System.out.println("");
        System.out.println("Enter Choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> {
                problem.AddProblem();
            }
            case 2 -> {
                problem.DeleteProblem();
            }
            case 3 -> {
                problem.SearchProblem();
            }
            case 4 -> {
                problem.ViewAllProblem();
            }
            case 5 -> {
                problem.ViewStatics();
            }
            case 6 -> {
                System.out.println("THANK YOU FOR USING");
            }
        }


    }
}
