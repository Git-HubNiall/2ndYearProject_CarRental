
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color:teal;"""),format.raw/*10.58*/("""}"""),format.raw/*10.59*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
		"""),format.raw/*12.3*/(""".sidecol2 """),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""background-color: white;"""),format.raw/*12.38*/("""}"""),format.raw/*12.39*/("""
	    """),format.raw/*13.6*/(""".midcol h1 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; font-weight: bold; """),format.raw/*13.58*/("""}"""),format.raw/*13.59*/("""
	    """),format.raw/*14.6*/(""".midcol h3 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""text-align: center; color: steelblue; """),format.raw/*14.57*/("""}"""),format.raw/*14.58*/("""
	    """),format.raw/*15.6*/(""".redtext """),format.raw/*15.15*/("""{"""),format.raw/*15.16*/(""" """),format.raw/*15.17*/("""color: red; """),format.raw/*15.29*/("""}"""),format.raw/*15.30*/("""
		"""),format.raw/*16.3*/(""".sidecol input """),format.raw/*16.18*/("""{"""),format.raw/*16.19*/("""width: 100%;"""),format.raw/*16.31*/("""}"""),format.raw/*16.32*/("""
		"""),format.raw/*17.3*/(""".pickUp """),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""float: left;"""),format.raw/*17.24*/("""}"""),format.raw/*17.25*/("""
		"""),format.raw/*18.3*/(""".dropOff """),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""float: right;"""),format.raw/*18.26*/("""}"""),format.raw/*18.27*/("""
		"""),format.raw/*19.3*/(""".sidecol form """),format.raw/*19.17*/("""{"""),format.raw/*19.18*/("""width: 50%;"""),format.raw/*19.29*/("""}"""),format.raw/*19.30*/("""
		"""),format.raw/*20.3*/(""".header """),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""width: 100%;"""),format.raw/*20.24*/("""}"""),format.raw/*20.25*/("""
		"""),format.raw/*21.3*/(""".banner """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""width: 100%; height: 270px;"""),format.raw/*21.39*/("""}"""),format.raw/*21.40*/("""
		"""),format.raw/*22.3*/(""".collage """),format.raw/*22.12*/("""{"""),format.raw/*22.13*/("""width: 99%;"""),format.raw/*22.24*/("""}"""),format.raw/*22.25*/("""
	"""),format.raw/*23.2*/("""</style>
	<title>OnlineCarRental """),_display_(/*24.26*/pagename),format.raw/*24.34*/("""</title>
    </head>
    <body>
		
	<img class="banner" src=""""),_display_(/*28.28*/routes/*28.34*/.Assets.versioned("images/carheader2.jpg")),format.raw/*28.76*/("""" alt="carheader">

	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">OnlineCarRental</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*36.18*/if(pagename == "Home")/*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""class="active"""")))}),format.raw/*36.57*/("""><a href=""""),_display_(/*36.68*/routes/*36.74*/.HomeController.index()),format.raw/*36.97*/("""">Home</a></li>
		    <li """),_display_(/*37.12*/if(pagename == "On Sale")/*37.37*/ {_display_(Seq[Any](format.raw/*37.39*/("""class="active"""")))}),format.raw/*37.54*/("""><a href=""""),_display_(/*37.65*/routes/*37.71*/.HomeController.onsale()),format.raw/*37.95*/("""">Cars To Rent</a></li>
			<li """),_display_(/*38.9*/if(pagename == "About")/*38.32*/ {_display_(Seq[Any](format.raw/*38.34*/("""class="active"""")))}),format.raw/*38.49*/("""><a href=""""),_display_(/*38.60*/routes/*38.66*/.HomeController.about()),format.raw/*38.89*/("""">About us</a></li>	
			<li """),_display_(/*39.9*/if(pagename == "Register")/*39.35*/ {_display_(Seq[Any](format.raw/*39.37*/("""class="active"""")))}),format.raw/*39.52*/("""><a href=""""),_display_(/*39.63*/routes/*39.69*/.LoginController.registerUser()),format.raw/*39.100*/("""">Register user</a></li>
			"""),_display_(/*40.5*/if((user != null) && ("admin".equals(user.getRole())))/*40.59*/ {_display_(Seq[Any](format.raw/*40.61*/("""
				"""),format.raw/*41.5*/("""<li """),_display_(/*41.10*/if(pagename == "Administrators")/*41.42*/ {_display_(Seq[Any](format.raw/*41.44*/("""class="active"""")))}),format.raw/*41.59*/("""><a href=""""),_display_(/*41.70*/routes/*41.76*/.HomeController.usersAdmin()),format.raw/*41.104*/("""">View Admin</a></li>
				<li """),_display_(/*42.10*/if(pagename == "Customers")/*42.37*/ {_display_(Seq[Any](format.raw/*42.39*/("""class="active"""")))}),format.raw/*42.54*/("""><a href=""""),_display_(/*42.65*/routes/*42.71*/.HomeController.usersCustomer()),format.raw/*42.102*/("""">View Customers</a></li>

			""")))}),format.raw/*44.5*/("""
			"""),format.raw/*45.4*/("""<li """),_display_(/*45.9*/if(pagename == "Log In")/*45.33*/ {_display_(Seq[Any](format.raw/*45.35*/("""class="active"""")))}),format.raw/*45.50*/(""">
				"""),_display_(/*46.6*/if(user != null)/*46.22*/ {_display_(Seq[Any](format.raw/*46.24*/("""
					"""),format.raw/*47.6*/("""<a href=""""),_display_(/*47.16*/routes/*47.22*/.LoginController.logout()),format.raw/*47.47*/("""">Log Out</a>
				""")))}/*48.7*/else/*48.12*/{_display_(Seq[Any](format.raw/*48.13*/("""
					"""),format.raw/*49.6*/("""<a href=""""),_display_(/*49.16*/routes/*49.22*/.LoginController.login()),format.raw/*49.46*/("""">Log In</a>
			
			</li>
