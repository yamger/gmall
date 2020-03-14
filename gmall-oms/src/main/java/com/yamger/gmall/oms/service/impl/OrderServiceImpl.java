package com.yamger.gmall.oms.service.impl;

import com.yamger.gmall.oms.entity.Order;
import com.yamger.gmall.oms.mapper.OrderMapper;
import com.yamger.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-14
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
