package HW_1.HW_2.factoryMethod;

import HW_1.HW_2.factoryMethod.TemplateMethod.LogEntry;
import HW_1.HW_2.factoryMethod.TemplateMethod.LogReader;

public class OperationSystemLogEventReader extends LogReader {
    @Override
    public Object getDataSourse() {
        return null;
    }

    @Override
    public void setDataSourse(Object data) {

    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringentry) {
        return null;
    }
}
