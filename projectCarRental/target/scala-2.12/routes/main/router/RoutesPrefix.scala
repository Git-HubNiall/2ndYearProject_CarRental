// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/projectCarRental/conf/routes
// @DATE:Tue Feb 26 12:49:46 GMT 2019


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
