package by.epam.tc_npr2.main;

import java.util.List;

public class NumberCalculator {

	private List<NumberData> list;

	public NumberCalculator() {

	}

	public NumberCalculator(List<NumberData> list) {
		this.list = list;
	}

	public List<NumberData> getList() {
		return list;
	}

	public void setList(List<NumberData> list) {
		this.list = list;
	}

	public List<NumberData> calc() {

		for (NumberData data : list) {
			calc(data);
		}
		return list;
	}

	private void calc(NumberData data)
	{
		Number result;
		if (data.getSign() == Sign.PLUS)
		{
			result = data.getNumber1().doubleValue() + data.getNumber2().doubleValue();
		}
		else if (data.getSign() == Sign.MINUS)
		{
			result = data.getNumber1().doubleValue() - data.getNumber2().doubleValue();
		}
		else if (data.getSign() == Sign.MULTIPLY)
		{
			result = data.getNumber1().doubleValue() - data.getNumber2().doubleValue();
		}
		else
		{
			throw new UnsupportedOperationException(data.getSign() + " sing isn't supported.");
		}
		data.setResult(result);
	}

}
