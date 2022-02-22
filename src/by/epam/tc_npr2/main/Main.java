package by.epam.tc_npr2.main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String fileIn = "resources/file1.txt";
		String fileOut = "resources/file2.txt";

		try {
			parseJavaWords(fileIn, fileOut);
//			parseNumbers(fileIn, fileOut);

		} catch (NumberParserException e) {
			// log
			System.err.println("Error");
			e.printStackTrace();
		}

	}

	private static void parseJavaWords(String fileIn, String fileOut) throws NumberParserException {
		DataReader<JavaWordData> reader = new DataReader<JavaWordData>(fileIn, new JavaWordParser());
		List<JavaWordData> fileData = reader.take();

		DataWriter<JavaWordData> nWriter = new JavaWordsDataWriter(fileOut, fileData);
		nWriter.save();
	}

	private static void parseNumbers(String fileIn, String fileOut) throws NumberParserException {
		DataReader<NumberData> reader = new DataReader<NumberData>(fileIn, new NumberParser());
		List<NumberData> fileData = reader.take();

		NumberCalculator calculator = new NumberCalculator(fileData);
		fileData = calculator.calc();

		DataWriter<NumberData> nWriter = new NumberDataWriter(fileOut, fileData);
		nWriter.save();
	}

}
