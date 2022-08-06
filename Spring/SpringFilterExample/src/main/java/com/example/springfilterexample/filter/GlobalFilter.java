package com.example.springfilterexample.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@Slf4j
@Component
public class GlobalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 전처리
//        HttpServletRequest httpServletRequest = (HttpServletRequest)request;   // getReader 부분에서 에러 발생 → read() 는 한번만 발생하기 때문에, 이미 읽어버려서 읽을 내용이 없기 때문에 발생함
        ContentCachingRequestWrapper httpServletRequest = new ContentCachingRequestWrapper((HttpServletRequest)request);
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        ContentCachingResponseWrapper httpServletResponse = new ContentCachingResponseWrapper((HttpServletResponse)response);

        String url = httpServletRequest.getRequestURI();

//        BufferedReader bufferedReader = httpServletRequest.getReader();
//        bufferedReader.lines().forEach(line -> {
//            log.info("URL: {}, line: {}", url, line);
//        });


        chain.doFilter(httpServletRequest, httpServletResponse);

        // 후처리(ContentCaching 사용 시, 위의 BufferedReader 에서 수행하는 역할을 아래에서 해야됨)
        // - request
        String reqContent = new String(httpServletRequest.getContentAsByteArray());
        log.info("Request URL: {}, Request Body: {}", url, reqContent);

        String resContent = new String(httpServletResponse.getContentAsByteArray());
        int httpStatus = httpServletResponse.getStatus();

        log.info("Response status : {}, Response Body: {}", httpStatus, resContent);

    }
}
