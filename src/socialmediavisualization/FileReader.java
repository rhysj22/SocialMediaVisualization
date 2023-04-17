package socialmediavisualization;

/*import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class FileReader {
    private ArrayQueue<Song> queue;
    private Playlist[] playlists;
    
    public PlaylistReader(String songsFileName, String playlistsFileName) 
        throws FileNotFoundException, ParseException, DailyMixDataException {
        queue = readQueueFile(songsFileName);
        playlists = readPlaylistFile(playlistsFileName);
        PlaylistCalculator calculator = new PlaylistCalculator(queue, playlists);
        PlaylistWindow window = new PlaylistWindow(calculator);
    }
    
    private Playlist[] readPlaylistFile(String fileName)
        throws FileNotFoundException,
        java.text.ParseException {

        Playlist[] lists = new Playlist[3];
        Scanner file = new Scanner(new File(fileName));
        int lineCount = 0;
        while (file.hasNextLine() && lineCount < 3) {
            String read = file.nextLine();
            Scanner currLine = new Scanner(read).useDelimiter(",\\s*");
            String tokens[] = new String[8];
            int tokenCount = 0;
            while (currLine.hasNext() && tokenCount < 8) {
                tokens[tokenCount++] = currLine.next();
            }
            currLine.close();
            if (tokenCount == 8) {
                lists[lineCount] = new Playlist(
                    tokens[0], 
                    Integer.parseInt(tokens[1]), 
                    Integer.parseInt(tokens[2]), 
                    Integer.parseInt(tokens[3]), 
                    Integer.parseInt(tokens[4]), 
                    Integer.parseInt(tokens[5]), 
                    Integer.parseInt(tokens[6]), 
                    Integer.parseInt(tokens[7]));
            }
            else {
                throw new java.text.ParseException("parse exception", 1);
            }
            lineCount++;
        }

        file.close();
        return lists;
    }
    
    private boolean isInValidPercentRange(int num1, int num2, int num3) {
        return new GenreSet(num1, num2, num3).isWithinRange(
            new GenreSet(PlaylistCalculator.MIN_PERCENT, 
                PlaylistCalculator.MIN_PERCENT, 
                PlaylistCalculator.MIN_PERCENT), 
            new GenreSet(PlaylistCalculator.MAX_PERCENT, 
                PlaylistCalculator.MAX_PERCENT, 
                PlaylistCalculator.MAX_PERCENT));
    }
    
    private ArrayQueue<Song> readQueueFile(String songFileName)
        throws FileNotFoundException,
        java.text.ParseException, DailyMixDataException {

        ArrayQueue<Song> songs = new ArrayQueue<Song>();
        Scanner file = new Scanner(new File(songFileName));
        int lineCount = 0;
        while (file.hasNextLine() && lineCount < 3) {
            String read = file.nextLine();
            Scanner currLine = new Scanner(read).useDelimiter(",\\s*");
            String tokens[] = new String[5];
            int tokenCount = 0;
            while (currLine.hasNext() && tokenCount < 5) {
                tokens[tokenCount++] = currLine.next();
            }
            currLine.close();
            if (tokenCount >= 4) {
                if (isInValidPercentRange(Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]), 
                    Integer.parseInt(tokens[3]))) {
                    songs.enqueue(new Song(
                        tokens[0], 
                        Integer.parseInt(tokens[1]), 
                        Integer.parseInt(tokens[2]), 
                        Integer.parseInt(tokens[3]), 
                        tokens[4] == null ? "" : tokens[4]));
                }
                else {
                    throw new DailyMixDataException("");
                }
            }
            else {
                throw new java.text.ParseException("parse exception", 1);
            }
            lineCount++;
        }

        file.close();
        return songs;
    }
}
*/