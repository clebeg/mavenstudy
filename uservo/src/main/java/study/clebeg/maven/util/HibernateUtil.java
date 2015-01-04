package study.clebeg.maven.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	/**
	 * session 工厂，整个项目是唯一的
	 * */
	private static SessionFactory factory = null;
	static {
		factory = new Configuration().configure().buildSessionFactory();
	}
	
	/**
	 * 保证所有的session都是由它产生的
	 * */
	public static Session openSession() {
		return HibernateUtil.factory.openSession();
	}

}
