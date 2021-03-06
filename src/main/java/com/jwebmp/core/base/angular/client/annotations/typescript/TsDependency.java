package com.jwebmp.core.base.angular.client.annotations.typescript;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE})
@Retention(RUNTIME)
@Inherited
@Repeatable(TsDependencies.class)
public @interface TsDependency
{
	/**
	 * The string name of the dev dependency for the given ng app
	 *
	 * @return
	 */
	String value();
	
	/**
	 * The version of the plugin in package.json
	 *
	 * @return
	 */
	String version();
	
	
	String name() default "";
	
	/**
	 * If this must be rendered in the overrides section as well
	 * @return
	 */
	boolean overrides() default false;
}
