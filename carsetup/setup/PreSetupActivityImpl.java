package com.google.android.gms.carsetup.setup;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.google.android.gms.R;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;
import com.google.android.gms.carsetup.setup.PreSetupActivityImpl;
import defpackage.amte;
import defpackage.anaa;
import defpackage.ancy;
import defpackage.anqj;
import defpackage.anyb;
import defpackage.anyh;
import defpackage.anyo;
import defpackage.anyw;
import defpackage.anyx;
import defpackage.bp;
import defpackage.caqj;
import defpackage.dg;
import defpackage.ekvl;
import defpackage.eluq;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.fojn;
import defpackage.ind;
import defpackage.rxx;
import j$.util.Optional;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PreSetupActivityImpl extends rxx implements anyw, anyo {
    public static final eluq j = ancy.a("CAR.SETUP.FRX");
    public static final Intent k = new Intent("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH").setPackage(anaa.e.getPackageName());
    static final IntentFilter l = new IntentFilter("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH");
    static final IntentFilter m = new IntentFilter("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
    anqj n;
    public anyx o;
    private Handler p;
    private Intent q = null;
    private TracingBroadcastReceiver r;
    private TracingBroadcastReceiver s;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class ForceFinishRequestReceiver extends TracingBroadcastReceiver {
        public ForceFinishRequestReceiver() {
            super("car_setup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            PreSetupActivityImpl.j.h().ai(2879).x("Request PreSetup force finish");
            PreSetupActivityImpl preSetupActivityImpl = PreSetupActivityImpl.this;
            ekvl.y(preSetupActivityImpl.o);
            anyx anyxVar = preSetupActivityImpl.o;
            if (anyxVar.d) {
                return;
            }
            anyxVar.c.a(eolk.FRX_PRESETUP_EXIT_CONDITIONS, eolj.bZ);
            anyxVar.a();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class UsbDisconnectReceiver extends TracingBroadcastReceiver {
        public UsbDisconnectReceiver() {
            super("car_setup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            PreSetupActivityImpl.j.h().ai(2880).x("Received USB disconnect");
            PreSetupActivityImpl preSetupActivityImpl = PreSetupActivityImpl.this;
            ekvl.y(preSetupActivityImpl.o);
            anyx anyxVar = preSetupActivityImpl.o;
            if (anyxVar.d) {
                return;
            }
            anyxVar.c.a(eolk.FRX_PRESETUP_GENERAL, eolj.po);
        }
    }

    @Override // defpackage.anyo
    public final anyx a() {
        ekvl.y(this.o);
        return this.o;
    }

    @Override // defpackage.anyw
    public final void k() {
        TracingBroadcastReceiver tracingBroadcastReceiver = this.r;
        if (tracingBroadcastReceiver != null) {
            unregisterReceiver(tracingBroadcastReceiver);
            this.r = null;
        }
    }

    @Override // defpackage.anyw
    public final void l() {
        TracingBroadcastReceiver tracingBroadcastReceiver = this.s;
        if (tracingBroadcastReceiver != null) {
            unregisterReceiver(tracingBroadcastReceiver);
            this.s = null;
        }
    }

    @Override // defpackage.anyw
    public final void m() {
        getWindow().clearFlags(2621568);
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
    }

    @Override // defpackage.anyw
    public final void n() {
        getWindow().addFlags(2621568);
        if (this.p != null) {
            j.j().ai(2887).x("Dismissal already scheduled");
        } else {
            caqj caqjVar = new caqj(Looper.getMainLooper());
            this.p = caqjVar;
            caqjVar.postDelayed(new Runnable() { // from class: anya
                @Override // java.lang.Runnable
                public final void run() {
                    PreSetupActivityImpl.j.i().ai(2882).x("Critical error: user didn't unlock to proceed within 30s.");
                    PreSetupActivityImpl preSetupActivityImpl = PreSetupActivityImpl.this;
                    ekvl.y(preSetupActivityImpl.o);
                    anyx anyxVar = preSetupActivityImpl.o;
                    if (anyxVar.d) {
                        return;
                    }
                    anyxVar.c.a(eolk.FRX_PRESETUP_EXIT_CONDITIONS, eolj.pn);
                    anyxVar.a();
                }
            }, 30000L);
        }
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
        }
    }

    @Override // defpackage.anyw
    public final void o() {
        amte amteVar = new anyb(this).a;
        amteVar.k(amteVar.g() + 1);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        ekvl.y(this.o);
        anyx anyxVar = this.o;
        if (anyxVar.d) {
            return;
        }
        anyxVar.c.a(eolk.FRX_PRESETUP_EXIT_CONDITIONS, eolj.g);
        anyxVar.a();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eluq eluqVar = j;
        eluqVar.h().ai(2883).x("PreSetupActivity:onCreate");
        if (fojn.c() && new anyb(this).a.e("DONT_SHOW_AGAIN_SETTING", false)) {
            eluqVar.h().ai(2884).x("Not showing PreSetupActivity: user has selected 'Don't show again'");
            finish();
            return;
        }
        overridePendingTransition(0, 0);
        ekvl.b(getIntent().hasExtra("PreSetup.AA_SUPPORT_RESULT"), "Invalid intent: missing AaSupportedResult extra");
        int intExtra = getIntent().getIntExtra("PreSetup.AA_SUPPORT_RESULT", -1);
        ekvl.b(getIntent().hasExtra("connection_type"), "Invalid intent: missing ConnectionType extra");
        int intExtra2 = getIntent().getIntExtra("connection_type", -1);
        Intent intent = (Intent) getIntent().getParcelableExtra("PreSetup.CONTINUE_INTENT");
        ekvl.y(intent);
        this.q = intent;
        setContentView(R.layout.car_bottom_sheet_activity);
        int i = true == getIntent().getBooleanExtra("PreSetup.SKIP_TO_USB_RESET", false) ? 7 : 1;
        amte.a(this);
        this.n = new anqj(this);
        this.o = new anyx(this, intExtra, new anyh(this.n), intExtra2, i, Optional.empty());
    }

    @Override // defpackage.anyw
    public final void p() {
        if (this.r != null) {
            return;
        }
        ForceFinishRequestReceiver forceFinishRequestReceiver = new ForceFinishRequestReceiver();
        this.r = forceFinishRequestReceiver;
        ind.b(this, forceFinishRequestReceiver, l, 2);
    }

    @Override // defpackage.anyw
    public final void q() {
        if (this.s != null) {
            return;
        }
        UsbDisconnectReceiver usbDisconnectReceiver = new UsbDisconnectReceiver();
        this.s = usbDisconnectReceiver;
        ind.b(this, usbDisconnectReceiver, m, 2);
    }

    @Override // defpackage.anyw
    public final void r(dg dgVar) {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.fragment_container, dgVar, "fragment_main");
        bpVar.a();
    }

    @Override // defpackage.anyw
    public final void s(boolean z) {
        if (isFinishing()) {
            return;
        }
        anqj anqjVar = this.n;
        if (anqjVar != null) {
            anqjVar.a();
        }
        if (z) {
            PackageManager packageManager = getPackageManager();
            Intent intent = this.q;
            if (intent == null) {
                j.j().ai(2890).x("continueIntent request to launch was null: skipping");
            } else if (intent.resolveActivityInfo(packageManager, 0) != null) {
                startActivity(this.q);
            } else {
                j.j().ai(2889).x("Unable to launch continueIntent: did not resolve");
            }
        }
        BottomSheetView bottomSheetView = (BottomSheetView) findViewById(R.id.bottom_sheet);
        if (bottomSheetView != null) {
            bottomSheetView.a.H(5);
        } else {
            finish();
        }
    }

    @Override // defpackage.anyw
    public final boolean t() {
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked();
    }

    @Override // defpackage.anyw
    public final boolean u() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
