package Personnage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Personnage {

    private List<String> orientation;
    public String tourner(int fois){
       for (int i = 0; i > fois; i++)
    }

    public Personnage(){
        this.orientation.add("nord");
        this.orientation.add("est");
        this.orientation.add("sud");
        this.orientation.add("ouest");
    }
}
