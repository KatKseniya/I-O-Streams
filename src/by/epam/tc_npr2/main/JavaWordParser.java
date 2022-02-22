package by.epam.tc_npr2.main;

import java.util.Set;

public class JavaWordParser implements DataParser<JavaWordData>{

    private static final Set<String> javaKeyWords = Set.of("java",
            "abstract", "assert", "boolean", "break", "byte", "case",
            "catch", "class", "const", "continue", "default", "do",
            "double", "else", "enum", "extends", "final", "finally",
            "float", "for", "goto", "if", "implements", "import",
            "instaceof", "int", "interface", "long", "native", "new",
            "package", "private", "protected", "public", "return", "short",
            "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while");

    @Override
    public JavaWordData parse(String data) throws DataParserException {
        JavaWordData javaWordData = new JavaWordData();
        String[] words = data.split("\\s+");
        for (String word : words) {
            if (javaKeyWords.contains(word))
            {
                javaWordData.getJavaWords().compute(word, (key, count) -> count == null ? 1 : count+1);
            }
        }
        return javaWordData;
    }
}
