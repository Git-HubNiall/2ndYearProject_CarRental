
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    """),_display_(/*6.6*/if(loginForm.hasGlobalErrors)/*6.35*/{_display_(Seq[Any](format.raw/*6.36*/("""
        """),format.raw/*7.9*/("""<p class="alert alert-warning">
            """),_display_(/*8.14*/for(e <- loginForm.globalErrors) yield /*8.46*/{_display_(Seq[Any](format.raw/*8.47*/("""
                """),_display_(/*9.18*/e/*9.19*/.message),format.raw/*9.27*/("""<br/>
            """)))}),format.raw/*10.14*/("""
        """),format.raw/*11.9*/("""</p>
    """)))}),format.raw/*12.6*/("""
    
    """),format.raw/*14.57*/("""
    """),_display_(/*15.6*/if(flash.containsKey("error"))/*15.36*/{_display_(Seq[Any](format.raw/*15.37*/("""
        """),format.raw/*16.9*/("""<div class="alert alert-success">
            """),_display_(/*17.14*/flash/*17.19*/.get("error")),format.raw/*17.32*/("""
        """),format.raw/*18.9*/("""</div>
    """)))}),format.raw/*19.6*/("""

    """),_display_(/*21.6*/helper/*21.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.76*/{_display_(Seq[Any](format.raw/*21.77*/("""
        """),format.raw/*22.37*/("""
        """),format.raw/*24.85*/("""
        """),_display_(/*25.10*/CSRF/*25.14*/.formField),format.raw/*25.24*/("""

        """),format.raw/*27.9*/("""<div class="form-group">
            """),_display_(/*28.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.72*/("""
        """),format.raw/*30.9*/("""</div>
        <div class="form-group">
            """),_display_(/*32.14*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "password")),format.raw/*33.75*/("""

        """),format.raw/*35.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 25 10:42:53 GMT 2019
                  SOURCE: /media/sf_student/year2Project/projectCarRental/app/views/login.scala.html
                  HASH: 4f2f0b1bd4bd4972164a3c9374a384f46806d5f0
                  MATRIX: 984->1|1119->65|1163->82|1190->84|1217->103|1255->104|1286->109|1333->131|1370->160|1408->161|1443->170|1514->215|1561->247|1599->248|1643->266|1652->267|1680->275|1730->294|1766->303|1806->313|1844->375|1876->381|1915->411|1954->412|1990->421|2064->468|2078->473|2112->486|2148->495|2190->507|2223->514|2238->520|2311->584|2350->585|2387->622|2424->784|2461->794|2474->798|2505->808|2542->818|2607->856|2744->972|2780->981|2860->1034|3003->1156|3040->1166|3204->1300|3233->1318
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|43->12|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|52->21|52->21|52->21|53->22|54->24|55->25|55->25|55->25|57->27|58->28|59->29|60->30|62->32|63->33|65->35|69->39|69->39
                  -- GENERATED --
              */
          