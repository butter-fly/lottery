package com.github.chengbin.core.log;
import java.lang.annotation.*;
/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/7/2.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodLogger {

}
