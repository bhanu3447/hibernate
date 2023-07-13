
package com.association.util;


import java.util.Properties;

public class ConnectionPropertiesUtil
{
 public static Properties getMysqlDbProperties()
 {
	 Properties properties=new Properties();
	 properties.setProperty("connection.driver_class","com.mysql.cj.Driver");
	 properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/telusko");
	 properties.setProperty("hibernate.connection.username","root");
	 properties.setProperty("hibernate.connection.password","ROOT");
	 properties.setProperty("hibernate.show_sql","true");
	 properties.setProperty("hibernate.hbm2ddl.auto","create");
	 return properties;
 }
}
