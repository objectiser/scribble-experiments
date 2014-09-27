/*
 * Copyright 2009-14 www.scribble.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.scribble.validation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.scribble.validation.propa.PropAPropertyValidator;
import org.scribble.validation.propb.PropBPropertyValidator;

public class ValidationHandler implements InvocationHandler {
	
	private java.util.List<PropertyValidator> _propertyValidators=new java.util.ArrayList<PropertyValidator>();
	
	{
		_propertyValidators.add(new PropAPropertyValidator());
		_propertyValidators.add(new PropBPropertyValidator());
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		for (PropertyValidator pv : _propertyValidators) {
			if (method.getName().equals("start")) {
				pv.start(args[0]);
			} else if (method.getName().equals("end")) {
				pv.end(args[0]);
			}
		}

		return null;
	}

}
