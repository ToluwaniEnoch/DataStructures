package com.data.neetcode150.arraysAndHashing;

import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeString {
        public String encode(List<String> strs) {
            String encodedMessage = "";
            for(int i=0; i<strs.size(); i++){
                String message = strs.get(i) + ":;";
                encodedMessage += message;
            }
            System.out.println(encodedMessage);
            return encodedMessage;
        }

        /*
         * @param str: A string
         * @return: dcodes a single string to a list of strings
         */
        public List<String> decode(String str) {
            String[] result = str.split(":;");
            return Arrays.asList(result);

        }

}
