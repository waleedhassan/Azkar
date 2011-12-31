package sd.waleed.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CursorAdapter;

public class AzkarActivity extends Activity implements OnClickListener {
	//Cursor model ;
	//ZekerAdapter zekeradapter ;
	Button zkr_adoo,zkr_afterahl,zkr_afterdafn,zkr_aftereating,zkr_afterendbaet,zkr_aftermatar,zkr_aftersalam,
	zkr_afterwdoo,zkr_alaaladoo,zkr_aldayeftosahebaltaam,zkr_alham,zkr_amrsaar,zkr_amrysoroh,zkr_arafa,	zkr_atahmaysrawyakrah,
	zkr_azan,zkr_baenalymanwalaswd,	zkr_bakooratalthmr,	zkr_beforeating,	zkr_beforewdoo,	zkr_betweensgdteen,	zkr_doaaaftertshahood,	zkr_doaamaeetinsalaa,
	zkr_doaatomngalgafr,	zkr_efshaaalsalam,	zkr_eftaralsayeem,	zkr_egmadalmaeet,	zkr_endalfaza,	zkr_enteralkhlaa,
	zkr_entergarya,	zkr_enterhome,	zkr_entermosque,	zkr_entersoog,	zkr_esmafromdgal,	zkr_estegazfromsleeping,	zkr_estesgaa,
	zkr_esteshaa,
	zkr_estgfaarwtawba,
	zkr_estkhara,
	zkr_estsabamr,
	zkr_etas,
	zkr_exithome,
	zkr_exitkhlaa,
	zkr_exitmosque,
	zkr_eyadatalmreed,
	zkr_ezaataalrokn,
	zkr_fadlalslaaalalnaby,
	zkr_fadleydatalmreed,
	zkr_fartinsalat,
	zkr_fazaainnoom,
	zkr_fdlaltsbeeh,
	zkr_forlebnewthawb,
	zkr_formotazweg,
	zkr_forsagaho,
	zkr_fromrkoo,
	zkr_gadab,
	zkr_gdaaaldaeen,
	zkr_gnootalweter,
	zkr_gomosque,
	zkr_helal,
	zkr_holm,
	zkr_howalnabyyosabeh,
	zkr_inmagles,
	zkr_karab,
	zkr_kfaratalmjles,
	zkr_khaffromsoltan,
	zkr_khafgawman,
	zkr_khawfmnalshrk,
	zkr_krahetaltyara,
	zkr_lebsalthawb,
	zkr_lmnsbbtho,
	zkr_maarooftoyou,
	zkr_maeetingaber,
	zkr_malayrdaho,
	zkr_masharharam,
	zkr_mater,
	zkr_mawlood,
	zkr_mdhmoslem,
	zkr_mnagradendalgdaa,
	zkr_mnaznab,
	zkr_mngalbarkallahfeek,
	zkr_mogeentomosafer,
	zkr_mohtader,
	zkr_mosaferezaashr,
	zkr_mosafertomogeem,
	zkr_moseeba,
	zkr_motazwegtoself,
	zkr_mreedyaesmnhyateh,
	zkr_nebahalkelab,
	zkr_newthawb,
	zkr_nightly,
	zkr_nzlfesafar,
	zkr_opening,
	zkr_raad,
	zkr_ramyaljamra,
	zkr_rdmrdatalshyateen,
	zkr_rdsalamtokafer,
	zkr_reeh,
	zkr_rgoomnalsfr,
	zkr_rkoo,
	zkr_rkoobaldaba,
	zkr_sabahmasaa,
	zkr_safar,
	zkr_salamfromweter,
	zkr_sayemsabho,
	zkr_sayenmafatar,
	zkr_sgood,
	zkr_sgoodtelawa,
	zkr_shakfealeman,
	zkr_slaaalaalnaby,
	zkr_sleep,
	zkr_syahaldeek,
	zkr_taeesalmrkoob,
	zkr_tardalshetaan,
	zkr_tazya,
	zkr_tkbeerinsafar,
	zkr_tokaferetas,
	zkr_tomnaradmalho,
	zkr_tomngalohebk,
	zkr_tshahood,
	zkr_typesofalkhair,
	zkr_wagaa,
	zkr_waswasainsalaa,
	zkr_wgoofinsafaawmarwa,
	zkr_whenputalthawb,
	zkr_whoseemobtla,
	zkr_yawazbhealawlad,
	zkr_yolbyalmohrem,
	zkr_yoseebbayneh,
	zkr_zabh,
	zkr_zeyartalgboor,
	zkr_zokymoslem;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        zkr_adoo = (Button)findViewById(R.id.zkr_adoo);
        zkr_afterahl  = (Button)findViewById(R.id.zkr_afterahl);
        zkr_afterdafn = (Button)findViewById(R.id.zkr_afterdafn);
        zkr_aftereating = (Button)findViewById(R.id.zkr_aftereating);
        zkr_afterendbaet = (Button)findViewById(R.id.zkr_afterendbaet);
        zkr_aftermatar = (Button)findViewById(R.id.zkr_aftermatar);
        zkr_aftersalam = (Button)findViewById(R.id.zkr_aftersalam);
        zkr_afterwdoo = (Button)findViewById(R.id.zkr_afterwdoo);
        zkr_alaaladoo = (Button)findViewById(R.id.zkr_alaaladoo);
        zkr_aldayeftosahebaltaam = (Button)findViewById(R.id.zkr_aldayeftosahebaltaam);
        zkr_alham = (Button)findViewById(R.id.zkr_alham);
        zkr_amrsaar = (Button)findViewById(R.id.zkr_amrsaar);
        zkr_amrysoroh = (Button)findViewById(R.id.zkr_amrysoroh);
        zkr_arafa = (Button)findViewById(R.id.zkr_arafa);
        zkr_atahmaysrawyakrah = (Button)findViewById(R.id.zkr_atahmaysrawyakrah);
        zkr_azan = (Button)findViewById(R.id.zkr_azan);
        zkr_baenalymanwalaswd = (Button)findViewById(R.id.zkr_baenalymanwalaswd);
        zkr_bakooratalthmr = (Button)findViewById(R.id.zkr_bakooratalthmr);
        zkr_beforeating = (Button)findViewById(R.id.zkr_beforeating);
        zkr_beforewdoo = (Button)findViewById(R.id.zkr_beforewdoo);
        zkr_betweensgdteen = (Button)findViewById(R.id.zkr_betweensgdteen);
        zkr_doaaaftertshahood = (Button)findViewById(R.id.zkr_doaaaftertshahood);
        zkr_doaamaeetinsalaa = (Button)findViewById(R.id.zkr_doaamaeetinsalaa);
        zkr_doaatomngalgafr = (Button)findViewById(R.id.zkr_doaatomngalgafr);
        zkr_efshaaalsalam = (Button)findViewById(R.id.zkr_efshaaalsalam);
        zkr_eftaralsayeem = (Button)findViewById(R.id.zkr_eftaralsayeem);
        zkr_egmadalmaeet = (Button)findViewById(R.id.zkr_egmadalmaeet);
        zkr_endalfaza = (Button)findViewById(R.id.zkr_endalfaza);
        zkr_enteralkhlaa = (Button)findViewById(R.id.zkr_enteralkhlaa);
        zkr_entergarya = (Button)findViewById(R.id.zkr_entergarya);
        zkr_enterhome = (Button)findViewById(R.id.zkr_enterhome);
        zkr_entermosque = (Button)findViewById(R.id.zkr_entermosque);
        zkr_entersoog = (Button)findViewById(R.id.zkr_entersoog);
        zkr_esmafromdgal = (Button)findViewById(R.id.zkr_esmafromdgal);
        zkr_estegazfromsleeping = (Button)findViewById(R.id.zkr_estegazfromsleeping);
        zkr_estesgaa = (Button)findViewById(R.id.zkr_estesgaa);
        zkr_esteshaa = (Button)findViewById(R.id.zkr_esteshaa);
        zkr_estgfaarwtawba = (Button)findViewById(R.id.zkr_estgfaarwtawba);
        zkr_estkhara = (Button)findViewById(R.id.zkr_estkhara);
        zkr_estsabamr = (Button)findViewById(R.id.zkr_estsabamr);
        zkr_etas = (Button)findViewById(R.id.zkr_etas);
        zkr_exithome = (Button)findViewById(R.id.zkr_exithome);
        zkr_exitkhlaa = (Button)findViewById(R.id.zkr_exitkhlaa);
        zkr_exitmosque = (Button)findViewById(R.id.zkr_exitmosque);
        zkr_eyadatalmreed = (Button)findViewById(R.id.zkr_eyadatalmreed);
        zkr_ezaataalrokn = (Button)findViewById(R.id.zkr_ezaataalrokn);
        zkr_fadlalslaaalalnaby = (Button)findViewById(R.id.zkr_fadlalslaaalalnaby);
        zkr_fadleydatalmreed = (Button)findViewById(R.id.zkr_fadleydatalmreed);
        zkr_fartinsalat = (Button)findViewById(R.id.zkr_fartinsalat);
        zkr_fazaainnoom = (Button)findViewById(R.id.zkr_fazaainnoom);
        zkr_fdlaltsbeeh = (Button)findViewById(R.id.zkr_fdlaltsbeeh);
        zkr_forlebnewthawb = (Button)findViewById(R.id.zkr_forlebnewthawb);
        zkr_formotazweg = (Button)findViewById(R.id.zkr_formotazweg);
        zkr_forsagaho = (Button)findViewById(R.id.zkr_forsagaho);
        zkr_fromrkoo = (Button)findViewById(R.id.zkr_fromrkoo);
        zkr_gadab = (Button)findViewById(R.id.zkr_gadab);
        zkr_gdaaaldaeen = (Button)findViewById(R.id.zkr_gdaaaldaeen);
        zkr_gnootalweter = (Button)findViewById(R.id.zkr_gnootalweter);
        zkr_gomosque = (Button)findViewById(R.id.zkr_gomosque);
        zkr_helal = (Button)findViewById(R.id.zkr_helal);
        zkr_holm = (Button)findViewById(R.id.zkr_holm);
        zkr_howalnabyyosabeh = (Button)findViewById(R.id.zkr_howalnabyyosabeh);
        zkr_inmagles = (Button)findViewById(R.id.zkr_inmagles);
        zkr_karab = (Button)findViewById(R.id.zkr_karab);
        zkr_kfaratalmjles = (Button)findViewById(R.id.zkr_kfaratalmjles);
        zkr_khaffromsoltan = (Button)findViewById(R.id.zkr_khaffromsoltan);
        zkr_khafgawman = (Button)findViewById(R.id.zkr_khafgawman);
        zkr_khawfmnalshrk = (Button)findViewById(R.id.zkr_khawfmnalshrk);
        zkr_krahetaltyara = (Button)findViewById(R.id.zkr_krahetaltyara);
        zkr_lebsalthawb = (Button)findViewById(R.id.zkr_lebsalthawb);
        zkr_lmnsbbtho = (Button)findViewById(R.id.zkr_lmnsbbtho);
        zkr_maarooftoyou = (Button)findViewById(R.id.zkr_maarooftoyou);
        zkr_maeetingaber = (Button)findViewById(R.id.zkr_maeetingaber);
        zkr_malayrdaho = (Button)findViewById(R.id.zkr_malayrdaho);
        zkr_masharharam = (Button)findViewById(R.id.zkr_masharharam);
        zkr_mater = (Button)findViewById(R.id.zkr_mater);
        zkr_mawlood = (Button)findViewById(R.id.zkr_mawlood);
        zkr_mdhmoslem = (Button)findViewById(R.id.zkr_mdhmoslem);
        zkr_mnagradendalgdaa = (Button)findViewById(R.id.zkr_mnagradendalgdaa);
        zkr_mnaznab = (Button)findViewById(R.id.zkr_mnaznab);
        zkr_mngalbarkallahfeek = (Button)findViewById(R.id.zkr_mngalbarkallahfeek);
        zkr_mogeentomosafer = (Button)findViewById(R.id.zkr_mogeentomosafer);
        zkr_mohtader = (Button)findViewById(R.id.zkr_mohtader);
        zkr_mosaferezaashr = (Button)findViewById(R.id.zkr_mosaferezaashr);
        zkr_mosafertomogeem = (Button)findViewById(R.id.zkr_mosafertomogeem);
        zkr_moseeba = (Button)findViewById(R.id.zkr_moseeba);
        zkr_motazwegtoself = (Button)findViewById(R.id.zkr_motazwegtoself);
        zkr_mreedyaesmnhyateh = (Button)findViewById(R.id.zkr_mreedyaesmnhyateh);
        zkr_nebahalkelab = (Button)findViewById(R.id.zkr_nebahalkelab);
        zkr_newthawb = (Button)findViewById(R.id.zkr_newthawb);
        zkr_nightly = (Button)findViewById(R.id.zkr_nightly);
        zkr_nzlfesafar = (Button)findViewById(R.id.zkr_nzlfesafar);
        zkr_opening = (Button)findViewById(R.id.zkr_opening);
        zkr_raad = (Button)findViewById(R.id.zkr_raad);
        zkr_ramyaljamra = (Button)findViewById(R.id.zkr_ramyaljamra);
        zkr_rdmrdatalshyateen = (Button)findViewById(R.id.zkr_rdmrdatalshyateen);
        zkr_rdsalamtokafer = (Button)findViewById(R.id.zkr_rdsalamtokafer);
        zkr_reeh = (Button)findViewById(R.id.zkr_reeh);
        zkr_rgoomnalsfr = (Button)findViewById(R.id.zkr_rgoomnalsfr);
        zkr_rkoo = (Button)findViewById(R.id.zkr_rkoo);
        zkr_rkoobaldaba = (Button)findViewById(R.id.zkr_rkoobaldaba);
        zkr_sabahmasaa = (Button)findViewById(R.id.zkr_sabahmasaa);
        zkr_safar = (Button)findViewById(R.id.zkr_safar);
        zkr_salamfromweter = (Button)findViewById(R.id.zkr_salamfromweter);
        zkr_sayemsabho = (Button)findViewById(R.id.zkr_sayemsabho);
        zkr_sayenmafatar = (Button)findViewById(R.id.zkr_sayenmafatar);
        zkr_sgood = (Button)findViewById(R.id.zkr_sgood);
        zkr_sgoodtelawa = (Button)findViewById(R.id.zkr_sgoodtelawa);
        zkr_shakfealeman = (Button)findViewById(R.id.zkr_shakfealeman);
        zkr_slaaalaalnaby = (Button)findViewById(R.id.zkr_slaaalaalnaby);
        zkr_sleep = (Button)findViewById(R.id.zkr_sleep);
        zkr_syahaldeek = (Button)findViewById(R.id.zkr_syahaldeek);
        zkr_taeesalmrkoob = (Button)findViewById(R.id.zkr_taeesalmrkoob);
        zkr_tardalshetaan = (Button)findViewById(R.id.zkr_tardalshetaan);
        zkr_tazya = (Button)findViewById(R.id.zkr_tazya);
        zkr_tkbeerinsafar = (Button)findViewById(R.id.zkr_tkbeerinsafar);
        zkr_tokaferetas = (Button)findViewById(R.id.zkr_tokaferetas);
        zkr_tomnaradmalho = (Button)findViewById(R.id.zkr_tomnaradmalho);
        zkr_tomngalohebk = (Button)findViewById(R.id.zkr_tomngalohebk);
        zkr_tshahood = (Button)findViewById(R.id.zkr_tshahood);
        zkr_typesofalkhair = (Button)findViewById(R.id.zkr_typesofalkhair);
        zkr_wagaa = (Button)findViewById(R.id.zkr_wagaa);
        zkr_waswasainsalaa = (Button)findViewById(R.id.zkr_waswasainsalaa);
        zkr_wgoofinsafaawmarwa = (Button)findViewById(R.id.zkr_wgoofinsafaawmarwa);
        zkr_whenputalthawb = (Button)findViewById(R.id.zkr_whenputalthawb);
        zkr_whoseemobtla = (Button)findViewById(R.id.zkr_whoseemobtla);
        zkr_yawazbhealawlad = (Button)findViewById(R.id.zkr_yawazbhealawlad);
        zkr_yolbyalmohrem = (Button)findViewById(R.id.zkr_yolbyalmohrem);
        zkr_yoseebbayneh = (Button)findViewById(R.id.zkr_yoseebbayneh);
        zkr_zabh = (Button)findViewById(R.id.zkr_zabh);
        zkr_zeyartalgboor = (Button)findViewById(R.id.zkr_zeyartalgboor);
        zkr_zokymoslem = (Button)findViewById(R.id.zkr_zokymoslem);
        
