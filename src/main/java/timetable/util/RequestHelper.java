package timetable.util;

import java.util.Enumeration;

import jakarta.servlet.http.HttpServletRequest;

public class RequestHelper {
	public static void displayRequest(HttpServletRequest req) {
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            System.out.println(paramName + " : " + req.getParameter(paramName));
        }
    }
}
