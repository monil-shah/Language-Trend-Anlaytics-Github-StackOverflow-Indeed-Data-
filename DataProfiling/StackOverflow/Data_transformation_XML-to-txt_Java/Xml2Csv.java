/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlregex;

/**
 *
 * @author MonilShah
 */
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

class Xml2Csv {

    public static void main(String args[]) throws Exception {
        File stylesheet = new File("style.xsl");
        File xmlSource = new File("Posts.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlSource);

        StreamSource stylesource = new StreamSource(stylesheet);
        Transformer transformer = TransformerFactory.newInstance()
                .newTransformer(stylesource);
        Source source = new DOMSource(document);
        Result outputTarget = new StreamResult(new File("output.txt"));
        transformer.transform(source, outputTarget);
    }
}