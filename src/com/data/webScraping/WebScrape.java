package com.data.webScraping;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebScrape {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "http://books.toscrape.com/";
        URL formattedUrl = new URL(url);

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpURLConnection httpConnection = (HttpURLConnection) formattedUrl.openConnection();
        httpConnection.setRequestProperty("User-Agent", "Mozilla/5.0");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("http client response code" + response);

        System.out.println("connection response code:: " + httpConnection.getResponseCode());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
        String inputLine;
        StringBuilder responseString = new StringBuilder();
        while ((inputLine = bufferedReader.readLine()) != null) {
            responseString.append(inputLine);
        }
        bufferedReader.close();
        String html = responseString.toString();

        Document doc = Jsoup.parse(html);
        Elements links = doc.getElementsByTag("section");
//        Elements links = doc.select("a[col-xs-6 col-sm-4 col-md-3 col-lg-3]");
        System.out.println(links.size());
//        for (Element link : links) {
//            String href = link.attr("col-xs-6 col-sm-4 col-md-3 col-lg-3");
//            System.out.println(href);
//        }
//
//        Writer writer = Files.newBufferedWriter(Paths.get("links.csv"));
//        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
//        Jsoup
    }



}
