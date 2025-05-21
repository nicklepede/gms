package com.google.android.gms.motionsicknessassist.service;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.provider.Settings;
import android.view.WindowManager;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.motionsicknessassist.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.motionsicknessassist.service.MotionSicknessAssistChimeraService;
import defpackage.aqxd;
import defpackage.aseu;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asmb;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqt;
import defpackage.asqu;
import defpackage.asrb;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bziq;
import defpackage.cabh;
import defpackage.cett;
import defpackage.cetu;
import defpackage.ceub;
import defpackage.ceuv;
import defpackage.cevj;
import defpackage.dnaj;
import defpackage.dnam;
import defpackage.dnan;
import defpackage.dnao;
import defpackage.dnap;
import defpackage.dnaq;
import defpackage.dnas;
import defpackage.dnat;
import defpackage.dnav;
import defpackage.dnlj;
import defpackage.eijr;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.fqiw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MotionSicknessAssistChimeraService extends Service implements asqt {
    private static final asot b = cetu.a("UI Service");
    private static final eits c = eits.n(ceub.QUICK_SETTINGS, aseu.MOTIONSICKNESSASSIST_OVERLAY_START_TRIGGER_QUICK_SETTINGS, ceub.MANUAL_SETTINGS, aseu.MOTIONSICKNESSASSIST_OVERLAY_START_TRIGGER_MANUAL, ceub.AUTOMATIC_CAR_DETECTION, aseu.MOTIONSICKNESSASSIST_OVERLAY_START_TRIGGER_AUTO);
    private static final eits d = eits.n(ceub.QUICK_SETTINGS, aseu.MOTIONSICKNESSASSIST_OVERLAY_END_TRIGGER_QUICK_SETTINGS, ceub.MANUAL_SETTINGS, aseu.MOTIONSICKNESSASSIST_OVERLAY_END_TRIGGER_MANUAL, ceub.AUTOMATIC_CAR_DETECTION, aseu.MOTIONSICKNESSASSIST_OVERLAY_END_TRIGGER_AUTO);
    public dnas a;
    private Context e;
    private ceuv f;
    private int g;
    private int h;
    private TracingBroadcastReceiver i;
    private asqu j;

    public static void c(Context context, ceub ceubVar) {
        asot asotVar = b;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 6456)).x("startDrawingBubbles()");
        asot asotVar2 = cett.a;
        if (!Settings.canDrawOverlays(context)) {
            ((ejhf) ((ejhf) asotVar.i()).ah((char) 6457)).x("Failed to start drawing bubbles. Missing overlay permissions.");
            return;
        }
        if (ceubVar != null) {
            eits eitsVar = c;
            if (eitsVar.containsKey(ceubVar)) {
                eijr eijrVar = bqqe.a;
                bqqa.a((aseu) eitsVar.get(ceubVar));
            }
        }
        Intent i = asng.i("com.google.android.gms.motionsicknessassist.service.MotionSicknessAssistService");
        i.setAction("com.google.android.gms.motionsicknessassist.ACTION_START_DRAWING_BUBBLES");
        context.startService(i);
    }

    public static void d(Context context, ceub ceubVar) {
        ((ejhf) ((ejhf) b.h()).ah((char) 6458)).x("stopDrawingBubbles()");
        if (ceubVar != null) {
            eits eitsVar = d;
            if (eitsVar.containsKey(ceubVar)) {
                eijr eijrVar = bqqe.a;
                bqqa.a((aseu) eitsVar.get(ceubVar));
            }
        }
        context.stopService(asng.i("com.google.android.gms.motionsicknessassist.service.MotionSicknessAssistService"));
    }

    private final void f() {
        dnas dnasVar = this.a;
        int h = this.f.p() ? (int) fqiw.a.a().h() : 0;
        dnam dnamVar = ((dnat) dnasVar).f;
        if (dnamVar.c == h) {
            return;
        }
        ((ejhf) ((ejhf) dnam.a.h()).ah((char) 12105)).z("Configuring bubble shape/color randomizer with interval=%s", h);
        dnamVar.c = h;
        if (h == 0) {
            dnamVar.d();
        } else if (dnamVar.d) {
            dnamVar.b();
        }
    }

    @Override // defpackage.asqt
    public final void a() {
        dnat dnatVar = (dnat) this.a;
        if (dnatVar.h == 3) {
            ((ejhf) ((ejhf) dnat.a.j()).ah((char) 12109)).x("Ignoring dupe call to pauseDrawingHints. Already paused.");
            return;
        }
        dnatVar.b.c();
        dnav dnavVar = dnatVar.d;
        SensorManager sensorManager = dnavVar.e;
        sensorManager.unregisterListener(dnavVar, dnavVar.c);
        sensorManager.unregisterListener(dnavVar, dnavVar.b);
        dnavVar.a();
        dnatVar.f.c();
        dnatVar.h = 3;
    }

    @Override // defpackage.asqt
    public final void b() {
        asrb.a(new Runnable() { // from class: cetz
            @Override // java.lang.Runnable
            public final void run() {
                MotionSicknessAssistChimeraService.this.a.a();
            }
        });
    }

    public final void e() {
        f();
        dnap dnapVar = new dnap(((dnat) this.a).g);
        if (!this.f.p()) {
            dnapVar.c(this.f.m());
            dnapVar.f(this.f.n());
        }
        dnapVar.d(this.f.a());
        dnas dnasVar = this.a;
        dnaq a = dnapVar.a();
        dnat dnatVar = (dnat) dnasVar;
        dnatVar.g = a;
        dnatVar.b.a(a);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.h != configuration.uiMode) {
            this.h = configuration.uiMode;
            e();
        }
        if (this.g != configuration.orientation) {
            this.g = configuration.orientation;
            dnas dnasVar = this.a;
            if (dnasVar != null) {
                dnat dnatVar = (dnat) dnasVar;
                WindowManager windowManager = dnatVar.e;
                if (windowManager == null) {
                    ((ejhf) ((ejhf) dnat.a.j()).ah((char) 12110)).x("WindowManager is null. Ignoring call to reDrawHints.");
                    return;
                }
                dnatVar.d.m = windowManager.getDefaultDisplay().getRotation();
                dnaj dnajVar = dnatVar.b;
                if (!dnajVar.h) {
                    ((ejhf) ((ejhf) dnaj.a.h()).ah((char) 12100)).x("MotionBubbles not started. Ignoring call to reDraw.");
                } else {
                    dnajVar.c();
                    dnajVar.b();
                }
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ((ejhf) ((ejhf) b.h()).ah((char) 6449)).x("Creating service");
        super.onCreate();
        this.e = AppContextProvider.a();
        cevj cevjVar = new cevj(this.e);
        this.f = cevjVar;
        this.i = cevjVar.b(new Runnable() { // from class: ceua
            @Override // java.lang.Runnable
            public final void run() {
                MotionSicknessAssistChimeraService.this.e();
            }
        });
        dnan a = dnao.a();
        a.b((int) fqiw.a.a().f());
        fqiw fqiwVar = fqiw.a;
        a.d((int) fqiwVar.a().k());
        a.c((float) fqiwVar.a().b());
        a.e((float) fqiwVar.a().d());
        dnao a2 = a.a();
        String m = this.f.m();
        String n = this.f.n();
        float a3 = this.f.a();
        dnap a4 = dnaq.a();
        a4.c(m);
        a4.f(n);
        a4.d(a3);
        a4.l((int) fqiwVar.a().m());
        a4.m((int) fqiwVar.a().n());
        a4.e((int) fqiwVar.a().g());
        a4.b((int) fqiwVar.a().e());
        a4.g((int) fqiwVar.a().i());
        a4.h((int) fqiwVar.a().j());
        a4.i(fqiwVar.a().o());
        a4.j((float) fqiwVar.a().c());
        a4.k((int) fqiwVar.a().l());
        dnaq a5 = a4.a();
        Context context = this.e;
        aqxd aqxdVar = bziq.a;
        this.a = new dnat(context, a2, a5, new cabh(this), new asmb(1, 9), new dnlj());
        asqu asquVar = new asqu(this.e, new aslv(new aslw("MotionSicknessAssistChimeraService", 9)));
        this.j = asquVar;
        asquVar.b(this);
        f();
        this.g = getResources().getConfiguration().orientation;
        this.h = getResources().getConfiguration().uiMode;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ((ejhf) ((ejhf) b.h()).ah((char) 6450)).x("Destroying service");
        dnat dnatVar = (dnat) this.a;
        if (dnatVar.h == 2) {
            ((ejhf) ((ejhf) dnat.a.j()).ah((char) 12112)).x("Ignoring dupe call to stopDrawingHints. Already stopped.");
        } else {
            dnatVar.b.c();
            dnav dnavVar = dnatVar.d;
            dnavVar.e.unregisterListener(dnavVar);
            dnavVar.n = false;
            dnavVar.a();
            dnatVar.f.c();
            dnatVar.h = 2;
        }
        this.j.c();
        this.f.o(this.i);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        asot asotVar = b;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 6453)).B("onStartCommand: intent: %s", intent);
        if (!fqiw.d()) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 6455)).x("Feature unavailable. Exiting");
            stopSelf(i2);
        }
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 6454)).B("Intent %s has an invalid action. Exiting", intent);
            stopSelf(i2);
            return 2;
        }
        if (!action.equals("com.google.android.gms.motionsicknessassist.ACTION_START_DRAWING_BUBBLES")) {
            return 2;
        }
        this.a.a();
        return 2;
    }
}
