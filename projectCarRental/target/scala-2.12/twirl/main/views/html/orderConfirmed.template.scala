
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Number of Days</th>
                <th>Total</th>
                <th>Payment Status</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*34.18*/if(order != null)/*34.35*/ {_display_(Seq[Any](format.raw/*34.37*/("""
                    """),format.raw/*35.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*36.22*/for(i <- order.getItems) yield /*36.46*/ {_display_(Seq[Any](format.raw/*36.48*/("""
                    """),format.raw/*37.21*/("""<tr>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getItem.getName),format.raw/*38.47*/("""</td>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getItem.getDescription),format.raw/*39.54*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getPrice))),format.raw/*40.64*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getQuantity()),format.raw/*41.45*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotal))),format.raw/*42.68*/("""</td>
                        <td>"""),_display_(/*43.30*/("Order Payed.")),format.raw/*43.46*/("""</td>
                    </tr>
                    """)))}),format.raw/*45.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*46.16*/("""
			"""),format.raw/*47.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*51.68*/("%.2f".format(order.getOrderTotal))),format.raw/*51.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 10:40:13 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/orderConfirmed.scala.html
                  HASH: 08bb51cf89c55dc50a7c48cada9020cf62dd12c6
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1259->69|1287->153|1314->154|1385->200|1429->236|1468->238|1498->241|1571->288|1612->320|1652->322|1685->328|1756->372|1770->377|1806->392|1839->398|1879->408|1911->413|2263->738|2289->755|2329->757|2378->778|2488->861|2528->885|2568->887|2617->908|2678->942|2688->943|2725->959|2787->994|2797->995|2841->1018|2910->1060|2958->1087|3020->1122|3030->1123|3065->1137|3134->1179|3186->1210|3248->1245|3285->1261|3369->1314|3440->1354|3471->1358|3647->1507|3705->1543
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|72->41|72->41|72->41|73->42|73->42|74->43|74->43|76->45|77->46|78->47|82->51|82->51
                  -- GENERATED --
              */
          