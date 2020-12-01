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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata properties of the tracking entity, trial, or trial component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MetadataProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The commit ID.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The repository.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The entity this entity was generated by.
     * </p>
     */
    private String generatedBy;
    /**
     * <p>
     * The project ID.
     * </p>
     */
    private String projectId;

    /**
     * <p>
     * The commit ID.
     * </p>
     * 
     * @param commitId
     *        The commit ID.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID.
     * </p>
     * 
     * @return The commit ID.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The commit ID.
     * </p>
     * 
     * @param commitId
     *        The commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataProperties withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The repository.
     * </p>
     * 
     * @param repository
     *        The repository.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository.
     * </p>
     * 
     * @return The repository.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository.
     * </p>
     * 
     * @param repository
     *        The repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataProperties withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The entity this entity was generated by.
     * </p>
     * 
     * @param generatedBy
     *        The entity this entity was generated by.
     */

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    /**
     * <p>
     * The entity this entity was generated by.
     * </p>
     * 
     * @return The entity this entity was generated by.
     */

    public String getGeneratedBy() {
        return this.generatedBy;
    }

    /**
     * <p>
     * The entity this entity was generated by.
     * </p>
     * 
     * @param generatedBy
     *        The entity this entity was generated by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataProperties withGeneratedBy(String generatedBy) {
        setGeneratedBy(generatedBy);
        return this;
    }

    /**
     * <p>
     * The project ID.
     * </p>
     * 
     * @param projectId
     *        The project ID.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The project ID.
     * </p>
     * 
     * @return The project ID.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The project ID.
     * </p>
     * 
     * @param projectId
     *        The project ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataProperties withProjectId(String projectId) {
        setProjectId(projectId);
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getGeneratedBy() != null)
            sb.append("GeneratedBy: ").append(getGeneratedBy()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataProperties == false)
            return false;
        MetadataProperties other = (MetadataProperties) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getGeneratedBy() == null ^ this.getGeneratedBy() == null)
            return false;
        if (other.getGeneratedBy() != null && other.getGeneratedBy().equals(this.getGeneratedBy()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getGeneratedBy() == null) ? 0 : getGeneratedBy().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return hashCode;
    }

    @Override
    public MetadataProperties clone() {
        try {
            return (MetadataProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MetadataPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
