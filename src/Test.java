import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tianyang on 3/13/16.
 */
public class Test {
    private int[] list = new int[10];
    public int fibonacci(int i){
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fibonacci(i-1) + fibonacci(i-2);
    }

    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempResult = new ArrayList<>();
        result.add(tempResult);
        Arrays.sort(nums);
        for (int curr : nums){
            for (List<Integer> sub : result){
                tempResult = new ArrayList<>(sub);
                tempResult.add(curr);
                result.add(tempResult);
            }
        }
        return result;
    }










    public static void main(String[] args){
        Test test = new Test();
        System.out.print(test.fibonacci(5));
    }
}
