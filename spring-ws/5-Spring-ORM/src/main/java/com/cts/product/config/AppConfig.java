package com.cts.product.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.entity.Product;

@Configuration
@ComponentScan("com.cts.product.dao,com.cts.product.service")
@PropertySource(value = { "application.properties" })
@EnableTransactionManagement
public class AppConfig {

	@Autowired

	private Environment env;

	// Step 1 : Create Data source : DB Server information

	@Bean
	public DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driver-class"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.user-name"));
		ds.setPassword(env.getProperty("db.password"));
		return ds;
	}

	// 2 . Create session Factory and provide information about datasource
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		System.out.println(">>>>> GET SESSIOn FACTORY <<<<<<<");
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());

		sf.setAnnotatedClasses(Product.class); // entity class

		Properties props = new Properties();

		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		props.setProperty("hibernate.format_sql", env.getProperty("hibernate.format_sql"));

		sf.setHibernateProperties(props);

		return sf;

	}

	// 3. Create Transaction Manager class and provide information about a
	// SessionFactory

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}

}
