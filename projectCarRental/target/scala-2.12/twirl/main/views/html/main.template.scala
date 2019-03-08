
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
		
	<img class="banner" src=""""),_display_(/*28.28*/routes/*28.34*/.Assets.versioned("images/carheader.jpg")),format.raw/*28.75*/("""" alt="carheader">

	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">OnlineCarRental</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*36.18*/if(pagename == "Home")/*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""class="active"""")))}),format.raw/*36.57*/("""><a href=""""),_display_(/*36.68*/routes/*36.74*/.HomeController.index()),format.raw/*36.97*/("""">Home</a></li>
		    <li """),_display_(/*37.12*/if(pagename == "On Sale")/*37.37*/ {_display_(Seq[Any](format.raw/*37.39*/("""class="active"""")))}),format.raw/*37.54*/("""><a href=""""),_display_(/*37.65*/routes/*37.71*/.HomeController.onsale()),format.raw/*37.95*/("""">Cars To Rent</a></li>
			<li """),_display_(/*38.9*/if(pagename == "About")/*38.32*/ {_display_(Seq[Any](format.raw/*38.34*/("""class="active"""")))}),format.raw/*38.49*/("""><a href=""""),_display_(/*38.60*/routes/*38.66*/.HomeController.about()),format.raw/*38.89*/("""">About us</a></li>
			
			<li """),_display_(/*40.9*/if(pagename == "Log In")/*40.33*/ {_display_(Seq[Any](format.raw/*40.35*/("""class="active"""")))}),format.raw/*40.50*/(""">
				"""),_display_(/*41.6*/if(user != null)/*41.22*/ {_display_(Seq[Any](format.raw/*41.24*/("""
					"""),format.raw/*42.6*/("""<a href=""""),_display_(/*42.16*/routes/*42.22*/.LoginController.logout()),format.raw/*42.47*/("""">Log Out</a>
				""")))}/*43.7*/else/*43.12*/{_display_(Seq[Any](format.raw/*43.13*/("""
					"""),format.raw/*44.6*/("""<a href=""""),_display_(/*44.16*/routes/*44.22*/.LoginController.login()),format.raw/*44.46*/("""">Log In</a>
			
			</li>
""")))}),format.raw/*47.2*/("""			
		"""),format.raw/*48.3*/("""</ul>
	    </div>
	</nav>
	<div>
		<div class="col-sm-12">
				<div class="midcol">
					"""),_display_(/*54.7*/content),format.raw/*54.14*/("""
					
				"""),format.raw/*56.5*/("""</div>
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
	<script src =""""),_display_(/*67.17*/routes/*67.23*/.Assets.versioned("javascripts/main.js")),format.raw/*67.63*/(""""></script>
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
                  DATE: Fri Mar 08 12:50:11 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/main.scala.html
                  HASH: 727d524ca664966d2aff66b65513530771a3c60a
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1542->372|1570->373|1603->379|1640->388|1669->389|1698->390|1767->431|1796->432|1829->438|1869->450|1898->451|1927->452|1974->471|2003->472|2033->475|2071->485|2100->486|2152->510|2181->511|2214->517|2253->528|2282->529|2311->530|2378->569|2407->570|2440->576|2479->587|2508->588|2537->589|2603->627|2632->628|2665->634|2702->643|2731->644|2760->645|2800->657|2829->658|2859->661|2902->676|2931->677|2971->689|3000->690|3030->693|3066->701|3095->702|3135->714|3164->715|3194->718|3231->727|3260->728|3301->741|3330->742|3360->745|3402->759|3431->760|3470->771|3499->772|3529->775|3565->783|3594->784|3634->796|3663->797|3693->800|3729->808|3758->809|3813->836|3842->837|3872->840|3909->849|3938->850|3977->861|4006->862|4035->864|4096->898|4125->906|4214->968|4229->974|4291->1015|4555->1252|4586->1274|4626->1276|4672->1291|4710->1302|4725->1308|4769->1331|4823->1358|4857->1383|4897->1385|4943->1400|4981->1411|4996->1417|5041->1441|5099->1473|5131->1496|5171->1498|5217->1513|5255->1524|5270->1530|5314->1553|5372->1585|5405->1609|5445->1611|5491->1626|5524->1633|5549->1649|5589->1651|5622->1657|5659->1667|5674->1673|5720->1698|5757->1718|5770->1723|5809->1724|5842->1730|5879->1740|5894->1746|5939->1770|5996->1797|6029->1803|6145->1893|6173->1900|6211->1911|6427->2100|6442->2106|6503->2146
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|54->23|55->24|55->24|59->28|59->28|59->28|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|78->47|79->48|85->54|85->54|87->56|98->67|98->67|98->67
                  -- GENERATED --
              */
          