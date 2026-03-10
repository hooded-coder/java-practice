import java.util.*;
class StudyPlanner
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String tasks[]=new String[10];
    int count=0;
    int choice;
    
    do
    {
        System.out.println("\nSTUDENT STUDY PLANNER");
        System.out.println("Add tasks");
        System.out.println("Veiw tasks");
        System.out.println("Exit ");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        sc.nextLine();
        if(choice == 1)
        {
            System.out.println("Enter study task:");
            tasks[count]=sc.nextLine();
            count++;
        }
        else if(choice == 2)
        {
            System.out.println("\nYour Tasks");
            for(int i=0;i<count;i++)
            {
                System.out.println((i+1)+"."+tasks[i]);
            }
        }
    }while(choice!=3);
}
}
