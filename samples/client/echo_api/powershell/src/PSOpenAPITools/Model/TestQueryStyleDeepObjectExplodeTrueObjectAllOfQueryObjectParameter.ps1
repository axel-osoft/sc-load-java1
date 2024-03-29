#
# Echo Server API
# Echo Server API
# Version: 0.1.0
# Contact: team@openapitools.org
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Size
No description available.
.PARAMETER Color
No description available.
.PARAMETER Id
No description available.
.PARAMETER Name
No description available.
.OUTPUTS

TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter<PSCustomObject>
#>

function Initialize-TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Size},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Color},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "size" = ${Size}
            "color" = ${Color}
            "id" = ${Id}
            "name" = ${Name}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter<PSCustomObject>

.DESCRIPTION

Convert from JSON to TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter<PSCustomObject>
#>
function ConvertFrom-JsonToTestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter
        $AllProperties = ("size", "color", "id", "name")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "size"))) { #optional property not found
            $Size = $null
        } else {
            $Size = $JsonParameters.PSobject.Properties["size"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "color"))) { #optional property not found
            $Color = $null
        } else {
            $Color = $JsonParameters.PSobject.Properties["color"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        $PSO = [PSCustomObject]@{
            "size" = ${Size}
            "color" = ${Color}
            "id" = ${Id}
            "name" = ${Name}
        }

        return $PSO
    }

}

