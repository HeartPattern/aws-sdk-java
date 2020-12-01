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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnableClientAuthenticationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableClientAuthenticationResultJsonUnmarshaller implements Unmarshaller<EnableClientAuthenticationResult, JsonUnmarshallerContext> {

    public EnableClientAuthenticationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnableClientAuthenticationResult enableClientAuthenticationResult = new EnableClientAuthenticationResult();

        return enableClientAuthenticationResult;
    }

    private static EnableClientAuthenticationResultJsonUnmarshaller instance;

    public static EnableClientAuthenticationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnableClientAuthenticationResultJsonUnmarshaller();
        return instance;
    }
}
