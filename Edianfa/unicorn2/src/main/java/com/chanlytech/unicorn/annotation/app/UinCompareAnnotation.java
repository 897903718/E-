package com.chanlytech.unicorn.annotation.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(
        {
                ElementType.FIELD,
                ElementType.PARAMETER,
                ElementType.METHOD
        })
public @interface UinCompareAnnotation
{
    /**
     * 选择进行排序属性标识
     *
     * @return 返回标识码
     */
    int sortFlag() default 0;
}
