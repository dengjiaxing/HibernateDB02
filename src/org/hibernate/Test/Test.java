package org.hibernate.Test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.entity.Address;
import org.hibernate.entity.HiberateUtil;
import org.hibernate.entity.User;

public class Test {
	public static void main(String[] args) {
		Session session = HiberateUtil.getSession();
		session.beginTransaction();
		Set<Address> set=new HashSet<>();
		try {
			User user=new User();
			user.setName("Jack");
			user.setPassword("111");
			Address address1=new Address();
			address1.setAddressinfo("America");		
			set.add(address1);
			Address address2=new Address();
			address2.setAddressinfo("China");		
			set.add(address2);
			user.setAddresses(set);
			session.save(user);
			session.save(address1);
			session.save(address2);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
