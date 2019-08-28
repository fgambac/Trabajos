import java.util.*;
public class Zoologico {

    public HashMap<String, Boolean> zoologico = new HashMap<String, Boolean>();
    public ArrayList<Set<String>> herv= new ArrayList<Set<String>>();


public HashMap<String, boolean> getzoologico() {
        
        return zoologico;
    }

public ArrayList<String> animalesHerv(){

    for (Map.Entry animales : this.getzoologico().entrySet()){

        if(zoologico.containsValue(true)){
            this.herv.add(zoologico.keySet());
        }
    }
    return herv;
}

    


