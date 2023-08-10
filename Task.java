

public class Task {
    private String description;
    private boolean isComplate;
    private String priority;

    public Task(String description,String priority){
        this.description=description;
        this.isComplate=false;
        this.priority=priority;

    }
    public String getDescription(){
        return description;
    }
    public String getPriority(){
        return priority;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setPriority(String priority){
        this.priority=priority;
    }
    public boolean isComplate(){
        return isComplate;
    }




    public String toString(){
        return "Description: "+description+" priority: "+priority;
    }
    public static void main(String[] args) {
        TodoListApp todoListApp=new TodoListApp();
        todoListApp.start();
    }

    public void setompleted(boolean isComplate) {
        this.isComplate=isComplate;
    }
}
