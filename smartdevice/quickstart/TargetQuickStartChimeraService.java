package com.google.android.gms.smartdevice.quickstart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asiu;
import defpackage.asmf;
import defpackage.asnj;
import defpackage.aspj;
import defpackage.byhr;
import defpackage.dcvf;
import defpackage.dcvt;
import defpackage.ddne;
import defpackage.ddqp;
import defpackage.ddqq;
import defpackage.ddre;
import defpackage.ddri;
import defpackage.ddvk;
import defpackage.ddvp;
import defpackage.ddvt;
import defpackage.ddwf;
import defpackage.ddwl;
import defpackage.ddwm;
import defpackage.ddxo;
import defpackage.ddxq;
import defpackage.ddxu;
import defpackage.ddxv;
import defpackage.ddxw;
import defpackage.ddzf;
import defpackage.decc;
import defpackage.demy;
import defpackage.denq;
import defpackage.denx;
import defpackage.deny;
import defpackage.dfbl;
import defpackage.eigd;
import defpackage.elob;
import defpackage.elpg;
import defpackage.elpn;
import defpackage.elpo;
import defpackage.fecj;
import defpackage.fsfn;
import defpackage.iln;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TargetQuickStartChimeraService extends Service implements dcvt, ddxv {
    public static final arxo a = new denq(new String[]{"TargetQuickStartChimeraService"});
    public static final Object b = new Object();
    public ddxo c;
    public ddxw d;
    public ddvt e;
    public ddzf f;
    private String g;
    private Handler h;
    private deny i;
    private ddvk j;
    private ddwm k;
    private BroadcastReceiver l;

    public static void g(Context context) {
        a.d("Request to stop Service", new Object[0]);
        ddqq.d(context).c(true, true);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
        context.stopService(intent);
    }

    @Override // defpackage.dcvt
    public final void b(BootstrapCompletionResult bootstrapCompletionResult) {
        try {
            ddvk ddvkVar = this.j;
            if (ddvkVar != null) {
                ddvkVar.b(bootstrapCompletionResult);
            }
        } catch (RemoteException e) {
            a.l(e);
        }
    }

    @Override // defpackage.dcvt
    public final boolean c(BootstrapProgressResult bootstrapProgressResult) {
        return false;
    }

    @Override // defpackage.dcvt
    public final void d(int i, ddne ddneVar) {
        this.f.n(i, ddneVar);
        try {
            ddvk ddvkVar = this.j;
            if (ddvkVar != null) {
                ddvkVar.e(i, decc.b(ddneVar));
            }
        } catch (RemoteException e) {
            a.l(e);
        }
    }

    public final void e(int i, TargetQuickStartOptions targetQuickStartOptions, ddvk ddvkVar) {
        byte[] bArr;
        String str;
        long j = targetQuickStartOptions.d;
        arxo arxoVar = a;
        arxoVar.h("Starting QuickStart with flow type %d and session ID %d", Integer.valueOf(i), Long.valueOf(j));
        ddzf ddzfVar = this.f;
        ddzfVar.b = j;
        elpn b2 = elpn.b(i);
        arwm.s(b2);
        ddzfVar.c = b2;
        this.j = ddvkVar;
        boolean z = targetQuickStartOptions.a;
        boolean z2 = !z;
        Trace.beginSection("smartdevice-TargetQuickStartService-initializeBt()");
        Status a2 = this.i.a(true, z2);
        Trace.endSection();
        if (!a2.e()) {
            arxoVar.f("Failed to enable bluetooth", new Object[0]);
            this.i.c(true, true);
            return;
        }
        denx denxVar = this.i.c;
        if (denxVar == null) {
            throw new IllegalStateException("Resources have not been initialized");
        }
        String replace = denxVar.b().replace(":", "");
        if (replace.length() != 12) {
            bArr = null;
        } else {
            bArr = new byte[6];
            try {
                bArr = aspj.c(replace);
            } catch (IllegalArgumentException unused) {
            }
        }
        String c = asnj.c(bArr);
        if (z) {
            a.d("QA latency - start second advertising timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
            ddzf ddzfVar2 = this.f;
            boolean z3 = targetQuickStartOptions.b;
            fecj v = elpg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            elpg elpgVar = (elpg) v.b;
            elpgVar.b |= 1;
            elpgVar.c = z3;
            elpg elpgVar2 = (elpg) v.Q();
            fecj t = ddzfVar2.t(elob.START_SECONDARY_ADVERTISING);
            if (!t.b.L()) {
                t.U();
            }
            elpo elpoVar = (elpo) t.b;
            elpo elpoVar2 = elpo.a;
            elpgVar2.getClass();
            elpoVar.m = elpgVar2;
            elpoVar.b |= 8192;
            ddzfVar2.k((elpo) t.Q());
            this.g = targetQuickStartOptions.c;
            new ddqp(this).b(asnj.d(this.g), j);
        } else {
            this.f.o(elob.START_INITIAL_ADVERTISING);
            arxo arxoVar2 = a;
            arxoVar2.d("QA latency - start first advertising timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
            if (this.g == null) {
                this.g = asnj.a(dcvf.c());
            }
            String str2 = this.g;
            if (c == null || str2 == null) {
                str = null;
            } else {
                str = Uri.parse(fsfn.l()).buildUpon().appendPath(c).appendQueryParameter("key", str2).appendQueryParameter("t", String.valueOf((int) ddre.a(this))).appendQueryParameter("o", String.valueOf(eigd.e(Build.MANUFACTURER, "samsung") ? 1 : eigd.e(Build.MANUFACTURER, "google") ? 2 : 0)).appendQueryParameter("f", String.valueOf(i)).toString();
            }
            try {
                arxoVar2.d("Update deeplinkUrl", new Object[0]);
                arwm.s(str);
                ddvkVar.f(ddwf.a(1, str, null, 0, false, null, 0, null, false, null, 0));
            } catch (RemoteException e) {
                a.g("Failed to send onEvent callback", e, new Object[0]);
            }
        }
        arxo arxoVar3 = a;
        arxoVar3.d("Advertising Info: encodedKey=%s advertisingId=%s", this.g, c);
        if (this.c.i) {
            arxoVar3.j("Already connected to source, skipping advertising", new Object[0]);
            try {
                ddvkVar.c();
                ddxw ddxwVar = this.d;
                if (ddxwVar != null) {
                    ddxwVar.h = ddvkVar;
                    ddxwVar.s = 1003;
                    ddxwVar.q = i;
                    this.c.b = new ddxq(ddvkVar, this.d, this.f);
                    return;
                }
                return;
            } catch (RemoteException e2) {
                a.l(e2);
                return;
            }
        }
        ddxw ddxwVar2 = new ddxw(this, this.h, ddvkVar, this, this.f, i);
        this.d = ddxwVar2;
        ddxwVar2.k = j;
        ddxwVar2.r = targetQuickStartOptions.e;
        if (z) {
            ddxwVar2.s = 1002;
            ddwm ddwmVar = new ddwm(this);
            this.k = ddwmVar;
            arxo arxoVar4 = ddwm.a;
            arxoVar4.d("Binding to SUW backup service", new Object[0]);
            ddwmVar.c = new ddwl(ddwmVar);
            Intent intent = new Intent("com.google.android.setupwizard.pairing.NearbyBackupService.BIND");
            intent.setPackage("com.google.android.setupwizard");
            if (!asiu.a().d(ddwmVar.b, intent, ddwmVar.c, 0)) {
                arxoVar4.m("Cannot bind to SuW Nearby Backup Service. It is not running or exist", new Object[0]);
                ddwmVar.d.o(elob.BACKUP_CONNECTION_SERVICE_BIND_FAILED);
            }
        } else {
            ddxwVar2.s = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        }
        AdvertisingInfo advertisingInfo = new AdvertisingInfo(null, Build.MODEL, this.g, c, z2);
        ddxo ddxoVar = this.c;
        ddxq ddxqVar = new ddxq(ddvkVar, this.d, this.f);
        if (ddxoVar.b != null) {
            ddxo.a.m("Already advertising!", new Object[0]);
            ddxoVar.b = ddxqVar;
            dfbl.d(null);
        } else {
            ddxoVar.b = ddxqVar;
            ddxoVar.d(i, advertisingInfo);
        }
        if (z) {
            ddxw ddxwVar3 = this.d;
            if (ddxwVar3.p == null) {
                long h = fsfn.a.a().h();
                ddxwVar3.p = new ddri(new asmf(1, 10), null, h, new ddxu(ddxwVar3, h));
            }
            ddxwVar3.p.a();
        }
    }

    public final void f() {
        a.d("Stopping advertising.", new Object[0]);
        if (fsfn.m()) {
            synchronized (b) {
                this.c.e();
            }
        } else {
            this.c.e();
        }
        ddxw ddxwVar = this.d;
        if (ddxwVar != null) {
            ddxwVar.A();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        a.d("onBind", new Object[0]);
        return new ddvp(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.d("onCreate().", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("TargetQuickStartBackground", 10);
        handlerThread.start();
        this.h = new byhr(handlerThread.getLooper());
        this.f = ddzf.i(this);
        this.i = ddqq.d(this);
        this.c = new ddxo(this.h, this, ddqq.a(this, "quickStart"), this.f);
        this.l = new TracingBroadcastReceiver(this) { // from class: com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent) {
                String action;
                if (intent == null || (action = intent.getAction()) == null) {
                    return;
                }
                if (action.equals("com.google.android.setupwizard.SETUP_WIZARD_FINISHED") || action.equals("com.google.android.setupwizard.SETUP_WIZARD_OTA_DETECTED")) {
                    TargetQuickStartChimeraService.a.d("Received SUW action: ".concat(action), new Object[0]);
                    TargetQuickStartChimeraService targetQuickStartChimeraService = TargetQuickStartChimeraService.this;
                    if (targetQuickStartChimeraService.d == null || !targetQuickStartChimeraService.c.i) {
                        TargetQuickStartChimeraService.g(targetQuickStartChimeraService);
                        return;
                    }
                    String str = true != action.equals("com.google.android.setupwizard.SETUP_WIZARD_FINISHED") ? "request_incoming_ota_update" : "request_suw_completed";
                    ddxw ddxwVar = targetQuickStartChimeraService.d;
                    ddxw.f.h("Notify source of SUW action: ".concat(str), new Object[0]);
                    ddxwVar.n = true;
                    if (str.equals("request_incoming_ota_update")) {
                        ddxwVar.j.o(elob.NOTIFY_OTA_UPDATE);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(str, true);
                        ddxwVar.n(jSONObject);
                    } catch (JSONException e) {
                        ddxw.f.l(e);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("com.google.android.setupwizard.SETUP_WIZARD_FINISHED");
        intentFilter.addAction("com.google.android.setupwizard.SETUP_WIZARD_OTA_DETECTED");
        iln.c(this, this.l, intentFilter, null, null, 2);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.d("onDestroy().", new Object[0]);
        unregisterReceiver(this.l);
        demy.a(this.h);
        f();
        ddwm ddwmVar = this.k;
        if (ddwmVar != null && ddwmVar.c != null) {
            asiu.a().c(ddwmVar.b, ddwmVar.c);
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a.d("onStartCommand", new Object[0]);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        a.d("onUnbind()", new Object[0]);
        return false;
    }

    @Override // defpackage.dcvt
    public final void a(String str) {
    }
}
