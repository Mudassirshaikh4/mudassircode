package com.springbasic.xpress;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class machine {

	public static void main(String[] args) 
	{
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springbasic/xpress/xpression.xml");
	Substract sub=con.getBean("substract",Substract.class);	
    System.out.println(sub);
	//SpelExpressionParser temp=new SpelExpressionParser();
	//org.springframework.expression.Expression expression=temp.parseExpression("5+4-7");
	//System.out.println(expression.getValue());
	}
}
