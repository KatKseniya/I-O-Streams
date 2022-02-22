package by.epam.tc_npr2.main;

import java.util.List;

public class NumberDataWriter extends DataWriter<NumberData>{

    public NumberDataWriter(String path, List<NumberData> data) {
        super(path, data);
    }

    @Override
    protected String format(NumberData d) {
        return d.getNumber1() + " " + d.getSign().getSign() + " " + d.getNumber2() + " = " + d.getResult() + "\n";
    }
}
