import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import zPlikuXML.Employee;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DomExample {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //пполучили фабрику документов
        DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
        //создадим документ  который парсит наш xml файл
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("/Users/alena/IdeaProjects/ShareLane/src/main/java/zPlikuXML/employee.xml"));




    }
}
