// RegisterDeviceServlet.java

package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class RegisterDeviceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // API URL for registering devices
        String apiUrl = "https://ugx6cqwyai.execute-api.ap-south-1.amazonaws.com/st1";
        
        // Make HTTP POST request to API
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");

        // Handle response
        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_CREATED) {
            // Device registered successfully
            // ...
        } else {
            // Failed to register device
            // ...
        }
    }
}
