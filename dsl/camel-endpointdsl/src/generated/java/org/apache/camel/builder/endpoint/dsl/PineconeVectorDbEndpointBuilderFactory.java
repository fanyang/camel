/* Generated by camel build tools - do NOT edit this file! */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on the Pinecone Vector Database.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PineconeVectorDbEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Pinecone component.
     */
    public interface PineconeVectorDbEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPineconeVectorDbEndpointBuilder advanced() {
            return (AdvancedPineconeVectorDbEndpointBuilder) this;
        }

        /**
         * Sets the API key to use for authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default PineconeVectorDbEndpointBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Pinecone component.
     */
    public interface AdvancedPineconeVectorDbEndpointBuilder
            extends
                EndpointProducerBuilder {
        default PineconeVectorDbEndpointBuilder basic() {
            return (PineconeVectorDbEndpointBuilder) this;
        }

        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPineconeVectorDbEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPineconeVectorDbEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface PineconeVectorDbBuilders {
        /**
         * Pinecone (camel-pinecone)
         * Perform operations on the Pinecone Vector Database.
         * 
         * Category: database,ai
         * Since: 4.6
         * Maven coordinates: org.apache.camel:camel-pinecone
         * 
         * @return the dsl builder for the headers' name.
         */
        default PineconeVectorDbHeaderNameBuilder pinecone() {
            return PineconeVectorDbHeaderNameBuilder.INSTANCE;
        }
        /**
         * Pinecone (camel-pinecone)
         * Perform operations on the Pinecone Vector Database.
         * 
         * Category: database,ai
         * Since: 4.6
         * Maven coordinates: org.apache.camel:camel-pinecone
         * 
         * Syntax: <code>pinecone:collection</code>
         * 
         * Path parameter: collection (required)
         * The collection Name
         * 
         * @param path collection
         * @return the dsl builder
         */
        default PineconeVectorDbEndpointBuilder pinecone(String path) {
            return PineconeVectorDbEndpointBuilderFactory.endpointBuilder("pinecone", path);
        }
        /**
         * Pinecone (camel-pinecone)
         * Perform operations on the Pinecone Vector Database.
         * 
         * Category: database,ai
         * Since: 4.6
         * Maven coordinates: org.apache.camel:camel-pinecone
         * 
         * Syntax: <code>pinecone:collection</code>
         * 
         * Path parameter: collection (required)
         * The collection Name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path collection
         * @return the dsl builder
         */
        default PineconeVectorDbEndpointBuilder pinecone(String componentName, String path) {
            return PineconeVectorDbEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Pinecone component.
     */
    public static class PineconeVectorDbHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final PineconeVectorDbHeaderNameBuilder INSTANCE = new PineconeVectorDbHeaderNameBuilder();

        /**
         * The action to be performed.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeAction}.
         */
        public String pineconeAction() {
            return "CamelPineconeAction";
        }
        /**
         * Operation Status.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeOperationStatus}.
         */
        public String pineconeOperationStatus() {
            return "CamelPineconeOperationStatus";
        }
        /**
         * Operation Status Value.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeOperationStatusValue}.
         */
        public String pineconeOperationStatusValue() {
            return "CamelPineconeOperationStatusValue";
        }
        /**
         * Text Field Name for Insert/Upsert operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeTextFieldName}.
         */
        public String pineconeTextFieldName() {
            return "CamelPineconeTextFieldName";
        }
        /**
         * Vector Field Name for Insert/Upsert operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeVectorFieldName}.
         */
        public String pineconeVectorFieldName() {
            return "CamelPineconeVectorFieldName";
        }
        /**
         * Index Name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeIndexName}.
         */
        public String pineconeIndexName() {
            return "CamelPineconeIndexName";
        }
        /**
         * Index Pod Type.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeIndexPodType}.
         */
        public String pineconeIndexPodType() {
            return "CamelPineconeIndexPodType";
        }
        /**
         * Index Pod Environment.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeIndexPodEnvironment}.
         */
        public String pineconeIndexPodEnvironment() {
            return "CamelPineconeIndexPodEnvironment";
        }
        /**
         * Collection Name for Insert/Upsert operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeCollectionName}.
         */
        public String pineconeCollectionName() {
            return "CamelPineconeCollectionName";
        }
        /**
         * Collection Similarity Metric.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * PineconeCollectionSimilarityMetric}.
         */
        public String pineconeCollectionSimilarityMetric() {
            return "CamelPineconeCollectionSimilarityMetric";
        }
        /**
         * Collection Dimension.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeCollectionDimension}.
         */
        public String pineconeCollectionDimension() {
            return "CamelPineconeCollectionDimension";
        }
        /**
         * Collection Cloud Vendor.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeCollectionCloud}.
         */
        public String pineconeCollectionCloud() {
            return "CamelPineconeCollectionCloud";
        }
        /**
         * Collection Cloud Vendor Region.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeCollectionCloudRegion}.
         */
        public String pineconeCollectionCloudRegion() {
            return "CamelPineconeCollectionCloudRegion";
        }
        /**
         * Index Upsert Id.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeIndexId}.
         */
        public String pineconeIndexId() {
            return "CamelPineconeIndexId";
        }
        /**
         * Query Top K.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code PineconeQueryTopK}.
         */
        public String pineconeQueryTopK() {
            return "CamelPineconeQueryTopK";
        }
    }
    static PineconeVectorDbEndpointBuilder endpointBuilder(String componentName, String path) {
        class PineconeVectorDbEndpointBuilderImpl extends AbstractEndpointBuilder implements PineconeVectorDbEndpointBuilder, AdvancedPineconeVectorDbEndpointBuilder {
            public PineconeVectorDbEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new PineconeVectorDbEndpointBuilderImpl(path);
    }
}