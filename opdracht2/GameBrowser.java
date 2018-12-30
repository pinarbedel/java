package opdrachten.opdracht2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GameBrowser {
    private GameCollection gameCollection;

    public GameBrowser(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    public ArrayList<VideoGame> showGamesForSearch(String search) {
        return gameCollection.selectGames(new Predicate<VideoGame>() {
            @Override
            public boolean test(VideoGame videoGame) {
                return videoGame.getName().toLowerCase().equals(search);
            }
        });
    }

    public ArrayList<VideoGame> showFreeGames(){
        return null;
    }

    public ArrayList<VideoGame> showGamesInGenre(){
        return null;
    }
}
