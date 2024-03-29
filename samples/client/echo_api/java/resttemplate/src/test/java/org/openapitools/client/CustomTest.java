/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.oprg
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import org.junit.Assert;
import org.junit.Test;
import org.openapitools.client.api.BodyApi;
import org.openapitools.client.api.QueryApi;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Pet;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;


/**
 * API tests
 */
public class CustomTest {

    private final QueryApi api = new QueryApi();
    private final BodyApi bodyApi = new BodyApi();

    /**
     * Test body parameter(s)
     * <p>
     * Test body parameter(s)
     *
     */
    @Test
    public void testEchoBodyPet() {
        Pet pet = new Pet().id(12345L).name("Hello World").
                photoUrls(Arrays.asList(new String[]{"http://a.com", "http://b.com"})).category(new Category().id(987L).name("new category"));

        Pet p = bodyApi.testEchoBodyPet(pet);
        assertNotNull(p);
        Assert.assertEquals("Hello World", p.getName());
        Assert.assertEquals(Long.valueOf(12345L), p.getId());

        // response is empty body
        Pet p2 = bodyApi.testEchoBodyPet(null);
        Assert.assertNull(p2);
    }
    
    @Test
    public void testQueryParamsExploded_whenQueryParamIsNull() {
        assertNotNull(api.testQueryStyleFormExplodeTrueObject(null));
    }
}
