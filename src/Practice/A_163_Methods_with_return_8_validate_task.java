package Practice;

public class A_163_Methods_with_return_8_validate_task {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        if (notEmpty && taskId == currentId + 1) {
            return true;
        } else {
            return false;
        }
    }
}