        zkr_adoo.setOnClickListener(this);
        zkr_afterahl.setOnClickListener(this);
        zkr_afterdafn.setOnClickListener(this);
        zkr_aftereating.setOnClickListener(this);
        zkr_afterendbaet.setOnClickListener(this);
        zkr_aftermatar.setOnClickListener(this);
        zkr_aftersalam.setOnClickListener(this);
        zkr_afterwdoo.setOnClickListener(this);
        zkr_alaaladoo.setOnClickListener(this);
        zkr_aldayeftosahebaltaam.setOnClickListener(this);
        zkr_alham.setOnClickListener(this);
        zkr_amrsaar.setOnClickListener(this);
        zkr_amrysoroh.setOnClickListener(this);
        zkr_arafa.setOnClickListener(this);
        zkr_atahmaysrawyakrah.setOnClickListener(this);
        zkr_azan.setOnClickListener(this);
        zkr_baenalymanwalaswd.setOnClickListener(this);
        zkr_bakooratalthmr.setOnClickListener(this);
        zkr_beforeating.setOnClickListener(this);
        zkr_beforewdoo.setOnClickListener(this);
        zkr_betweensgdteen.setOnClickListener(this);
        zkr_doaaaftertshahood.setOnClickListener(this);
        zkr_doaamaeetinsalaa.setOnClickListener(this);
        zkr_doaatomngalgafr.setOnClickListener(this);
        zkr_efshaaalsalam.setOnClickListener(this);
        zkr_eftaralsayeem.setOnClickListener(this);
        zkr_egmadalmaeet.setOnClickListener(this);
        zkr_endalfaza.setOnClickListener(this);
        zkr_enteralkhlaa.setOnClickListener(this);
        zkr_entergarya.setOnClickListener(this);
        zkr_enterhome.setOnClickListener(this);
        zkr_entermosque.setOnClickListener(this);
        zkr_entersoog.setOnClickListener(this);
        zkr_esmafromdgal.setOnClickListener(this);
        zkr_estegazfromsleeping.setOnClickListener(this);
        zkr_estesgaa.setOnClickListener(this);
        zkr_esteshaa.setOnClickListener(this);
        zkr_estgfaarwtawba.setOnClickListener(this);
        zkr_estkhara.setOnClickListener(this);
        zkr_estsabamr.setOnClickListener(this);
        zkr_etas.setOnClickListener(this);
        zkr_exithome.setOnClickListener(this);
        zkr_exitkhlaa.setOnClickListener(this);
        zkr_exitmosque.setOnClickListener(this);
        zkr_eyadatalmreed.setOnClickListener(this);
        zkr_ezaataalrokn.setOnClickListener(this);
        zkr_fadlalslaaalalnaby.setOnClickListener(this);
        zkr_fadleydatalmreed.setOnClickListener(this);
        zkr_fartinsalat.setOnClickListener(this);
        zkr_fazaainnoom.setOnClickListener(this);
        zkr_fdlaltsbeeh.setOnClickListener(this);
        zkr_forlebnewthawb.setOnClickListener(this);
        zkr_formotazweg.setOnClickListener(this);
        zkr_forsagaho.setOnClickListener(this);
        zkr_fromrkoo.setOnClickListener(this);
        zkr_gadab.setOnClickListener(this);
        zkr_gdaaaldaeen.setOnClickListener(this);
        zkr_gnootalweter.setOnClickListener(this);
        zkr_gomosque.setOnClickListener(this);
        zkr_helal.setOnClickListener(this);
        zkr_holm.setOnClickListener(this);
        zkr_howalnabyyosabeh.setOnClickListener(this);
        zkr_inmagles.setOnClickListener(this);
        zkr_karab.setOnClickListener(this);
        zkr_kfaratalmjles.setOnClickListener(this);
        zkr_khaffromsoltan.setOnClickListener(this);
        zkr_khafgawman.setOnClickListener(this);
        zkr_khawfmnalshrk.setOnClickListener(this);
        zkr_krahetaltyara.setOnClickListener(this);
        zkr_lebsalthawb.setOnClickListener(this);
        zkr_lmnsbbtho.setOnClickListener(this);
        zkr_maarooftoyou.setOnClickListener(this);
        zkr_maeetingaber.setOnClickListener(this);
        zkr_malayrdaho.setOnClickListener(this);
        zkr_masharharam.setOnClickListener(this);
        zkr_mater.setOnClickListener(this);
        zkr_mawlood.setOnClickListener(this);
        zkr_mdhmoslem.setOnClickListener(this);
        zkr_mnagradendalgdaa.setOnClickListener(this);
        zkr_mnaznab.setOnClickListener(this);
        zkr_mngalbarkallahfeek.setOnClickListener(this);
        zkr_mogeentomosafer.setOnClickListener(this);
        zkr_mohtader.setOnClickListener(this);
        zkr_mosaferezaashr.setOnClickListener(this);
        zkr_mosafertomogeem.setOnClickListener(this);
        zkr_moseeba.setOnClickListener(this);
        zkr_motazwegtoself.setOnClickListener(this);
        zkr_mreedyaesmnhyateh.setOnClickListener(this);
        zkr_nebahalkelab.setOnClickListener(this);
        zkr_newthawb.setOnClickListener(this);
        zkr_nightly.setOnClickListener(this);
        zkr_nzlfesafar.setOnClickListener(this);
        zkr_opening.setOnClickListener(this);
        zkr_raad.setOnClickListener(this);
        zkr_ramyaljamra.setOnClickListener(this);
        zkr_rdmrdatalshyateen.setOnClickListener(this);
        zkr_rdsalamtokafer.setOnClickListener(this);
        zkr_reeh.setOnClickListener(this);
        zkr_rgoomnalsfr.setOnClickListener(this);
        zkr_rkoo.setOnClickListener(this);
        zkr_rkoobaldaba.setOnClickListener(this);
        zkr_sabahmasaa.setOnClickListener(this);
        zkr_safar.setOnClickListener(this);
        zkr_salamfromweter.setOnClickListener(this);
        zkr_sayemsabho.setOnClickListener(this);
        zkr_sayenmafatar.setOnClickListener(this);
        zkr_sgood.setOnClickListener(this);
        zkr_sgoodtelawa.setOnClickListener(this);
        zkr_shakfealeman.setOnClickListener(this);
        zkr_slaaalaalnaby.setOnClickListener(this);
        zkr_sleep.setOnClickListener(this);
        zkr_syahaldeek.setOnClickListener(this);
        zkr_taeesalmrkoob.setOnClickListener(this);
        zkr_tardalshetaan.setOnClickListener(this);
        zkr_tazya.setOnClickListener(this);
        zkr_tkbeerinsafar.setOnClickListener(this);
        zkr_tokaferetas.setOnClickListener(this);
        zkr_tomnaradmalho.setOnClickListener(this);
        zkr_tomngalohebk.setOnClickListener(this);
        zkr_tshahood.setOnClickListener(this);
        zkr_typesofalkhair.setOnClickListener(this);
        zkr_wagaa.setOnClickListener(this);
        zkr_waswasainsalaa.setOnClickListener(this);
        zkr_wgoofinsafaawmarwa.setOnClickListener(this);
        zkr_whenputalthawb.setOnClickListener(this);
        zkr_whoseemobtla.setOnClickListener(this);
        zkr_yawazbhealawlad.setOnClickListener(this);
        zkr_yolbyalmohrem.setOnClickListener(this);
        zkr_yoseebbayneh.setOnClickListener(this);
        zkr_zabh.setOnClickListener(this);
        zkr_zeyartalgboor.setOnClickListener(this);
        zkr_zokymoslem.setOnClickListener(this);
    }
    
