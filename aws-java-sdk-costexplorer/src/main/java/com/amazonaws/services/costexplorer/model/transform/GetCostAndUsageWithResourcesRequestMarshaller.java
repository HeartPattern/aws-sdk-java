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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetCostAndUsageWithResourcesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetCostAndUsageWithResourcesRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimePeriod").build();
    private static final MarshallingInfo<String> GRANULARITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Granularity").build();
    private static final MarshallingInfo<StructuredPojo> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Filter").build();
    private static final MarshallingInfo<List> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metrics").build();
    private static final MarshallingInfo<List> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupBy").build();
    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextPageToken").build();

    private static final GetCostAndUsageWithResourcesRequestMarshaller instance = new GetCostAndUsageWithResourcesRequestMarshaller();

    public static GetCostAndUsageWithResourcesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest, ProtocolMarshaller protocolMarshaller) {

        if (getCostAndUsageWithResourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getCostAndUsageWithResourcesRequest.getTimePeriod(), TIMEPERIOD_BINDING);
            protocolMarshaller.marshall(getCostAndUsageWithResourcesRequest.getGranularity(), GRANULARITY_BINDING);
            protocolMarshaller.marshall(getCostAndUsageWithResourcesRequest.getFilter(), FILTER_BINDING);
            protocolMarshaller.marshall(getCostAndUsageWithResourcesRequest.getMetrics(), METRICS_BINDING);
            protocolMarshaller.marshall(getCostAndUsageWithResourcesRequest.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(getCostAndUsageWithResourcesRequest.getNextPageToken(), NEXTPAGETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
