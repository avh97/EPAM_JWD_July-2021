package by.khaletski.task08.controller;

import by.khaletski.task08.entity.Tariff;
import by.khaletski.task08.service.DOMTariffsBuilder;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Controller extends HttpServlet {
    public static final String pathName;

    static {
        pathName = "D:\\Java\\EPAM_JWD_July-2021\\task08XML\\src\\main\\resources\\data\\tariffs.xml";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        List<Tariff> tariffList = new ArrayList<>();
        try {
            tariffList = new DOMTariffsBuilder().build(pathName);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>task08XML</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>List of tariffs:</h1>");
        for (int i = 0; i < tariffList.size(); i++) {
            out.println("<p>" + tariffList.get(i).toString() + "<p/>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
