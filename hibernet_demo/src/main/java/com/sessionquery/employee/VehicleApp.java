package com.sessionquery.employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleApp {

	public static void main(String[] args) {
		System.out.println("*************   vehicl test start ***************");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Vehicle v1 = new Vehicle();
//		v1.setId(1111);
		v1.setNm("Kia");
		v1.setAvg(12.90);
		v1.setCompany_nm("Hyundai Motor Group");

		Vehicle v2 = new Vehicle();
//		v2.setId(2222);
		v2.setNm("Range Rover");
		v2.setAvg(11.75);
		v2.setCompany_nm("Land Rover");

		Vehicle v3 = new Vehicle();
		v3.setId(1321);
		v3.setNm("Rolle Royce");
		v3.setAvg(08.00);
		v3.setCompany_nm("BMW AG");

		ArrayList<Vehicle> al = new ArrayList<>();
		al.add(v3);
		al.add(v2);
		al.add(v1);

		for (Object ob : al) {
			session.save(ob);
		}
		tx.commit();

		List<Vehicle> list1 = session.createCriteria(Vehicle.class).list();

		for (Vehicle veh : list1) {
			System.out.println(veh);
		}

		List<Object[]> list = session.createNativeQuery("select from Vehicle").list();

		for (Object[] temp : list) {
			Vehicle v = new Vehicle();
			v.setNm(temp[0].toString());
			v.setAvg(Integer.parseInt(temp[1].toString()));

			System.out.println(v);
		}

		System.out.println("**********  Vehicle Test complete **************");

		session.close();
	}

}
