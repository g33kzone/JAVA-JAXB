package com.g33kzone;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.g33kzone.model.Student;

public class JAXBMarshal {

	public void marhsal() {
		Student student = new Student();

		student.setFirstName("Albert");
		student.setLastName("Einstein");
		student.setAge(76);

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// Display output in console
			jaxbMarshaller.marshal(student, System.out);

			File file = new File("D:\\file.xml");
			// Persist XML output to a file
			jaxbMarshaller.marshal(student, file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
