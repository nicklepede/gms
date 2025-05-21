package com.google.android.gms.cast_mirroring;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.media.remotedisplay.RemoteDisplay;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.cast_mirroring.CastSystemMirroringChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.amap;
import defpackage.amhy;
import defpackage.anpc;
import defpackage.anpe;
import defpackage.anpf;
import defpackage.anpo;
import defpackage.asbo;
import defpackage.asqh;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.flxs;
import defpackage.iln;
import defpackage.kaz;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastSystemMirroringChimeraService extends Service {
    public anpf a;
    public PendingIntent b;
    private amap c;
    private BroadcastReceiver d;
    private BroadcastReceiver e;
    private final eijr f = eijy.a(new eijr() { // from class: anpm
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flyr.a.a().G());
        }
    });

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class DisconnectReceiver extends TracingBroadcastReceiver {
        public DisconnectReceiver() {
            super("cast");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if ("com.google.android.gms.cast.media.ACTION_DISCONNECT".equals(intent.getAction())) {
                amhy.a().execute(new Runnable() { // from class: anpn
                    @Override // java.lang.Runnable
                    public final void run() {
                        CastSystemMirroringChimeraService.this.a.j(null);
                    }
                });
                CastSystemMirroringChimeraService.this.stopSelf();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class ProjectionReceiver extends TracingBroadcastReceiver {
        public ProjectionReceiver() {
            super("Projection receiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            anpo anpoVar;
            if (Objects.equals(intent.getAction(), "com.google.android.gms.cast.media.PROJECT")) {
                if (intent.getIntExtra("com.google.android.gms.media.USER_CONSENT_REQUEST_RESULT", 0) == -1) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("extra_projection_intent");
                    if (intent2 != null) {
                        CastSystemMirroringChimeraService castSystemMirroringChimeraService = CastSystemMirroringChimeraService.this;
                        castSystemMirroringChimeraService.a.e(intent2);
                        final anpf anpfVar = castSystemMirroringChimeraService.a;
                        anpfVar.p = false;
                        anpfVar.c.m("User consent requested successfully!");
                        if (((Boolean) anpfVar.h.a()).booleanValue()) {
                            anpfVar.j.ifPresent(new Consumer() { // from class: anof
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void q(Object obj) {
                                    final anpf anpfVar2 = anpf.this;
                                    final amgd amgdVar = (amgd) obj;
                                    anpfVar2.k.ifPresent(new Consumer() { // from class: anox
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void q(Object obj2) {
                                            final amgk amgkVar = (amgk) obj2;
                                            final amgd amgdVar2 = amgdVar;
                                            final anpf anpfVar3 = anpf.this;
                                            anpfVar3.l.ifPresent(new Consumer() { // from class: anow
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void q(Object obj3) {
                                                    amgk amgkVar2 = amgkVar;
                                                    Instant instant = (Instant) obj3;
                                                    int a = amgkVar2.a();
                                                    fecj v = emtr.a.v();
                                                    String valueOf = String.valueOf(amgkVar2.b());
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    anpf anpfVar4 = anpf.this;
                                                    emtr emtrVar = (emtr) v.b;
                                                    valueOf.getClass();
                                                    emtrVar.b |= 2;
                                                    emtrVar.g = valueOf;
                                                    long millis = Duration.between(instant, ((enoq) anpfVar4.m.get()).a()).toMillis();
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    amgd amgdVar3 = amgdVar2;
                                                    emtr emtrVar2 = (emtr) v.b;
                                                    emtrVar2.b |= 4;
                                                    emtrVar2.h = millis;
                                                    amgdVar3.z((emtr) v.Q(), a, anpfVar4.a());
                                                    anpfVar4.c.p("Mirroring request consent succeeded; logging session info: %s and event sequence number: %d", amgkVar2.b(), Integer.valueOf(a));
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        anpe anpeVar = anpfVar.r;
                        if (anpeVar != null) {
                            anpfVar.c(anpeVar.a);
                            return;
                        }
                        final anpc anpcVar = anpfVar.s;
                        if (anpcVar != null) {
                            anpfVar.f.execute(new Runnable() { // from class: anog
                                @Override // java.lang.Runnable
                                public final void run() {
                                    anpf anpfVar2 = anpf.this;
                                    anpc anpcVar2 = anpcVar;
                                    anpfVar2.i(anpcVar2.c, anpcVar2.d, anpcVar2.a.f(), anpcVar2.b);
                                    anpfVar2.s = null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                final anpf anpfVar2 = CastSystemMirroringChimeraService.this.a;
                anpfVar2.c.g("Failed to get user consent to start mirroring.", new Object[0]);
                if (((Boolean) anpfVar2.h.a()).booleanValue()) {
                    anpfVar2.j.ifPresent(new Consumer() { // from class: anpa
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj) {
                            final anpf anpfVar3 = anpf.this;
                            final amgd amgdVar = (amgd) obj;
                            anpfVar3.k.ifPresent(new Consumer() { // from class: anpb
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void q(Object obj2) {
                                    final amgk amgkVar = (amgk) obj2;
                                    final amgd amgdVar2 = amgdVar;
                                    final anpf anpfVar4 = anpf.this;
                                    anpfVar4.l.ifPresent(new Consumer() { // from class: anod
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void q(Object obj3) {
                                            amgk amgkVar2 = amgkVar;
                                            Instant instant = (Instant) obj3;
                                            int a = amgkVar2.a();
                                            fecj v = emtr.a.v();
                                            String valueOf = String.valueOf(amgkVar2.b());
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            anpf anpfVar5 = anpf.this;
                                            emtr emtrVar = (emtr) v.b;
                                            valueOf.getClass();
                                            emtrVar.b |= 2;
                                            emtrVar.g = valueOf;
                                            long millis = Duration.between(instant, ((enoq) anpfVar5.m.get()).a()).toMillis();
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            amgd amgdVar3 = amgdVar2;
                                            emtr emtrVar2 = (emtr) v.b;
                                            emtrVar2.b |= 4;
                                            emtrVar2.h = millis;
                                            amgdVar3.y((emtr) v.Q(), a, anpfVar5.a());
                                            anpfVar5.c.p("Mirroring request consent failed; logging session info: %s and event sequence number: %d", amgkVar2.b(), Integer.valueOf(a));
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                anpfVar2.p = false;
                anpe anpeVar2 = anpfVar2.r;
                if (anpeVar2 != null) {
                    int discoveryMode = anpfVar2.getDiscoveryMode();
                    RemoteDisplay remoteDisplay = anpeVar2.a;
                    if (discoveryMode == 0) {
                        anpfVar2.removeDisplay(remoteDisplay);
                    } else {
                        RemoteDisplay findRemoteDisplay = anpfVar2.findRemoteDisplay(remoteDisplay.getId());
                        if (findRemoteDisplay != null) {
                            findRemoteDisplay.setStatus(2);
                            anpfVar2.updateDisplay(findRemoteDisplay);
                        }
                    }
                    anpfVar2.r = null;
                } else {
                    anpc anpcVar2 = anpfVar2.s;
                    if (anpcVar2 != null && (anpoVar = anpcVar2.c) != null) {
                        try {
                            anpoVar.c(2209);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                anpfVar2.s = null;
                anpfVar2.f();
            }
        }
    }

    public static Intent a(Context context) {
        if (flxs.c()) {
            Intent intent = new Intent("com.android.media.remotedisplay.RemoteDisplayProvider");
            intent.setPackage("com.google.android.gms");
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.cast.media.CastRemoteDisplayProviderService");
        return intent2;
    }

    public static void b(Context context) {
        context.stopService(a(context));
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.android.media.remotedisplay.RemoteDisplayProvider")) {
            return this.a.getBinder();
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        asbo f;
        super.onCreate();
        this.c = amap.a(getApplicationContext(), "CastSystemMirroringSrv");
        Context applicationContext = getApplicationContext();
        ScheduledExecutorService a = amhy.a();
        amap amapVar = this.c;
        anpf b = anpf.b(applicationContext, a, amapVar.g, amapVar.m, kaz.b(this), this.c.e);
        this.a = b;
        b.g(this);
        Intent intent = new Intent("com.google.android.gms.cast.media.ACTION_DISCONNECT");
        intent.setPackage("com.google.android.gms");
        this.b = PendingIntent.getBroadcast(this, 0, intent, 201326592);
        this.d = new DisconnectReceiver();
        this.e = new ProjectionReceiver();
        BroadcastReceiver broadcastReceiver = this.d;
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.cast.media.ACTION_DISCONNECT");
        eijr eijrVar = this.f;
        iln.b(this, broadcastReceiver, intentFilter, true != ((Boolean) eijrVar.a()).booleanValue() ? 2 : 4);
        iln.b(this, this.e, new IntentFilter("com.google.android.gms.cast.media.PROJECT"), true != ((Boolean) eijrVar.a()).booleanValue() ? 2 : 4);
        if (asqh.c() && (f = asbo.f(getApplicationContext())) != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_system_mirroring_service", getString(R.string.cast_display_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            f.p(notificationChannel);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        unregisterReceiver(this.d);
        unregisterReceiver(this.e);
        anpf anpfVar = this.a;
        if (anpfVar != null) {
            anpfVar.g(null);
            this.a.e(null);
        }
        if (this.c != null) {
            amap.b("CastSystemMirroringSrv");
        }
        super.onDestroy();
    }
}
