/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl;

import org.apache.camel.Exchange;
import org.apache.camel.CamelContext;

/**
 * A base class useful for implementing other typesafe exchanges
 *
 * @version $Revision$
 */
public abstract class ExchangeSupport<M,R,F> implements Exchange<M,R,F> {
    private M request;
    private R response;
    private F fault;
    private Exception exception;
    private String exchangeId;
    protected final CamelContext container;

    public ExchangeSupport(CamelContext container) {
        this.container = container;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public F getFault() {
        return fault;
    }

    public void setFault(F fault) {
        this.fault = fault;
    }

    public M getRequest() {
        return request;
    }

    public void setRequest(M request) {
        this.request = request;
    }

    public R getResponse() {
        return response;
    }

    public void setResponse(R response) {
        this.response = response;
    }
    
    
    public String getExchangeId() {
        return exchangeId;
    }
    
  
    public void setExchangeId(String id) {
        this.exchangeId=id;
    }

    public CamelContext getContainer() {
        return container;
    }
}
