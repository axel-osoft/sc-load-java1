/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Order
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object StoreApi {
  def apply(baseUrl: String = "http://petstore.swagger.io/v2") = new StoreApi(baseUrl)
}

class StoreApi(baseUrl: String) {

  /**
   * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
   * 
   * Expected answers:
   *   code 400 :  (Invalid ID supplied)
   *   code 404 :  (Order not found)
   * 
   * @param orderId ID of the order that needs to be deleted
   */
  def deleteOrder(orderId: String): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/store/order/${orderId}")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Returns a map of status codes to quantities
   * 
   * Expected answers:
   *   code 200 : Map[String, Int] (successful operation)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   */
  def getInventory(apiKey: String)(): Request[Either[ResponseException[String, Exception], Map[String, Int]]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/store/inventory")
      .contentType("application/json")
      .header("api_key", apiKey)
      .response(asJson[Map[String, Int]])

  /**
   * For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions
   * 
   * Expected answers:
   *   code 200 : Order (successful operation)
   *   code 400 :  (Invalid ID supplied)
   *   code 404 :  (Order not found)
   * 
   * @param orderId ID of pet that needs to be fetched
   */
  def getOrderById(orderId: Long): Request[Either[ResponseException[String, Exception], Order]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/store/order/${orderId}")
      .contentType("application/json")
      .response(asJson[Order])

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Order (successful operation)
   *   code 400 :  (Invalid Order)
   * 
   * @param order order placed for purchasing the pet
   */
  def placeOrder(order: Order): Request[Either[ResponseException[String, Exception], Order]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/store/order")
      .contentType("application/json")
      .body(order)
      .response(asJson[Order])

}
