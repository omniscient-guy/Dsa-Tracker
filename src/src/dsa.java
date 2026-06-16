import java.util.*;
public class dsa{
    List<String> problems = new ArrayList<>();
    List<String> difficulty = new ArrayList<>();
    public void AddProblem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many problems do you want to add:");
        int count = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i<count ; i++){
            System.out.print("Enter Problem name:");
            String name = sc.nextLine();
            if(problems.contains(name)){
                System.out.println("Problem Already Present Skipping...");
                i--;
                continue;
            }
            else{
                problems.add(name);
            }
            boolean running = true;
            while(running == true) {
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
                if(choice>=1&&choice<=3){
                    running = false;
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
