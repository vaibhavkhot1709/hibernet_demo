package com.hibernet_demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name = "Car_details")
public class CarDBHibernate {

	@Id
	int id;
	String car_name;
	Double price;

	@Column(name = "Produced_By")
	String made_by;

	public CarDBHibernate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarDBHibernate(int id, String car_name, Double price) {
		super();
		this.id = id;
		this.car_name = car_name;
		this.price = price;
	}

	public CarDBHibernate(String made_by) {
		super();
		this.made_by = made_by;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getMade_by() {
		return made_by;
	}

	public void setMade_by(String made_by) {
		this.made_by = made_by;
	}

	@Override
	public String toString() {
		return "CarDBHibernate [id=" + id + ", car_name=" + car_name + ", price=" + price + "produced By :" + "]";
	}

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

//		CarDBHibernate ch1=new CarDBHibernate(1111, "Range Rover", 12900.98D);
//		CarDBHibernate ch2=new CarDBHibernate(1112, "Rolls Royce", 10900.98D);
//		CarDBHibernate ch3=new CarDBHibernate(1113, "Mercedes", 11900.98D);
//		CarDBHibernate ch4=new CarDBHibernate(1114, "Audi", 13900.98D);
//		CarDBHibernate ch5=new CarDBHibernate(1116, "Audi", 13900.98D);

		Transaction tx = session.beginTransaction();

//		session.save(ch1);
//		session.save(ch2);
//		session.save(ch3);
		tx.commit();
		
		Transaction tx2=session.beginTransaction();
		List<Student> li=session.createQuery("from CarDBHibernate").list();
		tx2.commit();
		session.close();
		System.out.println("\n"+li);
		System.out.println("complete");
		session.close();
//		factory.close();
	}
}
