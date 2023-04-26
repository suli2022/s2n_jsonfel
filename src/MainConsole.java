import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainConsole {
    StringBuilder sb;
    public MainConsole() {
        sb = new StringBuilder();
        this.readFile();
        this.convertJsonToList();
    }
    
    public void readFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
        }
    }
    public void tryReadFile() 
            throws FileNotFoundException {
        
        File file = new File("horgaszhelyek.json");
        FileReader fr = new FileReader(file);
        while() {
            
        }
        // System.out.println(sb.toString());
    }
    public void convertJsonToList() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String lines = sb.toString();
        lines = lines.replaceFirst("\\{", "");
        lines = lines.replace("\"fishingspots\": [", "");
        lines = lines.replace("]}", "");
        
        System.out.println(lines);
        // Place[] placeArray = gson.fromJson(lines, Place[].class);
        // System.out.println(placeArray[0].name);

    }
}
