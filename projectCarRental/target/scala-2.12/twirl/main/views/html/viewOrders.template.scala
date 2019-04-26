
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("View Orders", customer)/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""


	"""),format.raw/*12.2*/("""<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		
               
                    """),format.raw/*21.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*22.22*/for(o <- customer.getOrders()) yield /*22.52*/ {_display_(Seq[Any](format.raw/*22.54*/("""

                        """),format.raw/*24.25*/("""<p>Order Number: """),_display_(/*24.43*/o/*24.44*/.getId()),format.raw/*24.52*/("""</p>
                        <p>Order Date: """),_display_(/*25.41*/o/*25.42*/.getOrderDateString()),format.raw/*25.63*/("""</p>
                        <table class="table table-bordered table-hover table-condensed">
                        
                            <thead>
                            <!-- The header row-->
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Number of Days</th>
                                <th>Price</th>
                                <th>Total</th>
                                <th>Payment Status</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*40.26*/for(i <- o.getItems()) yield /*40.48*/ {_display_(Seq[Any](format.raw/*40.50*/("""

                        """),format.raw/*42.25*/("""<tr>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getId),format.raw/*43.37*/("""</td>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getItem.getName()),format.raw/*44.49*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice()))),format.raw/*46.66*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td>"""),_display_(/*48.30*/("Order Payed.")),format.raw/*48.46*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*51.22*/("""<!-- End of For loop -->
                     
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*57.68*/("%.2f".format(o.getOrderTotal))),format.raw/*57.100*/("""</strong></p>
            </div>  
        </div>
        <p>
            <a href=""""),_display_(/*61.23*/routes/*61.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*61.65*/("""">
              <button class="btn btn-primary">Cancel Order</button>
            </a>
          </p>

          <p>
            <a href=""""),_display_(/*67.23*/routes/*67.29*/.ShoppingCtrl.returnCar(o.getId())),format.raw/*67.63*/("""">
              <button class="btn btn-primary">Return Car</button>
            </a>
          </p>
         """)))}),format.raw/*71.11*/("""<!-- End of For loop -->
       
        </div> 



""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 26 14:55:42 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/viewOrders.scala.html
                  HASH: d5b58e7b6532e15819adaeaa4b49a212ddb119f2
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1195->35|1223->119|1250->120|1321->166|1358->195|1397->197|1428->201|1481->228|1522->260|1562->262|1595->268|1666->312|1680->317|1716->332|1749->338|1789->348|1859->390|1969->473|2015->503|2055->505|2109->531|2154->549|2164->550|2193->558|2265->603|2275->604|2317->625|3011->1292|3049->1314|3089->1316|3143->1342|3204->1376|3214->1377|3241->1383|3303->1418|3313->1419|3352->1437|3414->1472|3424->1473|3459->1487|3528->1529|3578->1558|3647->1600|3699->1631|3761->1666|3798->1682|3907->1760|4139->1965|4193->1997|4304->2081|4319->2087|4376->2123|4543->2263|4558->2269|4613->2303|4755->2414
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|52->21|53->22|53->22|53->22|55->24|55->24|55->24|55->24|56->25|56->25|56->25|71->40|71->40|71->40|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|78->47|78->47|79->48|79->48|82->51|88->57|88->57|92->61|92->61|92->61|98->67|98->67|98->67|102->71
                  -- GENERATED --
              */
          