package com.jwebmp.core.base.angular.client.annotations.boot;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE})
@Retention(RUNTIME)
@Repeatable(NgBootGlobalFields.class)
@Inherited
public @interface NgBootGlobalField
{
	String value();
	
	boolean onParent() default false;
	
	boolean onSelf() default true;
}
