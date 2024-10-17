package com.kgisl.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/item")
@Controller
public class ItemController {

    @RequestMapping("/") // to run localhost:8080/app/item/
    public String showPage() {
        return "home";
    }

    @RequestMapping("/index") // to run localhost:8080/app/item/index
    public String indexPage() {
        return "index";
    }

    // MODEL
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(@Validated Item item, Model model) {
        System.out.println("User Page Requested");
        System.out.println(item);
        model.addAttribute("itemId", item.getItemId());
        model.addAttribute("itemName", item.getItemName());
        model.addAttribute("expDate", item.getExpDate());
        model.addAttribute("price", item.getPrice());
        model.addAttribute("category", item.getCategory());
        return "user";
    }

    // MODEL MAP
    // @RequestMapping(value = "/user", method = RequestMethod.POST)
    // public String user(@Validated Item item, ModelMap modelMap) {
    // System.out.println("User Page Requested");
    // System.out.println(item);
    // modelMap.addAttribute("itemId", item.getItemId());
    // modelMap.addAttribute("itemName", item.getItemName());
    // modelMap.addAttribute("expDate", item.getExpDate());
    // modelMap.addAttribute("price", item.getPrice());
    // modelMap.addAttribute("category", item.getCategory());
    // return "user";
    // }

    // MODEL AND VIEW
    // @RequestMapping(value = "/user", method = RequestMethod.POST)
    // public ModelAndView user(@Validated Item item) {
    // System.out.println("User Page Requested");
    // System.out.println(item);
    // ModelAndView modelAndView = new ModelAndView("user");
    // modelAndView.addObject("itemId", item.getItemId());
    // modelAndView.addObject("itemName", item.getItemName());
    // modelAndView.addObject("expDate", item.getExpDate());
    // modelAndView.addObject("price", item.getPrice());
    // modelAndView.addObject("category", item.getCategory());
    // return modelAndView;
    // }

}
