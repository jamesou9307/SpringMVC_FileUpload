package com.james.springdemo.contorller;

import com.james.springdemo.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
public class UserController {


    private static Log logger= LogFactory.getLog(UserController.class);
@RequestMapping(value = "/add_user")
    public String addUser(Model model){

    model.addAttribute("user",new User());
    return "UserAddForm";

}

@RequestMapping(value = "/save_user")
    public String saveUser(Model model, @ModelAttribute User user, HttpServletRequest request){

    logger.info(user.toString());
    List<MultipartFile> images=user.getImages();

    if(null!=images&&images.size()>0){

        for(MultipartFile image:images){
            String fileName=image.getOriginalFilename();
            File file=new File(request.getServletContext().getRealPath("/WEB-INF/image"),fileName);
            try{
                image.transferTo(file);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    model.addAttribute("user",user);
    return "UserDetails";
}

}
