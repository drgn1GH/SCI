package ro.sci.carrental.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

    public class CarWriter<Car> implements EntityWriter<Car> {

    @Override
    public void writeObjects(List<Car> carRepository, File file) {
        Charset charset = Charset.forName("UTF8");

        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(), charset)) {
            int size = carRepository.size();
            for (int i = 0; i < carRepository.size(); i++) {
                String str = carRepository.get(i).toString();
                writer.write(str);
                if(i < size -1)
                    writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}