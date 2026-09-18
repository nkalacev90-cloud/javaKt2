import task2.DeadlineTask;
import task2.RecurringTask;
import task2.TaskManager;

public class Main {

    public static void main(String[] args) {
        DeadlineTask task1 = new DeadlineTask( "Отметить день рождения", "внутри дома", "12.03.2026", "10.10.2026");
        RecurringTask task2 = new RecurringTask( "Подумать о бытие", "внутри дома","03.10.2026", "в день","12.09.2027");
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        System.out.println(TaskManager.getCountTask());
        taskManager.lookTasks();
        taskManager.sortArrTask();
        taskManager.lookTasks();
        taskManager.delitTask(task1);
        taskManager.lookTasks();
        System.out.println(taskManager);

//        System.out.println(user3.getCountTask);
    }
}
