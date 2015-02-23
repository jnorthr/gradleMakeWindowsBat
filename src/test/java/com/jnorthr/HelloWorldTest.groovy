package com.jnorthr;
import org.springframework.boot.test.OutputCapture;

/*
 * Copyright 2009 the original author or authors.
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
 */

class HelloWorldTest extends spock.lang.Specification {

 HelloWorld hw;

 @org.junit.Rule
 OutputCapture capture = new OutputCapture();

 // run before the first feature method
 def setupSpec() 
 {
 } // end of setupSpec()     

 // run before every feature method
 def setup() 
 {
	hw = new HelloWorld();
 }          

 // run after every feature method
 def cleanup() 
 {

 }        

 // run after the last feature method 
 def cleanupSpec() 
 {

 }   
 
	def "Build default HelloWorld"() {
		when:	'default HelloWorld has been built'
		then:	hw != null;
   } // end of feature method
 
 
} // end of class