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

import static org.junit.Assert.*;

import org.junit.Test;
import org.scribble.model.Protocol;
import org.scribble.model.MessageTransfer;
import org.scribble.validation.propa.MessageTransferPropARule;
import org.scribble.validation.propa.PropAContext;

public class ValidatorTest {

	@Test
	public void test() {
		Validator validator=new Validator();
		
		Protocol p=new Protocol();
		
		MessageTransfer mt1=new MessageTransfer();
		p.getActivities().add(mt1);
		
		MessageTransfer mt2=new MessageTransfer();
		p.getActivities().add(mt2);
		
		validator.validate(p);
	}

}
