package com.table_per_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Person_App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("Shree");
		p1.setAge(24);
		p1.setGender("Male");

		PersonStudent s1 = new PersonStudent();
		s1.setName("Pramod dada");
		s1.setAge(21);
		s1.setGender("Male");
		s1.setSclool_nm("ProWings");

		PersonEmployee e1 = new PersonEmployee();
		e1.setName("Anu Vahini");
		e1.setAge(32);
		e1.setGender("Female");
		e1.setDepart("ITEngineer");
		e1.setSalary(32000);

		SessionFactory factory =new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(e1);
		session.save(p1);

		tx.commit();
		session.close();

	}

}
