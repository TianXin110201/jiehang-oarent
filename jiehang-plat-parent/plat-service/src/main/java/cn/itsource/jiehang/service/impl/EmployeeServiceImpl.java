package cn.itsource.jiehang.service.impl;

import cn.itsource.jiehang.domain.Employee;
import cn.itsource.jiehang.mapper.EmployeeMapper;
import cn.itsource.jiehang.service.IEmployeeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tx
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements IEmployeeService {

    @Override
    public Employee login(String username, String password) {
        return baseMapper.selectOne(new QueryWrapper<Employee>()
                .eq("username",username)
                .eq("password",password));
    }
}
