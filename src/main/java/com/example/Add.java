package com.example;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) {

        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        Double i = 0.0;
        Double j = 0.0;
        if(num1 != null && num1 != ""){
             i = Double.parseDouble(num1);
        }
        if(num2 != null && num2 != ""){
            j = Double.parseDouble(num2);
       }
        String button = req.getParameter("button");
        Double result;
        Calculator calculator = new Calculator();

        if (button.equals("+")) {
            result = calculator.Add(i, j);
        } else if (button.equals("-")) {
            result = calculator.Substraction(i, j);
        } else if (button.equals("*")) {
            result = calculator.multiplication(i, j);
        } else if (button.equals("/")) {
            result = calculator.Division(i, j);
        } else if (button.equals("Sq")) {
                result = calculator.Square(i > 0 ? i : j);
        } else if (button.equals("power")) {
            result = calculator.Power(i, j);
        } else {
            result = 0.0;
        }
        try {
            res.getWriter().println("result is : " + result);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}