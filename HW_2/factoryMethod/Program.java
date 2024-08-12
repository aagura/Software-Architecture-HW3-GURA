package HW_1.HW_2.factoryMethod;

import HW_1.HW_2.factoryMethod.TemplateMethod.LogEntry;
import HW_1.HW_2.factoryMethod.TemplateMethod.LogReader;

public class Program {

    public static String data = """
            Судьба нам долю лучшую не может сразу дать,
            Везенье — дело случая, который надо ждать.
            Ценой нелегкой счастье достаться нам должно,
            Иначе не обрадует оно.
            
            Что-нибудь получится,
            Если долго мучиться,
            Что-нибудь получится.
            """;

    public static void main(String[] args) {

        LogReader logReader = new ConcreteReaderCreator()
                .createLogReader(LogType.Poem, data);
        logReader.setCurrentPosition(5);
        for (LogEntry log : logReader.readLogEntry()){
            System.out.println(log.getText());
        }
    }
}
