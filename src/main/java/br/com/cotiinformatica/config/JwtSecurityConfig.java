package br.com.cotiinformatica.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.cotiinformatica.filters.JwtSecurityFilter;

@Configuration
public class JwtSecurityConfig {

	@Bean
	public FilterRegistrationBean<JwtSecurityFilter> jwtFilter(){
		
		//definindo o filter que irá realizar a regra de autorização e autenticação do projeto
		FilterRegistrationBean<JwtSecurityFilter> filter = new FilterRegistrationBean<JwtSecurityFilter>();
		filter.setFilter(new JwtSecurityFilter());
		
		//definindo quais endpoints da APi exigem autenticação
		filter.addUrlPatterns("/api/*");
		
		return filter;
	}
}
