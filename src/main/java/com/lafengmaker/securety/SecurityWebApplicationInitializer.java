package com.lafengmaker.securety;

//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
//
//import com.lafengmaker.service.UserService;
//
//@Configuration
//@EnableWebMvcSecurity
//public class SecurityWebApplicationInitializer extends WebSecurityConfigurerAdapter  {
//	@Resource
//	private UserService userService;
//	 @Autowired
//	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//	      //  auth.userDetailsService(userService);
//	           auth.inMemoryAuthentication()
//	                .withUser("user").password("password").roles("USER");
//	    }
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		 http
//         .authorizeRequests()
//             .antMatchers("/", "/home").authenticated()
//             .anyRequest().authenticated();
//     http
//         .formLogin()
//             .loginPage("/login")
//             .permitAll()
//             .and()
//         .logout()
//             .permitAll();
//	}
//	 @Configuration
//	    protected static class AuthenticationConfiguration extends
//	            GlobalAuthenticationConfigurerAdapter {
//
//	        @Override
//	        public void init(AuthenticationManagerBuilder auth) throws Exception {
//	            auth
//	                    .inMemoryAuthentication()
//	                    .withUser("user").password("password").roles("USER");
//	        }
//
//	    }
//}
