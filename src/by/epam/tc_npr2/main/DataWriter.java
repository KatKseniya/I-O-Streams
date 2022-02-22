package by.epam.tc_npr2.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class DataWriter<T extends Data> {
	private String path;
	private List<T> data;
	
	public DataWriter(String path, List<T> data) {
		this.path = path;
		this.data = data;
	}
	
	public boolean save() throws NumberParserException {

		FileWriter writer = null;
		try {
			writer = new FileWriter(path);
			write(writer, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					throw new NumberParserException(e);
				}
			}
		}
		return true;
	}

	protected void write(Writer writer, List<T> data) throws IOException {
		for (T line : data) {
			writer.write(format(line));
		}
	}

	protected String format(T data)
	{
		return data.toString();
	}
}
