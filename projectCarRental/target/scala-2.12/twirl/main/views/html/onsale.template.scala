
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
    """),format.raw/*3.5*/("""<h1>On sale here</h1>


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
                  DATE: Tue Feb 26 12:45:36 GMT 2019
                  SOURCE: /media/sf_student/projectCarRental/app/views/onsale.scala.html
                  HASH: 9c93b54551bb3ed7d0bc238a01c7f7dd9f7c3f10
                  MATRIX: 1006->1|1190->93|1218->113|1256->114|1287->119|1342->216|1370->219|1410->251|1449->253|1478->256|1541->294|1554->299|1589->314|1619->317|1657->325|1689->330|1826->440|1841->446|1887->471|1970->527|2004->545|2044->547|2084->559|2123->571|2138->577|2192->610|2257->647|2268->648|2298->656|2351->681|2399->702|2409->703|2444->717|2516->759|2557->772|3115->1357|3156->1371|3185->1384|3225->1386|3269->1402|3324->1430|3334->1431|3361->1437|3417->1466|3427->1467|3456->1475|3512->1504|3522->1505|3563->1525|3619->1554|3629->1555|3665->1570|3721->1599|3731->1600|3761->1609|3824->1645|3872->1672|3925->1698|3988->1752|4028->1754|4075->1773|4153->1824|4168->1830|4224->1865|4451->2065|4466->2071|4522->2106|4733->2286|4777->2302|4827->2321|4872->2339|4925->2366|4988->2420|5028->2422|5060->2427|5109->2449|5124->2455|5170->2480|5295->2575|5323->2576
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|82->51|82->51|82->51|83->52|85->54|85->54|85->54|91->60|91->60|91->60|95->64|96->65|97->66|99->68|101->70|101->70|101->70|102->71|103->72|103->72|103->72|107->76|108->77
                  -- GENERATED --
              */
          