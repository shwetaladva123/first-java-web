package com.example;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse res)
    {
       
        Double i = Double.parseDouble(req.getParameter("num1"));
        Double j = Double.parseDouble(req.getParameter("num2"));
        String  button = req.getParameter("button");
        Double result;
        Calculator calculator = new Calculator();
       
       if(button.equals("+"))
       {
           result =  calculator.Add(i, j);
       }
       else if(button.equals("-"))
       {
           result =  calculator.Substraction(i, j);
       }
       else if(button.equals("*"))
       {
          result =   calculator.multiplication(i, j);
       }
       else
       {
            result = calculator.Division(i, j);
       }
            try {
                res.getWriter().println("result is : " + result);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }
}