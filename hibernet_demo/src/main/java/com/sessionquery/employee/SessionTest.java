package com.sessionquery.employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionTest {
	
	public static void main(String[] args) {
		System.out.println("*************  start ***************");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setAge(45);
		e1.setNm("Shinde Sir");
		e1.setDepartment("Civil");
		
		Employee e2=new Employee();
		e2.setAge(43);
		e2.setNm("Janagam Sir");
		e2.setDepartment("Civil");
		
		Employee e3=new Employee();
		e3.setAge(42);
		e3.setNm("J A Patil Sir");
		e3.setDepartment("Civil");
		
		Employee e4=new Employee();
		e4.setAge(48);
		e4.setNm("Chavan Sir");
		e4.setDepartment("Civil");
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		
		Student s1=new Student();
		s1.setAge(25);
		s1.setNm("Shree Patil");
		s1.setPrsnt_class("10 th");
		
		Student s2=new Student();
		s2.setAge(24);
		s2.setNm("Renu Thavakar");
		s2.setPrsnt_class("11th");
		
		Student s3=new Student();
		s3.setAge(21);
		s3.setNm("Pratiksha Lakade");
		s3.setPrsnt_class("09th");
		
		Student s4=new Student();
		s4.setAge(27);
		s4.setNm("Sayali ");
		s4.setPrsnt_class("15 th");
		
		session.save(s1);
		session.save(s3);
		session.save(s2);
		session.save(s4);
		
		
		List<Object []> list = session.createNativeQuery("select from Student").list();
		
		for(Object[] temp :list) {
			Student s=new Student();
			s.setAge(Integer.parseInt(temp[0].toString()));
			s.setNm(temp[1].toString());
			
			System.out.println(s);
			
		}
		
		System.out.println("********** complete **************");
		
		tx.commit();
		session.close();
	}
	

}
