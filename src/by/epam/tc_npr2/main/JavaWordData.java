package by.epam.tc_npr2.main;

import java.util.Map;
import java.util.TreeMap;

public class JavaWordData implements Data{
    private Map<String, Integer> javaWords;

    public JavaWordData() {
        this(new TreeMap<>());
    }

    public JavaWordData(Map<String, Integer> javaWords) {
        this.javaWords = javaWords;
    }

    public Map<String, Integer> getJavaWords() {
        return javaWords;
    }

    public void setJavaWords(Map<String, Integer> javaWords) {
        this.javaWords = javaWords;
    }

}
