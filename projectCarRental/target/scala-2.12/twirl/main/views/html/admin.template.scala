
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Administrator],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Administrator],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Administrators",user)/*2.29*/{_display_(Seq[Any](format.raw/*2.30*/("""
    """),format.raw/*3.5*/("""<h1>Current administrators</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current administrators on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*28.62*/("""
            """),_display_(/*29.14*/for(u<-users) yield /*29.27*/ {_display_(Seq[Any](format.raw/*29.29*/("""
               """),format.raw/*30.16*/("""<tr>
                  <td>"""),_display_(/*31.24*/u/*31.25*/.getEmail),format.raw/*31.34*/("""</td>
                  <td>"""),_display_(/*32.24*/u/*32.25*/.getRole),format.raw/*32.33*/("""</td>
                  <td>"""),_display_(/*33.24*/u/*33.25*/.getName),format.raw/*33.33*/("""</td>
                  <td>"""),_display_(/*34.24*/u/*34.25*/.getPassword),format.raw/*34.37*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*37.18*/routes/*37.24*/.HomeController.updateAdmin(u.getEmail)),format.raw/*37.63*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*43.18*/routes/*43.24*/.HomeController.deleteAdmin(u.getEmail)),format.raw/*43.63*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*48.14*/("""
        
        """),format.raw/*50.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.HomeController.addAdmin()),format.raw/*54.51*/("""">
            <button class="btn btn-primary">Add a new Administrator</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(users:List[models.users.Administrator],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Administrator],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 26 14:55:42 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/admin.scala.html
                  HASH: 612fa42c36e6bd4fa35e71e710b6d07f2ac9ff0f
                  MATRIX: 992->1|1151->68|1186->95|1224->96|1255->101|1320->205|1348->208|1388->240|1427->242|1456->245|1519->283|1532->288|1567->303|1597->306|1635->314|1668->320|2136->809|2177->823|2206->836|2246->838|2290->854|2345->882|2355->883|2385->892|2441->921|2451->922|2480->930|2536->959|2546->960|2575->968|2631->997|2641->998|2674->1010|2776->1085|2791->1091|2851->1130|3078->1330|3093->1336|3153->1375|3379->1570|3424->1588|3500->1637|3515->1643|3562->1669
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|79->48|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          