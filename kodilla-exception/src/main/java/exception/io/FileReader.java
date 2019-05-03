package exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(){

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        //Klasa Paths pozwala nam na modyfikacje ścieżki
        // o typie String na obiekt Path

       try (Stream<String> fileLines = Files.lines (Paths.get ( file.getPath () ))){

           fileLines.forEach ( System.out::println);

       } catch ( IOException e) {
           System.out.println ( "Oh no! Something went wrong! " + e );
       } finally {
           System.out.println ( "Im going to be here, always, like a stalker! " );
       }
//System.out.println ( file.getPath () );
    }
}
