<?php

namespace OpenAPI\Client;

use GuzzleHttp\Psr7\Response;
use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/FakeHttpClient.php';

class HeadersTest extends TestCase
{
    /** @var  FakeHttpClient */
    private $fakeHttpClient;

    public function setUp(): void
    {
        $this->fakeHttpClient = new FakeHttpClient();
        $this->fakeHttpClient->setResponse(new Response(200, [], json_encode([])));
    }

    public function testUserAgent()
    {
        $config = new Configuration();
        $config->setUserAgent('value');
        $api = new Api\PetApi($this->fakeHttpClient, $config);

        $api->getPetById(3);

        $request = $this->fakeHttpClient->getLastRequest();
        $headers = $request->getHeaders();

        $this->assertArrayHasKey('User-Agent', $headers);
        $this->assertEquals(['value'], $headers['User-Agent']);
    }
}
