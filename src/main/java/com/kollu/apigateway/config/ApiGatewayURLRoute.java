package com.kollu.apigateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayURLRoute {

	private Logger logger = LoggerFactory.getLogger(ApiGatewayURLRoute.class);
	@Bean
	public RouteLocator gateWayRouter(RouteLocatorBuilder routeLocatorBuilder) {
		System.out.println("Console:: I am from ApiGatewayURLRoute- gateWayRouter");
		logger.info("I am from ApiGatewayURLRoute- gateWayRouter"); 
		/*Function<PredicateSpec, Buildable<Route>> routeFunction = 
				//filter concept 
				p -> p.path("/kollu")
							.filters(f -> f.addRequestHeader("Header", "kolluHeader")
											.addRequestParameter("hi", "bye")) 
						.uri("http://httpbin.org:80");	
				
				//p -> p.path("/kollu")
				 		.uri("http://localhost:8761/");
				
				return routeLocatorBuilder.routes().route(routeFunction).build();*/
		
		//Alternateway code
		
		return routeLocatorBuilder.routes()
								.route(p -> p.path("/customer/**")
										.uri("lb://CUSTOMERMODULE"))
								.route(p -> p.path("/customer/custByIdd/**")
										.uri("lb://CUSTOMERMODULE"))
								.route(p -> p.path("/bank/**")
										.uri("lb://BANKMODULE"))
								.route(p -> p.path("/custBank/**")
										.uri("lb://BANKMODULE"))
								.route(p -> p.path("/customerkollu/**")
												.filters(k -> k.rewritePath("/customerkollu/(?<segment>.*)", 
																			"/customer/custByIdd/${segment}"))
										.uri("lb://CUSTOMERMODULE"))
								.build();

				
				
	}//method end
}
