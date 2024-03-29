# \FakeClassnameTags123API

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TestClassname**](FakeClassnameTags123API.md#TestClassname) | **Patch** /fake_classname_test | To test class name in snake case



## TestClassname

> Client TestClassname(ctx).Client(client).Execute()

To test class name in snake case



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	client := *openapiclient.NewClient() // Client | client model

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FakeClassnameTags123API.TestClassname(context.Background()).Client(client).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FakeClassnameTags123API.TestClassname``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TestClassname`: Client
	fmt.Fprintf(os.Stdout, "Response from `FakeClassnameTags123API.TestClassname`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTestClassnameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**Client**](Client.md) | client model | 

### Return type

[**Client**](Client.md)

### Authorization

[api_key_query](../README.md#api_key_query)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

