package com.sairam.test;

import com.sairam.pojo.Account;
import com.sairam.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class TestPage {
    public static void main(String[] args) throws Exception {
        Configuration cfg = new Configuration();
        cfg.configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
        builder = builder.applySettings(cfg.getProperties());
        StandardServiceRegistry registry = builder.build();
        SessionFactory sessionFactory = cfg.buildSessionFactory(registry);

        Session session = sessionFactory.openSession();

        Account acc = new Account();
        acc.setAccNo("abc123");
        acc.setAccName("Durga");
        acc.setAccType("Savings");

        Employee emp = new Employee();
        emp.setEid("E-111");
        emp.setEname("Durga");
        emp.setEsal(25000);
        emp.setEaddr("Hyd");
        emp.setAcc(acc);

        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        System.out.println("Employee Inserted Successfully");

        session.close();
        sessionFactory.close();
    }
}
