package ro.sci.carrental.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class CustomerWriter<Customer> implements EntityWriter<Customer> {

    @Override
    public void writeObjects(List<Customer> customerRepository, File file) {
        Charset charset = Charset.forName("UTF8");

        try(BufferedWriter writer = Files.newBufferedWriter(file.toPath(),charset)){
            int size = customerRepository.size();
            for (int i = 0; i < customerRepository.size(); i++) {
                String str = customerRepository.get(i).toString();
                writer.write(str);
                if(i < size -1)
                    writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}