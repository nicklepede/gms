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
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.suw.SetupWizardChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.items.ItemGroup;
import com.google.android.setupdesign.items.RadioButtonItem;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bfbw;
import defpackage.bfbx;
import defpackage.bfbz;
import defpackage.bfca;
import defpackage.bfcy;
import defpackage.bgfk;
import defpackage.bhay;
import defpackage.cbnz;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dkbw;
import defpackage.edxt;
import defpackage.efrl;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efsn;
import defpackage.efuc;
import defpackage.efuj;
import defpackage.efun;
import defpackage.efuu;
import defpackage.efvv;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ejad;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqdu;
import defpackage.ewwz;
import defpackage.flna;
import defpackage.flnn;
import defpackage.fqsv;
import defpackage.rxx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SetupWizardChimeraActivity extends rxx {
    public static final ausn j = ausn.b("SetupWizardActivity", auid.FIND_MY_DEVICE_SPOT);
    public ewwz k = ewwz.FMDN_DISABLED_DEFAULT;
    public Account l;
    public efsn m;
    public RadioButtonItem n;
    public RadioButtonItem o;

    public static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_GoogleMaterial3_DayNight);
        int i = edxt.a;
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
            ((eluo) ((eluo) ((eluo) j.i()).s(e)).ai((char) 4497)).x("Failed to allocate bitmap");
            return null;
        }
    }

    public final void l() {
        final elgo m = elgo.m(Integer.valueOf(R.string.high_traffic_radio_title), Integer.valueOf(R.string.all_locations_radio_title));
        final elgo m2 = elgo.m(Integer.valueOf(R.string.high_traffic_radio_subtitle), Integer.valueOf(R.string.all_locations_radio_subtitle));
        if (this.l != null) {
            final aupz aupzVar = new aupz(1, 9);
            aupzVar.execute(new Runnable() { // from class: bhaj
                @Override // java.lang.Runnable
                public final void run() {
                    SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                    dzlr a = dzlq.a(setupWizardChimeraActivity, setupWizardChimeraActivity.l);
                    dzlp dzlpVar = dzlp.SETUP_WIZARD;
                    int i = elgo.d;
                    elgo elgoVar = elpg.a;
                    eqgc.t(a.a(dzlpVar, m, m2, elgoVar, elgoVar, dzlo.a(setupWizardChimeraActivity.k.a(), true)), new bhaw(), aupzVar);
                }
            });
            final bhay bhayVar = new bhay((bfbw) flnn.b(new bfbx(flna.c(new bfca(flna.c(new bfbz()))), flna.c(new cbnz(flna.c(new dkbw()))), flna.c(bfcy.a))).a());
            bhayVar.a(this.k == ewwz.FMDN_ALL_LOCATIONS ? 27 : 26);
            bgfk bgfkVar = new bgfk(this);
            ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest = new ChangeFindMyDeviceSettingsRequest();
            changeFindMyDeviceSettingsRequest.a = true;
            changeFindMyDeviceSettingsRequest.b = true;
            FindMyDeviceNetworkSettings findMyDeviceNetworkSettings = new FindMyDeviceNetworkSettings();
            findMyDeviceNetworkSettings.a = this.k.a();
            changeFindMyDeviceSettingsRequest.c = findMyDeviceNetworkSettings;
            changeFindMyDeviceSettingsRequest.d = !fqsv.r();
            dhlw c = bgfkVar.c(changeFindMyDeviceSettingsRequest);
            c.z(new dhlq() { // from class: bhak
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    ausn ausnVar = SetupWizardChimeraActivity.j;
                    bhay.this.a(28);
                    ((eluo) ((eluo) SetupWizardChimeraActivity.j.h()).ai((char) 4494)).x("Setup wizard FMDN enrollment succeeded.");
                }
            });
            c.y(new dhln() { // from class: bhal
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    ausn ausnVar = SetupWizardChimeraActivity.j;
                    bhay.this.a(29);
                    ((eluo) ((eluo) ((eluo) SetupWizardChimeraActivity.j.j()).s(exc)).ai((char) 4495)).x("Setup wizard FMDN enrollment failed.");
                }
            });
        }
        setResult(-1);
        ((eluo) ((eluo) j.h()).ai((char) 4496)).x("onDone");
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getContainerActivity();
        int i = edxt.a;
        int i2 = efwn.a;
        if (efrl.s(this)) {
            setTheme(efwn.b(this));
        } else {
            String stringExtra = getIntent().getStringExtra("theme");
            int i3 = true != efrl.v(this) ? R.style.SudThemeGlifV4_Light : R.style.SudThemeGlifV4_DayNight;
            efwo d = efwo.d();
            int i4 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new efwo(i3, true).c(stringExtra, !efrl.v(this)));
        }
        efwn.d();
        setContentView(R.layout.fmd_suw_activity);
        final GlifLayout glifLayout = (GlifLayout) findViewById(R.id.glif_layout);
        if (efrl.s(this)) {
            ((ImageView) glifLayout.findViewById(R.id.main_image)).setImageDrawable(getDrawable(R.drawable.fmd_check_bc25));
        }
        efsl efslVar = (efsl) glifLayout.q(efsl.class);
        efsm efsmVar = new efsm(this);
        efsmVar.b(R.string.common_next);
        efsmVar.b = new View.OnClickListener() { // from class: bhap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupWizardChimeraActivity.this.l();
            }
        };
        efsmVar.c = 4;
        efsmVar.d = R.style.SudGlifButton_Primary;
        efsn a = efsmVar.a();
        this.m = a;
        efslVar.b(a);
        ((efvv) glifLayout.q(efvv.class)).d(this, this.m, new View.OnClickListener() { // from class: bhaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetupWizardChimeraActivity.this.l();
            }
        });
        this.n = new RadioButtonItem();
        this.o = new RadioButtonItem();
        this.n.F(getString(R.string.all_locations_radio_title));
        String string = getString(R.string.all_locations_radio_subtitle);
        String string2 = getString(R.string.learn_more_about_find_my_in_all_areas);
        SpannableString spannableString = new SpannableString(string + "\n" + string2);
        spannableString.setSpan(new efuu("all_locations_span"), spannableString.length() - string2.length(), spannableString.length(), 33);
        this.n.E(spannableString);
        this.n.j = false;
        RadioButtonItem radioButtonItem = this.n;
        radioButtonItem.a = new efuj() { // from class: bhae
            @Override // defpackage.efuj
            public final void a(boolean z2) {
                if (z2) {
                    SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                    RadioButtonItem radioButtonItem2 = setupWizardChimeraActivity.o;
                    ekvl.y(radioButtonItem2);
                    radioButtonItem2.g(false);
                    setupWizardChimeraActivity.m.c(true);
                    setupWizardChimeraActivity.k = ewwz.FMDN_ALL_LOCATIONS;
                }
            }
        };
        radioButtonItem.k = new efuc() { // from class: bhaf
            @Override // defpackage.efuc
            public final void a() {
                final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: bham
                    @Override // java.lang.Runnable
                    public final void run() {
                        edzp edzpVar = new edzp(SetupWizardChimeraActivity.a(SetupWizardChimeraActivity.this));
                        edzpVar.M(R.string.title_find_my_devices_in_all_areas);
                        edzpVar.B(R.string.message_find_my_devices_in_all_areas);
                        edzpVar.E(R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: bhab
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                ausn ausnVar = SetupWizardChimeraActivity.j;
                                dialogInterface.dismiss();
                            }
                        });
                        edzpVar.create().show();
                    }
                });
            }
        };
        this.o.F(getString(R.string.high_traffic_radio_title));
        String string3 = getString(R.string.high_traffic_radio_subtitle);
        String string4 = getString(R.string.learn_more_about_find_my_in_high_traffic_areas);
        SpannableString spannableString2 = new SpannableString(string3 + "\n" + string4);
        spannableString2.setSpan(new efuu("high_traffic_areas_span"), spannableString2.length() - string4.length(), spannableString2.length(), 33);
        this.o.E(spannableString2);
        RadioButtonItem radioButtonItem2 = this.o;
        radioButtonItem2.j = false;
        radioButtonItem2.a = new efuj() { // from class: bhag
            @Override // defpackage.efuj
            public final void a(boolean z2) {
                if (z2) {
                    SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                    RadioButtonItem radioButtonItem3 = setupWizardChimeraActivity.n;
                    ekvl.y(radioButtonItem3);
                    radioButtonItem3.g(false);
                    setupWizardChimeraActivity.m.c(true);
                    setupWizardChimeraActivity.k = ewwz.FMDN_HIGH_TRAFFIC;
                }
            }
        };
        radioButtonItem2.k = new efuc() { // from class: bhah
            @Override // defpackage.efuc
            public final void a() {
                final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: bhao
                    @Override // java.lang.Runnable
                    public final void run() {
                        edzp edzpVar = new edzp(SetupWizardChimeraActivity.a(SetupWizardChimeraActivity.this));
                        edzpVar.M(R.string.title_find_my_devices_in_high_traffic_areas);
                        edzpVar.B(R.string.message_find_my_devices_in_high_traffic_areas);
                        edzpVar.E(R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: bhad
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                ausn ausnVar = SetupWizardChimeraActivity.j;
                                dialogInterface.dismiss();
                            }
                        });
                        edzpVar.create().show();
                    }
                });
            }
        };
        ItemGroup itemGroup = new ItemGroup();
        itemGroup.d(this.n);
        itemGroup.d(this.o);
        RecyclerView recyclerView = (RecyclerView) glifLayout.findViewById(R.id.opt_in_area);
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ah(new efun(itemGroup));
        this.o.g(true);
        aupz aupzVar = new aupz(1, 9);
        final Callable callable = new Callable() { // from class: bhar
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bhfg.a(SetupWizardChimeraActivity.this);
            }
        };
        ejad.e(new eqdu() { // from class: ejab
            @Override // defpackage.eqdu
            public final eqgl a() {
                return eqgc.i(callable.call());
            }
        }, aupzVar).h(new ekut() { // from class: bhas
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Account account = (Account) obj;
                if (account == null) {
                    return null;
                }
                SetupWizardChimeraActivity.this.l = account;
                try {
                    return (Bitmap) dwug.a().g(account.name, 32).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, aupzVar).e(Throwable.class, new ekut() { // from class: bhat
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ((eluo) ((eluo) ((eluo) SetupWizardChimeraActivity.j.j()).s((Throwable) obj)).ai((char) 4490)).x("Failed to get the avatar");
                return null;
            }
        }, aupzVar).h(new ekut() { // from class: bhau
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                final efvh efvhVar = (efvh) glifLayout.q(efvh.class);
                if (efvhVar == null || bitmap == null) {
                    return null;
                }
                final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                final Bitmap k = SetupWizardChimeraActivity.k(bitmap, (int) TypedValue.applyDimension(1, 32.0f, setupWizardChimeraActivity.getResources().getDisplayMetrics()));
                if (k == null) {
                    return null;
                }
                setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: bhai
                    @Override // java.lang.Runnable
                    public final void run() {
                        SetupWizardChimeraActivity setupWizardChimeraActivity2 = SetupWizardChimeraActivity.this;
                        efvhVar.d(setupWizardChimeraActivity2.l.name, new BitmapDrawable(setupWizardChimeraActivity2.getResources(), k));
                    }
                });
                return null;
            }
        }, aupzVar);
        dhlw d2 = new bgfk(this).d(new GetFindMyDeviceSettingsRequest());
        d2.z(new dhlq() { // from class: bhav
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                FindMyDeviceNetworkSettings findMyDeviceNetworkSettings = ((GetFindMyDeviceSettingsResponse) obj).c;
                if (findMyDeviceNetworkSettings != null) {
                    ausn ausnVar = SetupWizardChimeraActivity.j;
                    ((eluo) ((eluo) ausnVar.h()).ai(4491)).z("Restored chosen FMDN state: %s", findMyDeviceNetworkSettings.a);
                    final ewwz b = ewwz.b(findMyDeviceNetworkSettings.a);
                    if (b == null) {
                        ((eluo) ((eluo) ausnVar.j()).ai(4492)).z("Unknown FMDN state: %s", findMyDeviceNetworkSettings.a);
                    } else {
                        final SetupWizardChimeraActivity setupWizardChimeraActivity = SetupWizardChimeraActivity.this;
                        setupWizardChimeraActivity.runOnUiThread(new Runnable() { // from class: bhan
                            @Override // java.lang.Runnable
                            public final void run() {
                                SetupWizardChimeraActivity setupWizardChimeraActivity2 = SetupWizardChimeraActivity.this;
                                int ordinal = b.ordinal();
                                if (ordinal == 2 || ordinal == 4) {
                                    RadioButtonItem radioButtonItem3 = setupWizardChimeraActivity2.n;
                                    if (radioButtonItem3 != null) {
                                        radioButtonItem3.g(true);
                                        return;
                                    }
                                    return;
                                }
                                RadioButtonItem radioButtonItem4 = setupWizardChimeraActivity2.o;
                                if (radioButtonItem4 != null) {
                                    radioButtonItem4.g(true);
                                }
                            }
                        });
                    }
                }
            }
        });
        d2.y(new dhln() { // from class: bhac
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) ((eluo) SetupWizardChimeraActivity.j.j()).s(exc)).ai((char) 4493)).x("Failed to get currently set FMDN state.");
            }
        });
    }
}
