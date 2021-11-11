package com.example.MyBlog.IndexController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.MyBlog.UserDAO.UserDAO;
import com.example.MyBlog.model.UserDetails;


@Controller
public class IndexController {
	
	//Index Controller will display respective url
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	public String user()
	{
		
		return "index";  //separation of concerns
	}
	@RequestMapping("addUser")
	public String adduser(UserDetails userdetails)
	{
		
		userdao.save(userdetails);
		return "index";  //separation of concerns
	}
	@RequestMapping("getUser")
	public ModelAndView getuser(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("ShowUser.jsp");
		UserDetails userdetails =  userdao.findById(id).orElse(new UserDetails());
		mav.addObject(userdetails);
		return mav;  //separation of concerns
	}

}
