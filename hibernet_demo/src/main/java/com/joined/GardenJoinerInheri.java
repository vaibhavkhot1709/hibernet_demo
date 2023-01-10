package com.joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GardenJoinerInheri {

	public static void main(String[] args) {
		System.out.println("************* Garden Hibernate Started*************");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Garden g1 = new Garden();
		g1.setPrice(112);
		g1.setColour("Red");

		Flower f1 = new Flower();
		f1.setName("Rose");
		f1.setColour("Red");
		f1.setPrice(120);

		Flower f2 = new Flower();
		f2.setName("Rose");
		f2.setColour("Pink");
		f2.setPrice(120);

		Fruits fruits = new Fruits();
		fruits.setName("Mango");
		fruits.setColour("Orange");
		fruits.setPrice(600);

		Fruits fruits1 = new Fruits();
		fruits1.setName("Mango");
		fruits1.setColour("Green");
		fruits1.setPrice(350);
		
		
		session.save(g1);
		session.save(f1);
		session.save(f2);
		session.save(fruits);
		session.save(fruits1);

		tx.commit();
		session.close();
		factory.close();

		System.out.println("************* Garden Hibernate Ended*************");
	}
}
