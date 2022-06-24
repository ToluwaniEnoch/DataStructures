package com.data.dataStructures;

import java.util.*;

public class AmazonLogs {
    String sessionId;
    String referral;
    String url;
    int timeStamp;

    AmazonLogs(String url, String sessionId, int timeStamp, String referral){
        this.url = url;
        this.sessionId = sessionId;
        this.referral = referral;
        this.timeStamp = timeStamp;
    }

    public static void main(String[] args) {
        List<AmazonLogs> logs = new ArrayList<>();
        logs.add(new AmazonLogs("/", "1", 12, null));
        logs.add(new AmazonLogs("/", "1", 13, "/"));
        logs.add(new AmazonLogs("/search", "1", 14, "/"));
        logs.add(new AmazonLogs("/detail", "1", 15, "/search"));
        logs.add(new AmazonLogs("/reviews", "1", 16, "/detail"));
        logs.add(new AmazonLogs("/help", "2", 17, "/"));
        logs.add(new AmazonLogs("/", "2", 18, "/search"));
        logs.add(new AmazonLogs("/cart", "1", 19, "/detail"));
        logs.add(new AmazonLogs("/cart", "2", 20, "/search"));
        System.out.println(createTraversalList(logs));
    }

    private static boolean createTraversalList(List<AmazonLogs> logs) {
        Map<String, Boolean> truthMap = new HashMap<>();

        Map<String, List<String>> map = new HashMap<>();
        for(AmazonLogs log : logs){
            if(Objects.isNull(log.referral)){
                log.referral = "";
            }
            if(Objects.isNull(log.url)){
                log.url = "";
            }
            if(map.containsKey(log.referral)){
                map.get(log.referral).add(log.url);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(log.url);
                map.put(log.referral, temp);
            }
        }

        boolean detail = isPageLinked(map, "/cart", "/search", truthMap);
        return detail;
    }

    private static boolean isPageLinked(Map<String, List<String>> map, String url, String referral, Map<String, Boolean> truthMap ) {
        if(map.containsKey(referral)){
            List<String> urls = map.get(referral);
            for(String s : urls){
                if(truthMap.containsKey(s)) continue;

                if(Objects.nonNull(s) && s.equals(url)) return true;
                truthMap.put(s, false);
                isPageLinked(map, url, s, truthMap);
            }
        }
        return false;
    }
}

