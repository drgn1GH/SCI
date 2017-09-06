package ro.sci.carrental.writer;

import java.io.File;
import java.util.List;

public interface EntityWriter<T> {
    /**
     *
     * @param t cars or customers
     * @param file CSV representation file
     */
    void writeObjects(List<T> t, File file);

}