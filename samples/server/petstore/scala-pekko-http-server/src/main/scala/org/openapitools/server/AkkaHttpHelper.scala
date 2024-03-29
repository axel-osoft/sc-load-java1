package org.openapitools.server

import org.apache.pekko.http.scaladsl.server.Directives._
import org.apache.pekko.http.scaladsl.server.{PathMatcher, PathMatcher1}
import scala.util.{Failure, Success, Try}
import scala.util.control.NoStackTrace

object AkkaHttpHelper {
  def optToTry[T](opt: Option[T], err: => String): Try[T] =
    opt.map[Try[T]](Success(_)) getOrElse Failure(new RuntimeException(err) with NoStackTrace)

  /**
   * A PathMatcher that matches and extracts a Float value. The matched string representation is the pure decimal,
   * optionally signed form of a float value, i.e. without exponent.
   *
   * @group pathmatcher
   */
  val FloatNumber: PathMatcher1[Float] =
    PathMatcher("""[+-]?\d*\.?\d*""".r) flatMap { string =>
      try Some(java.lang.Float.parseFloat(string))
      catch { case _: NumberFormatException => None }
     }

  /**
   * A PathMatcher that matches and extracts a Boolean value.
   *
   * @group pathmatcher
   */
  val Boolean: PathMatcher1[Boolean] =
    Segment.flatMap { string =>
      try Some(string.toBoolean)
      catch { case _: IllegalArgumentException => None }
    }
}
