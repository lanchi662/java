package com.briup.xml.dom4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import com.briup.xml.records;

public class Dom4Test2 {
	public static void main(String[] args) throws Exception {
		SAXReader saxreader=new SAXReader();
		Document document=saxreader.read(new File("src/com/briup/xml/user.xml"));
		Element root=document.getRootElement();
		List<Element>list=root.elements();
		ArrayList<records>array=new ArrayList<>();
		for (Element element : list) {
			records re=new records();
		String info=element.attributeValue("name");
		re.setName("info");
		String str=element.getStringValue();
		re.setPrice(Double.parseDouble(info));
		array.add(re);
		Document document1=DocumentHelper.createDocument();
		
	}
	
	}
}



