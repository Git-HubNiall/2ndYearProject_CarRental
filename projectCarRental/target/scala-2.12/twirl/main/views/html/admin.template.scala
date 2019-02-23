
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[user[List[models.users.Administrator], <error>],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Administrator] user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Administrators", user)),format.raw/*2.30*/("""
"""),format.raw/*3.1*/("""{"""),format.raw/*3.2*/("""
    """),format.raw/*4.5*/("""<h1>Current administrators</h1>


        """),_display_(/*7.10*/if(flash.containsKey("success"))),format.raw/*7.42*/("""
        """),format.raw/*8.9*/("""{"""),format.raw/*8.10*/("""
            """),format.raw/*9.13*/("""<div class="alert alert-warning">

                """),_display_(/*11.18*/flash/*11.23*/.get("success")),format.raw/*11.38*/("""
            """),format.raw/*12.13*/("""</div>
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/("""






    """),format.raw/*20.5*/("""<div class="col-sm-9">
        <h4>Here are all the current administrators on the system.</h4>
        <table class="table tavle-bordered table-hover table-condensed">
            <thead>
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>

        <tbody>

        """),_display_(/*34.10*/for(u<-users)),format.raw/*34.23*/("""
        """),format.raw/*35.9*/("""{"""),format.raw/*35.10*/("""
            """),format.raw/*36.13*/("""<tr>
                <td>"""),_display_(/*37.22*/u/*37.23*/.getEmail),format.raw/*37.32*/("""</td>
                <td>"""),_display_(/*38.22*/u/*38.23*/.getRole),format.raw/*38.31*/("""</td>
                <td>"""),_display_(/*39.22*/u/*39.23*/.getName),format.raw/*39.31*/("""</td>
                <td>"""),_display_(/*40.22*/u/*40.23*/.getPassword),format.raw/*40.35*/("""</td>

                <!-- UPDATE BUTTON-->

                    <td>
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.HomeController.updateAdmin(u.getEmail)),format.raw/*45.80*/("""" class="button-xs btn-danger">
                            <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                    </td>

                <!--DELETE BUTTON-->

                    <td>
                        <a href=""""),_display_(/*53.35*/routes/*53.41*/.HomeController.deleteAdmin(u.getEmail)),format.raw/*53.80*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                            </a>


                    </td>


            </tr>

        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/("""


        """),format.raw/*66.9*/("""</tbody>
        
        </table>


        <p>
            <a href=""""),_display_(/*72.23*/routes/*72.29*/.HomeController.addAdmin()),format.raw/*72.55*/("""">
                <button class="btn btn-primary">Add a new Administrator</button>
            </a>
        </p>
    </div>

    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""

"""))
      }
    }
  }

  def render(users:user[List[models.users.Administrator], <error>]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((user[List[models.users.Administrator], <error>]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Feb 23 11:49:28 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/admin.scala.html
                  HASH: 9fe8b934ff4534cbf119ce151ac365853884691f
                  MATRIX: 989->1|1148->68|1196->96|1223->97|1250->98|1281->103|1350->146|1402->178|1437->187|1465->188|1505->201|1584->253|1598->258|1634->273|1675->286|1717->301|1746->302|1784->313|2179->681|2213->694|2249->703|2278->704|2319->717|2372->743|2382->744|2412->753|2466->780|2476->781|2505->789|2559->816|2569->817|2598->825|2652->852|2662->853|2695->865|2827->970|2842->976|2902->1015|3195->1281|3210->1287|3270->1326|3526->1555|3555->1556|3593->1567|3691->1638|3706->1644|3753->1670|3910->1800|3938->1801
                  LINES: 28->1|33->2|33->2|34->3|34->3|35->4|38->7|38->7|39->8|39->8|40->9|42->11|42->11|42->11|43->12|44->13|44->13|51->20|65->34|65->34|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|76->45|76->45|76->45|84->53|84->53|84->53|94->63|94->63|97->66|103->72|103->72|103->72|109->78|109->78
                  -- GENERATED --
              */
          