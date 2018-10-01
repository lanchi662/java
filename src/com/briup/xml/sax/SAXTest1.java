package com.briup.xml.sax;

import java.io.FileInputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.briup.xml.Student;

public class SAXTest1 {
		
	public static void main(String[] args) throws Exception {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		FileInputStream f=new FileInputStream("src/com/briup/xml/student.xml");
		ArrayList<Student> list=new ArrayList<>();
		
		parser.parse(f,new DefaultHandler(){
				private  Student stu=null;
				private  String labName;
			@Override
			public void startDocument() throws SAXException {
				//System.out.println("开始解析");
				
			}

			@Override
			public void endDocument() throws SAXException {
				
				//System.out.println("解析完成");
			}

			@Override
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {
				/*System.out.println("localName="+localName);
				System.out.println("qName="+qName);
*/				 labName=qName;				 
				 if(qName.equals("student")){
					 stu=new Student();
					 String  id=attributes.getValue("id");
					 String gender=attributes.getValue("gender");
					 stu.setId(id);
					 stu.setGender(gender);
									
				 }
							
			}

			@Override
			public void endElement(String uri, String localName, String qName) throws SAXException {
				/*System.out.println(localName);
				System.out.println(qName);*/
				if(qName.equals("student")){
				list.add(stu);
				
				}
				
			}

			@Override
			public void characters(char[] ch, int start, int length) throws SAXException {
				String info=new String(ch,start,length);
				//System.out.println(info);
				if(labName.equals("name")){
					stu.setName(info);
				}
				if(labName.equals("age")){
					stu.setAge(Integer.parseInt(info));
				}
				
			}
				
		});
		
		
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
