package HW_1.HW_2.factoryMethod;

import HW_1.HW_2.factoryMethod.TemplateMethod.LogReader;
import HW_1.HW_2.factoryMethod.TemplateMethod.PoemReader;

public class ConcreteReaderCreator extends BaseLogReaderCreator{

    @Override
    protected LogReader createLogReaderInstance(LogType LogType) {

        return switch (LogType){
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case Database -> new DataBaseReader();
            case System -> new OperationSystemLogEventReader();
        };
    }
}
