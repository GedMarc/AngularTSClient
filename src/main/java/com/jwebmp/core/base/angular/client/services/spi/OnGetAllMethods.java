package com.jwebmp.core.base.angular.client.services.spi;

import com.guicedee.guicedinjection.interfaces.*;
import com.jwebmp.core.base.angular.client.annotations.structures.*;

import java.util.*;

@FunctionalInterface
public interface OnGetAllMethods extends IDefaultService<OnGetAllMethods>
{
	void perform(List<NgMethod> allParameters, Object instance);
}
