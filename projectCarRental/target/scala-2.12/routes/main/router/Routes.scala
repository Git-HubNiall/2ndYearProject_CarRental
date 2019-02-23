// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/year2Project/projectCarRental/conf/routes
// @DATE:Sat Feb 23 11:46:43 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:18
  LoginController_4: controllers.LoginController,
  // @LINE:32
  CountController_0: controllers.CountController,
  // @LINE:34
  AsyncController_2: controllers.AsyncController,
  // @LINE:37
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:18
    LoginController_4: controllers.LoginController,
    // @LINE:32
    CountController_0: controllers.CountController,
    // @LINE:34
    AsyncController_2: controllers.AsyncController,
    // @LINE:37
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """onsale""", """controllers.HomeController.onsale(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addItem""", """controllers.HomeController.addItem"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addItemSubmit""", """controllers.HomeController.addItemSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteItem/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateItem/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.HomeController.users"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.HomeController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteUser(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateUser(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_onsale1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("onsale")))
  )
  private[this] lazy val controllers_HomeController_onsale1_invoker = createInvoker(
    HomeController_1.onsale(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "onsale",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """onsale""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about2_invoker = createInvoker(
    HomeController_1.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_addItem3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addItem")))
  )
  private[this] lazy val controllers_HomeController_addItem3_invoker = createInvoker(
    HomeController_1.addItem,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addItem",
      Nil,
      "GET",
      this.prefix + """addItem""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addItemSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addItemSubmit")))
  )
  private[this] lazy val controllers_HomeController_addItemSubmit4_invoker = createInvoker(
    HomeController_1.addItemSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addItemSubmit",
      Nil,
      "POST",
      this.prefix + """addItemSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_deleteItem5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteItem5_invoker = createInvoker(
    HomeController_1.deleteItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_updateItem6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateItem6_invoker = createInvoker(
    HomeController_1.updateItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login7_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_loginSubmit8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit8_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout9_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_users10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_HomeController_users10_invoker = createInvoker(
    HomeController_1.users,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "users",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_addUser11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_HomeController_addUser11_invoker = createInvoker(
    HomeController_1.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_addUserSubmit12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit12_invoker = createInvoker(
    HomeController_1.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "GET",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_deleteUser13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser13_invoker = createInvoker(
    HomeController_1.deleteUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateUser14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateUser14_invoker = createInvoker(
    HomeController_1.updateUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CountController_count15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count15_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AsyncController_message16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message16_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_onsale1_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_onsale1_invoker.call(HomeController_1.onsale(cat))
      }
  
    // @LINE:9
    case controllers_HomeController_about2_route(params@_) =>
      call { 
        controllers_HomeController_about2_invoker.call(HomeController_1.about)
      }
  
    // @LINE:12
    case controllers_HomeController_addItem3_route(params@_) =>
      call { 
        controllers_HomeController_addItem3_invoker.call(HomeController_1.addItem)
      }
  
    // @LINE:14
    case controllers_HomeController_addItemSubmit4_route(params@_) =>
      call { 
        controllers_HomeController_addItemSubmit4_invoker.call(HomeController_1.addItemSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_deleteItem5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteItem5_invoker.call(HomeController_1.deleteItem(id))
      }
  
    // @LINE:17
    case controllers_HomeController_updateItem6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateItem6_invoker.call(HomeController_1.updateItem(id))
      }
  
    // @LINE:18
    case controllers_LoginController_login7_route(params@_) =>
      call { 
        controllers_LoginController_login7_invoker.call(LoginController_4.login)
      }
  
    // @LINE:19
    case controllers_LoginController_loginSubmit8_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit8_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:20
    case controllers_LoginController_logout9_route(params@_) =>
      call { 
        controllers_LoginController_logout9_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:23
    case controllers_HomeController_users10_route(params@_) =>
      call { 
        controllers_HomeController_users10_invoker.call(HomeController_1.users)
      }
  
    // @LINE:24
    case controllers_HomeController_addUser11_route(params@_) =>
      call { 
        controllers_HomeController_addUser11_invoker.call(HomeController_1.addUser)
      }
  
    // @LINE:25
    case controllers_HomeController_addUserSubmit12_route(params@_) =>
      call { 
        controllers_HomeController_addUserSubmit12_invoker.call(HomeController_1.addUserSubmit)
      }
  
    // @LINE:26
    case controllers_HomeController_deleteUser13_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteUser13_invoker.call(HomeController_1.deleteUser(id))
      }
  
    // @LINE:27
    case controllers_HomeController_updateUser14_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateUser14_invoker.call(HomeController_1.updateUser(id))
      }
  
    // @LINE:32
    case controllers_CountController_count15_route(params@_) =>
      call { 
        controllers_CountController_count15_invoker.call(CountController_0.count)
      }
  
    // @LINE:34
    case controllers_AsyncController_message16_route(params@_) =>
      call { 
        controllers_AsyncController_message16_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:37
    case controllers_Assets_versioned17_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
