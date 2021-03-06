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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * H265 Filter Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/H265FilterSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H265FilterSettings implements Serializable, Cloneable, StructuredPojo {

    private TemporalFilterSettings temporalFilterSettings;

    /**
     * @param temporalFilterSettings
     */

    public void setTemporalFilterSettings(TemporalFilterSettings temporalFilterSettings) {
        this.temporalFilterSettings = temporalFilterSettings;
    }

    /**
     * @return
     */

    public TemporalFilterSettings getTemporalFilterSettings() {
        return this.temporalFilterSettings;
    }

    /**
     * @param temporalFilterSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H265FilterSettings withTemporalFilterSettings(TemporalFilterSettings temporalFilterSettings) {
        setTemporalFilterSettings(temporalFilterSettings);
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
        if (getTemporalFilterSettings() != null)
            sb.append("TemporalFilterSettings: ").append(getTemporalFilterSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H265FilterSettings == false)
            return false;
        H265FilterSettings other = (H265FilterSettings) obj;
        if (other.getTemporalFilterSettings() == null ^ this.getTemporalFilterSettings() == null)
            return false;
        if (other.getTemporalFilterSettings() != null && other.getTemporalFilterSettings().equals(this.getTemporalFilterSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemporalFilterSettings() == null) ? 0 : getTemporalFilterSettings().hashCode());
        return hashCode;
    }

    @Override
    public H265FilterSettings clone() {
        try {
            return (H265FilterSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.H265FilterSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
