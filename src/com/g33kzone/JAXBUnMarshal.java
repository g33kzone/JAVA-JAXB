package com.g33kzone;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.g33kzone.model.Student;

public class JAXBUnMarshal {

	public void unmarhsal() {

		try {
			File file = new File("D:\\file.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Student student = (Student) jaxbUnmarshaller.unmarshal(file);

			System.out.println(student);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
