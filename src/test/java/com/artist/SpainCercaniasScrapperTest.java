package com.artist;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class SpainCercaniasScrapperTest
{

    @BeforeClass
    public static void testSetup()
    {
        //TODO fcres: Review this code
    }

    @AfterClass
    public static void testCleanup()
    {
        // Teardown for data used by the unit tests
        //TODO fcres: Review this code

    }

    @Test
    public void testSearch() {
        final CercaniasScrapper scrapper =
                CercaniasScrapper.INSTANCE;
//        final List<ArrivalData> data = scrapper.retrieveArrivalDataList();

//        assertTrue(data > 0);
    }



    @Test
    public void testParse() {
        final CercaniasScrapper scrapper =
                CercaniasScrapper.INSTANCE;


        final String fake = "" +
                "<!--hjcer310.jsp versión:  ver FEB 2004  --->\n" +
                "<!-- \n" +
                "/******************************************************************************\n" +
                "  * FICHERO: hjcer310.jsp\n" +
                "  * ****************************************************************************\n" +
                "  * Fecha         \tResponsable     \t Descripción\n" +
                "  * --------     \t------------         -----------------\n" +
                "  * 28/11/2011\t\tINDRA.SCCID73\t \t 44622 (INC000000293596): Horarios de Cataluña\n" +
                "  *****************************************************************************/ \n" +
                "-->\n" +
                "<!--RNF09-CER001 RQ CERRF001 Introducir i18n en cercanías.-->\n" +
                "<!--FIN RNF09-CER001 RQ CERRF001.-->\n" +
                "<html><!-- hjcer312.jsp versión nueva web feb 2009  --><head>\n" +
                "<meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\">\n" +
                "<link rel=\"stylesheet\" href=\"cercanias_files/style_cer.css\">\n" +
                "<!--RNF09-CER001 RQ CERRF001 Introducir i18n en cercanías.-->\n" +
                "<title>RENFE: Cercanías </title>\n" +
                "<!--FIN RNF09-CER001 RQ CERRF001.-->\n" +
                "<style type=\"text/css\">\n" +
                ".TA {scrollbar-3dlight-color:;\n" +
                "     scrollbar-arrow-color:#666666;\n" +
                "     scrollbar-base-color:#ffffff;\n" +
                "     scrollbar-darkshadow-color:#ffffff;\n" +
                "     scrollbar-face-color:#EDEBEB;\n" +
                "     scrollbar-highlight-color:#ffffff;\n" +
                "     scrollbar-shadow-color:#666666\n" +
                "\t }\n" +
                "\n" +
                "body {\n" +
                "\tfont-size:62.5%;\n" +
                "\tmargin-left: 0px;\n" +
                "\tmargin-top: 0px;\n" +
                "\tmargin-right: 0px;\n" +
                "\tmargin-bottom: 0px;\n" +
                "\t\n" +
                "}\n" +
                "\n" +
                "#contenedor {\n" +
                "\t width:100%;\n" +
                "\t height:auto;\n" +
                "\t margin-left:10px;\n" +
                "\t font-size:1em;\n" +
                "\t font-family:Arial, Helvetica, sans-serif;\n" +
                "\tfont-weight: normal;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #000000;\n" +
                "\tfont-style: normal;\t \n" +
                " }\n" +
                "\n" +
                "\n" +
                "h1 {\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1.3em;\n" +
                "\tfont-weight: normal;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #D2200A;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\n" +
                "}\n" +
                "\n" +
                "h2 {\n" +
                "\tmargin-left:15px;\n" +
                "\tfont-size: 1.2em;\n" +
                "\tfont-family: Verdana,Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #666666;\n" +
                "\tfont-style: normal;\n" +
                "\tfont-weight: normal;\t\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "h3 {\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1em;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #666666;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\n" +
                "}\n" +
                "\n" +
                "h4 {\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1.2em;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #000000;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\n" +
                "\t}\n" +
                "\t\n" +
                ".caja_texto {\n" +
                "\tBORDER-RIGHT: #cccccc 0.1em solid; \n" +
                "\tBORDER-TOP: #cccccc 1px solid; \n" +
                "\tFONT-SIZE: 0.8em; \n" +
                "\tBORDER-LEFT: #cccccc 1px solid; \n" +
                "\tBORDER-BOTTOM: #cccccc 0.1em solid; \n" +
                "\tFONT-FAMILY: Arial, Helvetica, sans-serif; \n" +
                "\tHEIGHT: 1.5em; \n" +
                "\tBACKGROUND-COLOR: #ffffff\n" +
                "\t}\n" +
                "\n" +
                "#menuderecho_lineagris {\n" +
                "\tlist-style-position: inherit;\n" +
                "\tmargin-left: 5px;\n" +
                "\tline-height: 10px;\n" +
                "\tbackground-image: url(\"/cer/gif/back_pgris.gif\");\t\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                ".titulo_rojo {\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1.3em;\n" +
                "\tfont-weight: normal;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #D2200A;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".titulo_negro {\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1.1em;\n" +
                "\tfont-weight: normal;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #000000;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\n" +
                "}\n" +
                "\n" +
                ".titulo_gris {\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1.3em;\n" +
                "\tfont-weight: normal;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #666666;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "#fondo_caja {\n" +
                "\tbackground-color:#F2F2F2;\n" +
                "\theight:25px;\n" +
                "\tmargin-left:1em;\n" +
                "\tfont-size: 1.1em;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #000000;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: 1.2em;\n" +
                "\tfont-weight: normal;\n" +
                "\tmargin-right: 0.5em;\t\n" +
                "\t\n" +
                "}\n" +
                "\n" +
                "A.linkgris {\n" +
                "\tFONT-SIZE: 1.1em; COLOR: #666666; FONT-FAMILY: Arial, Helvetica, sans-serif; TEXT-DECORATION: none; line-height:auto;\n" +
                "}\n" +
                "\n" +
                "A.linkgris:hover {\n" +
                "\tFONT-SIZE: 1.1em; COLOR: #D2200A; FONT-FAMILY: Arial, Helvetica, sans-serif; TEXT-DECORATION: underline; line-height:auto;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".celda_pijama_gris {\n" +
                "\tmargin-left:5px;\n" +
                "\tfont-size: 0.8em;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #666666;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height:normal;\n" +
                "\tfont-weight: normal;\n" +
                "\ttext-align:center;\n" +
                "\tbackground-color:#F5F6F6;\t\t\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".celda_txto_negro {\n" +
                "\tmargin-left:5px;\n" +
                "\tfont-size: 0.9em;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\tcolor: #000000;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: normal;\n" +
                "\tfont-weight: normal;\n" +
                "\ttext-align:center;\n" +
                "\t}\t\n" +
                "\n" +
                "\n" +
                ".celda_pijama_negro {\n" +
                "\tmargin-left:5px;\n" +
                "\tfont-size: 0.9em;\n" +
                "\tfont-family: Arial, Helvetica, sans-serif;\n" +
                "\tcolor: #000000;\n" +
                "\tfont-style: normal;\n" +
                "\tline-height: normal;\n" +
                "\tfont-weight: normal;\n" +
                "\ttext-align:center;\n" +
                "\tbackground-color:#F5F6F6;\n" +
                "\t}\t\t\n" +
                "\n" +
                "\n" +
                ".cabe{\n" +
                "\tfont:0.8em;\n" +
                "\tfont-family:Arial, Helvetica, sans-serif; \n" +
                "\tbackground-color: rgb(193,51,51); \n" +
                "\tcolor: #FFFFFF;\n" +
                "\t}\n" +
                "\n" +
                ".rojo   {font:10px Arial, Helvetica, sans-serif; color:red; background-color: rgb(191,216,216); }\n" +
                ".azul   {font:10px Arial, Helvetica, sans-serif; background-color: rgb(191,216,216);}\n" +
                "\n" +
                ".cabecera2   {font:11pt arial;  background-color: rgb(222,219,219); color: black;}\n" +
                ".esta   {font:10px Arial, Helvetica, sans-serif; \n" +
                "background-color: rgb(255,204,204);\n" +
                "\n" +
                "}\n" +
                "   .color1 {font:0.7em Arial, Helvetica, sans-serif; background-color: rgb(192,192,192);}\n" +
                "   .color2 {font:0.7em Arial, Helvetica, sans-serif; background-color: rgb(222,219,219);}\n" +
                "   .color3 {font:0.7em Arial, Helvetica, sans-serif; background-color:#e0e0e0;}\n" +
                "\n" +
                "   .rojo1  {font:0.7em Arial, Helvetica, sans-serif; color:red; background-color: rgb(192,192,192); }\n" +
                "   .rojo2  {font:0.7em Arial, Helvetica, sans-serif; color:red; background-color: rgb(192,192,192); }\n" +
                "   .rojo3  {font:0.7em Arial, Helvetica, sans-serifl; color:red;background-color: rgb(222,219,219); }\n" +
                "   .gris   {font:0.7em Arial, Helvetica, sans-serif; background-color: rgb(192,192,192); }\n" +
                "   .grismejor  {font:0.7em Arial, Helvetica, sans-serif; background-color: rgb(192,192,192);\n" +
                "               color:yellow; }\n" +
                "   .azulmejor  {font:0.7em Arial, Helvetica, sans-serif; background-color: rgb(191,216,216);\n" +
                "               color:yellow;}\n" +
                "   .griso  {font:0.7em Arial, Helvetica, sans-serif; background-color: rgb(168,168,168); }\n" +
                "</style>\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"TA\" leftmargin=\"0\" topmargin=\"0\" marginheight=\"0\" marginwidth=\"0\" text=\"000000\" bgcolor=\"FFFFFF\">\n" +
                "\n" +
                "<div id=\"contenedor\">\n" +
                "<h1>\n" +
                "<!--RNF09-CER001 RQ CERRF001 Introducir i18n en cercanías.-->\n" +
                "Horarios Solicitados\n" +
                "<!--FIN RNF09-CER001 RQ CERRF001.-->\n" +
                "</h1>\n" +
                "<h4>\n" +
                "               \n" +
                "   Horarios válidos desde   <b> 28-02-2014 </b>\n" +
                "   hasta   <b> 28-02-2014 </b>\n" +
                "   \n" +
                "\n" +
                "   \n" +
                "   <br><br>\n" +
                "\n" +
                "<a href=\"http://horarios.renfe.com/cer/hjcer310.jsp?&amp;nucleo=10&amp;o=17000&amp;d=18000&amp;tc=DIA&amp;td=D&amp;df=20140228&amp;th=1&amp;ho=00&amp;i=s&amp;cp=NO&amp;TXTInfo=\" class=\"titulo_negro\"><img src=\"cercanias_files/cerinverso.jpg\" alt=\"Solicitar los Horarios de Regreso en el día\" border=\"0\">\n" +
                "Solicitar los Horarios de Regreso en el día </a>\n" +
                "<div id=\"imprimir\">\n" +
                "<a href=\"javascript:window.print();\" id=\"imprimir\" class=\"titulo_negro\"><img src=\"cercanias_files/cercaimp.jpg\" alt=\"Imprimir horarios\" border=\"0\"> Imprimir horarios</a>\n" +
                "</div>\n" +
                "\n" +
                "</h4>\n" +
                "\n" +
                "<span class=\"titulo_rojo\">Origen :</span> <span class=\"titulo_negro\">Atocha                                  </span><br>\n" +
                "\n" +
                "<span class=\"titulo_rojo\">Destino  :</span> <span class=\"titulo_negro\">Chamartin                               \n" +
                "\t</span><br>\n" +
                "<br>\n" +
                "<span class=\"titulo_rojo\">Día de viaje:  :</span> <span class=\"titulo_negro\">28-02-2014</span>\n" +
                "\t\n" +
                "\t \t\n" +
                "\t \t\n" +
                "<br><br>\n" +
                "  \t\n" +
                "\t\n" +
                "<br><br>\n" +
                "<table width=\"100%\" align=\"center\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\">\n" +
                "<tbody>\n" +
                "          <tr>\n" +
                "            <td colspan=\"5\" valign=\"middle\" align=\"center\">\n" +
                "              \n" +
                "          </td></tr><tr>\n" +
                "          \n" +
                "          \t \n" +
                "          \t<td class=\"cabe\" align=\"center\"> Línea </td>\n" +
                "            <td class=\"cabe\" align=\"center\"> Hora Salida  </td>\n" +
                "            <td class=\"cabe\" align=\"center\"> Hora Llegada  </td>\n" +
                "           \n" +
                "            <td class=\"cabe\" align=\"center\"> Tiempo de Viaje </td>\n" +
                "            <td class=\"cabe\" align=\"center\"> </td>\n" +
                "          </tr>\n" +
                "          \n" +
                "          <tr>\n" +
                
                
                
                
                
                "            <td class=\"color3\" align=\"center\">C4A </td>\n" +
                "            <td class=\"color1\" align=\"center\">09.00</td>\n" +
                "            <td class=\"color2\" align=\"center\">09.13</td>\n" +
                
                "            <td class=\"color1\" align=\"center\">0.13</td>\n" +
                "            <td class=\"rojo3\" align=\"center\"> </td>\n" +
                "          </tr>\n" +
                "          \n" +
                "          <tr>\n" +
                
                


                "            <td class=\"color3\" align=\"center\">C2  </td>\n" +
                "            <td class=\"color1\" align=\"center\">15.48</td>\n" +
                "            <td class=\"color2\" align=\"center\">16.01</td>\n" +

                "            <td class=\"color1\" align=\"center\">0.13</td>\n" +
                "            <td class=\"rojo3\" align=\"center\"> </td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +





                "            <td class=\"color3\" align=\"center\">C3  </td>\n" +
                "            <td class=\"color1\" align=\"center\">23.59</td>\n" +
                "            <td class=\"color2\" align=\"center\">00.13</td>\n" +

                "            <td class=\"color1\" align=\"center\">0.13</td>\n" +
                "            <td class=\"rojo3\" align=\"center\"> </td>\n" +
                "          </tr>\n" +
                "          \n" +
                "          \n" +
                "\n" +
                "\t</tbody>\t\t  \n" +
                "</table><br>\n" +
                "<br>\n" +
                "<div id=\"volver\" style=\"margin-right:10px;width:100%;padding-right:15px\" align=\"right\">\n" +
                "<a href=\"javascript:history.go(-1);\" class=\"linkgris\"><img src=\"cercanias_files/boton_volver2_castellano.gif\" alt=\"Volver \" border=\"0\"></a></div><br>\n" +
                "<br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                " \n" +
                "  \n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "</body></html>";
























        final List data = scrapper.parse(fake);

//        assertTrue(data > 0);
    }


}
