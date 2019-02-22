
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
  def apply/*1.2*/(pagename:String, user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
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
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>OFM """),_display_(/*16.14*/pagename),format.raw/*16.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "On Sale")/*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""class="active"""")))}),format.raw/*26.54*/("""><a href=""""),_display_(/*26.65*/routes/*26.71*/.HomeController.onsale()),format.raw/*26.95*/("""">On Sale</a></li>
			<li """),_display_(/*27.9*/if(pagename == "About")/*27.32*/ {_display_(Seq[Any](format.raw/*27.34*/("""class="active"""")))}),format.raw/*27.49*/("""><a href=""""),_display_(/*27.60*/routes/*27.66*/.HomeController.about()),format.raw/*27.89*/("""">About us</a></li>
			<li """),_display_(/*28.9*/if(pagename == "Log In")/*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""class="active"""")))}),format.raw/*28.50*/(""">
				"""),_display_(/*29.6*/if(user != null)/*29.22*/{_display_(Seq[Any](format.raw/*29.23*/("""
					"""),format.raw/*30.6*/("""<a href=""""),_display_(/*30.16*/routes/*30.22*/.LoginController.logout()),format.raw/*30.47*/("""">Log Out</a>	
				""")))}/*31.7*/else/*31.12*/{_display_(Seq[Any](format.raw/*31.13*/("""
					"""),format.raw/*32.6*/("""<a href=""""),_display_(/*32.16*/routes/*32.22*/.LoginController.login()),format.raw/*32.46*/("""">Log In</a>
				""")))}),format.raw/*33.6*/("""
			"""),format.raw/*34.4*/("""</li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*50.5*/content),format.raw/*50.12*/("""
		    """),format.raw/*51.7*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*69.17*/routes/*69.23*/.Assets.versioned("javascripts/main.js")),format.raw/*69.63*/(""""></script>
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
                  DATE: Fri Feb 22 08:48:34 GMT 2019
                  SOURCE: /home/wdd/year2Project/projectCarRental/app/views/main.scala.html
                  HASH: c7494e34370826876f483064405076d042631cdb
                  MATRIX: 970->1|1120->58|1402->313|1430->314|1458->315|1543->373|1571->374|1604->380|1641->389|1670->390|1699->391|1775->439|1804->440|1837->446|1877->458|1906->459|1935->460|1982->479|2011->480|2044->486|2083->497|2112->498|2141->499|2208->538|2237->539|2270->545|2309->556|2338->557|2367->558|2433->596|2462->597|2495->603|2532->612|2561->613|2590->614|2630->626|2659->627|2688->629|2737->651|2766->659|3038->904|3069->926|3109->928|3155->943|3193->954|3208->960|3252->983|3306->1010|3340->1035|3380->1037|3426->1052|3464->1063|3479->1069|3524->1093|3577->1120|3609->1143|3649->1145|3695->1160|3733->1171|3748->1177|3792->1200|3846->1228|3879->1252|3919->1254|3965->1269|3998->1276|4023->1292|4062->1293|4095->1299|4132->1309|4147->1315|4193->1340|4231->1361|4244->1366|4283->1367|4316->1373|4353->1383|4368->1389|4413->1413|4461->1431|4492->1435|5026->1943|5054->1950|5088->1957|5724->2566|5739->2572|5800->2612
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|64->33|65->34|81->50|81->50|82->51|100->69|100->69|100->69
                  -- GENERATED --
              */
          