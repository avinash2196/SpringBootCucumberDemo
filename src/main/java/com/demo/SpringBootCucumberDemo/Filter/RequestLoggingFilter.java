package com.demo.SpringBootCucumberDemo.Filter;

import jakarta.servlet.FilterConfig;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class RequestLoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        if (request instanceof HttpServletRequest httpRequest) {

            // Wrap the request to cache the body
            CachedBodyHttpServletRequest cachedRequest = new CachedBodyHttpServletRequest(httpRequest);

            // Log HTTP method and URL
            logger.info("Request Method: {}, URL: {}", cachedRequest.getMethod(), cachedRequest.getRequestURL());

            // Log headers
            cachedRequest.getHeaderNames().asIterator().forEachRemaining(header ->
                    logger.info("Header: {} = {}", header, cachedRequest.getHeader(header))
            );

            // Log body
            logger.info("Request Body: {}", cachedRequest.getCachedBody());

            // Pass the wrapped request along the filter chain
            chain.doFilter(cachedRequest, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        // Cleanup logic if needed
    }
}