package com.james.springdemo.contorller;


import com.james.springdemo.entity.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

private static final Log logger= LogFactory.getLog(ProductController.class);

//用于让用户上传图片
@RequestMapping(value = "/input_product")
public String inputProduct(Model model){

    model.addAttribute("product",new Product());
    return "ProductAddForm";

}

@RequestMapping(value = "/save_product")
public String saveProduct(HttpServletRequest request, @ModelAttribute Product product,Model model){

    List<MultipartFile> files=product.getImages();//获取用户上传的文件

    List<String> filenames=new ArrayList<String>();
    if(null!=files&&files.size()>0){
        for (MultipartFile file:files){
            String fileName=file.getOriginalFilename();//获取文件名
            filenames.add(fileName);

            File imageFile=new File(request.getServletContext().getRealPath("/WEB-INF/image"),fileName);

            try {
                file.transferTo(imageFile);
            }catch (IOException ie){
                ie.printStackTrace();
            }

        }
    }
    model.addAttribute("product",product);
    return "ProductDetails";
}




}
