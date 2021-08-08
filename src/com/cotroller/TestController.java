package com.cotroller;

import com.entity.Business;
import com.entity.Detail;
import com.service.BusinessService;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private  BusinessService businessService;

    @RequestMapping("/add")

    public String add(Business business , HttpSession session){



        System.out.println(business);

        session.setAttribute("business",business);

        int i=businessService.add(business);

        if(i>0){
            System.out.println("成功");


            return "redirect:/page.jsp";

        }
        else {
            System.out.println("失败");

            return "redirect:/add.jsp";
        }

    }


    @RequestMapping("/insert")
    public String insert(Detail detail , HttpSession session){



        System.out.println(detail);

        session.setAttribute("detail",detail);

        int i=businessService.increase(detail);

        if(i>0){
            System.out.println("成功");


            return "redirect:/index.jsp";

        }
        else {
            System.out.println("失败");

            return "redirect:/addd.jsp";
        }

    }

}
