// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.build.internal.soapextensions;

import com.microsoft.tfs.core.internal.wrappers.WebServiceObjectWrapper;
import com.microsoft.tfs.core.internal.wrappers.WrapperUtils;

import ms.tfs.build.buildservice._03._BuildAgentQueryResult;

public class BuildAgentQueryResult2010 extends WebServiceObjectWrapper {
    public BuildAgentQueryResult2010(final _BuildAgentQueryResult value) {
        super(value);
    }

    public _BuildAgentQueryResult getWebServiceObject() {
        return (_BuildAgentQueryResult) webServiceObject;
    }

    public Failure2010[] getInternalFailures() {
        return (Failure2010[]) WrapperUtils.wrap(Failure2010.class, getWebServiceObject().getFailures());
    }

    public BuildAgent2010[] getAgents() {
        return (BuildAgent2010[]) WrapperUtils.wrap(BuildAgent2010.class, getWebServiceObject().getAgents());
    }

    public BuildController2010[] getControllers() {
        return (BuildController2010[]) WrapperUtils.wrap(
            BuildController2010.class,
            getWebServiceObject().getControllers());
    }

    public BuildServiceHost2010[] getServiceHosts() {
        return (BuildServiceHost2010[]) WrapperUtils.wrap(
            BuildServiceHost2010.class,
            getWebServiceObject().getServiceHosts());
    }
}
