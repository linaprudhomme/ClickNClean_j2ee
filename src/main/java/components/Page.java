package components;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

import model.UserStatus;

public class Page {
    public static String url;
    public static UserStatus sessionHost;

    public static void TopPage(HttpServletResponse response, String url) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(
            "<!DOCTYPE html>"
            + "<html lang='fr'>"
            + "<head>"
            +    "<link rel='stylesheet' href='./resources/style.css'>"
            +    "<meta charset='UTF-8'>"
            +    "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
            +        "<title> " + url + "</title>"
            + "</head>"
            + "<body>" + Header.Render(response, UserStatus.OWNER)
        );
    }

    public static void BottomPage(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(
            "</body>"
            + "</html>"
        );
    }
}
