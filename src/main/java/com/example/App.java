package com.example;

import spark.Spark;

public class App {
    public static void main(String[] args) {
        Spark.port(8080); // Set the port Docker will expose
        Spark.get("/", (req, res) -> "Hello from Java!");
    }

    public static String getGreeting() {
        return "Hello from Java!";
    }
}