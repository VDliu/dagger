package demo.com.reiniot.av.compnentdependence;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 提供provide限定,功能和@Named("Activity")一樣
 */
@Qualifier
@Documented   //起到文档提示作用
@Retention(RetentionPolicy.RUNTIME)  //注意注解范围是Runtime级别
public @interface ContextLife {
    String value() default "Application";  // 默认值是"Application"
}
