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

import org.openapitools.client.ApiException;
import java.io.File;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.Tag;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * API tests
 */
public class CustomTest {

    private final BodyApi api = new BodyApi();

    /**
     * Test single binary in multipart mime
     *
     * @see
     * <a href="https://github.com/OpenAPITools/openapi-generator/issues/17367">#17367</a>
     */
    @Test
    public void testBodyMultipartFormdataSingleBinaryTest() throws ApiException, IOException {
        File myFile = new File("test.txt");
        if (!myFile.exists()){
            assertTrue(myFile.createNewFile());
        }
        FileWriter fw = new FileWriter(myFile);
        fw.write("testing only");
        fw.close();
        myFile.deleteOnExit();

        String response =
                api.testBodyMultipartFormdataSingleBinary(myFile);

        EchoServerResponseParser parser =
                new EchoServerResponseParser(response);

        String contentDisposition = parser.headers.get("Content-Disposition");

        assertThat(contentDisposition, containsString(
                "form-data; name=\"my-file\"; filename=\"test.txt\""
        ));
    }
}
