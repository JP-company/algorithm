package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//public class MyFilter1 implements Filter {
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
//
//        // 토큰: cos 이걸 만들어줘야 함. Id, pw 정상적으로 들어와서 로그인이 완료 되면 토큰을 만들어주고 그걸 응답을 해준다.
//        // 요청할 때마다 Header 에 Authorization 에 value 값으로 토큰을 가지고 온다.
//        // 그떄 토큰이 넘어오면 이 토큰이 내가 만든 토큰이 맞는지만 검증만 하면 된다.
//        if (req.getMethod().equals("POST")) {
//            System.out.println("POST 요청됨");
//            String headerAuth = req.getHeader("Authorization");
//            System.out.println(headerAuth);
//
//            if (headerAuth.equals("cos")) {
//                System.out.println("cos 확인");
//                chain.doFilter(req, res);
//            } else {
//                PrintWriter writer = res.getWriter();
//                writer.println("인증 안됨");
//            }
//        }
//    }
//}
