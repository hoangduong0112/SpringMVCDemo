/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demo;

import com.hd.pojo.Category;
import com.hd.pojo.Product;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Demo {

    public static void main(String[] args) {
//        try (Session s = new HibernateUtils().getFactory().openSession()) {
//            Query q = s.createQuery("From Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));                            
//        }
        Session s = new HibernateUtils().getFactory().openSession();
        
        Query q = s.createQuery("Select d.name From Product d Where d.name LIKE :arg").setParameter("arg", "iPhone");
        List<Product> pros = q.getResultList();
        pros.forEach(c -> System.out.println(c.getName()));
        
        s.close();
    
    }
}
