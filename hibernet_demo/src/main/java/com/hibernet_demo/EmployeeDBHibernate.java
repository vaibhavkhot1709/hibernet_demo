package com.hibernet_demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDBHibernate {

	public static void main(String[] args) {
//		Employee e1=new Employee(111, "Shree", "Kop");
//		Employee e2=new Employee(112, "Renu", "Amravati");
//		Employee e3=new Employee(113, "Shubham", "Mumbai");
//		Employee e4=new Employee(114, "Vaibhav", "Kop");
//		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

//   	Transaction tx=session.beginTransaction();

//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);

//		tx.commit();

		Transaction tx3 = session.beginTransaction();
		List<Student> li = session.createQuery("from Employee where id>111 ").list();
		tx3.commit();
		session.close();
		System.out.println(li);
		System.out.println(">>>>>>>>>   Hibernate complete <<<<<<<<<<<<");
	}
}
