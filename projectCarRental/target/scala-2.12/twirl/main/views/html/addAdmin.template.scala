
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Administrator],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Administrator], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.User
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Admin", user)),format.raw/*6.25*/("""
"""),format.raw/*7.1*/("""{"""),format.raw/*7.2*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new Administrator</p>


    """),_display_(/*11.6*/form(action=routes.HomeController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")),format.raw/*11.103*/("""
    """),format.raw/*12.5*/("""{"""),format.raw/*12.6*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""

        """),_display_(/*15.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.84*/("""
        """),_display_(/*16.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.82*/("""
        """),_display_(/*17.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.90*/("""
        """),_display_(/*18.10*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "", 'hidden -> "hidden")),format.raw/*18.99*/("""
        """),_display_(/*19.10*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.74*/("""





        """),format.raw/*25.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Admin" class="btn btn-primary">
            <a href=""""),_display_(/*27.23*/routes/*27.29*/.HomeController.usersAdmin()),format.raw/*27.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>

        </div>

    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
"""),format.raw/*34.1*/("""}"""))
      }
    }
  }

  def render(userForm:Form[models.users.Administrator],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Administrator],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Feb 23 11:48:53 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/addAdmin.scala.html
                  HASH: 6fac6f062281b8a68274bd361de4b745dbb4762d
                  MATRIX: 995->1|1137->73|1169->99|1213->71|1240->115|1267->117|1310->140|1337->141|1364->142|1395->147|1472->198|1591->295|1623->300|1651->301|1688->311|1701->315|1732->325|1770->336|1865->410|1902->420|1995->492|2032->502|2133->582|2170->592|2280->681|2317->691|2402->755|2443->769|2597->896|2612->902|2661->930|2807->1049|2835->1050|2863->1051
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|38->7|38->7|39->8|42->11|42->11|43->12|43->12|44->13|44->13|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|56->25|58->27|58->27|58->27|64->33|64->33|65->34
                  -- GENERATED --
              */
          