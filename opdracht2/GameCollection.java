package opdrachten.opdracht2;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GameCollection {
    private ArrayList<VideoGame> videoGames;

    public void addGame(VideoGame videoGame) {
        videoGames.add(videoGame);
    }

    public ArrayList<VideoGame> selectGames(Predicate<VideoGame> filter) {
        return videoGames.stream().filter(filter).collect(Collectors.toCollection(ArrayList::new));
    }
}
