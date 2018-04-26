import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleCalculatorServlet", urlPatterns = "/calculator")
public class SimpleCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int firstNumber = Integer.parseInt(request.getParameter("firstNumber")) ;
        String option = request.getParameter("option");
        int secondNumber =Integer.parseInt(request.getParameter("secondNumber")) ;
        int sum = firstNumber+secondNumber;
        int sub = firstNumber-secondNumber;
        int mul = firstNumber*secondNumber;
        int division = firstNumber/secondNumber;

        PrintWriter writer = response.getWriter();

        switch (option){
            case "Summation":
                writer.println("<h1>Result: "+sum+"</h1>");
                break;
            case "Subtraction":
                writer.println("<h1>Result: "+sub+"</h1>");
                break;
            case "Multiplication":
                writer.println("<h1>Result: "+mul+"</h1>");
                break;
            case "Division":
                writer.println("<h1>Result: "+division+"</h1>");
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
