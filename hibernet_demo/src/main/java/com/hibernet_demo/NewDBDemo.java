package com.hibernet_demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewDBDemo {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<   project started     >>>>>>>>>>>>>>");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Student st = new Student();
//		st.setRoll(12);
//		st.setName("abc");
//		st.setCity("Pune");
//		System.out.println(st);
//		Student st2 = new Student(13,"Vaibhav Gurav", "Kop");
//		Student st3 = new Student(14,"Shree ", "Kop");
//		Student st4 = new Student(15,"Rushi", "Kop");

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
//		session.save(st);
//		session.save(st2);
//		session.save(st3);
//		session.save(st4);
		tx.commit();
		
		Transaction tx2=session.beginTransaction();
		List<Student> li=session.createQuery("from Student").list();
		tx2.commit();
		session.close();

		System.out.println(li);
		System.out.println("<<<<<<<<<<<<<<<   project ended     >>>>>>>>>>>>>>");
	}

}
