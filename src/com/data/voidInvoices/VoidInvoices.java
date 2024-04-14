package com.data.voidInvoices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class VoidInvoices {
    public static void main(String[] args) throws IOException, InterruptedException {

        String filePath = "/Users/toluwani/Documents/projects/DataStructures/src/com/data/dataStructures/invoice.txt";
        // Specify the file path here
        List<String> lines = readLinesFromFile(filePath);
        String url = "https://api.xero.com/api.xro/2.0/Invoices/";

        // Print the lines read from the file
        for (String number : lines) {
            System.out.println("trying to void " + number);
            Payload payload = new Payload(number, "VOIDED");

            System.out.println(payload.toString());
            TimeUnit.SECONDS.sleep(1);



            sendPostRequest(url + number, payload);
        }

    }



    public static String sendPostRequest(String url, Payload data) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        // Prepare the request body
        StringBuilder requestBody = new StringBuilder();
//        for (Map.Entry<Object, Object> entry : data.entrySet()) {
//            requestBody.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
//        }
//        String requestBodyString = requestBody.toString();

        String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjFDQUY4RTY2NzcyRDZEQzAyOEQ2NzI2RkQwMjYxNTgxNTcwRUZDMTkiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJISy1PWm5jdGJjQW8xbkp2MENZVmdWY09fQmsifQ.eyJuYmYiOjE2OTY0OTcwNzIsImV4cCI6MTY5NjQ5ODg3MiwiaXNzIjoiaHR0cHM6Ly9pZGVudGl0eS54ZXJvLmNvbSIsImF1ZCI6Imh0dHBzOi8vaWRlbnRpdHkueGVyby5jb20vcmVzb3VyY2VzIiwiY2xpZW50X2lkIjoiRUUwQzhGMkRFRDAzNDMzQTlEREE0NkVDMDcyQTA2REUiLCJzdWIiOiJjY2QwOTRiMjY5YjY1ZWUwYWY4ZGNiZmRjMjQ0OWJmMyIsImF1dGhfdGltZSI6MTY5NjQ5NDU2OSwieGVyb191c2VyaWQiOiI2MjYxMjc2Ni01MDQ5LTQyNGMtODQ3MS1kZWJiZWQ2OGZiNGIiLCJnbG9iYWxfc2Vzc2lvbl9pZCI6IjlmYmIxZTA5Njk3YzQyYjdhNGY1ODdlM2Q3ZTYxNGQyIiwic2lkIjoiOWZiYjFlMDk2OTdjNDJiN2E0ZjU4N2UzZDdlNjE0ZDIiLCJqdGkiOiI3M0M2Q0IwRUJGNzQ1REQ4NDkxMzg2QTkwREU5NTQxQSIsImF1dGhlbnRpY2F0aW9uX2V2ZW50X2lkIjoiZjNjNjUwYzktMmI4Ni00YWRiLTk2NDQtZWUyYjhkNTgwMTViIiwic2NvcGUiOlsiZW1haWwiLCJwcm9maWxlIiwib3BlbmlkIiwiYWNjb3VudGluZy5yZXBvcnRzLnJlYWQiLCJmaWxlcyIsInBheXJvbGwuZW1wbG95ZWVzIiwicGF5cm9sbC5wYXlydW5zIiwicGF5cm9sbC5wYXlzbGlwIiwicGF5cm9sbC50aW1lc2hlZXRzIiwicHJvamVjdHMiLCJhY2NvdW50aW5nLnNldHRpbmdzIiwiYWNjb3VudGluZy5hdHRhY2htZW50cyIsImFjY291bnRpbmcudHJhbnNhY3Rpb25zIiwiYWNjb3VudGluZy5qb3VybmFscy5yZWFkIiwiYXNzZXRzIiwiYWNjb3VudGluZy5jb250YWN0cyIsInBheXJvbGwuc2V0dGluZ3MiLCJmaW5hbmNlLmNhc2h2YWxpZGF0aW9uLnJlYWQiLCJhY2NvdW50aW5nLmJ1ZGdldHMucmVhZCIsImFjY291bnRpbmcucmVwb3J0cy50ZW5uaW5ldHluaW5lLnJlYWQiLCJmaW5hbmNlLnN0YXRlbWVudHMucmVhZCIsImZpbmFuY2UuYWNjb3VudGluZ2FjdGl2aXR5LnJlYWQiLCJmaW5hbmNlLmJhbmtzdGF0ZW1lbnRzcGx1cy5yZWFkIiwib2ZmbGluZV9hY2Nlc3MiXSwiYW1yIjpbInB3ZCJdfQ.U-uuMLwQpm9zx1QR9hqhMYzy53k1kVpYtYECjasuLL3HrKuWB9ADxJITCqTKS7Krljppv054ch00HCYcxZBIf2_iRFCamF9wTDmkpNCOFjh_48k5H_vvpuvmh1PUxJT6GDnHmsZsmsifHu1Gbb7z4wPKBdaZZRDilwBRKvYgGWOvXLdtH4sBTIGxYWqlcTA49oh1DNtGlnoiPv30gIrYfLJv1AGXz-cWqxXUsr6TkHHFlkjpjtifsYwRsdbahaKNHFBQwuT2ivIsyNTSSJmRmpV8nMREaCITY0lfMbz0WG0XTOBw-gL29TQOPfpa91JlCidTD1KmUtj9vQMq_QQBrA";
        // Build the request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("xero-tenant-id", "07dc4ca8-8fb2-4231-bc10-af347b7c230c")
                .header("Authorization", "Bearer "+ token)
                .POST(HttpRequest.BodyPublishers.ofString(data.toJson()))
                .build();

        System.out.println("sending request :: " + data);
        // Send the request and handle the response
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Print response status code and body
        System.out.println("Response Code: " + response.statusCode());
        if(response.statusCode() == 200) {
            System.out.println("success voiding "+ data.getInvoiceNumber());
        } else{
            System.out.println("Response Body: " + response.body());

        }

        return response.body();
    }

    public static List<String> readLinesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }

        return lines;
    }


}
