/*
 *      Licensed to the Apache Software Foundation (ASF) under one or more
 *      contributor license agreements.  See the NOTICE file distributed with
 *      this work for additional information regarding copyright ownership.
 *      The ASF licenses this file to You under the Apache License, Version 2.0
 *      (the "License"); you may not use this file except in compliance with
 *      the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package org.jboss.budapest.connector;

import org.apache.activemq.artemis.api.core.client.ClientSession;
import org.apache.activemq.artemis.api.core.client.ServerLocator;


/**
 * An interface that contains necessary utility methods
 *
 * @author <a href="mailto:tw.techlist@gmail.com">Tyronne Wickramarathne</a>
 */


public interface ConnectionHandler {

    /**
     * Returns a ServerLocator object from the local server
     * @return
     */
    public ServerLocator getServerLocator();

    /**
     * Returns a ServerLocator object for any given remote server instance.
     * @param ipAddress
     * @return
     */
    public ServerLocator getServerLocator(String ipAddress);

    /**
     * Creates a ClientSession
     * @param serverLocator
     * @return
     */
    public ClientSession createClientSession(ServerLocator serverLocator) throws Exception;

}
