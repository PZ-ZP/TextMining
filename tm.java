/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShakespeareParser;

import java.util.List;

/**
 *
 * @author kai
 */
public class tm {
    
    public static void main(String[] args) {
        ShakespeareParser sp = new ShakespeareParser();
        AllWorks works = null;
        if (args.length==0) {
            works = sp.readFiles("C:\\Users\\kai\\Downloads\\ShakespearePlaysPlus\\TXT");
        } else {
            works = sp.readFiles(args[0]);
        }
            for (Speaker speaker: works.getAllSpeakers()) {
                System.out.println(speaker.getName() + ": " + speaker.getNumberOfMonologues() + " times, " + speaker.getNumberOfWords() + " words, " + speaker.getNumberOfWords()/speaker.getNumberOfMonologues() + " words per monologue.");
            }
        
        
    }
    
}