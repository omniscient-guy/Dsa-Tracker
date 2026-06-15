import java.util.*;
public class dsa{
    public void AddProblem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many problems do you want to add:");
        int count = sc.nextInt();
        sc.nextLine();
        List<String> problems = new ArrayList<>();
        List<String> difficulty = new ArrayList<>();
        for(int i = 0 ; i<count ; i++){
            System.out.print("Enter Problem name:");
            problems.add(sc.nextLine());
            System.out.print("Choose Difficulty:\n1.Low\n2.Medium\n3.High\nEnter Choice: ");
            int choice =  sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    difficulty.add("Low");
                }
                case 2 -> {
                    difficulty.add("Medium");
                }
                case 3 -> {
                    difficulty.add("High");
                }
                default -> {
                    System.out.println("Enter Choice From Above:");
                }
            }

        }
    }
    public void DeleteProblem(){

    }
    public void SearchProblem(){

    }
    public void ViewAllProblem(){

    }
    public void ViewStatics(){

    }
}
