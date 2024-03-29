/*
Test

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the Object3 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Object3{}

// Object3 struct for Object3
type Object3 struct {
	// Specifies an action name to be used with the Android Intent class.
	Field1 string `json:"field1"`
	// Specifies an action name to be used with the Android Intent class.
	Field2 string `json:"field2"`
}

type _Object3 Object3

// NewObject3 instantiates a new Object3 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObject3(field1 string, field2 string) *Object3 {
	this := Object3{}
	this.Field1 = field1
	this.Field2 = field2
	return &this
}

// NewObject3WithDefaults instantiates a new Object3 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObject3WithDefaults() *Object3 {
	this := Object3{}
	return &this
}

// GetField1 returns the Field1 field value
func (o *Object3) GetField1() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Field1
}

// GetField1Ok returns a tuple with the Field1 field value
// and a boolean to check if the value has been set.
func (o *Object3) GetField1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Field1, true
}

// SetField1 sets field value
func (o *Object3) SetField1(v string) {
	o.Field1 = v
}

// GetField2 returns the Field2 field value
func (o *Object3) GetField2() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Field2
}

// GetField2Ok returns a tuple with the Field2 field value
// and a boolean to check if the value has been set.
func (o *Object3) GetField2Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Field2, true
}

// SetField2 sets field value
func (o *Object3) SetField2(v string) {
	o.Field2 = v
}

func (o Object3) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Object3) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["field1"] = o.Field1
	toSerialize["field2"] = o.Field2
	return toSerialize, nil
}

func (o *Object3) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"field1",
		"field2",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varObject3 := _Object3{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varObject3)

	if err != nil {
		return err
	}

	*o = Object3(varObject3)

	return err
}

type NullableObject3 struct {
	value *Object3
	isSet bool
}

func (v NullableObject3) Get() *Object3 {
	return v.value
}

func (v *NullableObject3) Set(val *Object3) {
	v.value = val
	v.isSet = true
}

func (v NullableObject3) IsSet() bool {
	return v.isSet
}

func (v *NullableObject3) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObject3(val *Object3) *NullableObject3 {
	return &NullableObject3{value: val, isSet: true}
}

func (v NullableObject3) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObject3) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


