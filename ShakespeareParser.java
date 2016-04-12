/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespeareparser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ShakespeareParser {
    public static void main(String[] args) {
        String line;
        line = "";
        
        try {
            try (BufferedReader b = new BufferedReader (
                    new InputStreamReader(new FileInputStream(
                            "C:\\Users\\zeisL^\\Desktop\\TXT\\comedies\\All's Well that Ends Well.txt"),  
                            StandardCharsets.UTF_8))) {
                while( (line = b.readLine()) !=null ) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: "+e.toString());
        }
    }
}

