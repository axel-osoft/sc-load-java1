#
# Echo Server API
# Echo Server API
# Version: 0.1.0
# Contact: team@openapitools.org
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Test path parameter(s)

.DESCRIPTION

No description available.

.PARAMETER PathString
No description available.

.PARAMETER PathInteger
No description available.

.PARAMETER EnumNonrefStringPath
No description available.

.PARAMETER EnumRefStringPath
No description available.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

String
#>
function Test-sPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${PathString},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int32]
        ${PathInteger},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("success", "failure", "unclassified")]
        [String]
        ${EnumNonrefStringPath},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${EnumRefStringPath},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Test-sPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('text/plain')

        $LocalVarUri = '/path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}'
        if (!$PathString) {
            throw "Error! The required parameter `PathString` missing when calling tests_path_string_pathString_integer_pathInteger_enumNonrefStringPath_enumRefStringPath."
        }
        $LocalVarUri = $LocalVarUri.replace('{path_string}', [System.Web.HTTPUtility]::UrlEncode($PathString))
        if (!$PathInteger) {
            throw "Error! The required parameter `PathInteger` missing when calling tests_path_string_pathString_integer_pathInteger_enumNonrefStringPath_enumRefStringPath."
        }
        $LocalVarUri = $LocalVarUri.replace('{path_integer}', [System.Web.HTTPUtility]::UrlEncode($PathInteger))
        if (!$EnumNonrefStringPath) {
            throw "Error! The required parameter `EnumNonrefStringPath` missing when calling tests_path_string_pathString_integer_pathInteger_enumNonrefStringPath_enumRefStringPath."
        }
        $LocalVarUri = $LocalVarUri.replace('{enum_nonref_string_path}', [System.Web.HTTPUtility]::UrlEncode($EnumNonrefStringPath))
        if (!$EnumRefStringPath) {
            throw "Error! The required parameter `EnumRefStringPath` missing when calling tests_path_string_pathString_integer_pathInteger_enumNonrefStringPath_enumRefStringPath."
        }
        $LocalVarUri = $LocalVarUri.replace('{enum_ref_string_path}', [System.Web.HTTPUtility]::UrlEncode($EnumRefStringPath))

        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "String" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