@Override
public void onClick(View arg0) {
	// TODO Auto-generated method stub	
	Intent i = new Intent(AzkarActivity.this,ZekerScreen.class);
	Button b = (Button)findViewById(arg0.getId());
	i.putExtra("title", b.getText().toString());
	switch (arg0.getId()) {
	case R.id.zkr_adoo:
        i.putExtra("zeker_title", "adoo");
        break;
	case R.id.zkr_afterahl:
        i.putExtra("zeker_title", "afterahl");
        break;
	case R.id.zkr_afterdafn:
        i.putExtra("zeker_title", "afterdafn");
        break;
	case R.id.zkr_aftereating:
        i.putExtra("zeker_title", "aftereating");
        break;
	case R.id.zkr_afterendbaet:
        i.putExtra("zeker_title", "afterendbaet");
        break;
	case R.id.zkr_aftermatar:
        i.putExtra("zeker_title", "aftermatar");
        break;
	case R.id.zkr_aftersalam:
        i.putExtra("zeker_title", "aftersalam");
        break;
	case R.id.zkr_afterwdoo:
        i.putExtra("zeker_title", "afterwdoo");
        break;
	case R.id.zkr_alaaladoo:
        i.putExtra("zeker_title", "alaaladoo");
        break;
	case R.id.zkr_aldayeftosahebaltaam:
        i.putExtra("zeker_title", "aldayeftosahebaltaam");
        break;
	case R.id.zkr_alham:
        i.putExtra("zeker_title", "alham");
        break;
	case R.id.zkr_amrsaar:
        i.putExtra("zeker_title", "amrsaar");
        break;
	case R.id.zkr_amrysoroh:
        i.putExtra("zeker_title", "amrysoroh");
        break;
	case R.id.zkr_arafa:
        i.putExtra("zeker_title", "arafa");
        break;
	case R.id.zkr_atahmaysrawyakrah:
        i.putExtra("zeker_title", "atahmaysrawyakrah");
        break;
	case R.id.zkr_azan:
        i.putExtra("zeker_title", "azan");
        break;
	case R.id.zkr_baenalymanwalaswd:
        i.putExtra("zeker_title", "baenalymanwalaswd");
        break;
	case R.id.zkr_bakooratalthmr:
        i.putExtra("zeker_title", "bakooratalthmr");
        break;
	case R.id.zkr_beforeating:
        i.putExtra("zeker_title", "beforeating");
        break;
	case R.id.zkr_beforewdoo:
        i.putExtra("zeker_title", "beforewdoo");
        break;
	case R.id.zkr_betweensgdteen:
        i.putExtra("zeker_title", "betweensgdteen");
        break;
	case R.id.zkr_doaaaftertshahood:
        i.putExtra("zeker_title", "doaaaftertshahood");
        break;
	case R.id.zkr_doaamaeetinsalaa:
        i.putExtra("zeker_title", "doaamaeetinsalaa");
        break;
	case R.id.zkr_doaatomngalgafr:
        i.putExtra("zeker_title", "doaatomngalgafr");
        break;
	case R.id.zkr_efshaaalsalam:
        i.putExtra("zeker_title", "efshaaalsalam");
        break;
	case R.id.zkr_eftaralsayeem:
        i.putExtra("zeker_title", "eftaralsayeem");
        break;
	case R.id.zkr_egmadalmaeet:
        i.putExtra("zeker_title", "egmadalmaeet");
        break;
	case R.id.zkr_endalfaza:
        i.putExtra("zeker_title", "endalfaza");
        break;
	case R.id.zkr_enteralkhlaa:
        i.putExtra("zeker_title", "enteralkhlaa");
        break;
	case R.id.zkr_entergarya:
        i.putExtra("zeker_title", "entergarya");
        break;
	case R.id.zkr_enterhome:
        i.putExtra("zeker_title", "enterhome");
        break;
	case R.id.zkr_entermosque:
        i.putExtra("zeker_title", "entermosque");
        break;
	case R.id.zkr_entersoog:
        i.putExtra("zeker_title", "entersoog");
        break;
	case R.id.zkr_esmafromdgal:
        i.putExtra("zeker_title", "esmafromdgal");
        break;
	case R.id.zkr_estegazfromsleeping:
        i.putExtra("zeker_title", "estegazfromsleeping");
        break;
	case R.id.zkr_estesgaa:
        i.putExtra("zeker_title", "estesgaa");
        break;
	case R.id.zkr_esteshaa:
        i.putExtra("zeker_title", "esteshaa");
        break;
	case R.id.zkr_estgfaarwtawba:
        i.putExtra("zeker_title", "estgfaarwtawba");
        break;
	case R.id.zkr_estkhara:
        i.putExtra("zeker_title", "estkhara");
        break;
	case R.id.zkr_estsabamr:
        i.putExtra("zeker_title", "estsabamr");
        break;
	case R.id.zkr_etas:
        i.putExtra("zeker_title", "etas");
        break;
	case R.id.zkr_exithome:
        i.putExtra("zeker_title", "exithome");
        break;
	case R.id.zkr_exitkhlaa:
        i.putExtra("zeker_title", "exitkhlaa");
        break;
	case R.id.zkr_exitmosque:
        i.putExtra("zeker_title", "exitmosque");
        break;
	case R.id.zkr_eyadatalmreed:
        i.putExtra("zeker_title", "eyadatalmreed");
        break;
	case R.id.zkr_ezaataalrokn:
        i.putExtra("zeker_title", "ezaataalrokn");
        break;
	case R.id.zkr_fadlalslaaalalnaby:
        i.putExtra("zeker_title", "fadlalslaaalalnaby");
        break;
	case R.id.zkr_fadleydatalmreed:
        i.putExtra("zeker_title", "fadleydatalmreed");
        break;
	case R.id.zkr_fartinsalat:
        i.putExtra("zeker_title", "fartinsalat");
        break;
	case R.id.zkr_fazaainnoom:
        i.putExtra("zeker_title", "fazaainnoom");
        break;
	case R.id.zkr_fdlaltsbeeh:
        i.putExtra("zeker_title", "fdlaltsbeeh");
        break;
	case R.id.zkr_forlebnewthawb:
        i.putExtra("zeker_title", "forlebnewthawb");
        break;
	case R.id.zkr_formotazweg:
        i.putExtra("zeker_title", "formotazweg");
        break;
	case R.id.zkr_forsagaho:
        i.putExtra("zeker_title", "forsagaho");
        break;
	case R.id.zkr_fromrkoo:
        i.putExtra("zeker_title", "fromrkoo");
        break;
	case R.id.zkr_gadab:
        i.putExtra("zeker_title", "gadab");
        break;
	case R.id.zkr_gdaaaldaeen:
        i.putExtra("zeker_title", "gdaaaldaeen");
        break;
	case R.id.zkr_gnootalweter:
        i.putExtra("zeker_title", "gnootalweter");
        break;
	case R.id.zkr_gomosque:
        i.putExtra("zeker_title", "gomosque");
        break;
	case R.id.zkr_helal:
        i.putExtra("zeker_title", "helal");
        break;
	case R.id.zkr_holm:
        i.putExtra("zeker_title", "holm");
        break;
	case R.id.zkr_howalnabyyosabeh:
        i.putExtra("zeker_title", "howalnabyyosabeh");
        break;
	case R.id.zkr_inmagles:
        i.putExtra("zeker_title", "inmagles");
        break;
	case R.id.zkr_karab:
        i.putExtra("zeker_title", "karab");
        break;
	case R.id.zkr_kfaratalmjles:
        i.putExtra("zeker_title", "kfaratalmjles");
        break;
	case R.id.zkr_khaffromsoltan:
        i.putExtra("zeker_title", "khaffromsoltan");
        break;
	case R.id.zkr_khafgawman:
        i.putExtra("zeker_title", "khafgawman");
        break;
	case R.id.zkr_khawfmnalshrk:
        i.putExtra("zeker_title", "khawfmnalshrk");
        break;
	case R.id.zkr_krahetaltyara:
        i.putExtra("zeker_title", "krahetaltyara");
        break;
	case R.id.zkr_lebsalthawb:
        i.putExtra("zeker_title", "lebsalthawb");
        break;
	case R.id.zkr_lmnsbbtho:
        i.putExtra("zeker_title", "lmnsbbtho");
        break;
	case R.id.zkr_maarooftoyou:
        i.putExtra("zeker_title", "maarooftoyou");
        break;
	case R.id.zkr_maeetingaber:
        i.putExtra("zeker_title", "maeetingaber");
        break;
	case R.id.zkr_malayrdaho:
        i.putExtra("zeker_title", "malayrdaho");
        break;
	case R.id.zkr_masharharam:
        i.putExtra("zeker_title", "masharharam");
        break;
	case R.id.zkr_mater:
        i.putExtra("zeker_title", "mater");
        break;
	case R.id.zkr_mawlood:
        i.putExtra("zeker_title", "mawlood");
        break;
	case R.id.zkr_mdhmoslem:
        i.putExtra("zeker_title", "mdhmoslem");
        break;
	case R.id.zkr_mnagradendalgdaa:
        i.putExtra("zeker_title", "mnagradendalgdaa");
        break;
	case R.id.zkr_mnaznab:
        i.putExtra("zeker_title", "mnaznab");
        break;
	case R.id.zkr_mngalbarkallahfeek:
        i.putExtra("zeker_title", "mngalbarkallahfeek");
        break;
	case R.id.zkr_mogeentomosafer:
        i.putExtra("zeker_title", "mogeentomosafer");
        break;
	case R.id.zkr_mohtader:
        i.putExtra("zeker_title", "mohtader");
        break;
	case R.id.zkr_mosaferezaashr:
        i.putExtra("zeker_title", "mosaferezaashr");
        break;
	case R.id.zkr_mosafertomogeem:
        i.putExtra("zeker_title", "mosafertomogeem");
        break;
	case R.id.zkr_moseeba:
        i.putExtra("zeker_title", "moseeba");
        break;
	case R.id.zkr_motazwegtoself:
        i.putExtra("zeker_title", "motazwegtoself");
        break;
	case R.id.zkr_mreedyaesmnhyateh:
        i.putExtra("zeker_title", "mreedyaesmnhyateh");
        break;
	case R.id.zkr_nebahalkelab:
        i.putExtra("zeker_title", "nebahalkelab");
        break;
	case R.id.zkr_newthawb:
        i.putExtra("zeker_title", "newthawb");
        break;
	case R.id.zkr_nightly:
        i.putExtra("zeker_title", "nightly");
        break;
	case R.id.zkr_nzlfesafar:
        i.putExtra("zeker_title", "nzlfesafar");
        break;
	case R.id.zkr_opening:
        i.putExtra("zeker_title", "opening");
        break;
	case R.id.zkr_raad:
        i.putExtra("zeker_title", "raad");
        break;
	case R.id.zkr_ramyaljamra:
        i.putExtra("zeker_title", "ramyaljamra");
        break;
	case R.id.zkr_rdmrdatalshyateen:
        i.putExtra("zeker_title", "rdmrdatalshyateen");
        break;
	case R.id.zkr_rdsalamtokafer:
        i.putExtra("zeker_title", "rdsalamtokafer");
        break;
	case R.id.zkr_reeh:
        i.putExtra("zeker_title", "reeh");
        break;
	case R.id.zkr_rgoomnalsfr:
        i.putExtra("zeker_title", "rgoomnalsfr");
        break;
	case R.id.zkr_rkoo:
        i.putExtra("zeker_title", "rkoo");
        break;
	case R.id.zkr_rkoobaldaba:
        i.putExtra("zeker_title", "rkoobaldaba");
        break;
	case R.id.zkr_sabahmasaa:
        i.putExtra("zeker_title", "sabahmasaa");
        break;
	case R.id.zkr_safar:
        i.putExtra("zeker_title", "safar");
        break;
	case R.id.zkr_salamfromweter:
        i.putExtra("zeker_title", "salamfromweter");
        break;
	case R.id.zkr_sayemsabho:
        i.putExtra("zeker_title", "sayemsabho");
        break;
	case R.id.zkr_sayenmafatar:
        i.putExtra("zeker_title", "sayenmafatar");
        break;
	case R.id.zkr_sgood:
        i.putExtra("zeker_title", "sgood");
        break;
	case R.id.zkr_sgoodtelawa:
        i.putExtra("zeker_title", "sgoodtelawa");
        break;
	case R.id.zkr_shakfealeman:
        i.putExtra("zeker_title", "shakfealeman");
        break;
	case R.id.zkr_slaaalaalnaby:
        i.putExtra("zeker_title", "slaaalaalnaby");
        break;
	case R.id.zkr_sleep:
        i.putExtra("zeker_title", "sleep");
        break;
	case R.id.zkr_syahaldeek:
        i.putExtra("zeker_title", "syahaldeek");
        break;
	case R.id.zkr_taeesalmrkoob:
        i.putExtra("zeker_title", "taeesalmrkoob");
        break;
	case R.id.zkr_tardalshetaan:
        i.putExtra("zeker_title", "tardalshetaan");
        break;
	case R.id.zkr_tazya:
        i.putExtra("zeker_title", "tazya");
        break;
	case R.id.zkr_tkbeerinsafar:
        i.putExtra("zeker_title", "tkbeerinsafar");
        break;
	case R.id.zkr_tokaferetas:
        i.putExtra("zeker_title", "");
        break;
	case R.id.zkr_tomnaradmalho:
        i.putExtra("zeker_title", "tomnaradmalho");
        break;
	case R.id.zkr_tomngalohebk:
        i.putExtra("zeker_title", "tomngalohebk");
        break;
	case R.id.zkr_tshahood:
        i.putExtra("zeker_title", "tshahood");
        break;
	case R.id.zkr_typesofalkhair:
        i.putExtra("zeker_title", "typesofalkhair");
        break;
	case R.id.zkr_wagaa:
        i.putExtra("zeker_title", "wagaa");
        break;
	case R.id.zkr_waswasainsalaa:
        i.putExtra("zeker_title", "waswasainsalaa");
        break;
	case R.id.zkr_wgoofinsafaawmarwa:
        i.putExtra("zeker_title", "wgoofinsafaawmarwa");
        break;
	case R.id.zkr_whenputalthawb:
        i.putExtra("zeker_title", "whenputalthawb");
        break;
	case R.id.zkr_whoseemobtla:
        i.putExtra("zeker_title", "whoseemobtla");
        break;
	case R.id.zkr_yawazbhealawlad:
        i.putExtra("zeker_title", "yawazbhealawlad");
        break;
	case R.id.zkr_yolbyalmohrem:
        i.putExtra("zeker_title", "yolbyalmohrem");
        break;
	case R.id.zkr_yoseebbayneh:
        i.putExtra("zeker_title", "yoseebbayneh");
        break;
	case R.id.zkr_zabh:
        i.putExtra("zeker_title", "zabh");
        break;
	case R.id.zkr_zeyartalgboor:
        i.putExtra("zeker_title", "zeyartalgboor");
        break;
	case R.id.zkr_zokymoslem:
        i.putExtra("zeker_title", "zokymoslem");
        break;	
	default:
		break;
	}	
	
	startActivity(i);
}
}