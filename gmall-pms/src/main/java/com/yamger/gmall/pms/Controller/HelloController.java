package com.yamger.gmall.pms.Controller;

import com.yamger.gmall.pms.entity.Brand;
import com.yamger.gmall.pms.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yamger
 * @create 2020-03-14 19:25
 */
@RestController
public class HelloController {
    @Autowired
    BrandService brandService;
    @GetMapping("/hello")
    public String hello(){
        Brand brand = new Brand();
        brand.setName("yamger");
        boolean save = brandService.save(brand);
        if (save){
            System.out.println("插入成功");
        }
        return "succ";
    }
}
