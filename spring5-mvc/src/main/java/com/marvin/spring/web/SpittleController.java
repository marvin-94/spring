package com.marvin.spring.web;

import com.marvin.spring.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller

public class SpittleController {
    private final SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(value = "/spittles1", method = RequestMethod.GET)
    public String spittles(Model model) {//也可以使用map代替 Map<String,Object> map
        model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittle";
    }

    //url传值/spittles?max=20&count=10
    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public String spittles(@RequestParam(name = "max", defaultValue = "99") long max,
                           @RequestParam(name = "count", defaultValue = "20") int count, Map<String, Object> map) {
        //@RequestParam 接收参数名字,如果没有还可以设置默认值
        map.put("spittleList", spittleRepository.findSpittles(max, count));
        return "spittle";
    }

    //路径参数传值
    @RequestMapping(value = "/spittles/{id}", method = RequestMethod.GET)//参数使用{}包围
    public String spittles2(@PathVariable("id") Long id, Model model) {
        model.addAttribute("spittle", spittleRepository.findSpittle(id));
        return "spittle";
    }
}
