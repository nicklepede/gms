package com.google.android.gms.findmydevice.gcm;

import android.accounts.Account;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.util.Base64;
import com.google.android.chimera.Service;
import com.google.android.gms.findmydevice.gcm.GcmReceiverChimeraService;
import defpackage.auid;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.ausn;
import defpackage.bhfh;
import defpackage.dzgr;
import defpackage.dzgs;
import defpackage.eluo;
import j$.util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends Service implements dzgs {
    public static final ausn a = ausn.b("GcmReceiverChimeraService", auid.FIND_MY_DEVICE_SPOT);
    private volatile HandlerThread b;
    private volatile Handler c;
    private final AtomicInteger d = new AtomicInteger(0);

    public final void a() {
        if (this.d.decrementAndGet() == 0) {
            stopSelf();
        }
    }

    @Override // defpackage.dzgs
    public final dzgr b(ScheduledExecutorService scheduledExecutorService, long j) {
        this.d.incrementAndGet();
        return new dzgr(new Runnable() { // from class: bewe
            @Override // java.lang.Runnable
            public final void run() {
                GcmReceiverChimeraService.this.a();
            }
        }, scheduledExecutorService, j);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (!bhfh.a()) {
            ((eluo) ((eluo) a.j()).ai((char) 3915)).x("All Finder use cases are disabled.");
            return;
        }
        aupq aupqVar = new aupq("findmydevice.gcm.GcmReceiverService", 9);
        aupqVar.start();
        this.b = aupqVar;
        this.c = new aupp(aupqVar, new Handler.Callback() { // from class: bewd
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ekvi j;
                Intent intent = (Intent) message.obj;
                final GcmReceiverChimeraService gcmReceiverChimeraService = GcmReceiverChimeraService.this;
                try {
                    ausn ausnVar = bewc.a;
                    bkcz.a(gcmReceiverChimeraService);
                    if (Objects.equals(bkcz.e(intent), "gcm")) {
                        j = ekvi.j(auur.c(intent.getStringExtra("type")));
                    } else {
                        ((eluo) ((eluo) bewc.a.j()).ai((char) 3910)).x("Not a GCM message.");
                        j = ektg.a;
                    }
                    if (j.h()) {
                        String str = (String) j.c();
                        if (str.hashCode() == 3524210 && str.equals("scac")) {
                            ausn ausnVar2 = bfcd.a;
                            if (fqsv.a.lK().v()) {
                                try {
                                    String stringExtra = intent.getStringExtra("scac");
                                    atzb.q(stringExtra);
                                    byte[] decode = Base64.decode(stringExtra, 0);
                                    fgri y = fgri.y(ewyo.a, decode, 0, decode.length, fgqp.a());
                                    fgri.M(y);
                                    final ewyo ewyoVar = (ewyo) y;
                                    bgdb a2 = bgda.a();
                                    final dzgh dzghVar = new dzgh(bgcu.b(), new bfcj(bgcw.b(), a2), (eqgo) ((bgda) a2).b.a());
                                    ekvl.y(ewyoVar);
                                    ejaa e = ejad.e(new eqdu() { // from class: dzfz
                                        @Override // defpackage.eqdu
                                        public final eqgl a() {
                                            eqgl h;
                                            final ewyo ewyoVar2 = ewyoVar;
                                            fgpr fgprVar = ewyoVar2.b;
                                            ewvi ewviVar = ewvi.a;
                                            fgpx k = fgprVar.k();
                                            fgri x = ewviVar.x();
                                            dzgh dzghVar2 = dzgh.this;
                                            fgqp fgqpVar = dzghVar2.b;
                                            try {
                                                fgtq b = fgti.a.b(x);
                                                b.l(x, fgpy.p(k), fgqpVar);
                                                b.g(x);
                                                k.z(0);
                                                fgri.M(x);
                                                final ewvi ewviVar2 = (ewvi) x;
                                                final bfcj bfcjVar = dzghVar2.d;
                                                String str2 = ewviVar2.f;
                                                atzb.q(str2);
                                                try {
                                                    ekvi b2 = bhfg.b(bfcjVar.a, str2);
                                                    h = b2.h() ? eqgc.i(b2.c()) : eqgc.h(new IllegalStateException("Account with the OID provided in a client action command not found on this device."));
                                                } catch (IOException | wjw e2) {
                                                    h = eqgc.h(e2);
                                                }
                                                final dzgs dzgsVar = gcmReceiverChimeraService;
                                                return ejaf.k(ejaa.g(h).h(new ekut() { // from class: bfci
                                                    @Override // defpackage.ekut
                                                    public final Object apply(Object obj) {
                                                        bgco a3 = ((bgcn) ((bgda) bfcj.this.b).i()).a((Account) obj);
                                                        bgda bgdaVar = a3.P;
                                                        return new dzgg(elgx.n(ewvh.RING_DATA, bgdaVar.ax, ewvh.TRIGGER_EID_SYNC_DATA, a3.F, ewvh.TRIGGER_DEVICE_LIST_REFRESH_DATA, a3.G), new dyqv(a3.s(), (eqgo) bgdaVar.b.a()), new dzfp(a3.H, bgdaVar.b), (eqgo) bgdaVar.b.a());
                                                    }
                                                }, eqex.a), new eqdv() { // from class: dzgc
                                                    @Override // defpackage.eqdv
                                                    public final eqgl a(Object obj) {
                                                        ewyo ewyoVar3 = ewyoVar2;
                                                        final dzgg dzggVar = (dzgg) obj;
                                                        ekvl.y(ewyoVar3);
                                                        dyqv dyqvVar = (dyqv) dzggVar.b;
                                                        dyqq dyqqVar = dyqvVar.b;
                                                        final fgpr fgprVar2 = ewyoVar3.c;
                                                        final fgpr fgprVar3 = ewyoVar3.b;
                                                        ejaa g = ejaa.g(dyqqVar.a(false));
                                                        ekut ekutVar = new ekut() { // from class: dyqj
                                                            @Override // defpackage.ekut
                                                            public final Object apply(Object obj2) {
                                                                dzlb dzlbVar = ((dzlc) obj2).d;
                                                                if (dzlbVar == null) {
                                                                    dzlbVar = dzlb.a;
                                                                }
                                                                return dzlbVar.c;
                                                            }
                                                        };
                                                        eqex eqexVar = eqex.a;
                                                        ejaa g2 = ejaa.g(ejaf.k(g.h(ekutVar, eqexVar), new eqdv() { // from class: dyqu
                                                            @Override // defpackage.eqdv
                                                            public final eqgl a(Object obj2) {
                                                                return dyqv.a(fgpr.this, fgprVar3, (fgpr) obj2);
                                                            }
                                                        }, dyqvVar.a));
                                                        final ewvi ewviVar3 = ewvi.this;
                                                        final dzgs dzgsVar2 = dzgsVar;
                                                        return g2.i(new eqdv() { // from class: dzge
                                                            @Override // defpackage.eqdv
                                                            public final eqgl a(Object obj2) {
                                                                final dzfj dzgiVar;
                                                                eqgl h2;
                                                                ewvi ewviVar4 = ewviVar3;
                                                                int i = ewviVar4.b;
                                                                dzgg dzggVar2 = dzgg.this;
                                                                dzgs dzgsVar3 = dzgsVar2;
                                                                if (i == 8 || i == 11) {
                                                                    dzgiVar = new dzgi();
                                                                } else {
                                                                    dzfp dzfpVar = dzggVar2.d;
                                                                    fgpr fgprVar4 = ewviVar4.d;
                                                                    fgpr fgprVar5 = ewviVar4.e;
                                                                    fxqo fxqoVar = dzfpVar.b;
                                                                    Object a3 = dzfpVar.a.a();
                                                                    Executor executor = (Executor) fxqoVar.a();
                                                                    executor.getClass();
                                                                    fgprVar4.getClass();
                                                                    fgprVar5.getClass();
                                                                    dzgiVar = new dzfo((bezs) a3, executor, fgprVar4, fgprVar5);
                                                                }
                                                                fxqo fxqoVar2 = (fxqo) dzggVar2.a.get(ewvh.a(ewviVar4.b));
                                                                if (fxqoVar2 == null) {
                                                                    ((elti) ((elti) dzgh.a.i().r(ausw.a, 284)).ai((char) 13055)).x("Client action not provided or unsupported.");
                                                                    h2 = dzgiVar.b(dzfq.a);
                                                                } else {
                                                                    try {
                                                                        ((elti) ((elti) dzgh.a.h().r(ausw.a, 284)).ai(13054)).B("Handling command of type %s", ewvh.a(ewviVar4.b));
                                                                        h2 = ((dzfi) fxqoVar2.a()).b(ewviVar4, dzgiVar, dzgsVar3);
                                                                    } catch (RuntimeException e3) {
                                                                        h2 = eqgc.h(e3);
                                                                    }
                                                                }
                                                                return ejaa.g(h2).f(Exception.class, new eqdv() { // from class: dzgd
                                                                    @Override // defpackage.eqdv
                                                                    public final eqgl a(Object obj3) {
                                                                        ((elti) ((elti) ((elti) dzgh.a.i().r(ausw.a, 284)).s((Exception) obj3)).ai(13057)).x("Command dispatched, but failed unexpectedly.");
                                                                        return dzfj.this.b(dzfq.b);
                                                                    }
                                                                }, dzggVar2.c);
                                                            }
                                                        }, dzggVar.c).f(GeneralSecurityException.class, new eqdv() { // from class: dzgf
                                                            @Override // defpackage.eqdv
                                                            public final eqgl a(Object obj2) {
                                                                ((elti) ((elti) ((elti) dzgh.a.i().r(ausw.a, 284)).s((GeneralSecurityException) obj2)).ai(13056)).x("Unable to verify the signature of the command.");
                                                                return eqgf.a;
                                                            }
                                                        }, eqexVar);
                                                    }
                                                }, dzghVar2.c);
                                            } catch (fgsd e3) {
                                                if (e3.a) {
                                                    throw new fgsd(e3);
                                                }
                                                throw e3;
                                            } catch (fguf e4) {
                                                throw e4.a();
                                            } catch (IOException e5) {
                                                if (e5.getCause() instanceof fgsd) {
                                                    throw ((fgsd) e5.getCause());
                                                }
                                                throw new fgsd(e5);
                                            } catch (RuntimeException e6) {
                                                if (e6.getCause() instanceof fgsd) {
                                                    throw ((fgsd) e6.getCause());
                                                }
                                                throw e6;
                                            }
                                        }
                                    }, dzghVar.c);
                                    eqdv eqdvVar = new eqdv() { // from class: dzga
                                        @Override // defpackage.eqdv
                                        public final eqgl a(Object obj) {
                                            ((elti) ((elti) ((elti) dzgh.a.i().r(ausw.a, 284)).s((fgsd) obj)).ai(13058)).x("Unable to parse the command.");
                                            return eqgf.a;
                                        }
                                    };
                                    eqex eqexVar = eqex.a;
                                    dzgp.a("Signed client action command execution", e.f(fgsd.class, eqdvVar, eqexVar).f(Exception.class, new eqdv() { // from class: dzgb
                                        @Override // defpackage.eqdv
                                        public final eqgl a(Object obj) {
                                            ((elti) ((elti) ((elti) dzgh.a.i().r(ausw.a, 284)).s((Exception) obj)).ai(13059)).x("An unexpected error occurred while handling a signed command.");
                                            return eqgf.a;
                                        }
                                    }, eqexVar));
                                } catch (fgsd e2) {
                                    ((eluo) ((eluo) ((eluo) bfcd.a.i()).s(e2)).ai((char) 3950)).x("Error parsing signed client action command.");
                                }
                            } else {
                                ((eluo) ((eluo) bfcd.a.j()).ai((char) 3951)).x("SPOT client actions handler is disabled.");
                            }
                        } else {
                            ((eluo) ((eluo) GcmReceiverChimeraService.a.j()).ai(3912)).B("Unsupported payload type '%s'.", j.c());
                        }
                    }
                    bkcq.b(intent);
                    gcmReceiverChimeraService.a();
                    return true;
                } catch (Throwable th) {
                    bkcq.b(intent);
                    gcmReceiverChimeraService.a();
                    throw th;
                }
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (this.b != null) {
            this.b.quit();
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!bhfh.a()) {
            ((eluo) ((eluo) a.j()).ai((char) 3918)).x("All Finder use cases are disabled.");
            stopSelf();
            return 2;
        }
        this.d.incrementAndGet();
        Message obtain = Message.obtain();
        obtain.obj = intent;
        this.c.sendMessage(obtain);
        return 2;
    }
}
