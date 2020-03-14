package com.yamger.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yamger.gmall.oms.entity.CartItem;
import com.yamger.gmall.oms.mapper.CartItemMapper;
import com.yamger.gmall.oms.service.CartItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-14
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
