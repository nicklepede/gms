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
import defpackage.amte;
import defpackage.amvp;
import defpackage.anaa;
import defpackage.ancv;
import defpackage.ancy;
import defpackage.ancz;
import defpackage.andq;
import defpackage.andw;
import defpackage.anmc;
import defpackage.anqj;
import defpackage.ansj;
import defpackage.ansv;
import defpackage.antg;
import defpackage.anth;
import defpackage.anti;
import defpackage.antu;
import defpackage.anty;
import defpackage.anxc;
import defpackage.anxd;
import defpackage.anys;
import defpackage.anyz;
import defpackage.anzj;
import defpackage.anzm;
import defpackage.asxe;
import defpackage.dhbu;
import defpackage.ekvl;
import defpackage.eluq;
import defpackage.eoke;
import defpackage.eokl;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.fojt;
import defpackage.fokd;
import defpackage.foll;
import defpackage.fomn;
import defpackage.fonw;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FirstActivityImpl extends ryt {
    static boolean k;
    static boolean l;
    public dhbu n;
    private final anzj o = new anzm();
    private LocalBinder p;
    private amte q;
    private anmc r;
    private anqj s;
    public static final eluq j = ancy.a("CAR.FIRST");
    static final long m = SystemClock.elapsedRealtime();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class LocalBinder extends SetupBinder {
        private FirstActivityImpl b;

        public LocalBinder(FirstActivityImpl firstActivityImpl, Intent intent, anys anysVar) {
            super(intent, anysVar);
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
            h(andq.INVALID);
            finish();
            return;
        }
        if (intent.getAction() == null) {
            j.i().ai(2716).B("First activity intent has null action: %s", intent);
            h(andq.UNKNOWN);
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
            if (fokd.a.lK().f() && usbAccessory != null && usbAccessory.getVersion() == null) {
                andw.h(getApplicationContext(), eoke.USB_ISSUE_NO_VERSION_FIELD);
            }
            if (usbAccessory != null && usbAccessory.getModel().equals("Android") && !fonw.a.lK().H()) {
                j.h().ai(2713).x("Do not handle accessory model 'Android'");
                finish();
                return;
            } else {
                if ("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(intent.getAction())) {
                    h(andq.FORCE_STARTED);
                } else {
                    h(andq.ACCESSORY_ATTACHED);
                }
                b(intent);
                return;
            }
        }
        if (c == 2) {
            if (getCallingPackage() != null && asxe.d(this).h(getCallingPackage())) {
                h(andq.WIRELESS_BRIDGE);
                b(intent);
                return;
            } else {
                h(andq.UNKNOWN);
                j.i().ai(2714).B("Unknown caller for bridge intent %s", intent);
                finish();
                return;
            }
        }
        if (c != 3) {
            if (c == 4) {
                h(andq.RESTART);
                k(intent);
                return;
            } else {
                j.i().ai(2712).B("Unknown intent %s", intent);
                h(andq.UNKNOWN);
                finish();
                return;
            }
        }
        if (!fojt.a.lK().j()) {
            h(andq.CAR_SERVICE);
            k(intent);
        } else if (this.o.a(this, intent)) {
            h(andq.CAR_SERVICE);
            amvp.e(new Runnable() { // from class: ansh
                @Override // java.lang.Runnable
                public final void run() {
                    FirstActivityImpl.this.b(intent);
                }
            });
        } else {
            h(andq.UNKNOWN);
            j.i().ai(2715).B("Unknown caller for start connection intent %s", intent);
            finish();
        }
    }

    private final void g(eolj eoljVar) {
        anqj anqjVar = this.s;
        ekvl.y(anqjVar);
        anqjVar.d(ancv.f(eokl.CONNECTIVITY, eolk.FIRST_ACTIVITY, eoljVar).c());
    }

    private final void h(andq andqVar) {
        andw.e(this, "com.google.android.gms.car.FIRST_ACTIVITY", andqVar);
    }

    private final void k(Intent intent) {
        IBinder iBinder;
        new anth();
        ansj ansjVar = new ansj(this, intent);
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("0p_checker");
        if (binderParcel == null || (iBinder = binderParcel.a) == null) {
            ancz.a("No 0p checker");
            ansjVar.a(false);
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyChecker");
        anti antgVar = queryLocalInterface instanceof anti ? (anti) queryLocalInterface : new antg(iBinder);
        antu antuVar = new antu(antgVar.asBinder(), ansjVar);
        try {
            antgVar.asBinder().linkToDeath(antuVar, 0);
            antgVar.a(antuVar);
        } catch (RemoteException unused) {
            ancz.a("Remote process died before validation");
            antuVar.binderDied();
        }
    }

    public final dhbu a() {
        dhbu dhbuVar = new dhbu(getApplicationContext(), 268435462, "CAR.FIRST", null, "com.google.android.gms");
        dhbuVar.j(false);
        return dhbuVar;
    }

    public final void b(Intent intent) {
        eluq eluqVar = RestartOperation.a;
        boolean a = foll.a.lK().a();
        if (fomn.d() && this.q.h() && anty.b(this)) {
            j.j().ai(2721).B("Detected unsupported device, ignoring %s", intent);
            finish();
            return;
        }
        anxc anxcVar = anxd.a;
        if (anxcVar.b(this)) {
            j.j().ai(2720).B("Detected user disabled Gearhead, ignoring %s", intent);
            anqj anqjVar = this.s;
            ekvl.y(anqjVar);
            anqjVar.d(ancv.f(eokl.CAR_SERVICE, eolk.FIRST_ACTIVITY, eolj.qv).c());
            finishAndRemoveTask();
            return;
        }
        if (!a) {
            if ("com.google.android.gms.carsetup.RESTART".equals(intent.getAction())) {
                g(eolj.qu);
                intent = (Intent) intent.getParcelableExtra("original_intent");
                k = true;
            } else if (!anxcVar.c(this) && !k) {
                j.h().ai(2719).x("Gearhead not up-to-date. Restarting");
                g(eolj.qt);
                Intent putExtra = new Intent("com.google.android.gms.carsetup.RESTART").setComponent((ComponentName) anaa.c.lK()).putExtra("original_intent", intent);
                Intent startIntent = IntentOperation.getStartIntent(this, RestartOperation.class, "com.google.android.gms.carsetup.DO_RESTART");
                ekvl.y(startIntent);
                startIntent.putExtra("binder", new BinderParcel(new ansv()));
                startIntent.putExtra("restart_intent", putExtra);
                startService(startIntent);
                finish();
                return;
            }
        }
        if (anyz.c(this, intent)) {
            j.h().ai(2718).x("PreSetup flow started, exiting for now");
            finishAndRemoveTask();
            return;
        }
        dhbu a2 = a();
        this.n = a2;
        a2.c(30000L);
        c(2);
        this.p = new LocalBinder(this, intent, new anys(this.n));
        Intent putExtra2 = new Intent().setClassName(this, ((ComponentName) anaa.b.lK()).getClassName()).putExtra("EXTRA_LOCAL_BINDER", this.p).putExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        andw.h(this, eoke.CAR_SETUP_STARTED_SETUP_SERVICE);
        startService(putExtra2);
    }

    public final void c(int i) {
        Context applicationContext = getApplicationContext();
        if (fokd.a.lK().b()) {
            andw.f(applicationContext, "com.google.android.gms.car.CONNECTIVITY_STAGE_REACHED", i - 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.FirstActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        c(3);
        anqj anqjVar = this.s;
        if (anqjVar != null) {
            anqjVar.a();
        }
        super.onDestroy();
        dhbu dhbuVar = this.n;
        if (dhbuVar != null) {
            dhbuVar.g();
            this.n = null;
        }
        LocalBinder localBinder = this.p;
        if (localBinder != null) {
            localBinder.a();
            this.p = null;
        }
        anmc anmcVar = this.r;
        if (anmcVar != null) {
            anmcVar.d(this);
            this.r = null;
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (anyz.d(intent)) {
            return;
        }
        fokd fokdVar = fokd.a;
        if (fokdVar.lK().i()) {
            j.h().ai(2727).B("Received new intent: %s, ignoring it.", intent);
            h(andq.NEW_INTENT);
        }
        if (fokdVar.lK().e()) {
            f(intent);
        }
    }
}
