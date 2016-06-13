package com.chanlytech.unicorn.annotation.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UinInjectView
{
    /**
     * View的ID
     */
    public int id() default -1;

    /**
     * View的单击事件
     */
    public boolean isClick() default false;

    /**
     * View的长按键事件
     */
    public String longClick() default "";

    /**
     * View的焦点改变事件
     */
    public String focuschange() default "";

    /**
     * View的手机键盘事件
     */
    public String key() default "";

    /**
     * View的触摸事件
     */
    public String Touch() default "";
}
