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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetContainerRecipePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerRecipePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     * </p>
     */
    private String containerRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     * </p>
     * 
     * @param containerRecipeArn
     *        The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     */

    public void setContainerRecipeArn(String containerRecipeArn) {
        this.containerRecipeArn = containerRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     */

    public String getContainerRecipeArn() {
        return this.containerRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     * </p>
     * 
     * @param containerRecipeArn
     *        The Amazon Resource Name (ARN) of the container recipe for the policy being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerRecipePolicyRequest withContainerRecipeArn(String containerRecipeArn) {
        setContainerRecipeArn(containerRecipeArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContainerRecipeArn() != null)
            sb.append("ContainerRecipeArn: ").append(getContainerRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerRecipePolicyRequest == false)
            return false;
        GetContainerRecipePolicyRequest other = (GetContainerRecipePolicyRequest) obj;
        if (other.getContainerRecipeArn() == null ^ this.getContainerRecipeArn() == null)
            return false;
        if (other.getContainerRecipeArn() != null && other.getContainerRecipeArn().equals(this.getContainerRecipeArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerRecipeArn() == null) ? 0 : getContainerRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerRecipePolicyRequest clone() {
        return (GetContainerRecipePolicyRequest) super.clone();
    }

}
