import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class trial {
    public static void main(String[] args) {
        int[][] points = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        Map<Double, int[]> map = new HashMap<>();
        PriorityQueue<Double> queue = new PriorityQueue<>();

        for(int[] num : points){
            double distance = calculateDistance(num);
            map.put(distance, num);
            queue.add(distance);

        }

        int[][] result = new int[k][2];
        int i=0;
        while(k>0){
            double n = queue.poll();
            result[i] = map.get(n);
            i++;
            k--;

        }
        System.out.println(result);
    }

    private static double calculateDistance(int[] num){
        int s = num[0] * num[0] + num[1] * num[1];
        double root = Math.sqrt(s);
        return root;
    }


}
