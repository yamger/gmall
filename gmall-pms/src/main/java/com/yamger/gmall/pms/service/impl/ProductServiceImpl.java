package com.yamger.gmall.pms.service.impl;

import com.yamger.gmall.pms.entity.Product;
import com.yamger.gmall.pms.mapper.ProductMapper;
import com.yamger.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-14
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
