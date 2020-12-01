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
package com.amazonaws.services.connectcontactlens;

import javax.annotation.Generated;

import com.amazonaws.services.connectcontactlens.model.*;

/**
 * Abstract implementation of {@code AmazonConnectContactLensAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonConnectContactLensAsync extends AbstractAmazonConnectContactLens implements AmazonConnectContactLensAsync {

    protected AbstractAmazonConnectContactLensAsync() {
    }

    @Override
    public java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsResult> listRealtimeContactAnalysisSegmentsAsync(
            ListRealtimeContactAnalysisSegmentsRequest request) {

        return listRealtimeContactAnalysisSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsResult> listRealtimeContactAnalysisSegmentsAsync(
            ListRealtimeContactAnalysisSegmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRealtimeContactAnalysisSegmentsRequest, ListRealtimeContactAnalysisSegmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
