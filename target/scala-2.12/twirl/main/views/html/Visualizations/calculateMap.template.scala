
package views.html.Visualizations

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

object calculateMap extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script type="text/javascript" src=""""),_display_(/*2.38*/routes/*2.44*/.Assets.versioned("demo-data/DemoData.js")),format.raw/*2.86*/(""""></script>
<script>
<!--TODO make map larger-->
    mapboxgl.accessToken = 'pk.eyJ1IjoiYWh1dmlsIiwiYSI6ImNqcHdjdmN1bDA1bjY0OXVqb2pucWo5b2oifQ.DlCUMxPJ6c3TD2eLq3OCEQ';
    var map = new mapboxgl.Map("""),format.raw/*6.32*/("""{"""),format.raw/*6.33*/("""
        """),format.raw/*7.9*/("""container: 'map',
        style: 'mapbox://styles/mapbox/streets-v9',
        center: [34.798256,31.260114],
        zoom: 13,
        trackResize: true
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/(""");

    map.on('load', function()"""),format.raw/*14.30*/("""{"""),format.raw/*14.31*/("""
        """),format.raw/*15.9*/("""addStations();
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/(""");
<!--TODO recieve stations from server-->
<!--TODO print stations id???-->
    //add all stations to map
    function addStations() """),format.raw/*20.28*/("""{"""),format.raw/*20.29*/("""
        """),format.raw/*21.9*/("""map.addLayer("""),format.raw/*21.22*/("""{"""),format.raw/*21.23*/("""
            """),format.raw/*22.13*/(""""id": "stationsLayer",
            "type": "symbol",
            "source": """),format.raw/*24.23*/("""{"""),format.raw/*24.24*/("""
                """),format.raw/*25.17*/(""""type": "geojson",
                "data": stations
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/(""",
            "layout": """),format.raw/*28.23*/("""{"""),format.raw/*28.24*/("""
                """),format.raw/*29.17*/(""""icon-image": "bus-15",
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""")
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/(""";

    //handle selection of area
    var points = [];
    map.on('click',function(e)"""),format.raw/*36.31*/("""{"""),format.raw/*36.32*/("""
        """),format.raw/*37.9*/("""if (points.length < 2) """),format.raw/*37.32*/("""{"""),format.raw/*37.33*/("""
            """),format.raw/*38.13*/("""var coordinates = [e.lngLat.lng,e.lngLat.lat];
            // var description = e.features[0].properties.name;
            //
            points.push(coordinates);
            var marker = new mapboxgl.Marker()
                .setLngLat(coordinates)
                .addTo(map);


        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
        """),format.raw/*48.9*/("""else alert("You have already choose 2 points");
    """),format.raw/*49.5*/("""}"""),format.raw/*49.6*/(""");

    function addNewLayerWithSelectedPoint(coordinates)"""),format.raw/*51.55*/("""{"""),format.raw/*51.56*/("""
        """),format.raw/*52.9*/("""map.addLayer("""),format.raw/*52.22*/("""{"""),format.raw/*52.23*/("""
            """),format.raw/*53.13*/(""""id": "point"+points.length,
            "type": "symbol",
            "source": """),format.raw/*55.23*/("""{"""),format.raw/*55.24*/("""
                """),format.raw/*56.17*/(""""type": "geojson",
                "data": """),format.raw/*57.25*/("""{"""),format.raw/*57.26*/("""
                    """),format.raw/*58.21*/(""""type": "FeatureCollection",
                    "features": ["""),format.raw/*59.34*/("""{"""),format.raw/*59.35*/("""
                        """),format.raw/*60.25*/(""""type": "Feature",
                        "geometry": """),format.raw/*61.37*/("""{"""),format.raw/*61.38*/("""
                            """),format.raw/*62.29*/(""""type": "Point",
                            "coordinates":coordinates
                        """),format.raw/*64.25*/("""}"""),format.raw/*64.26*/("""
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/("""]
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/(""",
            "layout": """),format.raw/*68.23*/("""{"""),format.raw/*68.24*/("""
                """),format.raw/*69.17*/(""""icon-image": "monument",
                "icon-size": 0.25
            """),format.raw/*71.13*/("""}"""),format.raw/*71.14*/("""
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/(""");
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""

    """),format.raw/*75.5*/("""function addPopupOfSelectesPoint(coordinates)"""),format.raw/*75.50*/("""{"""),format.raw/*75.51*/("""
        """),format.raw/*76.9*/("""while (Math.abs(e.lngLat.lng - coordinates[0]) > 180) """),format.raw/*76.63*/("""{"""),format.raw/*76.64*/("""
            """),format.raw/*77.13*/("""coordinates[0] += e.lngLat.lng > coordinates[0] ? 360 : -360;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""

        """),format.raw/*80.9*/("""new mapboxgl.Popup()
            .setLngLat(coordinates)
            .setHTML(description)
            .addTo(map);
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""

    """),format.raw/*86.5*/("""</script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 13:03:44 IST 2019
                  SOURCE: C:/Users/shaha/Desktop/p_n/FastLane-master/app/views/Visualizations/calculateMap.scala.html
                  HASH: a94642547298be8bc2e444546466fb49f63a3383
                  MATRIX: 1052->1|1115->38|1129->44|1191->86|1417->285|1445->286|1480->295|1664->452|1692->453|1753->486|1782->487|1818->496|1864->515|1892->516|2054->650|2083->651|2119->660|2160->673|2189->674|2230->687|2333->762|2362->763|2407->780|2499->844|2528->845|2580->869|2609->870|2654->887|2718->923|2747->924|2783->933|2812->934|2845->940|2873->941|2986->1026|3015->1027|3051->1036|3102->1059|3131->1060|3172->1073|3489->1363|3518->1364|3554->1373|3633->1425|3661->1426|3747->1484|3776->1485|3812->1494|3853->1507|3882->1508|3923->1521|4032->1602|4061->1603|4106->1620|4177->1663|4206->1664|4255->1685|4345->1747|4374->1748|4427->1773|4510->1828|4539->1829|4596->1858|4719->1953|4748->1954|4797->1975|4826->1976|4872->1994|4901->1995|4942->2008|4971->2009|5023->2033|5052->2034|5097->2051|5197->2123|5226->2124|5262->2133|5291->2134|5325->2141|5353->2142|5386->2148|5459->2193|5488->2194|5524->2203|5606->2257|5635->2258|5676->2271|5773->2341|5802->2342|5839->2352|5986->2472|6014->2473|6047->2479
                  LINES: 33->2|33->2|33->2|33->2|37->6|37->6|38->7|43->12|43->12|45->14|45->14|46->15|47->16|47->16|51->20|51->20|52->21|52->21|52->21|53->22|55->24|55->24|56->25|58->27|58->27|59->28|59->28|60->29|61->30|61->30|62->31|62->31|63->32|63->32|67->36|67->36|68->37|68->37|68->37|69->38|78->47|78->47|79->48|80->49|80->49|82->51|82->51|83->52|83->52|83->52|84->53|86->55|86->55|87->56|88->57|88->57|89->58|90->59|90->59|91->60|92->61|92->61|93->62|95->64|95->64|96->65|96->65|97->66|97->66|98->67|98->67|99->68|99->68|100->69|102->71|102->71|103->72|103->72|104->73|104->73|106->75|106->75|106->75|107->76|107->76|107->76|108->77|109->78|109->78|111->80|115->84|115->84|117->86
                  -- GENERATED --
              */
          