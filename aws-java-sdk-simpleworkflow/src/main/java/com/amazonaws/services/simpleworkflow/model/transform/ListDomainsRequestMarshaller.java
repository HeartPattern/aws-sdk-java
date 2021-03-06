/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListDomainsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListDomainsRequestMarshaller {

    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextPageToken").build();
    private static final MarshallingInfo<String> REGISTRATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registrationStatus").build();
    private static final MarshallingInfo<Integer> MAXIMUMPAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumPageSize").build();
    private static final MarshallingInfo<Boolean> REVERSEORDER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reverseOrder").build();

    private static final ListDomainsRequestMarshaller instance = new ListDomainsRequestMarshaller();

    public static ListDomainsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListDomainsRequest listDomainsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listDomainsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listDomainsRequest.getNextPageToken(), NEXTPAGETOKEN_BINDING);
            protocolMarshaller.marshall(listDomainsRequest.getRegistrationStatus(), REGISTRATIONSTATUS_BINDING);
            protocolMarshaller.marshall(listDomainsRequest.getMaximumPageSize(), MAXIMUMPAGESIZE_BINDING);
            protocolMarshaller.marshall(listDomainsRequest.getReverseOrder(), REVERSEORDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
