package brb.research.rest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilterTest implements Filter{

	private static final Logger logger=LoggerFactory.getLogger(LogFilterTest.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("Logger instantiated");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
	}

	@Override
	public void destroy() {
		
	}

}
