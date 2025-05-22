package com.google.android.gms.nearby.messages.service;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.CopresenceBroadcastReceiver;
import com.google.android.gms.nearby.messages.GcmChimeraBroadcastReceiver;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.Update;
import defpackage.atos;
import defpackage.aumo;
import defpackage.ausn;
import defpackage.autx;
import defpackage.bsj;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.caqj;
import defpackage.cher;
import defpackage.chjy;
import defpackage.chjz;
import defpackage.cmgv;
import defpackage.cmik;
import defpackage.cmiq;
import defpackage.cmiu;
import defpackage.cmko;
import defpackage.cmlr;
import defpackage.cmmm;
import defpackage.cmnx;
import defpackage.cmol;
import defpackage.cmpg;
import defpackage.cmph;
import defpackage.cmpi;
import defpackage.cmpj;
import defpackage.cmpk;
import defpackage.cmpl;
import defpackage.cmpm;
import defpackage.cmpn;
import defpackage.cmpo;
import defpackage.cmpp;
import defpackage.cmpr;
import defpackage.cmps;
import defpackage.cmqk;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.elpp;
import defpackage.elqn;
import defpackage.eluo;
import defpackage.ezqc;
import defpackage.ezqh;
import defpackage.ezqj;
import defpackage.fiwy;
import defpackage.fixk;
import defpackage.ftfk;
import defpackage.ind;
import defpackage.irm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NearbyMessagesChimeraService extends Service implements chjz {
    public static final Object a = new Object();
    private static final elhz i = new elqn("android.permission-group.MICROPHONE");
    private static final elgx j = elgx.l("android.permission-group.MICROPHONE", Integer.valueOf(R.string.messages_microphone_permission));
    private static boolean k;
    private static WeakReference l;
    public Map b;
    public CountDownLatch c;
    public CopresenceBroadcastReceiver d;
    public cmqk e;
    public chjy f;
    public ezqc g;
    public cmgv h;
    private ServiceConnection m;
    private BroadcastReceiver n;
    private BroadcastReceiver o;
    private autx p;
    private final ezqj q = new cmpg(this);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class AppUninstallAndForceStopReceiver extends TracingBroadcastReceiver {
        public AppUninstallAndForceStopReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            ausn ausnVar = cher.a;
            intent.getAction();
            Uri data = intent.getData();
            if (data != null) {
                NearbyMessagesChimeraService.this.i(data.getSchemeSpecificPart(), true);
            }
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class OptInChangeBroadcastReceiver extends TracingBroadcastReceiver {
        public OptInChangeBroadcastReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            NearbyMessagesChimeraService.this.g.f(new cmpp(this, intent, context));
        }
    }

    public static synchronized chjy a() {
        synchronized (NearbyMessagesChimeraService.class) {
            WeakReference weakReference = l;
            if (weakReference == null) {
                return null;
            }
            return (chjy) weakReference.get();
        }
    }

    private final bzqb h() {
        return new bzqb(this, new elqn(62), i, j, 3, elpp.a, new bzqa() { // from class: cmpf
            /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
            @Override // defpackage.bzqa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(defpackage.bzoz r11, com.google.android.gms.common.internal.GetServiceRequest r12) {
                /*
                    Method dump skipped, instructions count: 264
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpf.a(bzoz, com.google.android.gms.common.internal.GetServiceRequest):void");
            }
        }, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(String str, boolean z) {
        ausn ausnVar = cher.a;
        elgo c = c(str);
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cmmm) c.get(i2)).g(z, false);
        }
    }

    private final void j() {
        this.g.f(new cmpo(this));
    }

    private static final boolean k(Bundle bundle) {
        try {
            return bundle.isEmpty();
        } catch (Exception e) {
            ((eluo) ((eluo) ((eluo) cher.a.j()).s(e)).ai((char) 7826)).x("NearbyMessagesService: Failed resubscribing, unable to read cached bundle");
            return true;
        }
    }

    @Override // defpackage.chjz
    public final chjy b() {
        return this.f;
    }

    public final elgo c(String str) {
        String str2;
        synchronized (a) {
            if (this.b == null) {
                int i2 = elgo.d;
                return elpg.a;
            }
            ArrayList arrayList = new ArrayList(2);
            for (Map.Entry entry : this.b.entrySet()) {
                ClientAppContext clientAppContext = ((ClientAppIdentifier) entry.getKey()).b;
                String str3 = clientAppContext.b;
                if (str3.equals(str) || (str3.equals("com.google.android.gms") && (str2 = clientAppContext.c) != null && str2.equals(str))) {
                    arrayList.add((cmmm) entry.getValue());
                }
            }
            return elgo.i(arrayList);
        }
    }

    public final void d() {
        NearbyMessagesChimeraService nearbyMessagesChimeraService;
        try {
            this.h.i();
            if (ftfk.h()) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : this.h.f()) {
                    if (!ftfk.d() || !k(bundle)) {
                        SubscribeRequest d = cmgv.d(bundle);
                        ClientAppIdentifier c = cmgv.c(bundle);
                        if (c == null) {
                            ((eluo) ((eluo) cher.a.j()).ai((char) 7845)).B("NearbyMessagesService: Failed resubscribing, null client for subscribe request: %s", d);
                        } else {
                            cmko b = ((cmlr) this.f.b(cmlr.class)).b(c);
                            if (!e(cmgv.a(bundle), d, c, cmgv.e(bundle), b.e())) {
                                this.h.h(bundle);
                            }
                            arrayList.add(b);
                        }
                    }
                }
                nearbyMessagesChimeraService = this;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((cmko) arrayList.get(i2)).f();
                }
            } else {
                nearbyMessagesChimeraService = this;
                cmko cmkoVar = ((cmlr) nearbyMessagesChimeraService.f.b(cmlr.class)).g;
                List e = cmkoVar.e();
                for (Bundle bundle2 : nearbyMessagesChimeraService.h.f()) {
                    if (!ftfk.d() || !k(bundle2)) {
                        if (!nearbyMessagesChimeraService.e(cmgv.a(bundle2), cmgv.d(bundle2), cmgv.c(bundle2), cmgv.e(bundle2), e)) {
                            nearbyMessagesChimeraService.h.h(bundle2);
                        }
                    }
                }
                cmkoVar.f();
            }
            Map map = nearbyMessagesChimeraService.b;
            if (map == null || map.isEmpty()) {
                stopSelf();
            }
        } catch (InterruptedException | TimeoutException e2) {
            ((eluo) ((eluo) ((eluo) cher.a.i()).s(e2)).ai((char) 7846)).x("Exception while waiting for BackgroundSubscribeCache init.");
            stopSelf();
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.g.f(new cmpn(this, printWriter, countDownLatch));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ((eluo) ((eluo) ((eluo) cher.a.i()).s(e)).ai((char) 7824)).x("Interrupted during dump");
        }
    }

    protected final boolean e(long j2, SubscribeRequest subscribeRequest, ClientAppIdentifier clientAppIdentifier, String str, List list) {
        String creatorPackage;
        boolean z = false;
        if (subscribeRequest == null || clientAppIdentifier == null) {
            ((eluo) ((eluo) cher.a.j()).ai(7844)).P("NearbyMessagesService: Failed resubscribing, null subscribeRequest(%s) or clientAppIdentifier(%s).", subscribeRequest, clientAppIdentifier);
            return false;
        }
        int elapsedRealtime = j2 == Long.MAX_VALUE ? Integer.MAX_VALUE : (int) ((j2 - SystemClock.elapsedRealtime()) / 1000);
        PendingIntent pendingIntent = subscribeRequest.f;
        if (elapsedRealtime > 0 && pendingIntent != null && (creatorPackage = pendingIntent.getCreatorPackage()) != null) {
            try {
                if (getPackageManager().getApplicationInfo(creatorPackage, 0).enabled && !subscribeRequest.o) {
                    if (!list.isEmpty()) {
                        cmiu cmiuVar = new cmiu(pendingIntent);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fixk fixkVar = (fixk) it.next();
                            fiwy fiwyVar = fixkVar.d;
                            if (fiwyVar == null) {
                                fiwyVar = fiwy.a;
                            }
                            Message a2 = cmol.a(fiwyVar);
                            if (ftfk.h()) {
                                MessageFilter messageFilter = subscribeRequest.e;
                                if (messageFilter != null && messageFilter.c(a2)) {
                                    cmnx cmnxVar = new cmnx();
                                    cmnxVar.b = a2;
                                    cmnxVar.h();
                                    cmiuVar.a(this, new Update(cmnxVar));
                                }
                            } else if (fixkVar.c.contains(str)) {
                                cmnx cmnxVar2 = new cmnx();
                                cmnxVar2.b = a2;
                                cmnxVar2.h();
                                cmiuVar.a(this, new Update(cmnxVar2));
                            }
                        }
                    }
                    cmiq cmiqVar = new cmiq(subscribeRequest.c);
                    cmiqVar.b(elapsedRealtime);
                    Strategy a3 = cmiqVar.a();
                    SubscribeRequest subscribeRequest2 = new SubscribeRequest(null, a3, null, subscribeRequest.e, subscribeRequest.f, subscribeRequest.j, null, false, subscribeRequest.p, subscribeRequest.q);
                    cmmm f = f(clientAppIdentifier);
                    if (a3.c()) {
                        f.d(2);
                    }
                    if (a3.d()) {
                        f.d(6);
                    }
                    z = true;
                    if (a3.e()) {
                        f.d(1);
                    }
                    f.b(subscribeRequest2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public final cmmm f(ClientAppIdentifier clientAppIdentifier) {
        cmmm cmmmVar;
        synchronized (a) {
            if (this.b == null) {
                this.b = new bsj();
            }
            cmmmVar = (cmmm) this.b.get(clientAppIdentifier);
            if (cmmmVar == null) {
                cmmmVar = new cmmm(this, clientAppIdentifier, this.h);
                Map map = this.b;
                if (map != null) {
                    map.put(clientAppIdentifier, cmmmVar);
                }
            }
        }
        return cmmmVar;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        ausn ausnVar = cher.a;
        hashCode();
        if ("com.google.android.gms.nearby.messages.service.NearbyMessagesService.START".equals(intent.getAction())) {
            return h();
        }
        if (!"com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE".equals(intent.getAction())) {
            return null;
        }
        cmik.b(this);
        synchronized (NearbyMessagesChimeraService.class) {
            l = new WeakReference(this.f);
        }
        return h();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ausn ausnVar = cher.a;
        hashCode();
        chjy chjyVar = new chjy(this);
        chjyVar.h(new cmps());
        this.f = chjyVar;
        this.e = new cmqk(this);
        ezqc ezqcVar = (ezqc) this.f.b(ezqc.class);
        this.g = ezqcVar;
        try {
            ezqcVar.d(new cmph(this));
            this.c = new CountDownLatch(1);
            if (this.m == null) {
                this.m = new cmpm(this);
                aumo a2 = aumo.a();
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this, "com.google.location.nearby.direct.service.NearbyDirectService"));
                ServiceConnection serviceConnection = this.m;
                if (serviceConnection != null) {
                    a2.d(this, intent, serviceConnection, 1);
                }
            }
            this.g.f(new cmpi(this));
            OptInChangeBroadcastReceiver optInChangeBroadcastReceiver = new OptInChangeBroadcastReceiver();
            this.n = optInChangeBroadcastReceiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.nearby.settings.MESSAGES_OPT_IN_CHANGE");
            ind.b(this, optInChangeBroadcastReceiver, intentFilter, 2);
            AppUninstallAndForceStopReceiver appUninstallAndForceStopReceiver = new AppUninstallAndForceStopReceiver();
            this.o = appUninstallAndForceStopReceiver;
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter2.addDataScheme("package");
            ind.b(this, appUninstallAndForceStopReceiver, intentFilter2, 2);
            CopresenceBroadcastReceiver copresenceBroadcastReceiver = this.d;
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
            ind.b(this, copresenceBroadcastReceiver, intentFilter3, 2);
            autx a3 = autx.a(this);
            this.p = a3;
            a3.c(new cmpr(this), new irm(new caqj()));
            this.h = new cmgv(this);
        } catch (InterruptedException e) {
            ((eluo) ((eluo) ((eluo) cher.a.i()).s(e)).ai((char) 7831)).x("Interrupted during initialization");
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ausn ausnVar = cher.a;
        hashCode();
        try {
            try {
                cmpj cmpjVar = new cmpj(this);
                if (ftfk.a.lK().L()) {
                    ((ezqh) this.g.a).a(cmpjVar, true);
                } else {
                    this.g.d(cmpjVar);
                }
                synchronized (NearbyMessagesChimeraService.class) {
                    l = null;
                }
            } catch (InterruptedException e) {
                ((eluo) ((eluo) ((eluo) cher.a.i()).s(e)).ai(7833)).x("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
                this.f.g();
                synchronized (NearbyMessagesChimeraService.class) {
                    l = null;
                }
            }
            try {
                unregisterReceiver(this.o);
                unregisterReceiver(this.n);
                unregisterReceiver(this.d);
                this.p.b();
            } catch (IllegalArgumentException unused) {
            }
            if (this.m != null) {
                aumo a2 = aumo.a();
                ServiceConnection serviceConnection = this.m;
                if (serviceConnection != null) {
                    a2.b(this, serviceConnection);
                }
                this.m = null;
            }
            super.onDestroy();
        } catch (Throwable th) {
            synchronized (NearbyMessagesChimeraService.class) {
                l = null;
                throw th;
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        try {
            if (k) {
                z = true;
            } else {
                k = true;
                ((ezqc) this.f.b(ezqc.class)).f(this.q);
                z = false;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (intent != null) {
                ausn ausnVar = cher.a;
                hashCode();
                intent.getAction();
                if (atos.m(intent)) {
                    cmgv cmgvVar = this.h;
                    atos atosVar = cmgvVar.a;
                    atosVar.h(intent);
                    if (atosVar.n()) {
                        cmgvVar.b.countDown();
                    }
                } else if ("com.google.android.gms.nearby.messages.service.STOP_CLIENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.messages.CALLING_APP_PACKAGE_NAME");
                    if (stringExtra != null) {
                        i(stringExtra, false);
                    } else {
                        ((eluo) ((eluo) cher.a.i()).ai(7842)).x("Missing CallingAppPackageName in Intent.");
                    }
                } else {
                    int i4 = GcmChimeraBroadcastReceiver.b;
                    if (intent.getBooleanExtra("isCopresenceGcm", false)) {
                        this.g.f(new cmpl(this, intent));
                    } else if ("com.google.android.gms.nearby.messages.service.START_SERVICE_PERSISTENT".equals(intent.getAction())) {
                        return 1;
                    }
                }
            } else {
                ausn ausnVar2 = cher.a;
                hashCode();
            }
            if (z) {
                j();
            }
            return 1;
        } catch (Throwable th2) {
            th = th2;
            z2 = z;
            if (z2) {
                j();
            }
            throw th;
        }
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        ausn ausnVar = cher.a;
        hashCode();
        synchronized (a) {
            Map map = this.b;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((cmmm) it.next()).g(false, true);
                }
            }
        }
        this.g.f(new cmpk(this));
        j();
        return true;
    }
}
