package com.nt;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Controller.MainController;
import com.nt.vo.CustName;

/**
 * Hello world!
 *
 */
public class ClientApp 
{
	
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CUST ADDRESS");
        String adress=sc.next();
        System.out.println("ENTER CUST PRINCIPAL AMOUNT");
        String PMA=sc.next();
        System.out.println("ENTER CUST rATE OF INTERST");
        String INT=sc.next();
        System.out.println("ENTER MONTH TO CALCULATE ");
        String TIM=sc.next();
        
        CustName vo=new CustName();    
        vo.setCustAd(adress);
        vo.setPamt(PMA);
        vo.setRate(INT);
        vo.setTime(TIM);
        
        DefaultListableBeanFactory dlf=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader fac=new XmlBeanDefinitionReader(dlf);
        fac.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
        MainController controller= dlf.getBean("controller",MainController.class );
        try {
			System.out.println(controller.processCustomer(vo));;
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
}
