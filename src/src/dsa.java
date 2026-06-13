import java.util.*:
public class dsa{
    public void AddProblem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many problems do you want to add:");
        int count = sc.nextInt();
        List<String> problems = new ArrayList<>();
        List<String> difficulty = new ArrayList<>();
        for(int i = 0 ; i<count ; i++){
            System.out.print("Enter Problem name:");
            problems.add(sc.nextLine());
            System.out.print("Enter Difficulty level:");
            difficulty.add(sc.nextLine());
            System.out.println("");
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
