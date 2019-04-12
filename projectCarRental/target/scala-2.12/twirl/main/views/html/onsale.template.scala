
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[models.products.ItemOnSale],List[models.products.Category],Long,String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.products.ItemOnSale],categories: List[models.products.Category], catId: Long, filter: String,
user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("On Sale",user)/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<h1>For Rent Here</h1>


    """),format.raw/*8.74*/("""
	"""),_display_(/*9.3*/if(flash.containsKey("success"))/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
		"""),format.raw/*10.3*/("""<div class="alert alert-success">
			"""),_display_(/*11.5*/flash/*11.10*/.get("success")),format.raw/*11.25*/("""
		"""),format.raw/*12.3*/("""</div>
""")))}),format.raw/*13.2*/("""



    


    """),format.raw/*20.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*23.33*/routes/*23.39*/.HomeController.onsale(0, filter)),format.raw/*23.72*/("""" class="list-group-item">All Categories</a>
		        """),_display_(/*24.12*/for(c<-categories) yield /*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
			        """),format.raw/*25.12*/("""<a href = """"),_display_(/*25.24*/routes/*25.30*/.HomeController.onsale(c.getId(), filter)),format.raw/*25.71*/("""" class="list-group-item catheight">"""),_display_(/*25.108*/c/*25.109*/.getName),format.raw/*25.117*/("""
                        """),format.raw/*26.25*/("""<span class="badge">"""),_display_(/*26.46*/c/*26.47*/.getItems.size),format.raw/*26.61*/("""</span> 
                    </a>
			    """)))}),format.raw/*28.9*/("""
            """),format.raw/*29.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h3>PLEASE NOTE!</h3>
        <h3>Prices are the price per day</h3>

        <div id="actions">
            <form action=""""),_display_(/*37.28*/routes/*37.34*/.HomeController.onsale(catId)),format.raw/*37.63*/("""" method="GET">
                <div class="form-group">
                    <input type="search" id="searchbox" name="filter" value =""""),_display_(/*39.80*/filter),format.raw/*39.86*/("""" placeholder="Search For Cars">
    
                </div>
                <div class="form-group">
                    <input type="submit" value="Search" class="btn btn-primary">
                </div>
            </form>
        </div>
        
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*63.68*/("""
            """),_display_(/*64.14*/for(i<-items) yield /*64.27*/ {_display_(Seq[Any](format.raw/*64.29*/("""
               """),format.raw/*65.16*/("""<tr>
                    """),_display_(/*66.22*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*66.104*/ {_display_(Seq[Any](format.raw/*66.106*/("""
                        """),format.raw/*67.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*67.69*/(i.getId + "thumb.jpg")),format.raw/*67.92*/(""""/></td>
                    """)))}/*68.23*/else/*68.28*/{_display_(Seq[Any](format.raw/*68.29*/("""
                        """),format.raw/*69.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
                    """)))}),format.raw/*70.22*/("""
                  """),format.raw/*71.19*/("""<td>"""),_display_(/*71.24*/i/*71.25*/.getId),format.raw/*71.31*/("""</td>
                  <td>"""),_display_(/*72.24*/i/*72.25*/.getName),format.raw/*72.33*/("""</td>
                  <td>"""),_display_(/*73.24*/i/*73.25*/.getDescription),format.raw/*73.40*/("""</td>
                  <td>"""),_display_(/*74.24*/i/*74.25*/.getStock),format.raw/*74.34*/("""</td>
                  <td>&euro; """),_display_(/*75.31*/("%.2f".format(i.getPrice))),format.raw/*75.58*/("""</td>

                  """),_display_(/*77.20*/if((user != null) && ("admin".equals(user.getRole())))/*77.74*/ {_display_(Seq[Any](format.raw/*77.76*/("""
                  """),format.raw/*78.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*80.18*/routes/*80.24*/.HomeController.updateItem(i.getId)),format.raw/*80.59*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*86.18*/routes/*86.24*/.HomeController.deleteItem(i.getId)),format.raw/*86.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                    """)))}),format.raw/*90.22*/("""
                    """),_display_(/*91.22*/if((user != null) && ("customer".equals(user.getRole())))/*91.79*/ {_display_(Seq[Any](format.raw/*91.81*/("""
                        """),_display_(/*92.26*/if(i.getStock() > 0)/*92.46*/{_display_(Seq[Any](format.raw/*92.47*/("""
                        """),format.raw/*93.25*/("""<td><a href=""""),_display_(/*93.39*/routes/*93.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*93.79*/("""" 
                             class="btn btn-default btn-xs"><span 
                            class="glyphicon glyphicon-shopping-cart"></span></a>
                        </td>
                    """)))}/*97.22*/else/*97.26*/{_display_(Seq[Any](format.raw/*97.27*/("""
                         """),format.raw/*98.26*/("""<td><img src="/assets/images/oos.jpg"/></td>

                    """)))}),format.raw/*100.22*/("""
                """)))}),format.raw/*101.18*/("""
               """),format.raw/*102.16*/("""</tr>
            """)))}),format.raw/*103.14*/("""
        
        """),format.raw/*105.9*/("""</tbody>
    </table>
    """),_display_(/*107.6*/if((user != null) && ("admin".equals(user.getRole())))/*107.60*/ {_display_(Seq[Any](format.raw/*107.62*/("""
    """),format.raw/*108.5*/("""<p>
        <a href=""""),_display_(/*109.19*/routes/*109.25*/.HomeController.addItem()),format.raw/*109.50*/("""">
            <button class="btn btn-primary">Add an item</button>
        </a>
    </p>
    """)))}),format.raw/*113.6*/("""
"""),format.raw/*114.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(items:List[models.products.ItemOnSale],categories:List[models.products.Category],catId:Long,filter:String,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,catId,filter,user,env)

  def f:((List[models.products.ItemOnSale],List[models.products.Category],Long,String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,catId,filter,user,env) => apply(items,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 12 12:59:37 IST 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/onsale.scala.html
                  HASH: 8b682b270f82f1ce3fdbe46e2432ce479d189fb8
                  MATRIX: 1057->1|1315->166|1342->168|1370->188|1408->189|1439->194|1495->292|1523->295|1563->327|1602->329|1632->332|1696->370|1710->375|1746->390|1776->393|1814->401|1856->416|1993->526|2008->532|2062->565|2145->621|2179->639|2219->641|2259->653|2298->665|2313->671|2375->712|2440->749|2451->750|2481->758|2534->783|2582->804|2592->805|2627->819|2699->861|2740->874|2943->1050|2958->1056|3008->1085|3171->1221|3198->1227|3876->1932|3917->1946|3946->1959|3986->1961|4030->1977|4083->2003|4175->2085|4216->2087|4269->2112|4340->2156|4384->2179|4433->2210|4446->2215|4485->2216|4538->2241|4653->2325|4700->2344|4732->2349|4742->2350|4769->2356|4825->2385|4835->2386|4864->2394|4920->2423|4930->2424|4966->2439|5022->2468|5032->2469|5062->2478|5125->2514|5173->2541|5226->2567|5289->2621|5329->2623|5376->2642|5454->2693|5469->2699|5525->2734|5752->2934|5767->2940|5823->2975|6036->3157|6085->3179|6151->3236|6191->3238|6244->3264|6273->3284|6312->3285|6365->3310|6406->3324|6421->3330|6476->3364|6698->3567|6711->3571|6750->3572|6804->3598|6903->3665|6953->3683|6998->3699|7049->3718|7095->3736|7149->3763|7213->3817|7254->3819|7287->3824|7337->3846|7353->3852|7400->3877|7526->3972|7555->3973
                  LINES: 28->1|34->3|35->4|35->4|35->4|36->5|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|51->20|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|59->28|60->29|68->37|68->37|68->37|70->39|70->39|94->63|95->64|95->64|95->64|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|102->71|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|108->77|108->77|108->77|109->78|111->80|111->80|111->80|117->86|117->86|117->86|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|124->93|128->97|128->97|128->97|129->98|131->100|132->101|133->102|134->103|136->105|138->107|138->107|138->107|139->108|140->109|140->109|140->109|144->113|145->114
                  -- GENERATED --
              */
          