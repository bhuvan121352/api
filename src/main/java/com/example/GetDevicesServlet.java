// GetDevicesServlet.java

package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetDevicesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // API URL for fetching devices
        String apiUrl = "https://xfwq69xkgf.execute-api.ap-south-1.amazonaws.com/st1";
        
        // Make HTTP GET request to API
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Handle response
        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Read and process response
            // ...
        } else {
            // Handle error
            // ...
        }
    }
}
