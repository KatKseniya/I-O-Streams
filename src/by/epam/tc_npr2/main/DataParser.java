package by.epam.tc_npr2.main;

public interface DataParser<T extends Data> {
    T parse(String data) throws DataParserException;
}
