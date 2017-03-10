package com.kcs.auto.adverts.servlets;

import com.kcs.auto.adverts.service.AdvertsService;
import com.kcs.auto.adverts.service.LoginService;
import com.kcs.auto.adverts.service.impl.AdvertsServiceImpl;
import com.kcs.auto.adverts.service.impl.LoginServiceImpl;
import com.kcs.auto.adverts.vo.Advert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/10/2017.
 */
@WebServlet(value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email").trim();
        String password = req.getParameter("password").trim();
        String page = "advertsResult.jsp";
        if(isStringNotBlank(email) && isStringNotBlank(password)) {
            LoginService loginService = new LoginServiceImpl();

            boolean isHaveAccess = loginService.isUserHavePermissions(email, password);
            if(isHaveAccess){
                page = "userAdverts.jsp";
            }else {
                req.setAttribute("adverts", loadAdverts());
                req.setAttribute("error", "Toks vartotojas neegzistuoja");
            }
        } else {
            req.setAttribute("error", "Blogi prisijungimo duomenys");
            req.setAttribute("adverts", loadAdverts());
        }
        req.getRequestDispatcher(page).forward(req, resp);
    }

    private List<Advert> loadAdverts(){
        AdvertsService advertsService = new AdvertsServiceImpl();
        return advertsService.getAdverts();
    }

    private boolean isStringNotBlank(String value){
        boolean val = false;
        if(value != null && !value.equals("") && value.length() > 3){
            val = true;
        }
        return val;
    }
}
