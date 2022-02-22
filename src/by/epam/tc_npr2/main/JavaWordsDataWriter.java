package by.epam.tc_npr2.main;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

public class JavaWordsDataWriter extends DataWriter<JavaWordData> {


    public JavaWordsDataWriter(String path, List<JavaWordData> data) {
        super(path, data);
    }

    @Override
    protected void write(Writer writer, List<JavaWordData> data) throws IOException {

        JavaWordData javaWordData = new JavaWordData();
        for (JavaWordData wordData : data) {
            for (Map.Entry<String, Integer> entry : wordData.getJavaWords().entrySet()) {
                javaWordData.getJavaWords().compute(entry.getKey(), (key, count) -> (count == null ? 0 : count) + 1);
            }
        }

        super.write(writer, List.of(javaWordData));
    }

    @Override
    public String format(JavaWordData data) {

        String result = "";
        for (Map.Entry<String, Integer> entry : data.getJavaWords().entrySet()) {
            result += entry.getKey() + " : " + entry.getValue() + "\n";

        }
        return result;
    }
}
