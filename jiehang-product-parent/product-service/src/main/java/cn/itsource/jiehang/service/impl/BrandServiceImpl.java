package cn.itsource.jiehang.service.impl;

import cn.itsource.jiehang.domain.Brand;
import cn.itsource.jiehang.mapper.BrandMapper;
import cn.itsource.jiehang.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author Tx
 * @since 2019-05-16
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
