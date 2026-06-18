import java.util.*;
public class dsa{
    List<String> problems = new ArrayList<>();
    List<String> difficulty = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
        public void AddProblem(){
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
        if(problems.size()==0){
            System.out.println("No problem present in database!! Store Problems first!!");
            return;
        }
        boolean running = true;
        int delete = 0;
        while(running == true){
            System.out.print("How many problems you want to delete:");
            delete = sc.nextInt();
            sc.nextLine();
            if(delete>problems.size()){
                System.out.print("Number of Problems you want to delete are more than the problems data contains:\n");
                System.out.println("Please Enter Problems less than equal to--> " + problems.size());
            }
            else{
                running = false;
            }
        }
        int dlt = 0;
        for(int i = 0 ; i<delete ; i++){
            System.out.println("enter problem name:");
            String name = sc.nextLine();
            if(problems.contains(name)){
                for(int j = 0 ; j<problems.size() ; j++){
                    if(problems.get(j).equals(name)){
                        dlt = j;
                        break;
                    }
                }
                problems.remove(dlt);
                difficulty.remove(dlt);
                System.out.println("Problem removed");
            }
            else{
                System.out.println("Problem doesnt exist!! Enter problem name that exists");
                i--;
            }
        }
    }
//    public void SearchProblem(){
//        if(problems.size()==0){
//            System.out.println("No problem present in database!! Store Problems first!!");
//            return;
//        }
//

//    }
    public void ViewAllProblem(){
        if(problems.size()==0){
            System.out.println("There are Zero Problems in Database!! Emter problems first");
            return;
        }

    }
    public void ViewStatics(){
        if(problems.size()==0){
            System.out.println("No problem present in database!! Store Problems first!!");
            return;
        }
    }
}
//in difficulty i have not made feature to tackle string and other data type input other than integer i dont have sufficient knowledge