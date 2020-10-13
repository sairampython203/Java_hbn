package com.hbn.main;


import com.hbn.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHbn {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        // Employee Obeject creation
        Employee emp = new Employee(222,"BBB",2000.0f);
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        s.save(emp);
        // tx Commiting
        tx.commit();
        s.close();
        sf.close();
        System.out.println("Inserted sucessfully");
    }

}
