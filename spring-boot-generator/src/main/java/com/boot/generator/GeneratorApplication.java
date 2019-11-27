package com.boot.generator;

import com.boot.sample.mapper.UserMapper;
import com.boot.sample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@Controller
public class GeneratorApplication {
    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        SpringApplication.run(GeneratorApplication.class,args);
    }

    @ResponseBody
    @GetMapping("/findAll")
    public List<User> findall(){
      List<User> list= userMapper.selectAll();
      list.forEach(e->System.out.println(e.getId()+"\t"+e.getUsername()));
      return list;
    }

    @GetMapping("/find")
    public String findAll(ModelMap mode){
        List<User> list= userMapper.selectAll();
        list.forEach(e->System.out.println(e.getId()+"\t"+e.getUsername()));
        mode.addAttribute("list",list);
        return "list";
    }
}
