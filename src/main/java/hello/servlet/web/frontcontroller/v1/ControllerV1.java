package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 프론트 컨트롤러 도입
 */
public interface ControllerV1 {

    void process (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
