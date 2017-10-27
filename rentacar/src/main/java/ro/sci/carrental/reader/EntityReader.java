package ro.sci.carrental.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntityReader {
    private Logger logger = Logger.getLogger(EntityReader.class.getName());
    public  List<String> readLines(File file) {
        Charset charset = Charset.forName("UTF8");

        List<String> listInputCars = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line;
            while ((line = reader.readLine()) != null) {
                listInputCars.add(line);
            }
        } catch (IOException e) {
            logger.log(Level.WARNING,"IOException:" + e);
        }
        return listInputCars;
    }
}
