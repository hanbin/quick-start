package cn.com.hanbinit.quickstart.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger配置
 * @author han_bin@outlook.com
 * @Description TODO
 */
@Configuration
public class SwaggerConfiguration {
	@Value("${spring.profiles.active:dev}")
	private String env;

	@Bean
	public OpenAPI customOpenAPI() {
		String serviceUrl = "http://localhost:8080/";
		if("pro".equals(env)){
			serviceUrl = "http://booking.qinsky.cn/";
		}
		return new OpenAPI()
				.info(new Info()
						.title("系统接口文档")
						.version("1.0")
						.description( "系统接口文档")
						.termsOfService(serviceUrl)
						.contact(new Contact().name("韩斌").url("https://blog.csdn.net/weixin_50209853").email("han_bin@outlook.com")));
	}

}
