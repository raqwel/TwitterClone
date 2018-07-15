package com.example.twitter;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class helloFilter extends OncePerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(helloFilter.class);


    @Override
    protected void initFilterBean() throws ServletException {
        super.initFilterBean();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        if (AccessContext.isExistAccessContextOnThread()) {
            // 既に設定されていたら何もしないで次へ
            // (二度呼び出しされたときのために念のため)
            filterChain.doFilter(request, response);
        }


        LocalDateTime accessDateTime = LocalDateTime.now();

        AccessContext context = new AccessContext();
        context.setAccessLocalDateTime(accessDateTime);
        AccessContext.setAccessContextOnThread(context);

        try {
            filterChain.doFilter(request, response);
        } finally {
            AccessContext.clearAccessContextOnThread();
        }
    }
}
