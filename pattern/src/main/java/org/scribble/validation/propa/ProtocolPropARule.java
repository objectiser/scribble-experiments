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
package org.scribble.validation.propa;

import org.scribble.model.Protocol;
import org.scribble.validation.PropertyValidationRule;

public class ProtocolPropARule implements PropertyValidationRule<PropAContext, Protocol> {

	@Override
	public void start(PropAContext context, Protocol model) {
		System.out.println("ProtocolPropARule start model="+model);
	}

	@Override
	public void end(PropAContext context, Protocol model) {
		System.out.println("ProtocolPropARule end model="+model);
	}

}
