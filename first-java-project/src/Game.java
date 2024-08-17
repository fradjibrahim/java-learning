import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Character> listCharacter = new ArrayList<>();

    void addCharacter(Character character){
        listCharacter.add(character);

    }

    void startBattle(){
        for(Character character : listCharacter){
            character.attack();
        }
    }
}
