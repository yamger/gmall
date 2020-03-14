package com.yamger.gmall.pms;

import com.yamger.gmall.pms.entity.Brand;
import com.yamger.gmall.pms.entity.Product;
import com.yamger.gmall.pms.service.BrandService;
import com.yamger.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService prod;
    @Autowired
    BrandService brandService;
    @Test
    public void GmallPmsApplicationTest() {
//        Product prods = this.prod.getById(1);
//
//        System.out.println(prods.getName());
//        System.out.println(1);
        Brand brand = new Brand();
        brand.setName("ggggggggg");

        boolean b = brandService.save(brand);

        if( b ){
            System.out.println("succ");
        }
    }

}
