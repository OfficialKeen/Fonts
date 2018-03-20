package keen.fonts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.font.AndroFonts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView alex = findViewById(R.id.alex_brush_regular);
        alex.setTypeface(AndroFonts.alexBrushReguler(this));

        TextView aller_bd = findViewById(R.id.aller_bd);
        aller_bd.setTypeface(AndroFonts.allerBd(this));

        TextView allura_regular = findViewById(R.id.allura_regular);
        allura_regular.setTypeface(AndroFonts.alluraRegular(this));

        TextView arizonia_regular = findViewById(R.id.arizonia_regular);
        arizonia_regular.setTypeface(AndroFonts.arizoniaRegular(this));

        TextView cac_champagne = findViewById(R.id.cac_champagne);
        cac_champagne.setTypeface(AndroFonts.cacChampagne(this));

        TextView caviar_dreams = findViewById(R.id.caviar_dreams);
        caviar_dreams.setTypeface(AndroFonts.caviarDreams(this));

        TextView caviar_dreams_bold = findViewById(R.id.caviar_dreams_bold);
        caviar_dreams_bold.setTypeface(AndroFonts.caviarDreamsBold(this));

        TextView caviar_dreams_bolditalic = findViewById(R.id.caviar_dreams_bolditalic);
        caviar_dreams_bolditalic.setTypeface(AndroFonts.caviarDreamsBolditalic(this));

        TextView caviar_dreams_italic = findViewById(R.id.caviar_dreams_italic);
        caviar_dreams_italic.setTypeface(AndroFonts.caviarDreamsItalic(this));

        TextView chunk_five = findViewById(R.id.chunk_five);
        chunk_five.setTypeface(AndroFonts.chunkFive(this));

        TextView colab_bol = findViewById(R.id.colab_bol);
        colab_bol.setTypeface(AndroFonts.colabBol(this));

        TextView colab_lig = findViewById(R.id.colab_lig);
        colab_lig.setTypeface(AndroFonts.colabLig(this));

        TextView colab_med = findViewById(R.id.colab_med);
        colab_med.setTypeface(AndroFonts.colabMed(this));

        TextView colab_reg = findViewById(R.id.colab_reg);
        colab_reg.setTypeface(AndroFonts.colabReg(this));

        TextView colab_thi = findViewById(R.id.colab_thi);
        colab_thi.setTypeface(AndroFonts.colabThi(this));

        TextView dancing_script_regular = findViewById(R.id.dancing_script_regular);
        dancing_script_regular.setTypeface(AndroFonts.dancingScriptRegular(this));

        TextView droid_sans = findViewById(R.id.droid_sans);
        droid_sans.setTypeface(AndroFonts.droidSans(this));

        TextView droid_sans_bold = findViewById(R.id.droid_sans_bold);
        droid_sans_bold.setTypeface(AndroFonts.droidSansBold(this));

        TextView grand_hotel_regular = findViewById(R.id.grand_hotel_regular);
        grand_hotel_regular.setTypeface(AndroFonts.grandHotelRegular(this));

        TextView great_vibes_regular = findViewById(R.id.great_vibes_regular);
        great_vibes_regular.setTypeface(AndroFonts.greatVibesRegular(this));

        TextView helvetica_neu_bold = findViewById(R.id.helvetica_neu_bold);
        helvetica_neu_bold.setTypeface(AndroFonts.helveticaNeuBold(this));

        TextView helvetica_neue = findViewById(R.id.helvetica_neue);
        helvetica_neue.setTypeface(AndroFonts.helveticaNeue(this));

        TextView helvetica_neue_ight = findViewById(R.id.helvetica_neue_ight);
        helvetica_neue_ight.setTypeface(AndroFonts.helveticaNeueIght(this));

        TextView helvetica_neue_medium = findViewById(R.id.helvetica_neue_medium);
        helvetica_neue_medium.setTypeface(AndroFonts.helveticaNeueMedium(this));

        TextView josefin_sans_bold = findViewById(R.id.josefin_sans_bold);
        josefin_sans_bold.setTypeface(AndroFonts.josefinSansBold(this));

        TextView josefin_sans_bold_italic = findViewById(R.id.josefin_sans_bold_italic);
        josefin_sans_bold_italic.setTypeface(AndroFonts.josefinSansBoldItalic(this));

        TextView josefin_sans_italic = findViewById(R.id.josefin_sans_italic);
        josefin_sans_italic.setTypeface(AndroFonts.josefinSansItalic(this));

        TextView josefin_sans_light = findViewById(R.id.josefin_sans_light);
        josefin_sans_light.setTypeface(AndroFonts.josefinSansLight(this));

        TextView josefin_sans_light_italic = findViewById(R.id.josefin_sans_light_italic);
        josefin_sans_light_italic.setTypeface(AndroFonts.josefinSansLightItalic(this));

        TextView josefin_sans_regular = findViewById(R.id.josefin_sans_regular);
        josefin_sans_regular.setTypeface(AndroFonts.josefinSansRegular(this));

        TextView josefin_sans_semi_bold = findViewById(R.id.josefin_sans_semi_bold);
        josefin_sans_semi_bold.setTypeface(AndroFonts.josefinSansSemiBold(this));

        TextView josefin_sans_semi_bold_italic = findViewById(R.id.josefin_sans_semi_bold_italic);
        josefin_sans_semi_bold_italic.setTypeface(AndroFonts.josefinSansBoldItalic(this));

        TextView josefin_sans_thin = findViewById(R.id.josefin_sans_thin);
        josefin_sans_thin.setTypeface(AndroFonts.josefinSansThin(this));

        TextView josefin_sans_thin_italic = findViewById(R.id.josefin_sans_thin_italic);
        josefin_sans_thin_italic.setTypeface(AndroFonts.josefinSansThinItalic(this));

        TextView kaushan_script_regular = findViewById(R.id.kaushan_script_regular);
        kaushan_script_regular.setTypeface(AndroFonts.kaushanScriptRegular(this));

        TextView lato_medium = findViewById(R.id.lato_medium);
        lato_medium.setTypeface(AndroFonts.latoMedium(this));

        TextView maven_pro_bold = findViewById(R.id.maven_pro_bold);
        maven_pro_bold.setTypeface(AndroFonts.mavenProBold(this));

        TextView maven_pro_medium = findViewById(R.id.maven_pro_medium);
        maven_pro_medium.setTypeface(AndroFonts.mavenProMedium(this));

        TextView maven_pro_regular = findViewById(R.id.maven_pro_regular);
        maven_pro_regular.setTypeface(AndroFonts.mavenProRegular(this));

        TextView open_sans_bold = findViewById(R.id.open_sans_bold);
        open_sans_bold.setTypeface(AndroFonts.openSansBold(this));

        TextView open_sans_extra_bold = findViewById(R.id.open_sans_extra_bold);
        open_sans_extra_bold.setTypeface(AndroFonts.openSansExtraBold(this));

        TextView open_sans_regular = findViewById(R.id.open_sans_regular);
        open_sans_regular.setTypeface(AndroFonts.openSansRegular(this));

        TextView opensans_semibold = findViewById(R.id.opensans_semibold);
        opensans_semibold.setTypeface(AndroFonts.opensansSemibold(this));

        TextView ostrich_regular = findViewById(R.id.ostrich_regular);
        ostrich_regular.setTypeface(AndroFonts.ostrichRegular(this));

        TextView ostrichsans_black = findViewById(R.id.ostrichsans_black);
        ostrichsans_black.setTypeface(AndroFonts.ostrichsansBlack(this));

        TextView ostrichsans_bold = findViewById(R.id.ostrichsans_bold);
        ostrichsans_bold.setTypeface(AndroFonts.ostrichsansBold(this));

        TextView ostrichsansdashed_medium = findViewById(R.id.ostrichsansdashed_medium);
        ostrichsansdashed_medium.setTypeface(AndroFonts.ostrichsansdashedMedium(this));

        TextView ostrichsans_heavy = findViewById(R.id.ostrichsans_heavy);
        ostrichsans_heavy.setTypeface(AndroFonts.ostrichsansHeavy(this));

        TextView ostrichsans_light = findViewById(R.id.ostrichsans_light);
        ostrichsans_light.setTypeface(AndroFonts.ostrichsansLight(this));

        TextView ostrichsans_medium = findViewById(R.id.ostrichsans_medium);
        ostrichsans_medium.setTypeface(AndroFonts.ostrichsansMedium(this));

        TextView ostrichsansrounded_medium = findViewById(R.id.ostrichsansrounded_medium);
        ostrichsansrounded_medium.setTypeface(AndroFonts.ostrichSansRoundedMedium(this));

        TextView playfairdisplay_black = findViewById(R.id.playfairdisplay_black);
        playfairdisplay_black.setTypeface(AndroFonts.playFairDisplayBlack(this));

        TextView playfairdisplay_bold = findViewById(R.id.playfairdisplay_bold);
        playfairdisplay_bold.setTypeface(AndroFonts.playFairDisplayBold(this));

        TextView playfairdisplay_regular = findViewById(R.id.playfairdisplay_regular);
        playfairdisplay_regular.setTypeface(AndroFonts.playFairDisplayRegular(this));

        TextView quicksand_bold = findViewById(R.id.quicksand_bold);
        quicksand_bold.setTypeface(AndroFonts.quicksandBold(this));

        TextView quicksand_bolditalic = findViewById(R.id.quicksand_bolditalic);
        quicksand_bolditalic.setTypeface(AndroFonts.quicksandBoldItalic(this));

        TextView quicksand_dash = findViewById(R.id.quicksand_dash);
        quicksand_dash.setTypeface(AndroFonts.quicksandDash(this));

        TextView quicksand_italic = findViewById(R.id.quicksand_italic);
        quicksand_italic.setTypeface(AndroFonts.quicksandItalic(this));

        TextView quicksand_light = findViewById(R.id.quicksand_light);
        quicksand_light.setTypeface(AndroFonts.quicksandLight(this));

        TextView quicksand_lightitalic = findViewById(R.id.quicksand_lightitalic);
        quicksand_lightitalic.setTypeface(AndroFonts.quicksandLightItalic(this));

        TextView quicksand_regular = findViewById(R.id.quicksand_regular);
        quicksand_regular.setTypeface(AndroFonts.quicksandRegular(this));

        TextView raleway_bold = findViewById(R.id.raleway_bold);
        raleway_bold.setTypeface(AndroFonts.ralewayBold(this));

        TextView roboto_black = findViewById(R.id.roboto_black);
        roboto_black.setTypeface(AndroFonts.robotoBlack(this));

        TextView roboto_bold = findViewById(R.id.roboto_bold);
        roboto_bold.setTypeface(AndroFonts.robotoBold(this));

        TextView roboto_italic = findViewById(R.id.roboto_italic);
        roboto_italic.setTypeface(AndroFonts.robotoItalic(this));

        TextView roboto_light = findViewById(R.id.roboto_light);
        roboto_light.setTypeface(AndroFonts.robotoLight(this));

        TextView roboto_medium = findViewById(R.id.roboto_medium);
        roboto_medium.setTypeface(AndroFonts.robotoMedium(this));

        TextView roboto_regular = findViewById(R.id.roboto_regular);
        roboto_regular.setTypeface(AndroFonts.robotoRegular(this));

        TextView roboto_thin = findViewById(R.id.roboto_thin);
        roboto_thin.setTypeface(AndroFonts.robotoThin(this));

        TextView ubuntu_l = findViewById(R.id.ubuntu_l);
        ubuntu_l.setTypeface(AndroFonts.ubuntu_L(this));

        TextView ubuntu_m = findViewById(R.id.ubuntu_m);
        ubuntu_m.setTypeface(AndroFonts.ubuntu_M(this));

        TextView ubuntu_r = findViewById(R.id.ubuntu_r);
        ubuntu_r.setTypeface(AndroFonts.ubuntu_R(this));

        TextView walkway_black = findViewById(R.id.walkway_black);
        walkway_black.setTypeface(AndroFonts.walkwayBlack(this));

        TextView walkway_bold = findViewById(R.id.walkway_bold);
        walkway_bold.setTypeface(AndroFonts.walkwayBold(this));

        TextView walkway_oblique = findViewById(R.id.walkway_oblique);
        walkway_oblique.setTypeface(AndroFonts.walkwayOblique(this));

        TextView walkway_oblique_black = findViewById(R.id.walkway_oblique_black);
        walkway_oblique_black.setTypeface(AndroFonts.walkwayObliqueBlack(this));

        TextView walkway_oblique_bold = findViewById(R.id.walkway_oblique_bold);
        walkway_oblique_bold.setTypeface(AndroFonts.walkwayObliqueBold(this));

        TextView walkway_oblique_semibold = findViewById(R.id.walkway_oblique_semibold);
        walkway_oblique_semibold.setTypeface(AndroFonts.walkwayObliqueSemibold(this));

        TextView walkway_oblique_ultrabold = findViewById(R.id.walkway_oblique_ultrabold);
        walkway_oblique_ultrabold.setTypeface(AndroFonts.walkwayObliqueUltrabold(this));

        TextView walkway_semibold = findViewById(R.id.walkway_semibold);
        walkway_semibold.setTypeface(AndroFonts.walkwaySemibold(this));

        TextView walkway_ultrabold = findViewById(R.id.walkway_ultrabold);
        walkway_ultrabold.setTypeface(AndroFonts.walkwayUltrabold(this));

    }
}