""")))}),format.raw/*52.2*/("""			
		"""),format.raw/*53.3*/("""</ul>
	    </div>
	</nav>
	<div>
		<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*59.7*/content),format.raw/*59.14*/("""
					
				"""),format.raw/*61.5*/("""</div>
		</div>
	</div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by JAN
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*72.17*/routes/*72.23*/.Assets.versioned("javascripts/main.js")),format.raw/*72.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 15:38:29 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/main.scala.html
                  HASH: 4b5f7566a1882e66d00b8e0073c98e44d98e73ca
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1542->372|1570->373|1603->379|1640->388|1669->389|1698->390|1767->431|1796->432|1829->438|1869->450|1898->451|1927->452|1974->471|2003->472|2033->475|2071->485|2100->486|2152->510|2181->511|2214->517|2253->528|2282->529|2311->530|2378->569|2407->570|2440->576|2479->587|2508->588|2537->589|2603->627|2632->628|2665->634|2702->643|2731->644|2760->645|2800->657|2829->658|2859->661|2902->676|2931->677|2971->689|3000->690|3030->693|3066->701|3095->702|3135->714|3164->715|3194->718|3231->727|3260->728|3301->741|3330->742|3360->745|3402->759|3431->760|3470->771|3499->772|3529->775|3565->783|3594->784|3634->796|3663->797|3693->800|3729->808|3758->809|3813->836|3842->837|3872->840|3909->849|3938->850|3977->861|4006->862|4035->864|4096->898|4125->906|4214->968|4229->974|4292->1016|4556->1253|4587->1275|4627->1277|4673->1292|4711->1303|4726->1309|4770->1332|4824->1359|4858->1384|4898->1386|4944->1401|4982->1412|4997->1418|5042->1442|5100->1474|5132->1497|5172->1499|5218->1514|5256->1525|5271->1531|5315->1554|5370->1583|5405->1609|5445->1611|5491->1626|5529->1637|5544->1643|5597->1674|5652->1703|5715->1757|5755->1759|5787->1764|5819->1769|5860->1801|5900->1803|5946->1818|5984->1829|5999->1835|6049->1863|6107->1894|6143->1921|6183->1923|6229->1938|6267->1949|6282->1955|6335->1986|6396->2017|6427->2021|6458->2026|6491->2050|6531->2052|6577->2067|6610->2074|6635->2090|6675->2092|6708->2098|6745->2108|6760->2114|6806->2139|6843->2159|6856->2164|6895->2165|6928->2171|6965->2181|6980->2187|7025->2211|7082->2238|7115->2244|7231->2334|7259->2341|7297->2352|7513->2541|7528->2547|7589->2587
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|54->23|55->24|55->24|59->28|59->28|59->28|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|75->44|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|80->49|83->52|84->53|90->59|90->59|92->61|103->72|103->72|103->72
                  -- GENERATED --
              */
          