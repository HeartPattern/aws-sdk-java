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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information for the bots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more bots available, the
     * <code>nextToken</code> field contains a token to the next page of results.
     * </p>
     */
    private java.util.List<BotSummary> botSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBots</code> operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information for the bots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more bots available, the
     * <code>nextToken</code> field contains a token to the next page of results.
     * </p>
     * 
     * @return Summary information for the bots that meet the filter criteria specified in the request. The length of
     *         the list is specified in the <code>maxResults</code> parameter of the request. If there are more bots
     *         available, the <code>nextToken</code> field contains a token to the next page of results.
     */

    public java.util.List<BotSummary> getBotSummaries() {
        return botSummaries;
    }

    /**
     * <p>
     * Summary information for the bots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more bots available, the
     * <code>nextToken</code> field contains a token to the next page of results.
     * </p>
     * 
     * @param botSummaries
     *        Summary information for the bots that meet the filter criteria specified in the request. The length of the
     *        list is specified in the <code>maxResults</code> parameter of the request. If there are more bots
     *        available, the <code>nextToken</code> field contains a token to the next page of results.
     */

    public void setBotSummaries(java.util.Collection<BotSummary> botSummaries) {
        if (botSummaries == null) {
            this.botSummaries = null;
            return;
        }

        this.botSummaries = new java.util.ArrayList<BotSummary>(botSummaries);
    }

    /**
     * <p>
     * Summary information for the bots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more bots available, the
     * <code>nextToken</code> field contains a token to the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotSummaries(java.util.Collection)} or {@link #withBotSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param botSummaries
     *        Summary information for the bots that meet the filter criteria specified in the request. The length of the
     *        list is specified in the <code>maxResults</code> parameter of the request. If there are more bots
     *        available, the <code>nextToken</code> field contains a token to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotsResult withBotSummaries(BotSummary... botSummaries) {
        if (this.botSummaries == null) {
            setBotSummaries(new java.util.ArrayList<BotSummary>(botSummaries.length));
        }
        for (BotSummary ele : botSummaries) {
            this.botSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the bots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more bots available, the
     * <code>nextToken</code> field contains a token to the next page of results.
     * </p>
     * 
     * @param botSummaries
     *        Summary information for the bots that meet the filter criteria specified in the request. The length of the
     *        list is specified in the <code>maxResults</code> parameter of the request. If there are more bots
     *        available, the <code>nextToken</code> field contains a token to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotsResult withBotSummaries(java.util.Collection<BotSummary> botSummaries) {
        setBotSummaries(botSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBots</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the <code>ListBots</code>
     *        operation. If the <code>nextToken</code> field is present, you send the contents as the
     *        <code>nextToken</code> parameter of a <code>ListBots</code> operation request to get the next page of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBots</code> operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListBots</code> operation. If the <code>nextToken</code> field is present, you send the contents as
     *         the <code>nextToken</code> parameter of a <code>ListBots</code> operation request to get the next page of
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListBots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListBots</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the <code>ListBots</code>
     *        operation. If the <code>nextToken</code> field is present, you send the contents as the
     *        <code>nextToken</code> parameter of a <code>ListBots</code> operation request to get the next page of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBotsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBotSummaries() != null)
            sb.append("BotSummaries: ").append(getBotSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBotsResult == false)
            return false;
        ListBotsResult other = (ListBotsResult) obj;
        if (other.getBotSummaries() == null ^ this.getBotSummaries() == null)
            return false;
        if (other.getBotSummaries() != null && other.getBotSummaries().equals(this.getBotSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotSummaries() == null) ? 0 : getBotSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBotsResult clone() {
        try {
            return (ListBotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
