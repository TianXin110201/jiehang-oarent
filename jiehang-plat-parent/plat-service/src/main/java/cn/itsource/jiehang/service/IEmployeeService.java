package cn.itsource.jiehang.service;

import cn.itsource.jiehang.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IEmployeeService extends IService<Employee> {

    Employee login(String username, String password);

}
