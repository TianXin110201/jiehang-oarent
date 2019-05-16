package cn.itsource.jiehang.service.impl;

import cn.itsource.jiehang.domain.Product;
import cn.itsource.jiehang.mapper.ProductMapper;
import cn.itsource.jiehang.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author Tx
 * @since 2019-05-16
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
