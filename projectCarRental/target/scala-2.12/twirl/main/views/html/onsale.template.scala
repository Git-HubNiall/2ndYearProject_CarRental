
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.ItemOnSale],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.ItemOnSale],categories: List[models.Category],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("On Sale",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<h1>For Rent Here</h1>


    """),format.raw/*6.74*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""
    """),format.raw/*12.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*15.33*/routes/*15.39*/.HomeController.onsale(0)),format.raw/*15.64*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*16.12*/for(c<-categories) yield /*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			        """),format.raw/*17.12*/("""<a href = """"),_display_(/*17.24*/routes/*17.30*/.HomeController.onsale(c.getId())),format.raw/*17.63*/("""" class="list-group-item catheight">"""),_display_(/*17.100*/c/*17.101*/.getName),format.raw/*17.109*/("""
                        """),format.raw/*18.25*/("""<span class="badge">"""),_display_(/*18.46*/c/*18.47*/.getItems.size),format.raw/*18.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*20.9*/("""
            """),format.raw/*21.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h4>Note that all products are second hand, unless otherwise stated.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*41.68*/("""
            """),_display_(/*42.14*/for(i<-items) yield /*42.27*/ {_display_(Seq[Any](format.raw/*42.29*/("""
               """),format.raw/*43.16*/("""<tr>
                  <td>"""),_display_(/*44.24*/i/*44.25*/.getId),format.raw/*44.31*/("""</td>
                  <td>"""),_display_(/*45.24*/i/*45.25*/.getName),format.raw/*45.33*/("""</td>
                  <td>"""),_display_(/*46.24*/i/*46.25*/.getCategory.getName),format.raw/*46.45*/("""</td>
                  <td>"""),_display_(/*47.24*/i/*47.25*/.getDescription),format.raw/*47.40*/("""</td>
                  <td>"""),_display_(/*48.24*/i/*48.25*/.getStock),format.raw/*48.34*/("""</td>
                  <td>&euro; """),_display_(/*49.31*/("%.2f".format(i.getPrice))),format.raw/*49.58*/("""</td>

                  """),_display_(/*51.20*/if((user != null) && ("admin".equals(user.getRole())))/*51.74*/ {_display_(Seq[Any](format.raw/*51.76*/("""
                  """),format.raw/*52.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*54.18*/routes/*54.24*/.HomeController.updateItem(i.getId)),format.raw/*54.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*60.18*/routes/*60.24*/.HomeController.deleteItem(i.getId)),format.raw/*60.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*64.20*/("""
               """),format.raw/*65.16*/("""</tr>
            """)))}),format.raw/*66.14*/("""
        
        """),format.raw/*68.9*/("""</tbody>
    </table>
    """),_display_(/*70.6*/if((user != null) && ("admin".equals(user.getRole())))/*70.60*/ {_display_(Seq[Any](format.raw/*70.62*/("""
    """),format.raw/*71.5*/("""<p>
        <a href=""""),_display_(/*72.19*/routes/*72.25*/.HomeController.addItem()),format.raw/*72.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*76.6*/("""
"""),format.raw/*77.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.ItemOnSale],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,user)

  def f:((List[models.ItemOnSale],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,user) => apply(items,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 06 21:28:07 GMT 2019
                  SOURCE: /home/wdd/Desktop/projectError/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: 651c9ed8021067001ab3148cee9d2cbdfd5c825c
                  MATRIX: 1006->1|1190->93|1218->113|1256->114|1287->119|1343->217|1371->220|1411->252|1450->254|1479->257|1542->295|1555->300|1590->315|1620->318|1658->326|1690->331|1827->441|1842->447|1888->472|1971->528|2005->546|2045->548|2085->560|2124->572|2139->578|2193->611|2258->648|2269->649|2299->657|2352->682|2400->703|2410->704|2445->718|2517->760|2558->773|3116->1358|3157->1372|3186->1385|3226->1387|3270->1403|3325->1431|3335->1432|3362->1438|3418->1467|3428->1468|3457->1476|3513->1505|3523->1506|3564->1526|3620->1555|3630->1556|3666->1571|3722->1600|3732->1601|3762->1610|3825->1646|3873->1673|3926->1699|3989->1753|4029->1755|4076->1774|4154->1825|4169->1831|4225->1866|4452->2066|4467->2072|4523->2107|4734->2287|4778->2303|4828->2322|4873->2340|4926->2367|4989->2421|5029->2423|5061->2428|5110->2450|5125->2456|5171->2481|5296->2576|5324->2577
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|82->51|82->51|82->51|83->52|85->54|85->54|85->54|91->60|91->60|91->60|95->64|96->65|97->66|99->68|101->70|101->70|101->70|102->71|103->72|103->72|103->72|107->76|108->77
                  -- GENERATED --
              */
          