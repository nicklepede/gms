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
import defpackage.armd;
import defpackage.asiu;
import defpackage.asot;
import defpackage.asqd;
import defpackage.bry;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.byhr;
import defpackage.cexg;
import defpackage.cfcm;
import defpackage.cfcn;
import defpackage.cjyq;
import defpackage.ckaf;
import defpackage.ckal;
import defpackage.ckap;
import defpackage.ckcj;
import defpackage.ckdm;
import defpackage.ckeh;
import defpackage.ckfs;
import defpackage.ckgg;
import defpackage.ckhb;
import defpackage.ckhc;
import defpackage.ckhd;
import defpackage.ckhe;
import defpackage.ckhf;
import defpackage.ckhg;
import defpackage.ckhh;
import defpackage.ckhi;
import defpackage.ckhj;
import defpackage.ckhk;
import defpackage.ckhm;
import defpackage.ckhn;
import defpackage.ckif;
import defpackage.eitj;
import defpackage.eits;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.ejhf;
import defpackage.exbt;
import defpackage.exby;
import defpackage.exca;
import defpackage.fgia;
import defpackage.fgim;
import defpackage.fqlp;
import defpackage.iln;
import defpackage.ipw;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearbyMessagesChimeraService extends Service implements cfcn {
    public static final Object a = new Object();
    private static final eiuu i = new ejdg("android.permission-group.MICROPHONE");
    private static final eits j = eits.l("android.permission-group.MICROPHONE", Integer.valueOf(R.string.messages_microphone_permission));
    private static boolean k;
    private static WeakReference l;
    public Map b;
    public CountDownLatch c;
    public CopresenceBroadcastReceiver d;
    public ckif e;
    public cfcm f;
    public exbt g;
    public cjyq h;
    private ServiceConnection m;
    private BroadcastReceiver n;
    private BroadcastReceiver o;
    private asqd p;
    private final exca q = new ckhb(this);

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class AppUninstallAndForceStopReceiver extends TracingBroadcastReceiver {
        public AppUninstallAndForceStopReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            asot asotVar = cexg.a;
            intent.getAction();
            Uri data = intent.getData();
            if (data != null) {
                NearbyMessagesChimeraService.this.i(data.getSchemeSpecificPart(), true);
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class OptInChangeBroadcastReceiver extends TracingBroadcastReceiver {
        public OptInChangeBroadcastReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            NearbyMessagesChimeraService.this.g.f(new ckhk(this, intent, context));
        }
    }

    public static synchronized cfcm a() {
        synchronized (NearbyMessagesChimeraService.class) {
            WeakReference weakReference = l;
            if (weakReference == null) {
                return null;
            }
            return (cfcm) weakReference.get();
        }
    }

    private final bxhl h() {
        return new bxhl(this, new ejdg(62), i, j, 3, ejck.a, new bxhk() { // from class: ckha
            /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
            @Override // defpackage.bxhk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(defpackage.bxgj r11, com.google.android.gms.common.internal.GetServiceRequest r12) {
                /*
                    Method dump skipped, instructions count: 264
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ckha.a(bxgj, com.google.android.gms.common.internal.GetServiceRequest):void");
            }
        }, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(String str, boolean z) {
        asot asotVar = cexg.a;
        eitj c = c(str);
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ckeh) c.get(i2)).g(z, false);
        }
    }

    private final void j() {
        this.g.f(new ckhj(this));
    }

    private static final boolean k(Bundle bundle) {
        try {
            return bundle.isEmpty();
        } catch (Exception e) {
            ((ejhf) ((ejhf) ((ejhf) cexg.a.j()).s(e)).ah((char) 7877)).x("NearbyMessagesService: Failed resubscribing, unable to read cached bundle");
            return true;
        }
    }

    @Override // defpackage.cfcn
    public final cfcm b() {
        return this.f;
    }

    public final eitj c(String str) {
        String str2;
        synchronized (a) {
            if (this.b == null) {
                int i2 = eitj.d;
                return ejcb.a;
            }
            ArrayList arrayList = new ArrayList(2);
            for (Map.Entry entry : this.b.entrySet()) {
                ClientAppContext clientAppContext = ((ClientAppIdentifier) entry.getKey()).b;
                String str3 = clientAppContext.b;
                if (str3.equals(str) || (str3.equals("com.google.android.gms") && (str2 = clientAppContext.c) != null && str2.equals(str))) {
                    arrayList.add((ckeh) entry.getValue());
                }
            }
            return eitj.i(arrayList);
        }
    }

    public final void d() {
        NearbyMessagesChimeraService nearbyMessagesChimeraService;
        try {
            this.h.i();
            if (fqlp.h()) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : this.h.f()) {
                    if (!fqlp.d() || !k(bundle)) {
                        SubscribeRequest d = cjyq.d(bundle);
                        ClientAppIdentifier c = cjyq.c(bundle);
                        if (c == null) {
                            ((ejhf) ((ejhf) cexg.a.j()).ah((char) 7896)).B("NearbyMessagesService: Failed resubscribing, null client for subscribe request: %s", d);
                        } else {
                            ckcj b = ((ckdm) this.f.b(ckdm.class)).b(c);
                            if (!e(cjyq.a(bundle), d, c, cjyq.e(bundle), b.e())) {
                                this.h.h(bundle);
                            }
                            arrayList.add(b);
                        }
                    }
                }
                nearbyMessagesChimeraService = this;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ckcj) arrayList.get(i2)).f();
                }
            } else {
                nearbyMessagesChimeraService = this;
                ckcj ckcjVar = ((ckdm) nearbyMessagesChimeraService.f.b(ckdm.class)).g;
                List e = ckcjVar.e();
                for (Bundle bundle2 : nearbyMessagesChimeraService.h.f()) {
                    if (!fqlp.d() || !k(bundle2)) {
                        if (!nearbyMessagesChimeraService.e(cjyq.a(bundle2), cjyq.d(bundle2), cjyq.c(bundle2), cjyq.e(bundle2), e)) {
                            nearbyMessagesChimeraService.h.h(bundle2);
                        }
                    }
                }
                ckcjVar.f();
            }
            Map map = nearbyMessagesChimeraService.b;
            if (map == null || map.isEmpty()) {
                stopSelf();
            }
        } catch (InterruptedException | TimeoutException e2) {
            ((ejhf) ((ejhf) ((ejhf) cexg.a.i()).s(e2)).ah((char) 7897)).x("Exception while waiting for BackgroundSubscribeCache init.");
            stopSelf();
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.g.f(new ckhi(this, printWriter, countDownLatch));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ((ejhf) ((ejhf) ((ejhf) cexg.a.i()).s(e)).ah((char) 7875)).x("Interrupted during dump");
        }
    }

    protected final boolean e(long j2, SubscribeRequest subscribeRequest, ClientAppIdentifier clientAppIdentifier, String str, List list) {
        String creatorPackage;
        boolean z = false;
        if (subscribeRequest == null || clientAppIdentifier == null) {
            ((ejhf) ((ejhf) cexg.a.j()).ah(7895)).P("NearbyMessagesService: Failed resubscribing, null subscribeRequest(%s) or clientAppIdentifier(%s).", subscribeRequest, clientAppIdentifier);
            return false;
        }
        int elapsedRealtime = j2 == Long.MAX_VALUE ? Integer.MAX_VALUE : (int) ((j2 - SystemClock.elapsedRealtime()) / 1000);
        PendingIntent pendingIntent = subscribeRequest.f;
        if (elapsedRealtime > 0 && pendingIntent != null && (creatorPackage = pendingIntent.getCreatorPackage()) != null) {
            try {
                if (getPackageManager().getApplicationInfo(creatorPackage, 0).enabled && !subscribeRequest.o) {
                    if (!list.isEmpty()) {
                        ckap ckapVar = new ckap(pendingIntent);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fgim fgimVar = (fgim) it.next();
                            fgia fgiaVar = fgimVar.d;
                            if (fgiaVar == null) {
                                fgiaVar = fgia.a;
                            }
                            Message a2 = ckgg.a(fgiaVar);
                            if (fqlp.h()) {
                                MessageFilter messageFilter = subscribeRequest.e;
                                if (messageFilter != null && messageFilter.c(a2)) {
                                    ckfs ckfsVar = new ckfs();
                                    ckfsVar.b = a2;
                                    ckfsVar.h();
                                    ckapVar.a(this, new Update(ckfsVar));
                                }
                            } else if (fgimVar.c.contains(str)) {
                                ckfs ckfsVar2 = new ckfs();
                                ckfsVar2.b = a2;
                                ckfsVar2.h();
                                ckapVar.a(this, new Update(ckfsVar2));
                            }
                        }
                    }
                    ckal ckalVar = new ckal(subscribeRequest.c);
                    ckalVar.b(elapsedRealtime);
                    Strategy a3 = ckalVar.a();
                    SubscribeRequest subscribeRequest2 = new SubscribeRequest(null, a3, null, subscribeRequest.e, subscribeRequest.f, subscribeRequest.j, null, false, subscribeRequest.p, subscribeRequest.q);
                    ckeh f = f(clientAppIdentifier);
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

    public final ckeh f(ClientAppIdentifier clientAppIdentifier) {
        ckeh ckehVar;
        synchronized (a) {
            if (this.b == null) {
                this.b = new bry();
            }
            ckehVar = (ckeh) this.b.get(clientAppIdentifier);
            if (ckehVar == null) {
                ckehVar = new ckeh(this, clientAppIdentifier, this.h);
                Map map = this.b;
                if (map != null) {
                    map.put(clientAppIdentifier, ckehVar);
                }
            }
        }
        return ckehVar;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        asot asotVar = cexg.a;
        hashCode();
        if ("com.google.android.gms.nearby.messages.service.NearbyMessagesService.START".equals(intent.getAction())) {
            return h();
        }
        if (!"com.google.android.gms.nearby.messages.service.ACTION_DEBUG_POKE".equals(intent.getAction())) {
            return null;
        }
        ckaf.b(this);
        synchronized (NearbyMessagesChimeraService.class) {
            l = new WeakReference(this.f);
        }
        return h();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        asot asotVar = cexg.a;
        hashCode();
        cfcm cfcmVar = new cfcm(this);
        cfcmVar.h(new ckhn());
        this.f = cfcmVar;
        this.e = new ckif(this);
        exbt exbtVar = (exbt) this.f.b(exbt.class);
        this.g = exbtVar;
        try {
            exbtVar.d(new ckhc(this));
            this.c = new CountDownLatch(1);
            if (this.m == null) {
                this.m = new ckhh(this);
                asiu a2 = asiu.a();
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this, "com.google.location.nearby.direct.service.NearbyDirectService"));
                ServiceConnection serviceConnection = this.m;
                if (serviceConnection != null) {
                    a2.d(this, intent, serviceConnection, 1);
                }
            }
            this.g.f(new ckhd(this));
            OptInChangeBroadcastReceiver optInChangeBroadcastReceiver = new OptInChangeBroadcastReceiver();
            this.n = optInChangeBroadcastReceiver;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.nearby.settings.MESSAGES_OPT_IN_CHANGE");
            iln.b(this, optInChangeBroadcastReceiver, intentFilter, 2);
            AppUninstallAndForceStopReceiver appUninstallAndForceStopReceiver = new AppUninstallAndForceStopReceiver();
            this.o = appUninstallAndForceStopReceiver;
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
            intentFilter2.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter2.addDataScheme("package");
            iln.b(this, appUninstallAndForceStopReceiver, intentFilter2, 2);
            CopresenceBroadcastReceiver copresenceBroadcastReceiver = this.d;
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
            iln.b(this, copresenceBroadcastReceiver, intentFilter3, 2);
            asqd a3 = asqd.a(this);
            this.p = a3;
            a3.c(new ckhm(this), new ipw(new byhr()));
            this.h = new cjyq(this);
        } catch (InterruptedException e) {
            ((ejhf) ((ejhf) ((ejhf) cexg.a.i()).s(e)).ah((char) 7882)).x("Interrupted during initialization");
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        asot asotVar = cexg.a;
        hashCode();
        try {
            try {
                ckhe ckheVar = new ckhe(this);
                if (fqlp.a.a().L()) {
                    ((exby) this.g.a).a(ckheVar, true);
                } else {
                    this.g.d(ckheVar);
                }
                synchronized (NearbyMessagesChimeraService.class) {
                    l = null;
                }
            } catch (InterruptedException e) {
                ((ejhf) ((ejhf) ((ejhf) cexg.a.i()).s(e)).ah(7884)).x("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
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
                asiu a2 = asiu.a();
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
                ((exbt) this.f.b(exbt.class)).f(this.q);
                z = false;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (intent != null) {
                asot asotVar = cexg.a;
                hashCode();
                intent.getAction();
                if (armd.m(intent)) {
                    cjyq cjyqVar = this.h;
                    armd armdVar = cjyqVar.a;
                    armdVar.h(intent);
                    if (armdVar.n()) {
                        cjyqVar.b.countDown();
                    }
                } else if ("com.google.android.gms.nearby.messages.service.STOP_CLIENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.messages.CALLING_APP_PACKAGE_NAME");
                    if (stringExtra != null) {
                        i(stringExtra, false);
                    } else {
                        ((ejhf) ((ejhf) cexg.a.i()).ah(7893)).x("Missing CallingAppPackageName in Intent.");
                    }
                } else {
                    int i4 = GcmChimeraBroadcastReceiver.b;
                    if (intent.getBooleanExtra("isCopresenceGcm", false)) {
                        this.g.f(new ckhg(this, intent));
                    } else if ("com.google.android.gms.nearby.messages.service.START_SERVICE_PERSISTENT".equals(intent.getAction())) {
                        return 1;
                    }
                }
            } else {
                asot asotVar2 = cexg.a;
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
        asot asotVar = cexg.a;
        hashCode();
        synchronized (a) {
            Map map = this.b;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ckeh) it.next()).g(false, true);
                }
            }
        }
        this.g.f(new ckhf(this));
        j();
        return true;
    }
}
