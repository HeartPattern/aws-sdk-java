/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBackendRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBackendRequestMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> APPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appName").build();
    private static final MarshallingInfo<String> BACKENDENVIRONMENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backendEnvironmentName").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceConfig").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceName").build();

    private static final CreateBackendRequestMarshaller instance = new CreateBackendRequestMarshaller();

    public static CreateBackendRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBackendRequest createBackendRequest, ProtocolMarshaller protocolMarshaller) {

        if (createBackendRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBackendRequest.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(createBackendRequest.getAppName(), APPNAME_BINDING);
            protocolMarshaller.marshall(createBackendRequest.getBackendEnvironmentName(), BACKENDENVIRONMENTNAME_BINDING);
            protocolMarshaller.marshall(createBackendRequest.getResourceConfig(), RESOURCECONFIG_BINDING);
            protocolMarshaller.marshall(createBackendRequest.getResourceName(), RESOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
