package mera_pack;


import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class PersonImplDAO implements PersonDAO
{
	private SessionFactory sf;
	private Session s;

	
	public PersonImplDAO() 
	{
		sf = HibernateUtil.getSessionFactory();
	}

	@Override
	public void insert(Person per) 
	{
		s = sf.openSession();
        org.hibernate.Transaction tran = s.beginTransaction();
		s.save(per);
		tran.commit();
		s.close();
		System.out.println("Done with commit");
	}

	@Override
	public Person get() 
	{
		s = sf.openSession();
		Query qry = s.createQuery("from Person");
		List mylist = qry.list();
		Person per = (Person)mylist.get(0);
		s.close();
		return per;
	}

}
