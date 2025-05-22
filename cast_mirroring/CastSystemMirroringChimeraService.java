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
import defpackage.aoca;
import defpackage.aoji;
import defpackage.apqv;
import defpackage.apqx;
import defpackage.apqy;
import defpackage.aprh;
import defpackage.aued;
import defpackage.auub;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.fopc;
import defpackage.ind;
import defpackage.ltj;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastSystemMirroringChimeraService extends Service {
    public apqy a;
    public PendingIntent b;
    private aoca c;
    private BroadcastReceiver d;
    private BroadcastReceiver e;
    private final ekww f = ekxd.a(new ekww() { // from class: aprf
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(foqb.a.lK().G());
        }
    });

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class DisconnectReceiver extends TracingBroadcastReceiver {
        public DisconnectReceiver() {
            super("cast");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if ("com.google.android.gms.cast.media.ACTION_DISCONNECT".equals(intent.getAction())) {
                aoji.a().execute(new Runnable() { // from class: aprg
                    @Override // java.lang.Runnable
                    public final void run() {
                        CastSystemMirroringChimeraService.this.a.j(null);
                    }
                });
                CastSystemMirroringChimeraService.this.stopSelf();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class ProjectionReceiver extends TracingBroadcastReceiver {
        public ProjectionReceiver() {
            super("Projection receiver");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            aprh aprhVar;
            if (Objects.equals(intent.getAction(), "com.google.android.gms.cast.media.PROJECT")) {
                if (intent.getIntExtra("com.google.android.gms.media.USER_CONSENT_REQUEST_RESULT", 0) == -1) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("extra_projection_intent");
                    if (intent2 != null) {
                        CastSystemMirroringChimeraService castSystemMirroringChimeraService = CastSystemMirroringChimeraService.this;
                        castSystemMirroringChimeraService.a.e(intent2);
                        final apqy apqyVar = castSystemMirroringChimeraService.a;
                        apqyVar.p = false;
                        apqyVar.c.m("User consent requested successfully!");
                        if (((Boolean) apqyVar.h.lK()).booleanValue()) {
                            apqyVar.j.ifPresent(new Consumer() { // from class: appy
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void u(Object obj) {
                                    final apqy apqyVar2 = apqy.this;
                                    final aoho aohoVar = (aoho) obj;
                                    apqyVar2.k.ifPresent(new Consumer() { // from class: apqq
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void u(Object obj2) {
                                            final aohv aohvVar = (aohv) obj2;
                                            final aoho aohoVar2 = aohoVar;
                                            final apqy apqyVar3 = apqy.this;
                                            apqyVar3.l.ifPresent(new Consumer() { // from class: apqp
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void u(Object obj3) {
                                                    aohv aohvVar2 = aohvVar;
                                                    Instant instant = (Instant) obj3;
                                                    int a = aohvVar2.a();
                                                    fgrc v = ephh.a.v();
                                                    String valueOf = String.valueOf(aohvVar2.b());
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    apqy apqyVar4 = apqy.this;
                                                    ephh ephhVar = (ephh) v.b;
                                                    valueOf.getClass();
                                                    ephhVar.b |= 2;
                                                    ephhVar.g = valueOf;
                                                    long millis = Duration.between(instant, ((eqcj) apqyVar4.m.get()).a()).toMillis();
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    aoho aohoVar3 = aohoVar2;
                                                    ephh ephhVar2 = (ephh) v.b;
                                                    ephhVar2.b |= 4;
                                                    ephhVar2.h = millis;
                                                    aohoVar3.z((ephh) v.Q(), a, apqyVar4.a());
                                                    apqyVar4.c.p("Mirroring request consent succeeded; logging session info: %s and event sequence number: %d", aohvVar2.b(), Integer.valueOf(a));
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
                        apqx apqxVar = apqyVar.r;
                        if (apqxVar != null) {
                            apqyVar.c(apqxVar.a);
                            return;
                        }
                        final apqv apqvVar = apqyVar.s;
                        if (apqvVar != null) {
                            apqyVar.f.execute(new Runnable() { // from class: appz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    apqy apqyVar2 = apqy.this;
                                    apqv apqvVar2 = apqvVar;
                                    apqyVar2.i(apqvVar2.c, apqvVar2.d, apqvVar2.a.f(), apqvVar2.b);
                                    apqyVar2.s = null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                final apqy apqyVar2 = CastSystemMirroringChimeraService.this.a;
                apqyVar2.c.g("Failed to get user consent to start mirroring.", new Object[0]);
                if (((Boolean) apqyVar2.h.lK()).booleanValue()) {
                    apqyVar2.j.ifPresent(new Consumer() { // from class: apqt
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void u(Object obj) {
                            final apqy apqyVar3 = apqy.this;
                            final aoho aohoVar = (aoho) obj;
                            apqyVar3.k.ifPresent(new Consumer() { // from class: apqu
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void u(Object obj2) {
                                    final aohv aohvVar = (aohv) obj2;
                                    final aoho aohoVar2 = aohoVar;
                                    final apqy apqyVar4 = apqy.this;
                                    apqyVar4.l.ifPresent(new Consumer() { // from class: appw
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void u(Object obj3) {
                                            aohv aohvVar2 = aohvVar;
                                            Instant instant = (Instant) obj3;
                                            int a = aohvVar2.a();
                                            fgrc v = ephh.a.v();
                                            String valueOf = String.valueOf(aohvVar2.b());
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            apqy apqyVar5 = apqy.this;
                                            ephh ephhVar = (ephh) v.b;
                                            valueOf.getClass();
                                            ephhVar.b |= 2;
                                            ephhVar.g = valueOf;
                                            long millis = Duration.between(instant, ((eqcj) apqyVar5.m.get()).a()).toMillis();
                                            if (!v.b.L()) {
                                                v.U();
                                            }
                                            aoho aohoVar3 = aohoVar2;
                                            ephh ephhVar2 = (ephh) v.b;
                                            ephhVar2.b |= 4;
                                            ephhVar2.h = millis;
                                            aohoVar3.y((ephh) v.Q(), a, apqyVar5.a());
                                            apqyVar5.c.p("Mirroring request consent failed; logging session info: %s and event sequence number: %d", aohvVar2.b(), Integer.valueOf(a));
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
                apqyVar2.p = false;
                apqx apqxVar2 = apqyVar2.r;
                if (apqxVar2 != null) {
                    int discoveryMode = apqyVar2.getDiscoveryMode();
                    RemoteDisplay remoteDisplay = apqxVar2.a;
                    if (discoveryMode == 0) {
                        apqyVar2.removeDisplay(remoteDisplay);
                    } else {
                        RemoteDisplay findRemoteDisplay = apqyVar2.findRemoteDisplay(remoteDisplay.getId());
                        if (findRemoteDisplay != null) {
                            findRemoteDisplay.setStatus(2);
                            apqyVar2.updateDisplay(findRemoteDisplay);
                        }
                    }
                    apqyVar2.r = null;
                } else {
                    apqv apqvVar2 = apqyVar2.s;
                    if (apqvVar2 != null && (aprhVar = apqvVar2.c) != null) {
                        try {
                            aprhVar.c(2209);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                apqyVar2.s = null;
                apqyVar2.f();
            }
        }
    }

    public static Intent a(Context context) {
        if (fopc.c()) {
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
        aued f;
        super.onCreate();
        this.c = aoca.a(getApplicationContext(), "CastSystemMirroringSrv");
        Context applicationContext = getApplicationContext();
        ScheduledExecutorService a = aoji.a();
        aoca aocaVar = this.c;
        apqy b = apqy.b(applicationContext, a, aocaVar.g, aocaVar.m, ltj.b(this), this.c.e);
        this.a = b;
        b.g(this);
        Intent intent = new Intent("com.google.android.gms.cast.media.ACTION_DISCONNECT");
        intent.setPackage("com.google.android.gms");
        this.b = PendingIntent.getBroadcast(this, 0, intent, 201326592);
        this.d = new DisconnectReceiver();
        this.e = new ProjectionReceiver();
        BroadcastReceiver broadcastReceiver = this.d;
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.cast.media.ACTION_DISCONNECT");
        ekww ekwwVar = this.f;
        ind.b(this, broadcastReceiver, intentFilter, true != ((Boolean) ekwwVar.lK()).booleanValue() ? 2 : 4);
        ind.b(this, this.e, new IntentFilter("com.google.android.gms.cast.media.PROJECT"), true != ((Boolean) ekwwVar.lK()).booleanValue() ? 2 : 4);
        if (auub.c() && (f = aued.f(getApplicationContext())) != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_system_mirroring_service", getString(R.string.cast_display_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            f.p(notificationChannel);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        unregisterReceiver(this.d);
        unregisterReceiver(this.e);
        apqy apqyVar = this.a;
        if (apqyVar != null) {
            apqyVar.g(null);
            this.a.e(null);
        }
        if (this.c != null) {
            aoca.b("CastSystemMirroringSrv");
        }
        super.onDestroy();
    }
}
