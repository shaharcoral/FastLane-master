// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/shaha/Desktop/p_n/FastLane-master/conf/routes
// @DATE:Thu Mar 07 13:03:43 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
