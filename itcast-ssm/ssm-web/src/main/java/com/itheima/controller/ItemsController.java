package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/itmes")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Items> itemsList = itemsService.findAll();
        modelAndView.addObject("itemsList", itemsList);
        modelAndView.setViewName("itemsList");
        return modelAndView;
    }

    @RequestMapping("/queryItems")
<<<<<<< HEAD
    public String queryItems(
                             Items items,
                             MultipartFile pictureFile,
                             HttpServletRequest request) throws IOException {

=======
    public String queryItems(Items items,MultipartFile pictureFile,HttpServletRequest request) throws IOException {
>>>>>>> ef2e2d941b464375648c6c45890e91546ce32da9
        String path = request.getSession().getServletContext().getRealPath("/pic/");
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        String filename = pictureFile.getOriginalFilename();
        filename=UUID.randomUUID().toString().replaceAll("-","")+filename.substring(filename.lastIndexOf(".")-1);
        pictureFile.transferTo(new File(path,filename));
        items.setPic(filename);
<<<<<<< HEAD
       
=======

>>>>>>> ef2e2d941b464375648c6c45890e91546ce32da9
        itemsService.updateItems(items);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findById")
    public ModelAndView findById(Integer id) {
        Items items = itemsService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items", items);
        modelAndView.setViewName("editItems");
        return modelAndView;

    }
}
