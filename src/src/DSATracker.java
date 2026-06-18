import java.util.*;

public class DSATracker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dsa problem = new dsa();
        boolean running = true;
        while(running==true){
            System.out.print("----DSA TRACKER MENU----\n1.Add Problem\n2.Delete Problem\n3.View All Problem\n4.Add Statistics\n5.Exit\nEnter Choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1 -> {
                    problem.AddProblem();
                }
                case 2 -> {
                    problem.DeleteProblem();
                }
//                case 2 -> {
//                    problem.SearchProblem();
//                }
                case 3 -> {
                    problem.ViewAllProblem();
                }
                case 4 -> {
                    problem.ViewStatics();
                }
                case 5 -> {
                    System.out.println("THANK YOU FOR USING");
                    running = false;
                }
                default -> {
                    System.out.println("----------INVALID CHOICE PLEASE CHOOSE FROM ABOVE OPTIONS----------");
                }
            }
        }

    }
}