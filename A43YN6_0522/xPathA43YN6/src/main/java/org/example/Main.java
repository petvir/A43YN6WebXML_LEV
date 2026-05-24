package org.example;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.*;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.xml.sax.SAXException;

public class Main {
    static void main(String[] args) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentbuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentbuilder.parse("hallgato.xml");

            document.getDocumentElement().normalize();;

            XPath xpath = XPathFactory.newInstance().newXPath();

            String A43YN6 = "/class/hallgato[@id='01']";
            //String A43YN6 = "/class/*";

            System.out.println("\nFuttatás eredménye:");

            NodeList nl_A43YN6 = (NodeList) xpath.compile(A43YN6).evaluate(document,xPathConstant.NODESET);

            for (int i=0;i<nl_A43YN6.getLength();i++) {
                Node node = nl_A43YN6.item(i);
                System.out.println("\nAtuális elem: " + node.getNodeName());

                if (node.getNodeType()==Node.ELEMENT_NODE && node.getNodeName().equals(("hallgato"))) {
                    Element element = (Element) node;
                    System.out.println("Hallgató ID: "+element.getAttribute("id"));
                    System.out.println("Keresztnév: "+element.getElementsByTagName("keresztnev").item(0).getTextContent());
                    System.out.println("Vezeték: "+element.getElementsByTagName("vezeteknev").item(0).getTextContent());
                    System.out.println("Becenév: "+element.getElementsByTagName("becenev").item(0).getTextContent());
                    System.out.println("Kor: "+element.getElementsByTagName("kor").item(0).getTextContent());
                }
            }
        }
        catch (ParserConfigurationException e) {
            e.printStackTrace();
        }catch (SAXException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}
