/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareadfile;

import java.io.*;
import java.util.*;
/**
 *
 * @author agonzalez
 */
public class JavaReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> bNames = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader("BoyNames.txt")))
        {
            for(int i = 0; i < 200; i++)
            {
                bNames.add(br.readLine());
            }
            Collections.sort(bNames);
            System.out.println(bNames);
        }
        catch(IOException ex)
        {
            System.out.println("Had trouble reading file.");
            System.exit(0);
        }
        
        try(FileWriter writer = new FileWriter("SortedBoyNames.txt"))
        {
            for(String str: bNames) 
            {
                writer.write(str + "\n ");
            }
            
        }
        catch(IOException ex)
        {
            System.out.println("Had trouble sorting or reading file.");
            System.exit(0);
        }
    }
    }
    
    

