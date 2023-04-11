import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Hello", value = "/Hello")
public class Hello extends HttpServlet {
    public Hello() {
        super();
        System.out.println("Hello 생성자");
    }

    @PostConstruct
    private void initPostConstruct() {
        System.out.println("@PostConstruct 메소드");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init 메소드");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service 메소드 ");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 메소드");
    }

    @PreDestroy
    private void  destroyPreDestroy() {
        System.out.println("@PreDestroy 메소드");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
