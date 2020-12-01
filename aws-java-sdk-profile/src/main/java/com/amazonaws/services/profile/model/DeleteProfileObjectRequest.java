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
package com.amazonaws.services.profile.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/profile-2020-08-15/DeleteProfileObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProfileObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * The unique identifier of the profile object generated by the service.
     * </p>
     */
    private String profileObjectUniqueKey;
    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of a customer profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     * 
     * @return The unique identifier of a customer profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of a customer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileObjectRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the profile object generated by the service.
     * </p>
     * 
     * @param profileObjectUniqueKey
     *        The unique identifier of the profile object generated by the service.
     */

    public void setProfileObjectUniqueKey(String profileObjectUniqueKey) {
        this.profileObjectUniqueKey = profileObjectUniqueKey;
    }

    /**
     * <p>
     * The unique identifier of the profile object generated by the service.
     * </p>
     * 
     * @return The unique identifier of the profile object generated by the service.
     */

    public String getProfileObjectUniqueKey() {
        return this.profileObjectUniqueKey;
    }

    /**
     * <p>
     * The unique identifier of the profile object generated by the service.
     * </p>
     * 
     * @param profileObjectUniqueKey
     *        The unique identifier of the profile object generated by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileObjectRequest withProfileObjectUniqueKey(String profileObjectUniqueKey) {
        setProfileObjectUniqueKey(profileObjectUniqueKey);
        return this;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileObjectRequest withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
        return this;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileObjectRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getProfileObjectUniqueKey() != null)
            sb.append("ProfileObjectUniqueKey: ").append(getProfileObjectUniqueKey()).append(",");
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProfileObjectRequest == false)
            return false;
        DeleteProfileObjectRequest other = (DeleteProfileObjectRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getProfileObjectUniqueKey() == null ^ this.getProfileObjectUniqueKey() == null)
            return false;
        if (other.getProfileObjectUniqueKey() != null && other.getProfileObjectUniqueKey().equals(this.getProfileObjectUniqueKey()) == false)
            return false;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getProfileObjectUniqueKey() == null) ? 0 : getProfileObjectUniqueKey().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProfileObjectRequest clone() {
        return (DeleteProfileObjectRequest) super.clone();
    }

}
