package com.hubernate.newdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProWings {

	public static void main(String[] args) {
		
//		ProWings p=new ProWings();
//		p.roll=11;
//		p.name="Vaibhav";
//		p.address="pune";
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
//		session.save(p);
		
		ProWings p1=new ProWings();
		p1.roll=1;
		p1.name="Vaibhav";
		p1.address="pune";
		session.save(p1);
		tx.commit();
		session.close();
		System.out.println("end");
		
	}
}
