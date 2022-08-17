package com.data.neetcode150.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
    public static void main(String[] args) {
        //int[][] intervals = new int[][] { {0, 30}, {5, 10}, {15, 20}};
        int[][] intervals = new int[][] { {0, 4}, {5, 10}, {15, 20}};
        System.out.println(canAttendMeetings(intervals));
    }

    private static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        int[] currentMeeting = intervals[0];
        for(int i=1; i < intervals.length; i++){
            int[] nextMeeting = intervals[i];
            int nextStart = nextMeeting[0];
            int nextEnd = nextMeeting[1];

            if(currentMeeting[1] > nextStart){
                return false;
            }
            currentMeeting = nextMeeting;
        }

        return true;
    }
}
