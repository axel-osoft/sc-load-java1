/**
 * Schemas with different types of composition for testing models generation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { DogBreedModel } from './dogBreed';
import { PetWithSimpleDiscriminatorModel } from './petWithSimpleDiscriminator';


export interface DogInheritedModel extends PetWithSimpleDiscriminatorModel { 
    breed?: DogBreedModel;
}



