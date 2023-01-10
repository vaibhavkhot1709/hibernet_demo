package com.single_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpSingleTable {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setNm("Norm Emp");
		
		FullTimeEmp e2=new FullTimeEmp();
		e2.setFtEmpnm("FullTm Emp");
		e2.setSalaryFt(12000);
		
		PartTimeEmp e3=new PartTimeEmp();
		e3.setPtEmpNm("Parttm Emp");
		e3.setSalPerHr(300);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		
		tx.commit();
		session.close();
		factory.close();
	

	}

}
