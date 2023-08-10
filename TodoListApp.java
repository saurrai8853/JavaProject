import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApp {
    private List<Task> tasks;
    Scanner sc=new Scanner(System.in);

    public TodoListApp(){
        tasks =new ArrayList<>();
        sc =new Scanner(System.in);
    }
    public void start(){
        boolean exit=false;
        while(!exit){
            displayMenu();
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskCompleted();
                    break;
                case 3:
                    viewTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    exit=true;
                    break;
                default:
                    System.out.println("Choice is wrong!!");

            }
        }
        System.out.println("Goodbye..");
        sc.close();
    }
    private void displayMenu(){
        System.out.println("\n----To do List Menu-----");
        System.out.println("1.Add Task");
        System.out.println("2.Mark Task is complated..");
        System.out.println("3.View Task");
        System.out.println("4.Delete Task");
        System.out.println("5.Exit");
        System.out.println("Enter your choice:");

    }
    private void addTask(){
        System.out.println("\n---Add Task----");
        System.out.println("Enter task describtion");
        String description=sc.nextLine();

        System.out.println("Enter Task priority");
        String priority=sc.nextLine();

        Task task=new Task(description,priority);
        tasks.add(task);
        System.out.println("Tasks added succesfully..");
    }

private void markTaskCompleted(){
    System.out.println("\n---Mark the task as complated");
    viewTask();
    System.out.println("Enter the index of task as mark of completed..");
    int index=sc.nextInt();
    sc.nextLine();
    if(index>=0 &&index<tasks.size()){
        Task task=tasks.get(index);
        task.setompleted(true);
        System.out.println("Task marks as complated");
    }
    else{
        System.out.println("Invalid Task..");
    }
}
private void viewTask(){
    System.out.println("\n---View Task---");
    if(tasks.isEmpty()){
        System.out.println("No Task in the to do list");
    }
    else {
        for(int i=0;i< tasks.size();i++){
            Task task =tasks.get(i);
            System.out.println(i+ ". " + task.getDescription() + " - Priority: " + task.getPriority() + " - Completed: " + task.isComplate());
        }
    }
}
private void deleteTask(){
    System.out.println("\n--Delete the Task--");
    System.out.println("Enter the index of task that we have to delete");
    int index=sc.nextInt();
    sc.nextLine();
    if(index>=0 && index< tasks.size()){
        tasks.remove(index);
        System.out.println("Task deleted Successfully");

    }
    else{
        System.out.println("Invalid index");
    }
}


}
