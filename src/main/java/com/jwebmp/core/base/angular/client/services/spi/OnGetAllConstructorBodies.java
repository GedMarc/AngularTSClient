package com.jwebmp.core.base.angular.client.services.spi;

import com.guicedee.guicedinjection.interfaces.*;
import com.jwebmp.core.base.angular.client.annotations.constructors.*;

import java.util.*;

@FunctionalInterface
public interface OnGetAllConstructorBodies extends IDefaultService<OnGetAllConstructorBodies>
{
	void perform(List<NgConstructorBody> allParameters, Object instance);
}
