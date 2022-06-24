package com.data.neetcode150.stack;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = { 73,74,75,71,69,72,76,73 };
        System.out.println(dailyTemperatureCalc(temperatures));
    }

    private static int[] dailyTemperatureCalc(int[] temperatures) {
        int[] result = new int[temperatures.length];
        //System.out.println(result);
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new Hashtable<>();
        for (int i=0; i<temperatures.length-1; i++){
            stack.push(i);
            if(map.isEmpty() || map.get(map.size()-1) <= temperatures[i]){
                map.put(i, temperatures[i]);
            }
        }

        for(int i= result.length-1; i>0; i--){
            if(stack.peek() - map.get(map.size()-1) < 0){
                //result[i] = map.();
            }else{
                result[i] = stack.peek() - map.get(map.size()-1);
            }
            stack.pop();

            if(stack.peek() == map.get(map.size()-1)) map.remove(map.size()-1);
        }



        return result;
    }
}
