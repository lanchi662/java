package com.briup.xml.dom4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.briup.xml.Student;


public class Dom4Test {

	public static void main(String[] args) throws Exception {
		SAXReader saxreader=new SAXReader();
		//��ȡDocument����
		Document document=saxreader.read(new File("src/com/briup/xml/student.xml"));
		//��ȡ��Ԫ��
		Element root=document.getRootElement();
		//��ȡ���ڵ�����ĺ��ӽڵ�
		List<Element>list=root.elements();
		List<Student> students=new ArrayList<>();
		//����ѧ���ڵ�
		for (Element element : list) {
			//System.out.println(element);
			Student stu=new Student();
			//��ȡѧ���ڵ������
			String strid=element.attributeValue("id");			
				stu.setId(strid);
			String strgender=element.attributeValue("gender");
			stu.setGender(strgender);
			//��ȡѧ���ڵ�ĺ��ӽڵ�
			List<Element>list1=element.elements();
			//����ѧ���ڵ�����ĺ��ӽڵ�
			for (Element element2 : list1) {
				String info=element2.getStringValue();
				if(element2.getName().equals("name")){
					stu.setName(info);
				}
				if(element2.getName().equals("age")){
					stu.setAge(Integer.parseInt(info));
				}
			}
			students.add(stu);
		}
		//��������
		for (Student student : students) {
			System.out.println(student);
		}
	
	}

}
