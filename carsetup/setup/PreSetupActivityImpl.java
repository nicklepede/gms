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
import defpackage.akrt;
import defpackage.akyp;
import defpackage.albn;
import defpackage.aloy;
import defpackage.alwq;
import defpackage.alww;
import defpackage.alxd;
import defpackage.alxl;
import defpackage.alxm;
import defpackage.bp;
import defpackage.byhr;
import defpackage.dg;
import defpackage.eiig;
import defpackage.ejhh;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.flsb;
import defpackage.iln;
import defpackage.qet;
import j$.util.Optional;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PreSetupActivityImpl extends qet implements alxl, alxd {
    public static final ejhh j = albn.a("CAR.SETUP.FRX");
    public static final Intent k = new Intent("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH").setPackage(akyp.e.getPackageName());
    static final IntentFilter l = new IntentFilter("com.google.android.gms.carsetup.setup.PreSetupActivityImpl.ACTION_FORCE_FINISH");
    static final IntentFilter m = new IntentFilter("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
    aloy n;
    public alxm o;
    private Handler p;
    private Intent q = null;
    private TracingBroadcastReceiver r;
    private TracingBroadcastReceiver s;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class ForceFinishRequestReceiver extends TracingBroadcastReceiver {
        public ForceFinishRequestReceiver() {
            super("car_setup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            PreSetupActivityImpl.j.h().ah(2875).x("Request PreSetup force finish");
            PreSetupActivityImpl preSetupActivityImpl = PreSetupActivityImpl.this;
            eiig.x(preSetupActivityImpl.o);
            alxm alxmVar = preSetupActivityImpl.o;
            if (alxmVar.d) {
                return;
            }
            alxmVar.c.a(elxw.FRX_PRESETUP_EXIT_CONDITIONS, elxv.bZ);
            alxmVar.a();
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class UsbDisconnectReceiver extends TracingBroadcastReceiver {
        public UsbDisconnectReceiver() {
            super("car_setup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            PreSetupActivityImpl.j.h().ah(2876).x("Received USB disconnect");
            PreSetupActivityImpl preSetupActivityImpl = PreSetupActivityImpl.this;
            eiig.x(preSetupActivityImpl.o);
            alxm alxmVar = preSetupActivityImpl.o;
            if (alxmVar.d) {
                return;
            }
            alxmVar.c.a(elxw.FRX_PRESETUP_GENERAL, elxv.po);
        }
    }

    @Override // defpackage.alxd
    public final alxm a() {
        eiig.x(this.o);
        return this.o;
    }

    @Override // defpackage.alxl
    public final void k() {
        TracingBroadcastReceiver tracingBroadcastReceiver = this.r;
        if (tracingBroadcastReceiver != null) {
            unregisterReceiver(tracingBroadcastReceiver);
            this.r = null;
        }
    }

    @Override // defpackage.alxl
    public final void l() {
        TracingBroadcastReceiver tracingBroadcastReceiver = this.s;
        if (tracingBroadcastReceiver != null) {
            unregisterReceiver(tracingBroadcastReceiver);
            this.s = null;
        }
    }

    @Override // defpackage.alxl
    public final void m() {
        getWindow().clearFlags(2621568);
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
    }

    @Override // defpackage.alxl
    public final void n() {
        getWindow().addFlags(2621568);
        if (this.p != null) {
            j.j().ah(2883).x("Dismissal already scheduled");
        } else {
            byhr byhrVar = new byhr(Looper.getMainLooper());
            this.p = byhrVar;
            byhrVar.postDelayed(new Runnable() { // from class: alwp
                @Override // java.lang.Runnable
                public final void run() {
                    PreSetupActivityImpl.j.i().ah(2878).x("Critical error: user didn't unlock to proceed within 30s.");
                    PreSetupActivityImpl preSetupActivityImpl = PreSetupActivityImpl.this;
                    eiig.x(preSetupActivityImpl.o);
                    alxm alxmVar = preSetupActivityImpl.o;
                    if (alxmVar.d) {
                        return;
                    }
                    alxmVar.c.a(elxw.FRX_PRESETUP_EXIT_CONDITIONS, elxv.pn);
                    alxmVar.a();
                }
            }, 30000L);
        }
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(new long[]{0, 600, 100, 600}, -1, new AudioAttributes.Builder().setUsage(10).build());
        }
    }

    @Override // defpackage.alxl
    public final void o() {
        akrt akrtVar = new alwq(this).a;
        akrtVar.k(akrtVar.g() + 1);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        eiig.x(this.o);
        alxm alxmVar = this.o;
        if (alxmVar.d) {
            return;
        }
        alxmVar.c.a(elxw.FRX_PRESETUP_EXIT_CONDITIONS, elxv.g);
        alxmVar.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ejhh ejhhVar = j;
        ejhhVar.h().ah(2879).x("PreSetupActivity:onCreate");
        if (flsb.d() && new alwq(this).a.e("DONT_SHOW_AGAIN_SETTING", false)) {
            ejhhVar.h().ah(2880).x("Not showing PreSetupActivity: user has selected 'Don't show again'");
            finish();
            return;
        }
        overridePendingTransition(0, 0);
        eiig.b(getIntent().hasExtra("PreSetup.AA_SUPPORT_RESULT"), "Invalid intent: missing AaSupportedResult extra");
        int intExtra = getIntent().getIntExtra("PreSetup.AA_SUPPORT_RESULT", -1);
        eiig.b(getIntent().hasExtra("connection_type"), "Invalid intent: missing ConnectionType extra");
        int intExtra2 = getIntent().getIntExtra("connection_type", -1);
        Intent intent = (Intent) getIntent().getParcelableExtra("PreSetup.CONTINUE_INTENT");
        eiig.x(intent);
        this.q = intent;
        setContentView(R.layout.car_bottom_sheet_activity);
        int i = true == getIntent().getBooleanExtra("PreSetup.SKIP_TO_USB_RESET", false) ? 7 : 1;
        akrt.a(this);
        this.n = new aloy(this);
        this.o = new alxm(this, intExtra, new alww(this.n), intExtra2, i, Optional.empty());
    }

    @Override // defpackage.alxl
    public final void p() {
        if (this.r != null) {
            return;
        }
        ForceFinishRequestReceiver forceFinishRequestReceiver = new ForceFinishRequestReceiver();
        this.r = forceFinishRequestReceiver;
        iln.b(this, forceFinishRequestReceiver, l, 2);
    }

    @Override // defpackage.alxl
    public final void q() {
        if (this.s != null) {
            return;
        }
        UsbDisconnectReceiver usbDisconnectReceiver = new UsbDisconnectReceiver();
        this.s = usbDisconnectReceiver;
        iln.b(this, usbDisconnectReceiver, m, 2);
    }

    @Override // defpackage.alxl
    public final void r(dg dgVar) {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.fragment_container, dgVar, "fragment_main");
        bpVar.a();
    }

    @Override // defpackage.alxl
    public final void s(boolean z) {
        if (isFinishing()) {
            return;
        }
        aloy aloyVar = this.n;
        if (aloyVar != null) {
            aloyVar.a();
        }
        if (z) {
            PackageManager packageManager = getPackageManager();
            Intent intent = this.q;
            if (intent == null) {
                j.j().ah(2886).x("continueIntent request to launch was null: skipping");
            } else if (intent.resolveActivityInfo(packageManager, 0) != null) {
                startActivity(this.q);
            } else {
                j.j().ah(2885).x("Unable to launch continueIntent: did not resolve");
            }
        }
        BottomSheetView bottomSheetView = (BottomSheetView) findViewById(R.id.bottom_sheet);
        if (bottomSheetView != null) {
            bottomSheetView.a.H(5);
        } else {
            finish();
        }
    }

    @Override // defpackage.alxl
    public final boolean t() {
        return ((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked();
    }

    @Override // defpackage.alxl
    public final boolean u() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
