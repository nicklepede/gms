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
import defpackage.asmb;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cexr;
import defpackage.cexs;
import defpackage.cfcs;
import defpackage.cfdj;
import defpackage.crsb;
import defpackage.crsc;
import defpackage.dhqf;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.iln;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NearbyUwbChimeraService extends bxgd {
    private crsb a;
    private ScheduledExecutorService b;
    private BroadcastReceiver c;
    private final Map d;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        public final void jz(Context context, Intent intent) {
            final PowerManager powerManager = this.a;
            final KeyguardManager keyguardManager = this.b;
            this.c.c(new Runnable() { // from class: crry
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
        super(298, "com.google.android.gms.nearby.uwb.service.START", ejck.a, 3, 10);
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.a(16, null);
        ((ejhf) ((ejhf) crsc.a.h()).ah((char) 8327)).x("onGetService: only supported for Android S and above");
    }

    public final void c(Runnable runnable) {
        this.b.execute(runnable);
    }

    public final void d(final boolean z) {
        final crsb crsbVar = this.a;
        crsbVar.b(new Runnable() { // from class: crrz
            @Override // java.lang.Runnable
            public final void run() {
                crsb.this.a();
                ((ejhf) crsc.a.f(crsc.a()).ah(8329)).B("Screen unlocked: %s", Boolean.valueOf(z));
            }
        });
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.a = new crsb(this);
        new cexs(getApplicationContext(), 7, new cexr() { // from class: crrw
            @Override // defpackage.cexr
            public final void a(fecj fecjVar, Object obj) {
                exzq exzqVar = (exzq) obj;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                exwc exwcVar = (exwc) fecjVar.b;
                exwc exwcVar2 = exwc.a;
                exzqVar.getClass();
                exwcVar.l = exzqVar;
                exwcVar.b |= 512;
            }
        });
        this.b = new asmb(1, 10);
        dhqf.a(this);
        final PowerManager powerManager = (PowerManager) getSystemService("power");
        final KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        this.c = new AnonymousClass1(this, powerManager, keyguardManager);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        iln.b(this, this.c, intentFilter, 2);
        c(new Runnable() { // from class: crrx
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

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.d.clear();
        final crsb crsbVar = this.a;
        ((ejhf) ((ejhf) crsc.a.h()).ah((char) 8331)).B("Initiating shutdown of ServiceControllerRouter %s.", crsbVar);
        crsbVar.b(new Runnable() { // from class: crsa
            @Override // java.lang.Runnable
            public final void run() {
                crsb crsbVar2 = crsb.this;
                crsbVar2.a().a();
                ((ejhf) ((ejhf) crsc.a.h()).ah((char) 8330)).B("Completed shutdown of ServiceControllerRouter %s.", crsbVar2);
            }
        });
        cfdj.h(crsbVar.a, "ServiceControllerRouter.offBinderSerializer");
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            cfcs.f(this, broadcastReceiver);
        }
        cfdj.h(this.b, "NearbyUwbServiceExecutor");
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
