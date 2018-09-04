package SuperCodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ReadXML {

	public static void main(String[] args) throws Exception  {
		String xMLpPath="C:\\Users\\ASUS\\Desktop\\2017-11-30-21-54-39-776_AOZPA6302E_2017_.xml";
		String inputPath ="ns3:ITR/ns2:ITR1/Form_ITR1/AssessmentYear@2017" ;
		String[] inputP = inputPath.split("@");
		String[] input=inputP[0].split("/");
		
		DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);

		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new FileInputStream(new File(xMLpPath)));
		NodeList entries = doc.getElementsByTagName("*");
		System.out.println("Number of total node is "+entries.getLength());
		for (int i=0; i<entries.getLength(); i++) {
			Element element = (Element) entries.item(i);
			System.out.println("Found element " + element.getNodeName());
			Node aNode = entries.item(i);
			NamedNodeMap attributes = aNode.getAttributes();
		//	System.out.println("Length of attribute is :"+attributes.getLength());
			for(int j=0;j<attributes.getLength();j++) {
				Node theAttribute = attributes.item(j);
		        System.out.println(theAttribute.getNodeName() + "=" + theAttribute.getNodeValue());
			}

		}

		
		System.out.println("Run successfully");
	}

}
