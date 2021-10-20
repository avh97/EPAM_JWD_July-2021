package by.khaletski.task08.controller;

import by.khaletski.task08.entity.Tariff;
import by.khaletski.task08.service.DOMTariffsBuilder;
import by.khaletski.task08.service.SAXTariffsBuilder;
import by.khaletski.task08.service.StAXTariifsBuilder;
import org.xml.sax.SAXException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "XMLServlet", urlPatterns = {"/xmlservlet"})
public class XMLServlet extends HttpServlet {
    public static final String PATH_NAME;

    static {
        PATH_NAME = FileUploadServlet.pathToFile;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String requestParameter = request.getParameter("switchParser");
        List<Tariff> tariffList = new ArrayList<>();
        switch (requestParameter) {
            case "DOM":
                try {
                    tariffList = new DOMTariffsBuilder().build(PATH_NAME);
                } catch (ParserConfigurationException | SAXException e) {
                    e.printStackTrace();
                }
                break;
            case "SAX":
                try {
                    tariffList = new SAXTariffsBuilder().build(PATH_NAME);
                } catch (ParserConfigurationException | SAXException e) {
                    e.printStackTrace();
                }
                break;
            case "StAX":
                try {
                    tariffList = new StAXTariifsBuilder().build(PATH_NAME);
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }
                break;
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>task08XML</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + requestParameter + "</h1>");
        out.println("<h2>" + "XML path: " + PATH_NAME + "</h2>");
        out.println("<h1>List of tariffs:</h1>");
        out.println("<table><thread>"
                + "<th>ID</th>"
                + "<th>Name</th>"
                + "<th>Payroll</th>"
                + "<th>Inside Network</th>"
                + "<th>Outside Network</th>"
                + "<th>Stationary Network</th>"
                + "<th>Traffic</th>"
                + "<th>Tarification Type</th>"
                + "<th>Favourite Numbers</th>"
                + "<th>Connection Fee</th>"
                + "</thread><tbody>");
        for (Tariff tariff : tariffList) {
            out.println("<tr><td style=\"text-align: center;\">" + tariff.getId() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.getName() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.getPayroll() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.callPrices.getInsideNetwork() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.callPrices.getOutsideNetwork() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.callPrices.getStationaryNetwork() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.getTraffic() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.parameters.getTarificationType() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.parameters.getFavouriteNumbers() + "</td>"
                    + "<td style=\"text-align: center;\">" + tariff.parameters.getConnectionFee() + "</td></tr>");
        }
        out.println("</tbody></table>");
        out.println("</body>");
        out.println("</html>");
    }
}
