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
package com.amazonaws.services.docdb.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.docdb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AddTagsToResourceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsToResourceRequestMarshaller implements Marshaller<Request<AddTagsToResourceRequest>, AddTagsToResourceRequest> {

    public Request<AddTagsToResourceRequest> marshall(AddTagsToResourceRequest addTagsToResourceRequest) {

        if (addTagsToResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddTagsToResourceRequest> request = new DefaultRequest<AddTagsToResourceRequest>(addTagsToResourceRequest, "AmazonDocDB");
        request.addParameter("Action", "AddTagsToResource");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (addTagsToResourceRequest.getResourceName() != null) {
            request.addParameter("ResourceName", StringUtils.fromString(addTagsToResourceRequest.getResourceName()));
        }

        if (addTagsToResourceRequest.getTags() != null) {
            java.util.List<Tag> tagsList = addTagsToResourceRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        if (tagsListValue.getKey() != null) {
                            request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                        }

                        if (tagsListValue.getValue() != null) {
                            request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                        }
                    }
                    tagsListIndex++;
                }
            }
        }

        return request;
    }

}
