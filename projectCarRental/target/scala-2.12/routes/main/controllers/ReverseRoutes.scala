// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/year2Project/projectCarRental/conf/routes
// @DATE:Fri Mar 15 12:44:19 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:39
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:34
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def updateUser(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:26
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:17
    def updateItem(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateItem/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def onsale(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "onsale" + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:9
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:28
    def addUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit")
    }
  
    // @LINE:16
    def deleteItem(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteItem/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def addItemSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addItemSubmit")
    }
  
    // @LINE:25
    def users(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:30
    def deleteUser(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def addItem(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addItem")
    }
  
  }

  // @LINE:36
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:19
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:23
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:19
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
