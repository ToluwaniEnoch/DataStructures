package com.data.neetcode150.intervals;

public class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] intervals = new int[][] { {0, 30}, {5, 10}, {15, 20}};
        System.out.println(numberOfConferenceRooms(intervals));
    }

    private static int numberOfConferenceRooms(int[][] intervals) {
        int[] startTimes = new int[intervals.length];
        int[] endTimes = new int[intervals.length];

        for(int i=0; i< intervals.length; i++){
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][0];
        }

        int rooms = 0;
        int left = 0;
        int right = 0;
        int count = 0;

        while(left < intervals.length){
            if(startTimes[left] < endTimes[right]){
                count++;
                left++;
            }else{
                count--;
                right++;
            }

            rooms = Math.max(rooms, count);
        }
        return rooms;
    }
}
