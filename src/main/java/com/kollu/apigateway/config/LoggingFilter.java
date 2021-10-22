package com.kollu.apigateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LoggingFilter implements GlobalFilter{

	private Logger logger = LoggerFactory.getLogger(LoggingFilter.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("Consol::i am from LoggingFilter - filter - Rest URL :" +exchange.getRequest().getPath()); 
		logger.info("i am from LoggingFilter - filter - Rest URL :" +exchange.getRequest().getPath());
		
		return chain.filter(exchange); 
	}

}
