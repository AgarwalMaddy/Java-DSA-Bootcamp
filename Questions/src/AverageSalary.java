import java.util.*;
public class AverageSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double averageSalary = 0 , sum = 0;
        int count = 0;
        for(int i = 1 ; i < salary.length - 1 ; i++){
            sum += salary[i];
            count++;
        }

        averageSalary = sum / count;
        return averageSalary;
    }

    public static void main(String[] args) {
        int[] arr = {4000, 3000, 1000, 2000};
        System.out.println(average(arr));
    }
}
