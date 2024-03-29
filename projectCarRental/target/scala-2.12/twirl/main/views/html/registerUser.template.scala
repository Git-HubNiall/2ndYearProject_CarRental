
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(regForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new user</p>

    """),format.raw/*8.57*/("""
	"""),_display_(/*9.3*/if(flash.containsKey("error"))/*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("error")),format.raw/*11.23*/("""
		"""),format.raw/*12.3*/("""</div>
	""")))}),format.raw/*13.3*/("""

    """),format.raw/*15.5*/("""<!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*18.6*/form(action=routes.LoginController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*18.108*/ {_display_(Seq[Any](format.raw/*18.110*/("""
        """),format.raw/*19.37*/("""
        """),format.raw/*20.99*/("""
        """),_display_(/*21.10*/CSRF/*21.14*/.formField),format.raw/*21.24*/("""


            """),_display_(/*24.14*/inputText(regForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*24.87*/("""
            """),_display_(/*25.14*/inputText(regForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
            """),_display_(/*26.14*/inputText(regForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*26.92*/("""
            """),_display_(/*27.14*/inputText(regForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*27.92*/("""
            """),_display_(/*28.14*/inputText(regForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*28.85*/("""
            """),_display_(/*29.14*/inputText(regForm("postCode"), '_label -> "Post Code", 'class -> "form-control")),format.raw/*29.94*/("""
            """),_display_(/*30.14*/inputText(regForm("creditCard"), '_label -> "Credit Card", 'class -> "form-control")),format.raw/*30.98*/("""
            """),_display_(/*31.14*/inputText(regForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*31.93*/("""
            """),_display_(/*32.14*/inputText(regForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*32.102*/("""
            
            """),_display_(/*34.14*/inputText(regForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*34.104*/("""
            """),_display_(/*35.14*/inputText(regForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*35.77*/("""
            
            """),format.raw/*37.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Register user" class="btn btn-primary">
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.LoginController.registerUser()),format.raw/*43.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*47.6*/(""" """),format.raw/*47.24*/("""
""")))}),format.raw/*48.2*/(""" """))
      }
    }
  }

  def render(regForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(regForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (regForm,user) => apply(regForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 26 14:55:42 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/registerUser.scala.html
                  HASH: 9951310db2ee1c2085047949ea659df520d2835d
                  MATRIX: 999->1|1139->71|1183->69|1210->87|1237->89|1271->115|1309->116|1340->121|1407->213|1435->216|1473->246|1512->248|1542->251|1606->289|1620->294|1654->307|1684->310|1723->319|1756->325|2035->578|2147->680|2188->682|2225->719|2262->818|2299->828|2312->832|2343->842|2386->858|2480->931|2521->945|2613->1016|2654->1030|2753->1108|2794->1122|2893->1200|2934->1214|3026->1285|3067->1299|3168->1379|3209->1393|3314->1477|3355->1491|3455->1570|3496->1584|3606->1672|3660->1699|3772->1789|3813->1803|3897->1866|3951->1892|4341->2255|4356->2261|4408->2292|4568->2422|4597->2440|4629->2442
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|46->15|49->18|49->18|49->18|50->19|51->20|52->21|52->21|52->21|55->24|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|60->29|60->29|61->30|61->30|62->31|62->31|63->32|63->32|65->34|65->34|66->35|66->35|68->37|74->43|74->43|74->43|78->47|78->47|79->48
                  -- GENERATED --
              */
          