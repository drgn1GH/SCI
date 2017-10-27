package ro.sci.carrental.reader;

public interface Converter<T> {
    T convert(String convertedString) throws InvalidEntityException;
}
