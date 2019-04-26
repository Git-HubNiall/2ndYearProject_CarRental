
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
    """),_display_(/*11.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form",
            'method -> "POST", 'enctype -> "multipart/form-data")/*12.66*/ {_display_(Seq[Any](format.raw/*12.68*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

        
            """),_display_(/*18.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.86*/("""
            """),format.raw/*19.13*/("""<p><strong>Categories</strong></p>
            """),_display_(/*20.14*/for((value, name) <- products.Category.options) yield /*20.61*/ {_display_(Seq[Any](format.raw/*20.63*/("""
                """),format.raw/*21.17*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*21.67*/value),format.raw/*21.72*/(""""  
                    """),_display_(/*22.22*/if(itemForm("id").getValue.isPresent && itemForm("id").getValue.get != "")/*22.96*/ {_display_(Seq[Any](format.raw/*22.98*/(""" 
                        """),_display_(/*23.26*/if(products.Category.inCategory(value.toLong, itemForm("id").getValue.get.toLong))/*23.108*/ {_display_(Seq[Any](format.raw/*23.110*/("""
                            """),format.raw/*24.29*/("""checked
                        """)))}),format.raw/*25.26*/("""
                    """)))}),format.raw/*26.22*/(""" 
                """),format.raw/*27.17*/("""/> """),_display_(/*27.21*/name),format.raw/*27.25*/(""" """),format.raw/*27.26*/("""</br>
            """)))}),format.raw/*28.14*/("""
            """),format.raw/*29.13*/("""<p></p>
            """),_display_(/*30.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*30.100*/("""
            """),_display_(/*31.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*31.88*/("""
            """),_display_(/*32.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*32.88*/("""

            """),format.raw/*34.13*/("""<label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload">

            """),_display_(/*37.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*37.75*/("""
            
            """),format.raw/*39.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.HomeController.onsale(0)),format.raw/*45.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*49.6*/(""" """),format.raw/*49.24*/("""
""")))}),format.raw/*50.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.products.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.products.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 26 14:55:42 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/addItem.scala.html
                  HASH: 0b56dbd5d3fa9f944aecf48e733a22b98a4377f9
                  MATRIX: 994->1|1135->72|1179->70|1206->88|1233->90|1262->111|1300->112|1331->117|1650->410|1821->572|1861->574|1898->611|1935->710|1972->720|1985->724|2016->734|2067->758|2160->830|2201->843|2276->891|2339->938|2379->940|2424->957|2501->1007|2527->1012|2579->1037|2662->1111|2702->1113|2756->1140|2848->1222|2889->1224|2946->1253|3010->1286|3063->1308|3109->1326|3140->1330|3165->1334|3194->1335|3244->1354|3285->1367|3333->1388|3441->1474|3482->1488|3577->1562|3618->1576|3713->1650|3755->1664|3897->1779|3979->1840|4033->1866|4425->2231|4440->2237|4486->2262|4646->2392|4675->2410|4707->2412
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|42->11|43->12|43->12|44->13|45->14|46->15|46->15|46->15|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|57->26|58->27|58->27|58->27|58->27|59->28|60->29|61->30|61->30|62->31|62->31|63->32|63->32|65->34|68->37|68->37|70->39|76->45|76->45|76->45|80->49|80->49|81->50
                  -- GENERATED --
              */
          