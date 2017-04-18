package evolution.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import evolution.interceptor.AnyInterceptor;

@Configuration
public class AnyConfiguration extends WebMvcConfigurerAdapter {
	@Autowired// You are encouraged to use @Autowired rather than new key word in @Configuration otherwise there is no need to use spring.
	private AnyInterceptor anyInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(this.anyInterceptor);
	}
}
