package com.oguzhanun.springboot.thymleaf;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurer extends WebSecurityConfigurerAdapter 
{
	
	@Autowired
	private DataSource comboPooledDataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
//		UserBuilder users = User.withDefaultPasswordEncoder();
//		
//		auth.inMemoryAuthentication().withUser(users.username("john").password("test123").roles("EMPLOYEE"))
//		 .withUser(users.username("mary").password("test123").roles("MANAGER"))
//		 .withUser(users.username("adam").password("test123").roles("ADMIN"));
		
		auth.inMemoryAuthentication().withUser("user").password("{noop}test123").roles("USER")
			.and()
			.withUser("admin").password("{noop}password").roles("ADMIN");;

		auth.jdbcAuthentication().dataSource(comboPooledDataSource)
				.usersByUsernameQuery("select uye_id, password, aktif from uyeler where uye_id=?")
				.authoritiesByUsernameQuery("select rol, uye_id from roller where uye_id=?");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		
		//add your custom encoding filter as the first filter in the chain
        //http.addFilterBefore(new EncodingFilter(), ChannelProcessingFilter.class);
        
        /*The ordering of antMatchers is important. You should list the most specific url
        patterns first and then add the more general patterns later. If you don't follow this
        approach, then you will not have proper access restrictions.
        */
		http.authorizeRequests()
					.anyRequest().authenticated()
					//.antMatchers("/").hasRole("EMPLOYEE")//anonymous()//permitAll()//.hasRole("EMPLOYEE")
					//.antMatchers("/leaders/**").hasRole("MANAGER")
					//.antMatchers("/systems/**").hasRole("ADMIN")
					//.antMatchers("/secured/**").hasAnyRole("EMPLOYEE","MANAGER","ADIMIN")
					.and()
					.formLogin()
					.loginPage("/login")
					//.defaultSuccessUrl("/uyeGirisi").usernameParameter("username").passwordParameter("password")
					.loginProcessingUrl("/authenticateTheUser")
					.successForwardUrl("/home/hello")
					.permitAll()
					.and().logout()
					//.logoutSuccessUrl("/uyeGirisSayfasi")
					.permitAll()
					.and().exceptionHandling().accessDeniedPage("/accessDenied-page")
					//.and().csrf().disable()
		            ;
	}
	
	

}
