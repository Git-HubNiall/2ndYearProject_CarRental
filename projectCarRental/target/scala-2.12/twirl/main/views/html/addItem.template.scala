
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

object addItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.products.ItemOnSale],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Item",user)/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*11.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form")/*11.102*/ {_display_(Seq[Any](format.raw/*11.104*/("""
        """),format.raw/*12.37*/("""
        """),format.raw/*13.99*/("""
        """),_display_(/*14.10*/CSRF/*14.14*/.formField),format.raw/*14.24*/("""

        
            """),_display_(/*17.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.86*/("""
            """),format.raw/*18.13*/("""<p><strong>Categories</strong></p>
            """),_display_(/*19.14*/for((value, name) <- products.Category.options) yield /*19.61*/ {_display_(Seq[Any](format.raw/*19.63*/("""
                """),format.raw/*20.17*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*20.67*/value),format.raw/*20.72*/(""""  
                    """),_display_(/*21.22*/if(itemForm("id").getValue.isPresent && itemForm("id").getValue.get != "")/*21.96*/ {_display_(Seq[Any](format.raw/*21.98*/(""" 
                        """),_display_(/*22.26*/if(products.Category.inCategory(value.toLong, itemForm("id").getValue.get.toLong))/*22.108*/ {_display_(Seq[Any](format.raw/*22.110*/("""
                            """),format.raw/*23.29*/("""checked
                        """)))}),format.raw/*24.26*/("""
                    """)))}),format.raw/*25.22*/(""" 
                """),format.raw/*26.17*/("""/> """),_display_(/*26.21*/name),format.raw/*26.25*/(""" """),format.raw/*26.26*/("""</br>
            """)))}),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""<p></p>
            """),_display_(/*29.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*29.100*/("""
            """),_display_(/*30.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*30.88*/("""
            """),_display_(/*31.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*31.88*/("""

            """),_display_(/*33.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*33.75*/("""
            
            """),format.raw/*35.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.onsale(0)),format.raw/*41.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*45.6*/(""" """),format.raw/*45.24*/("""
""")))}),format.raw/*46.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.products.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.products.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 22:29:15 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/addItem.scala.html
                  HASH: 0df581287889165a2fe6b322a9bc7a832be54b3f
                  MATRIX: 994->1|1135->72|1179->70|1206->88|1233->90|1262->111|1300->112|1331->117|1650->410|1756->506|1797->508|1834->545|1871->644|1908->654|1921->658|1952->668|2003->692|2096->764|2137->777|2212->825|2275->872|2315->874|2360->891|2437->941|2463->946|2515->971|2598->1045|2638->1047|2692->1074|2784->1156|2825->1158|2882->1187|2946->1220|2999->1242|3045->1260|3076->1264|3101->1268|3130->1269|3180->1288|3221->1301|3269->1322|3377->1408|3418->1422|3513->1496|3554->1510|3649->1584|3691->1599|3773->1660|3827->1686|4219->2051|4234->2057|4280->2082|4440->2212|4469->2230|4501->2232
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|55->24|56->25|57->26|57->26|57->26|57->26|58->27|59->28|60->29|60->29|61->30|61->30|62->31|62->31|64->33|64->33|66->35|72->41|72->41|72->41|76->45|76->45|77->46
                  -- GENERATED --
              */
          