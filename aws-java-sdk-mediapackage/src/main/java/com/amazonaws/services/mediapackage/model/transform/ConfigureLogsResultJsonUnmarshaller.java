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
package com.amazonaws.services.mediapackage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigureLogsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureLogsResultJsonUnmarshaller implements Unmarshaller<ConfigureLogsResult, JsonUnmarshallerContext> {

    public ConfigureLogsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigureLogsResult configureLogsResult = new ConfigureLogsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return configureLogsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("egressAccessLogs", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setEgressAccessLogs(EgressAccessLogsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hlsIngest", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setHlsIngest(HlsIngestJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ingressAccessLogs", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setIngressAccessLogs(IngressAccessLogsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    configureLogsResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configureLogsResult;
    }

    private static ConfigureLogsResultJsonUnmarshaller instance;

    public static ConfigureLogsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigureLogsResultJsonUnmarshaller();
        return instance;
    }
}
