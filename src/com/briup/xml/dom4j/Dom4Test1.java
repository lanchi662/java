package com.briup.xml.dom4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.briup.xml.Employee;


public class Dom4Test1 {
	public static void main(String[] args) throws Exception {
		SAXReader saxreader=new SAXReader();
		Document document=saxreader.read(new File("src/com/briup/xml/user.xml"));
		//获取根节点
		Element root=document.getRootElement();
		//获取根节点下的孩子节点
		List<Element>list=root.elements();
		ArrayList<Employee> array=new ArrayList<>();
		//遍历
		for (Element element : list) {
			Employee em=new Employee();
			//获取属性
			String name=element.attributeValue("name");
			em.setName(name);
			String info=element.getStringValue();
			em.setUser(Double.parseDouble(info));
			array.add(em);
		}
		for (Employee employee : array) {
			System.out.println(employee);
		}
		
	}
	

}
