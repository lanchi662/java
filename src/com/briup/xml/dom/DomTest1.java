package com.briup.xml.dom;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.briup.xml.Student;

public class DomTest1 {

	public static void main(String[] args) throws Exception {
		//��DOM����xml�ļ�
		//1.��ȡһ��DocumentBuilderFactory����
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//2.����DocumentBuilderFactory����DocumentBuilder
		DocumentBuilder docu=factory.newDocumentBuilder();
		//3.����DocumentBuilder �����ȡDocument�ĵ�
		File f=new File("src/com/briup/xml/student.xml");
		Document document=docu.parse(f);
		//System.out.println(document);
		//��ʼ����
		//4.��ȡ���ڵ����Document��ȡ���ڵ�
		Element element=document.getDocumentElement();
		//5.��ȡ���ڵ��±ߵĺ��ӽڵ�
		//System.out.println(element);
		ArrayList<Student> array=new ArrayList<>();
		NodeList list=element.getChildNodes();
		for(int i=0;i<list.getLength();i++){
			Student stu=new Student();
			Node node=list.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				//System.out.println(node);
				//��ȡѧ���ڵ�����ֵ
				NamedNodeMap namenode=node.getAttributes();
			
				Node idnode=namenode.getNamedItem("id");
				String id=idnode.getNodeValue();
				Node gendernode=namenode.getNamedItem("gender");
				String gender=gendernode.getNodeValue();
				stu.setId(id);
				stu.setGender(gender);
				//System.out.println(id);
				//��ȡѧ���ڵ�ĺ��ӽڵ�
				NodeList list1=node.getChildNodes();
				for(int j=0;j<list1.getLength();j++){
					Node node1=list1.item(j);
					if(node.getNodeType()==Node.ELEMENT_NODE){
						String str=node1.getTextContent();
						if(node1.getNodeName().equals("name")){
							stu.setName(str);
						}
						if(node1.getNodeName().equals("age")){
							stu.setAge(Integer.parseInt(str));
						}
					
						
					}
				}
				array.add(stu);
			}
			
		}
		
		for (Student student : array) {
			System.out.println(student);
		}
		
		
	}

}
