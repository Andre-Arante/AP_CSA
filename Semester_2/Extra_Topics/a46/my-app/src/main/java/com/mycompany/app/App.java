package com.mycompany.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;  
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask to input URL
        System.out.println("\nEnter the url: ");
        String requestURL = input.nextLine();
        
        /* Get reponse from the API */
        int status = 0;
        StringBuffer content = null;
        
        try {
            URL chuckRequest = new URL(requestURL);
            HttpURLConnection con = (HttpURLConnection) chuckRequest.openConnection();
            con.setRequestMethod("GET");
            con.setDoOutput(true);

            status = con.getResponseCode();

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            con.disconnect();
        } catch (IOException ioe) {
            System.err.println("Malformed URL");
        }

        /* Valid reponse returned */
        if (content != null) {
            System.out.println("\n\nStatus: " + status + "\n\nContent:\n");

            // Pretty print JSON reponse
            JsonObject jsonObj = JsonParser.parseString(content.toString()).getAsJsonObject();
            Gson g = new GsonBuilder().setPrettyPrinting().create();
            String jsonOutput = g.toJson(jsonObj);
            System.out.println(jsonOutput + "\n");

            // Create a person object 
            Person p = gson.fromJson(jsonOutput.toString(), Person.class)
            System.out.println(p.getName() + " is " + p.getAge() + " years old.");
        }
    }
}


public class Person() {
    private String name;
    private int age;

    public Person() { }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
}