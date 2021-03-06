/*                                                                      *\
** Squants                                                              **
**                                                                      **
** Scala Quantities and Units of Measure Library and DSL                **
** (c) 2013-2014, Gary Keorkunian                                       **
**                                                                      **
\*                                                                      */

package squants.time

import org.scalatest.{ Matchers, FlatSpec }
import squants.motion.UsMilesPerHour
import squants.space.UsMiles

/**
 * @author  garyKeorkunian
 * @since   0.1
 *
 */
class TimeDerivativeSpec extends FlatSpec with Matchers {

  behavior of "Time Derivatives and Integrals as implemented in Distance and Velocity"

  it should "satisfy Derivative = Integral / Time" in {
    assert(UsMilesPerHour(55) == UsMiles(55) / Hours(1))
  }

  it should "satisfy Integral = Derivative * Time" in {
    assert(UsMiles(110) == UsMilesPerHour(55) * Hours(2))
    assert(UsMiles(110) == Hours(2) * UsMilesPerHour(55))
  }

  it should "satisfy Time = Integral / Derivative" in {
    assert(Hours(2) == UsMiles(110) / UsMilesPerHour(55))
  }
}
