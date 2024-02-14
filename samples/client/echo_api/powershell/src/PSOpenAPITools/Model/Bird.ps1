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
.OUTPUTS

Bird<PSCustomObject>
#>

function Initialize-Bird {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Size},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Color}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => Bird' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "size" = ${Size}
            "color" = ${Color}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Bird<PSCustomObject>

.DESCRIPTION

Convert from JSON to Bird<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Bird<PSCustomObject>
#>
function ConvertFrom-JsonToBird {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => Bird' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Bird
        $AllProperties = ("size", "color")
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

        $PSO = [PSCustomObject]@{
            "size" = ${Size}
            "color" = ${Color}
        }

        return $PSO
    }

}

