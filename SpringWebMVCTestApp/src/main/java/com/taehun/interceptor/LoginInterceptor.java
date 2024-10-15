package com.taehun.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    // 컨트롤러 실행 전에 호출 (전처리)
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor: preHandle() called");

        // 세션에서 로그인 정보를 확인
        Object user = request.getSession().getAttribute("user");
        
        // 로그인이 되어 있지 않으면 로그인 페이지로 리다이렉트
        if (user == null) {
            response.sendRedirect("/login");
            return false; // 요청을 중단하고 더 이상 컨트롤러로 진행하지 않음
        }
        
        return true; // 로그인이 되어 있으면 요청을 계속 진행
    }

    // 컨트롤러 실행 후, 뷰가 렌더링되기 전에 호출 (후처리)
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor: postHandle() called");
    }

    // 뷰가 렌더링된 후에 호출 (응답 후 처리)
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("LoginInterceptor: afterCompletion() called");
    }
}
