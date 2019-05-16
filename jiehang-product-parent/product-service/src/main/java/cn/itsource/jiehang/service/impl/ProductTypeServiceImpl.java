package cn.itsource.jiehang.service.impl;

import cn.itsource.jiehang.domain.ProductType;
import cn.itsource.jiehang.mapper.ProductTypeMapper;
import cn.itsource.jiehang.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author Tx
 * @since 2019-05-16
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
