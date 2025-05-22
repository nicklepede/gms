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
import defpackage.atzb;
import defpackage.auad;
import defpackage.aumo;
import defpackage.aupz;
import defpackage.aurd;
import defpackage.autd;
import defpackage.caqj;
import defpackage.dfgk;
import defpackage.dfgy;
import defpackage.dfyj;
import defpackage.dgbu;
import defpackage.dgbv;
import defpackage.dgcj;
import defpackage.dgcn;
import defpackage.dggp;
import defpackage.dggu;
import defpackage.dggy;
import defpackage.dghp;
import defpackage.dghq;
import defpackage.dgis;
import defpackage.dgiu;
import defpackage.dgiy;
import defpackage.dgiz;
import defpackage.dgja;
import defpackage.dgkj;
import defpackage.dgnf;
import defpackage.dgyb;
import defpackage.dgyt;
import defpackage.dgza;
import defpackage.dgzb;
import defpackage.dhmr;
import defpackage.ekti;
import defpackage.eobp;
import defpackage.eocu;
import defpackage.eodb;
import defpackage.eodc;
import defpackage.fgrc;
import defpackage.fvak;
import defpackage.ind;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TargetQuickStartChimeraService extends Service implements dfgy, dgiz {
    public static final auad a = new dgyt(new String[]{"TargetQuickStartChimeraService"});
    public static final Object b = new Object();
    public dgis c;
    public dgja d;
    public dggy e;
    public dgkj f;
    private String g;
    private Handler h;
    private dgzb i;
    private dggp j;
    private dghq k;
    private BroadcastReceiver l;

    public static void g(Context context) {
        a.d("Request to stop Service", new Object[0]);
        dgbv.d(context).c(true, true);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
        context.stopService(intent);
    }

    @Override // defpackage.dfgy
    public final void b(BootstrapCompletionResult bootstrapCompletionResult) {
        try {
            dggp dggpVar = this.j;
            if (dggpVar != null) {
                dggpVar.b(bootstrapCompletionResult);
            }
        } catch (RemoteException e) {
            a.l(e);
        }
    }

    @Override // defpackage.dfgy
    public final boolean c(BootstrapProgressResult bootstrapProgressResult) {
        return false;
    }

    @Override // defpackage.dfgy
    public final void d(int i, dfyj dfyjVar) {
        this.f.n(i, dfyjVar);
        try {
            dggp dggpVar = this.j;
            if (dggpVar != null) {
                dggpVar.e(i, dgnf.b(dfyjVar));
            }
        } catch (RemoteException e) {
            a.l(e);
        }
    }

    public final void e(int i, TargetQuickStartOptions targetQuickStartOptions, dggp dggpVar) {
        byte[] bArr;
        String str;
        long j = targetQuickStartOptions.d;
        auad auadVar = a;
        auadVar.h("Starting QuickStart with flow type %d and session ID %d", Integer.valueOf(i), Long.valueOf(j));
        dgkj dgkjVar = this.f;
        dgkjVar.b = j;
        eodb b2 = eodb.b(i);
        atzb.s(b2);
        dgkjVar.c = b2;
        this.j = dggpVar;
        boolean z = targetQuickStartOptions.a;
        boolean z2 = !z;
        Trace.beginSection("smartdevice-TargetQuickStartService-initializeBt()");
        Status a2 = this.i.a(true, z2);
        Trace.endSection();
        if (!a2.e()) {
            auadVar.f("Failed to enable bluetooth", new Object[0]);
            this.i.c(true, true);
            return;
        }
        dgza dgzaVar = this.i.c;
        if (dgzaVar == null) {
            throw new IllegalStateException("Resources have not been initialized");
        }
        String replace = dgzaVar.b().replace(":", "");
        if (replace.length() != 12) {
            bArr = null;
        } else {
            bArr = new byte[6];
            try {
                bArr = autd.c(replace);
            } catch (IllegalArgumentException unused) {
            }
        }
        String c = aurd.c(bArr);
        if (z) {
            a.d("QA latency - start second advertising timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
            dgkj dgkjVar2 = this.f;
            boolean z3 = targetQuickStartOptions.b;
            fgrc v = eocu.a.v();
            if (!v.b.L()) {
                v.U();
            }
            eocu eocuVar = (eocu) v.b;
            eocuVar.b |= 1;
            eocuVar.c = z3;
            eocu eocuVar2 = (eocu) v.Q();
            fgrc t = dgkjVar2.t(eobp.START_SECONDARY_ADVERTISING);
            if (!t.b.L()) {
                t.U();
            }
            eodc eodcVar = (eodc) t.b;
            eodc eodcVar2 = eodc.a;
            eocuVar2.getClass();
            eodcVar.m = eocuVar2;
            eodcVar.b |= 8192;
            dgkjVar2.k((eodc) t.Q());
            this.g = targetQuickStartOptions.c;
            new dgbu(this).b(aurd.d(this.g), j);
        } else {
            this.f.o(eobp.START_INITIAL_ADVERTISING);
            auad auadVar2 = a;
            auadVar2.d("QA latency - start first advertising timestamp: %d", Long.valueOf(SystemClock.elapsedRealtime()));
            if (this.g == null) {
                this.g = aurd.a(dfgk.c());
            }
            String str2 = this.g;
            if (c == null || str2 == null) {
                str = null;
            } else {
                str = Uri.parse(fvak.l()).buildUpon().appendPath(c).appendQueryParameter("key", str2).appendQueryParameter("t", String.valueOf((int) dgcj.a(this))).appendQueryParameter("o", String.valueOf(ekti.e(Build.MANUFACTURER, "samsung") ? 1 : ekti.e(Build.MANUFACTURER, "google") ? 2 : 0)).appendQueryParameter("f", String.valueOf(i)).toString();
            }
            try {
                auadVar2.d("Update deeplinkUrl", new Object[0]);
                atzb.s(str);
                dggpVar.f(new QuickStartTargetEventData(1, str, null, 0, false, null, 0, null, false, null, 0));
            } catch (RemoteException e) {
                a.g("Failed to send onEvent callback", e, new Object[0]);
            }
        }
        auad auadVar3 = a;
        auadVar3.d("Advertising Info: encodedKey=%s advertisingId=%s", this.g, c);
        if (this.c.i) {
            auadVar3.j("Already connected to source, skipping advertising", new Object[0]);
            try {
                dggpVar.c();
                dgja dgjaVar = this.d;
                if (dgjaVar != null) {
                    dgjaVar.h = dggpVar;
                    dgjaVar.s = 1003;
                    dgjaVar.q = i;
                    this.c.b = new dgiu(dggpVar, this.d, this.f);
                    return;
                }
                return;
            } catch (RemoteException e2) {
                a.l(e2);
                return;
            }
        }
        dgja dgjaVar2 = new dgja(this, this.h, dggpVar, this, this.f, i);
        this.d = dgjaVar2;
        dgjaVar2.k = j;
        dgjaVar2.r = targetQuickStartOptions.e;
        if (z) {
            dgjaVar2.s = 1002;
            dghq dghqVar = new dghq(this);
            this.k = dghqVar;
            auad auadVar4 = dghq.a;
            auadVar4.d("Binding to SUW backup service", new Object[0]);
            dghqVar.c = new dghp(dghqVar);
            Intent intent = new Intent("com.google.android.setupwizard.pairing.NearbyBackupService.BIND");
            intent.setPackage("com.google.android.setupwizard");
            if (!aumo.a().d(dghqVar.b, intent, dghqVar.c, 0)) {
                auadVar4.m("Cannot bind to SuW Nearby Backup Service. It is not running or exist", new Object[0]);
                dghqVar.d.o(eobp.BACKUP_CONNECTION_SERVICE_BIND_FAILED);
            }
        } else {
            dgjaVar2.s = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        }
        AdvertisingInfo advertisingInfo = new AdvertisingInfo(null, Build.MODEL, this.g, c, z2);
        dgis dgisVar = this.c;
        dgiu dgiuVar = new dgiu(dggpVar, this.d, this.f);
        if (dgisVar.b != null) {
            dgis.a.m("Already advertising!", new Object[0]);
            dgisVar.b = dgiuVar;
            dhmr.d(null);
        } else {
            dgisVar.b = dgiuVar;
            dgisVar.d(i, advertisingInfo);
        }
        if (z) {
            dgja dgjaVar3 = this.d;
            if (dgjaVar3.p == null) {
                long h = fvak.a.lK().h();
                dgjaVar3.p = new dgcn(new aupz(1, 10), null, h, new dgiy(dgjaVar3, h));
            }
            dgjaVar3.p.a();
        }
    }

    public final void f() {
        a.d("Stopping advertising.", new Object[0]);
        if (fvak.m()) {
            synchronized (b) {
                this.c.e();
            }
        } else {
            this.c.e();
        }
        dgja dgjaVar = this.d;
        if (dgjaVar != null) {
            dgjaVar.A();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        a.d("onBind", new Object[0]);
        return new dggu(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.d("onCreate().", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("TargetQuickStartBackground", 10);
        handlerThread.start();
        this.h = new caqj(handlerThread.getLooper());
        this.f = dgkj.i(this);
        this.i = dgbv.d(this);
        this.c = new dgis(this.h, this, dgbv.a(this, "quickStart"), this.f);
        this.l = new TracingBroadcastReceiver(this) { // from class: com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
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
                    dgja dgjaVar = targetQuickStartChimeraService.d;
                    dgja.f.h("Notify source of SUW action: ".concat(str), new Object[0]);
                    dgjaVar.n = true;
                    if (str.equals("request_incoming_ota_update")) {
                        dgjaVar.j.o(eobp.NOTIFY_OTA_UPDATE);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(str, true);
                        dgjaVar.n(jSONObject);
                    } catch (JSONException e) {
                        dgja.f.l(e);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("com.google.android.setupwizard.SETUP_WIZARD_FINISHED");
        intentFilter.addAction("com.google.android.setupwizard.SETUP_WIZARD_OTA_DETECTED");
        ind.c(this, this.l, intentFilter, null, null, 2);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.d("onDestroy().", new Object[0]);
        unregisterReceiver(this.l);
        dgyb.a(this.h);
        f();
        dghq dghqVar = this.k;
        if (dghqVar != null && dghqVar.c != null) {
            aumo.a().c(dghqVar.b, dghqVar.c);
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

    @Override // defpackage.dfgy
    public final void a(String str) {
    }
}
