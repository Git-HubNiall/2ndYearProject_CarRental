
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
                  DATE: Fri Mar 15 12:44:22 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: 1561dda2dd6f6e8e4a0e832bb131adaf3ef57326
                  MATRIX: 1006->1|1190->93|1218->113|1256->114|1287->119|1343->217|1371->220|1411->252|1450->254|1479->257|1542->295|1555->300|1590->315|1620->318|1658->326|1690->331|1827->441|1842->447|1888->472|1971->528|2005->546|2045->548|2085->560|2124->572|2139->578|2193->611|2258->648|2269->649|2299->657|2352->682|2400->703|2410->704|2445->718|2517->760|2558->773|3043->1285|3084->1299|3113->1312|3153->1314|3197->1330|3252->1358|3262->1359|3289->1365|3345->1394|3355->1395|3384->1403|3440->1432|3450->1433|3491->1453|3547->1482|3557->1483|3593->1498|3649->1527|3659->1528|3689->1537|3752->1573|3800->1600|3853->1626|3916->1680|3956->1682|4003->1701|4081->1752|4096->1758|4152->1793|4379->1993|4394->1999|4450->2034|4661->2214|4705->2230|4755->2249|4800->2267|4853->2294|4916->2348|4956->2350|4988->2355|5037->2377|5052->2383|5098->2408|5223->2503|5251->2504
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|82->51|82->51|82->51|83->52|85->54|85->54|85->54|91->60|91->60|91->60|95->64|96->65|97->66|99->68|101->70|101->70|101->70|102->71|103->72|103->72|103->72|107->76|108->77
                  -- GENERATED --
              */
          