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
		//获取Document对象
		Document document=saxreader.read(new File("src/com/briup/xml/student.xml"));
		//获取根元素
		Element root=document.getRootElement();
		//获取根节点下面的孩子节点
		List<Element>list=root.elements();
		List<Student> students=new ArrayList<>();
		//遍历学生节点
		for (Element element : list) {
			//System.out.println(element);
			Student stu=new Student();
			//获取学生节点的属性
			String strid=element.attributeValue("id");			
				stu.setId(strid);
			String strgender=element.attributeValue("gender");
			stu.setGender(strgender);
			//获取学生节点的孩子节点
			List<Element>list1=element.elements();
			//遍历学生节点下面的孩子节点
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
		//遍历集合
		for (Student student : students) {
			System.out.println(student);
		}
	
	}

}
