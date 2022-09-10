import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

class Bowling {
    
    HashMap<String,Integer> players;
    
    Bowling() {
        players = new HashMap<String,Integer>();
    }
    
    public void addPlayer(String name, int points) {
        players.put(name, points);
    }
    
    public void getWinner() {
        int maxPoints;
        String maxName;
        Iterator<Entry<String,Integer>> it = players.entrySet().iterator();
        Map.Entry<String,Integer> hm = (Map.Entry<String,Integer>) it.next();
        maxPoints = hm.getValue();
        maxName = hm.getKey();
        while(it.hasNext()) {
            hm = (Map.Entry<String,Integer>) it.next();
            if (hm.getValue() > maxPoints) {
                maxPoints = hm.getValue();
                maxName = hm.getKey();
            }
        }
        System.out.println(maxName);
    }
    
}

public class HashMapIteration {
    
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
    
}