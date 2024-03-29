/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.DataQuery;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.client.model.TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter;
import org.openapitools.client.model.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueryApi
 */
@Ignore
public class QueryApiTest {

    private final QueryApi api = new QueryApi();

    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumRefStringTest() {
        String enumNonrefStringQuery = null;
        StringEnumRef enumRefStringQuery = null;

        String response = api.testEnumRefString(enumNonrefStringQuery, enumRefStringQuery);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryDatetimeDateStringTest() {
        OffsetDateTime datetimeQuery = null;
        LocalDate dateQuery = null;
        String stringQuery = null;

        String response = api.testQueryDatetimeDateString(datetimeQuery, dateQuery, stringQuery);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryIntegerBooleanStringTest() {
        Integer integerQuery = null;
        Boolean booleanQuery = null;
        String stringQuery = null;

        String response = api.testQueryIntegerBooleanString(integerQuery, booleanQuery, stringQuery);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleDeepObjectExplodeTrueObjectTest() {
        Pet queryObject = null;

        String response = api.testQueryStyleDeepObjectExplodeTrueObject(queryObject);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleDeepObjectExplodeTrueObjectAllOfTest() {
        TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter queryObject = null;

        String response = api.testQueryStyleDeepObjectExplodeTrueObjectAllOf(queryObject);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueArrayStringTest() {
        TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject = null;

        String response = api.testQueryStyleFormExplodeTrueArrayString(queryObject);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueObjectTest() {
        Pet queryObject = null;

        String response = api.testQueryStyleFormExplodeTrueObject(queryObject);

        // TODO: test validations
    }
    
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueObjectAllOfTest() {
        DataQuery queryObject = null;

        String response = api.testQueryStyleFormExplodeTrueObjectAllOf(queryObject);

        // TODO: test validations
    }
    
}
