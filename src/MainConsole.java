import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;


public class MainConsole {
    ArrayList<Place> placeList;
    public MainConsole() {
        this.placeList = new ArrayList<>();
        this.readFile();
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
        FileReader fr = new FileReader("horgaszhelyek.json");
        BufferedReader bf = new BufferedReader(fr);
        Gson gson = new Gson();
        Places data = gson.fromJson(bf, Places.class);
        
        for(Place place: data.fishingspots) {
            this.placeList.add(place);
        }
    }
}
