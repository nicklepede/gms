package com.google.android.gms.nearby.uwb.service;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.LruCache;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.uwb.service.NearbyUwbChimeraService;
import defpackage.aupv;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.chfc;
import defpackage.chfd;
import defpackage.chke;
import defpackage.chkv;
import defpackage.cubg;
import defpackage.cubh;
import defpackage.dkbl;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.ind;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NearbyUwbChimeraService extends bzot {
    private cubg a;
    private ScheduledExecutorService b;
    private BroadcastReceiver c;
    private final Map d;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.uwb.service.NearbyUwbChimeraService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        final /* synthetic */ PowerManager a;
        final /* synthetic */ KeyguardManager b;
        public final /* synthetic */ NearbyUwbChimeraService c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NearbyUwbChimeraService nearbyUwbChimeraService, PowerManager powerManager, KeyguardManager keyguardManager) {
            super("nearby", "ScreenStateReceiver");
            this.a = powerManager;
            this.b = keyguardManager;
            this.c = nearbyUwbChimeraService;
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            final PowerManager powerManager = this.a;
            final KeyguardManager keyguardManager = this.b;
            this.c.c(new Runnable() { // from class: cubd
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    if (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked()) {
                        z = true;
                    }
                    NearbyUwbChimeraService.AnonymousClass1.this.c.d(z);
                }
            });
        }
    }

    static {
        new LruCache(4);
    }

    public NearbyUwbChimeraService() {
        super(298, "com.google.android.gms.nearby.uwb.service.START", elpp.a, 3, 10);
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.a(16, null);
        ((eluo) ((eluo) cubh.a.h()).ai((char) 8280)).x("onGetService: only supported for Android S and above");
    }

    public final void c(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void d(final boolean z) {
        final cubg cubgVar = this.a;
        cubgVar.b(new Runnable() { // from class: cube
            @Override // java.lang.Runnable
            public final void run() {
                cubg.this.a();
                ((eluo) cubh.a.f(Level.INFO).ai(8282)).B("Screen unlocked: %s", Boolean.valueOf(z));
            }
        });
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.a = new cubg(this);
        new chfd(getApplicationContext(), 7, new chfc() { // from class: cubb
            @Override // defpackage.chfc
            public final void a(fgrc fgrcVar, Object obj) {
                faoc faocVar = (faoc) obj;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                fako fakoVar = (fako) fgrcVar.b;
                fako fakoVar2 = fako.a;
                faocVar.getClass();
                fakoVar.l = faocVar;
                fakoVar.b |= 512;
            }
        });
        this.b = new aupv(1, 10);
        dkbl.a(this);
        final PowerManager powerManager = (PowerManager) getSystemService("power");
        final KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        this.c = new AnonymousClass1(this, powerManager, keyguardManager);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        ind.b(this, this.c, intentFilter, 2);
        c(new Runnable() { // from class: cubc
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = false;
                if (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked()) {
                    z = true;
                }
                NearbyUwbChimeraService.this.d(z);
            }
        });
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.d.clear();
        final cubg cubgVar = this.a;
        ((eluo) ((eluo) cubh.a.h()).ai((char) 8284)).B("Initiating shutdown of ServiceControllerRouter %s.", cubgVar);
        cubgVar.b(new Runnable() { // from class: cubf
            @Override // java.lang.Runnable
            public final void run() {
                cubg cubgVar2 = cubg.this;
                cubgVar2.a().a();
                ((eluo) ((eluo) cubh.a.h()).ai((char) 8283)).B("Completed shutdown of ServiceControllerRouter %s.", cubgVar2);
            }
        });
        chkv.h(cubgVar.a, "ServiceControllerRouter.offBinderSerializer");
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            chke.f(this, broadcastReceiver);
        }
        chkv.h(this.b, "NearbyUwbServiceExecutor");
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
