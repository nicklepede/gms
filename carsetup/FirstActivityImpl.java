package com.google.android.gms.carsetup;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.carsetup.FirstActivityImpl;
import com.google.android.gms.carsetup.restart.RestartOperation;
import com.google.android.gms.carsetup.setup.SetupBinder;
import defpackage.akrt;
import defpackage.akue;
import defpackage.akyp;
import defpackage.albk;
import defpackage.albn;
import defpackage.albo;
import defpackage.alcf;
import defpackage.alcl;
import defpackage.alkr;
import defpackage.aloy;
import defpackage.alqy;
import defpackage.alrk;
import defpackage.alrv;
import defpackage.alrw;
import defpackage.alrx;
import defpackage.alsj;
import defpackage.alsn;
import defpackage.alvs;
import defpackage.alxh;
import defpackage.alxo;
import defpackage.alxy;
import defpackage.alyb;
import defpackage.aqup;
import defpackage.deqr;
import defpackage.eiig;
import defpackage.ejhh;
import defpackage.elwq;
import defpackage.elwx;
import defpackage.elxv;
import defpackage.elxw;
import defpackage.flsh;
import defpackage.flsr;
import defpackage.fluc;
import defpackage.flve;
import defpackage.flwn;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FirstActivityImpl extends qfp {
    static boolean k;
    static boolean l;
    public deqr n;
    private final alxy o = new alyb();
    private LocalBinder p;
    private akrt q;
    private alkr r;
    private aloy s;
    public static final ejhh j = albn.a("CAR.FIRST");
    static final long m = SystemClock.elapsedRealtime();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class LocalBinder extends SetupBinder {
        private FirstActivityImpl b;

        public LocalBinder(FirstActivityImpl firstActivityImpl, Intent intent, alxh alxhVar) {
            super(intent, alxhVar);
            this.b = firstActivityImpl;
        }

        @Override // com.google.android.gms.carsetup.setup.SetupBinder
        public final void a() {
            FirstActivityImpl firstActivityImpl = this.b;
            if (firstActivityImpl != null) {
                firstActivityImpl.finishAndRemoveTask();
            }
            this.b = null;
        }

        @Override // com.google.android.gms.carsetup.setup.SetupBinder
        public final boolean b() {
            return this.b != null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void f(final Intent intent) {
        char c;
        if (intent == null) {
            h(alcf.INVALID);
            finish();
            return;
        }
        if (intent.getAction() == null) {
            j.i().ah(2712).B("First activity intent has null action: %s", intent);
            h(alcf.UNKNOWN);
            finish();
            return;
        }
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1989641542:
                if (action.equals("com.google.android.gms.carsetup.START_DUPLEX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1785280654:
                if (action.equals("com.google.android.gms.carsetup.RESTART")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -528141398:
                if (action.equals("com.google.android.gms.car.WIFI_ACTION_BRIDGE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -462095206:
                if (action.equals("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1099555123:
                if (action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
            if (flsr.a.a().f() && usbAccessory != null && usbAccessory.getVersion() == null) {
                alcl.h(getApplicationContext(), elwq.USB_ISSUE_NO_VERSION_FIELD);
            }
            if (usbAccessory != null && usbAccessory.getModel().equals("Android") && !flwn.a.a().H()) {
                j.h().ah(2709).x("Do not handle accessory model 'Android'");
                finish();
                return;
            } else {
                if ("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(intent.getAction())) {
                    h(alcf.FORCE_STARTED);
                } else {
                    h(alcf.ACCESSORY_ATTACHED);
                }
                b(intent);
                return;
            }
        }
        if (c == 2) {
            if (getCallingPackage() != null && aqup.d(this).h(getCallingPackage())) {
                h(alcf.WIRELESS_BRIDGE);
                b(intent);
                return;
            } else {
                h(alcf.UNKNOWN);
                j.i().ah(2710).B("Unknown caller for bridge intent %s", intent);
                finish();
                return;
            }
        }
        if (c != 3) {
            if (c == 4) {
                h(alcf.RESTART);
                k(intent);
                return;
            } else {
                j.i().ah(2708).B("Unknown intent %s", intent);
                h(alcf.UNKNOWN);
                finish();
                return;
            }
        }
        if (!flsh.a.a().j()) {
            h(alcf.CAR_SERVICE);
            k(intent);
        } else if (this.o.a(this, intent)) {
            h(alcf.CAR_SERVICE);
            akue.e(new Runnable() { // from class: alqw
                @Override // java.lang.Runnable
                public final void run() {
                    FirstActivityImpl.this.b(intent);
                }
            });
        } else {
            h(alcf.UNKNOWN);
            j.i().ah(2711).B("Unknown caller for start connection intent %s", intent);
            finish();
        }
    }

    private final void g(elxv elxvVar) {
        aloy aloyVar = this.s;
        eiig.x(aloyVar);
        aloyVar.d(albk.f(elwx.CONNECTIVITY, elxw.FIRST_ACTIVITY, elxvVar).c());
    }

    private final void h(alcf alcfVar) {
        alcl.e(this, "com.google.android.gms.car.FIRST_ACTIVITY", alcfVar);
    }

    private final void k(Intent intent) {
        IBinder iBinder;
        new alrw();
        alqy alqyVar = new alqy(this, intent);
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("0p_checker");
        if (binderParcel == null || (iBinder = binderParcel.a) == null) {
            albo.a("No 0p checker");
            alqyVar.a(false);
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyChecker");
        alrx alrvVar = queryLocalInterface instanceof alrx ? (alrx) queryLocalInterface : new alrv(iBinder);
        alsj alsjVar = new alsj(alrvVar.asBinder(), alqyVar);
        try {
            alrvVar.asBinder().linkToDeath(alsjVar, 0);
            alrvVar.a(alsjVar);
        } catch (RemoteException unused) {
            albo.a("Remote process died before validation");
            alsjVar.binderDied();
        }
    }

    public final deqr a() {
        deqr deqrVar = new deqr(getApplicationContext(), 268435462, "CAR.FIRST", null, "com.google.android.gms");
        deqrVar.j(false);
        return deqrVar;
    }

    public final void b(Intent intent) {
        ejhh ejhhVar = RestartOperation.a;
        boolean a = fluc.a.a().a();
        if (flve.d() && this.q.h() && alsn.b(this)) {
            j.j().ah(2717).B("Detected unsupported device, ignoring %s", intent);
            finish();
            return;
        }
        if (alvs.a.b(this)) {
            j.j().ah(2716).B("Detected user disabled Gearhead, ignoring %s", intent);
            aloy aloyVar = this.s;
            eiig.x(aloyVar);
            aloyVar.d(albk.f(elwx.CAR_SERVICE, elxw.FIRST_ACTIVITY, elxv.qq).c());
            finishAndRemoveTask();
            return;
        }
        if (!a) {
            if ("com.google.android.gms.carsetup.RESTART".equals(intent.getAction())) {
                g(elxv.qp);
                intent = (Intent) intent.getParcelableExtra("original_intent");
                k = true;
            } else if (!alvs.a.c(this) && !k) {
                j.h().ah(2715).x("Gearhead not up-to-date. Restarting");
                g(elxv.qo);
                Intent putExtra = new Intent("com.google.android.gms.carsetup.RESTART").setComponent((ComponentName) akyp.c.a()).putExtra("original_intent", intent);
                Intent startIntent = IntentOperation.getStartIntent(this, RestartOperation.class, "com.google.android.gms.carsetup.DO_RESTART");
                eiig.x(startIntent);
                startIntent.putExtra("binder", new BinderParcel(new alrk()));
                startIntent.putExtra("restart_intent", putExtra);
                startService(startIntent);
                finish();
                return;
            }
        }
        if (alxo.c(this, intent)) {
            j.h().ah(2714).x("PreSetup flow started, exiting for now");
            finishAndRemoveTask();
            return;
        }
        deqr a2 = a();
        this.n = a2;
        a2.c(30000L);
        c(2);
        this.p = new LocalBinder(this, intent, new alxh(this.n));
        Intent putExtra2 = new Intent().setClassName(this, ((ComponentName) akyp.b.a()).getClassName()).putExtra("EXTRA_LOCAL_BINDER", this.p).putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        alcl.h(this, elwq.CAR_SETUP_STARTED_SETUP_SERVICE);
        startService(putExtra2);
    }

    public final void c(int i) {
        Context applicationContext = getApplicationContext();
        if (flsr.a.a().b()) {
            alcl.f(applicationContext, "com.google.android.gms.car.CONNECTIVITY_STAGE_REACHED", i - 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.FirstActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        c(3);
        aloy aloyVar = this.s;
        if (aloyVar != null) {
            aloyVar.a();
        }
        super.onDestroy();
        deqr deqrVar = this.n;
        if (deqrVar != null) {
            deqrVar.g();
            this.n = null;
        }
        LocalBinder localBinder = this.p;
        if (localBinder != null) {
            localBinder.a();
            this.p = null;
        }
        alkr alkrVar = this.r;
        if (alkrVar != null) {
            alkrVar.d(this);
            this.r = null;
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (alxo.d(intent)) {
            return;
        }
        if (flsr.a.a().i()) {
            j.h().ah(2723).B("Received new intent: %s, ignoring it.", intent);
            h(alcf.NEW_INTENT);
        }
        if (flsr.a.a().e()) {
            f(intent);
        }
    }
}
