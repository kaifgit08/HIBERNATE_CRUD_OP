package com.simpili.driver;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.simpili.bean.Employee;

//Perfoming Crud operation
public class DriverMain {
	public static void main(String[] args) {

		Employee e1 = new Employee("Mhd Kaif", "Chennai", 202000.90f);
		Employee e2 = new Employee("ALthaf", "dubai", 2111100.20f);
		Employee e3 = new Employee("yasar", "chennai", 989866.80f);
		Employee e4 = new Employee("Aslam", "Chennai", 332223.33f);
		Employee e5 = new Employee("AK", "valiyur", 333330.90f);
		Employee e6 = new Employee("Nandhini", "madurai", 323232.90f);
		Employee e7 = new Employee("Sudhabam", "kerala", 20000.90f);
		Employee e8 = new Employee("sharique", "qatar", 2878282.90f);
		Employee e9 = new Employee("gathan", "mumbai", 329883.90f);
		Employee e10 = new Employee("SaKarthi", "delhi", 98633.90f);

		Configuration config = new Configuration();
		config.configure();

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
//		// to create
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);
//		session.save(e5);
//		session.save(e6);
//		session.save(e7);
//		session.save(e8);
//		session.save(e9);
//		session.save(e10);
//
//		// to read
//
//		Employee s11 = session.get(Employee.class, 2);
//		System.out.println(s11.getF_name());
//
//		// to update
//
//		Employee s12 = session.get(Employee.class, 8);
//		System.out.println("Before Update " + s12.getCity());
//		s12.setCity("Abudhabi");
//		System.out.println("After Update" + s12.getCity());
//
//		// to delete
//		Employee s13 = session.get(Employee.class, 10);
//		session.delete(s13);
		
		Query query=session.createQuery("from Employee where emp_id =3");
		List<Employee> empList=query.list();
		System.out.println("Going to print the Table");
		for(Employee p:empList) {
			System.out.println(p);
		}
		
		
		
		session.getTransaction().commit();
		session.close();

	}

}
