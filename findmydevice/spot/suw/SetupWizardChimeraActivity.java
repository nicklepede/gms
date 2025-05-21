package com.google.android.gms.findmydevice.spot.suw;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.suw.SetupWizardChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.items.ItemGroup;
import com.google.android.setupdesign.items.RadioButtonItem;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bcuu;
import defpackage.bdak;
import defpackage.bdal;
import defpackage.bdan;
import defpackage.bdao;
import defpackage.bdbm;
import defpackage.bedy;
import defpackage.bezi;
import defpackage.bzfi;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dhqq;
import defpackage.eble;
import defpackage.edeq;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edfs;
import defpackage.edhh;
import defpackage.edho;
import defpackage.edhs;
import defpackage.edhz;
import defpackage.edja;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.egna;
import defpackage.eiho;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.enqb;
import defpackage.euhg;
import defpackage.fixd;
import defpackage.fixq;
import defpackage.fobb;
import defpackage.qet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SetupWizardChimeraActivity extends qet {
    public static final asot j = asot.b("SetupWizardActivity", asej.FIND_MY_DEVICE_SPOT);
    public euhg k = euhg.FMDN_DISABLED_DEFAULT;
    public Account l;
    public edfs m;

    public static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_GoogleMaterial3_DayNight);
        int i = eble.a;
        return contextThemeWrapper;
    }

    public static Bitmap k(Bitmap bitmap, int i) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawARGB(0, 0, 0, 0);
            float f = i / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == i && height == i) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return createBitmap;
            }
            int min = Math.min(width, height);
            int i2 = (width - min) / 2;
            int i3 = (height - min) / 2;
            canvas.drawBitmap(bitmap, new Rect(i2, i3, i2 + min, min + i3), new Rect(0, 0, i, i), paint);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            ((ejhf) ((ejhf) ((ejhf) j.i()).s(e)).ah((char) 4487)).x("Failed to allocate bitmap");
            return null;
        }
    }

    public final void l() {
        final eitj m = eitj.m(Integer.valueOf(R.string.high_traffic_radio_title), Integer.valueOf(R.string.all_locations_radio_title));
        final eitj m2 = eitj.m(Integer.valueOf(R.string.high_traffic_radio_subtitle), Integer.valueOf(R.string.all_locations_radio_subtitle));
        if (this.l != null) {
            final asmf asmfVar = new asmf(1, 9);
            asmfVar.execute(new Runnable() { // from class: bezf
                @Override // java.lang.Runnable
                public final void run() {
                    SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                    dwzr a = dwzq.a(setupWizardChimeraActivity, setupWizardChimeraActivity.l);
                    dwzp dwzpVar = dwzp.SETUP_WIZARD;
                    int i = eitj.d;
                    eitj eitjVar = ejcb.a;
                    ensj.t(a.a(dwzpVar, m, m2, eitjVar, eitjVar, dwzo.a(setupWizardChimeraActivity.k.a(), true)), new bezg(), asmfVar);
                }
            });
            final bezi beziVar = new bezi((bdak) fixq.b(new bdal(fixd.c(new bdao(fixd.c(new bdan()))), fixd.c(new bzfi(fixd.c(new dhqq()))), fixd.c(bdbm.a))).a());
            beziVar.a(this.k == euhg.FMDN_ALL_LOCATIONS ? 27 : 26);
            bedy bedyVar = new bedy(this);
            bcuu bcuuVar = new bcuu();
            bcuuVar.b(true);
            bcuuVar.d(true);
            FindMyDeviceNetworkSettings findMyDeviceNetworkSettings = new FindMyDeviceNetworkSettings();
            findMyDeviceNetworkSettings.a = this.k.a();
            bcuuVar.c(findMyDeviceNetworkSettings);
            bcuuVar.a(!fobb.s());
            dfaq c = bedyVar.c(bcuuVar.a);
            c.z(new dfak() { // from class: beyp
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    asot asotVar = SetupWizardChimeraActivity.j;
                    bezi.this.a(28);
                    ((ejhf) ((ejhf) SetupWizardChimeraActivity.j.h()).ah((char) 4482)).x("Setup wizard FMDN enrollment succeeded.");
                }
            });
            c.y(new dfah() { // from class: beyq
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    asot asotVar = SetupWizardChimeraActivity.j;
                    bezi.this.a(29);
                    ((ejhf) ((ejhf) ((ejhf) SetupWizardChimeraActivity.j.j()).s(exc)).ah((char) 4483)).x("Setup wizard FMDN enrollment failed.");
                }
            });
        }
        setResult(-1);
        ((ejhf) ((ejhf) j.h()).ah((char) 4486)).x("onDone");
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getContainerActivity();
        int i = eble.a;
        int i2 = edjs.a;
        if (edeq.s(this)) {
            setTheme(edjs.b(this));
        } else {
            String stringExtra = getIntent().getStringExtra("theme");
            int i3 = true != edeq.v(this) ? R.style.SudThemeGlifV4_Light : R.style.SudThemeGlifV4_DayNight;
            edjt d = edjt.d();
            int i4 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new edjt(i3, true).c(stringExtra, !edeq.v(this)));
        }
        edjs.d();
        setContentView(R.layout.fmd_suw_activity);
        final GlifLayout glifLayout = (GlifLayout) findViewById(R.id.glif_layout);
        if (edeq.s(this)) {
            ((ImageView) glifLayout.findViewById(R.id.main_image)).setImageDrawable(getDrawable(R.drawable.fmd_check_bc25));
        }
        edfq edfqVar = (edfq) glifLayout.q(edfq.class);
        edfr edfrVar = new edfr(this);
        edfrVar.b(R.string.common_next);
        edfrVar.b = new View.OnClickListener() { // from class: beyo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupWizardChimeraActivity.this.l();
            }
        };
        edfrVar.c = 4;
        edfrVar.d = R.style.SudGlifButton_Primary;
        edfs a = edfrVar.a();
        this.m = a;
        edfqVar.b(a);
        ((edja) glifLayout.q(edja.class)).d(this, this.m, new View.OnClickListener() { // from class: beyx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupWizardChimeraActivity.this.l();
            }
        });
        final RadioButtonItem radioButtonItem = new RadioButtonItem();
        final RadioButtonItem radioButtonItem2 = new RadioButtonItem();
        radioButtonItem.F(getString(R.string.all_locations_radio_title));
        String string = getString(R.string.all_locations_radio_subtitle);
        String string2 = getString(R.string.learn_more_about_find_my_in_all_areas);
        SpannableString spannableString = new SpannableString(string + "\n" + string2);
        spannableString.setSpan(new edhz("all_traffic_span"), spannableString.length() - string2.length(), spannableString.length(), 33);
        radioButtonItem.E(spannableString);
        radioButtonItem.j = false;
        radioButtonItem.a = new edho() { // from class: beys
            @Override // defpackage.edho
            public final void a(boolean z2) {
                if (z2) {
                    RadioButtonItem radioButtonItem3 = radioButtonItem2;
                    SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                    radioButtonItem3.g(false);
                    setupWizardChimeraActivity.m.c(true);
                    setupWizardChimeraActivity.k = euhg.FMDN_ALL_LOCATIONS;
                }
            }
        };
        radioButtonItem.k = new edhh() { // from class: beyt
            @Override // defpackage.edhh
            public final void a() {
                final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: bezc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebna ebnaVar = new ebna(SetupWizardChimeraActivity.a(SetupWizardChimeraActivity.this));
                        ebnaVar.M(R.string.title_find_my_devices_in_all_areas);
                        ebnaVar.B(R.string.message_find_my_devices_in_all_areas);
                        ebnaVar.E(R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: beyw
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                asot asotVar = SetupWizardChimeraActivity.j;
                                dialogInterface.dismiss();
                            }
                        });
                        ebnaVar.create().show();
                    }
                });
            }
        };
        radioButtonItem2.F(getString(R.string.high_traffic_radio_title));
        String string3 = getString(R.string.high_traffic_radio_subtitle);
        String string4 = getString(R.string.learn_more_about_find_my_in_high_traffic_areas);
        SpannableString spannableString2 = new SpannableString(string3 + "\n" + string4);
        spannableString2.setSpan(new edhz("high_traffic_span"), spannableString2.length() - string4.length(), spannableString2.length(), 33);
        radioButtonItem2.E(spannableString2);
        radioButtonItem2.j = false;
        radioButtonItem2.a = new edho() { // from class: beyu
            @Override // defpackage.edho
            public final void a(boolean z2) {
                if (z2) {
                    RadioButtonItem radioButtonItem3 = radioButtonItem;
                    SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                    radioButtonItem3.g(false);
                    setupWizardChimeraActivity.m.c(true);
                    setupWizardChimeraActivity.k = euhg.FMDN_HIGH_TRAFFIC;
                }
            }
        };
        radioButtonItem2.k = new edhh() { // from class: beyv
            @Override // defpackage.edhh
            public final void a() {
                final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: beyr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebna ebnaVar = new ebna(SetupWizardChimeraActivity.a(SetupWizardChimeraActivity.this));
                        ebnaVar.M(R.string.title_find_my_devices_in_high_traffic_areas);
                        ebnaVar.B(R.string.message_find_my_devices_in_high_traffic_areas);
                        ebnaVar.E(R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: bezd
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                asot asotVar = SetupWizardChimeraActivity.j;
                                dialogInterface.dismiss();
                            }
                        });
                        ebnaVar.create().show();
                    }
                });
            }
        };
        ItemGroup itemGroup = new ItemGroup();
        itemGroup.d(radioButtonItem);
        itemGroup.d(radioButtonItem2);
        RecyclerView recyclerView = (RecyclerView) glifLayout.findViewById(R.id.opt_in_area);
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ah(new edhs(itemGroup));
        radioButtonItem2.g(true);
        asmf asmfVar = new asmf(1, 9);
        final Callable callable = new Callable() { // from class: beyy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bfdq.a(SetupWizardChimeraActivity.this);
            }
        };
        egna.e(new enqb() { // from class: egmy
            @Override // defpackage.enqb
            public final enss a() {
                return ensj.i(callable.call());
            }
        }, asmfVar).h(new eiho() { // from class: beyz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                Account account = (Account) obj;
                if (account == null) {
                    return null;
                }
                SetupWizardChimeraActivity.this.l = account;
                try {
                    return (Bitmap) duju.a().g(account.name, 32).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, asmfVar).d(Throwable.class, new eiho() { // from class: beza
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ((ejhf) ((ejhf) ((ejhf) SetupWizardChimeraActivity.j.j()).s((Throwable) obj)).ah((char) 4481)).x("Failed to get the avatar");
                return null;
            }
        }, asmfVar).h(new eiho() { // from class: bezb
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                final edim edimVar = (edim) glifLayout.q(edim.class);
                if (edimVar == null || bitmap == null) {
                    return null;
                }
                final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                final Bitmap k = SetupWizardChimeraActivity.k(bitmap, (int) TypedValue.applyDimension(1, 32.0f, setupWizardChimeraActivity.getResources().getDisplayMetrics()));
                if (k == null) {
                    return null;
                }
                setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: beze
                    @Override // java.lang.Runnable
                    public final void run() {
                        SetupWizardChimeraActivity setupWizardChimeraActivity2 = SetupWizardChimeraActivity.this;
                        edimVar.d(setupWizardChimeraActivity2.l.name, new BitmapDrawable(setupWizardChimeraActivity2.getResources(), k));
                    }
                });
                return null;
            }
        }, asmfVar);
    }
}
