package zPlikuXML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import zPlikuXML.Employee;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SAXParser {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        javax.xml.parsers.SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("/Users/alena/IdeaProjects/ShareLane/src/main/java/employee.xml"), handler);

        for (Employee employee : employees) {
            System.out.println(String.format("имя сотрудника : %s, должность: :%s  ", employee.getName(), employee.getJob()));
        }

    }

    public static class XMLHandler extends DefaultHandler {

        @Override
        public void startDocument() throws SAXException {
            //логика для начала документа
        }

        @Override
        public void endDocument() throws SAXException {
            //логика для конца документа
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String name = attributes.getValue("name");
                String job = attributes.getValue("job");
                employees.add(new Employee(name, job));
            }

        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {

        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {

        }

        @Override
        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {

        }
    }
}
