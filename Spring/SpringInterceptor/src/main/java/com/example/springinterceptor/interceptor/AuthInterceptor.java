package com.example.springinterceptor.interceptor;

import com.example.springinterceptor.annotation.Auth;
import com.example.springinterceptor.exception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Component
@Slf4j
public class AuthInterceptor extends InterceptorRegistry implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String url = request.getRequestURI();
        log.info("request url: {}", url);

        URI uri = UriComponentsBuilder.fromUriString(request.getRequestURI())
                .query(request.getQueryString())
                .build().toUri();

        boolean hasAnnotation = checkAnnotation(handler, Auth.class);
        log.info("has annotation: {}", hasAnnotation);

        // 서버는 모두 public 으로 동작하지만
        // Auth 권한을 가진 요청에 대해서는 세션, 쿠키 등
        if (hasAnnotation) {
            // 권한 체크
            String query = uri.getQuery();
            log.info("Query: {}", query);

            if (query.equals("name=slykid")) {
                return true;
            }

            throw new AuthException();

        }

        return true;  // false 로 설정되어 있으면, Interceptor 까지 도달하지 못했기 때문에 void 로 반환
    }

    private boolean checkAnnotation(Object handler, Class clazz) {

        // resource javascript, html, ...
        if (handler instanceof ResourceHttpRequestHandler) {
            return true;
        }

        // annotation check
        HandlerMethod handlerMethod = (HandlerMethod) handler;

        if (handlerMethod.getMethodAnnotation(clazz) != null || handlerMethod.getBeanType().getAnnotation(clazz) != null) {
            // Auth 어노테이션이 있을 경우 true,
            return true;
        }

        return true;
    }
}
