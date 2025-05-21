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
import defpackage.asej;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asot;
import defpackage.bfdr;
import defpackage.dwur;
import defpackage.dwus;
import defpackage.ejhf;
import j$.util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends Service implements dwus {
    public static final asot a = asot.b("GcmReceiverChimeraService", asej.FIND_MY_DEVICE_SPOT);
    private volatile HandlerThread b;
    private volatile Handler c;
    private final AtomicInteger d = new AtomicInteger(0);

    public final void a() {
        if (this.d.decrementAndGet() == 0) {
            stopSelf();
        }
    }

    @Override // defpackage.dwus
    public final dwur b(ScheduledExecutorService scheduledExecutorService, long j) {
        this.d.incrementAndGet();
        return new dwur(new Runnable() { // from class: bcur
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
        if (!bfdr.a()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 3909)).x("All Finder use cases are disabled.");
            return;
        }
        aslw aslwVar = new aslw("findmydevice.gcm.GcmReceiverService", 9);
        aslwVar.start();
        this.b = aslwVar;
        this.c = new aslv(aslwVar, new Handler.Callback() { // from class: bcuq
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                eiid j;
                Intent intent = (Intent) message.obj;
                final GcmReceiverChimeraService gcmReceiverChimeraService = GcmReceiverChimeraService.this;
                try {
                    asot asotVar = bcup.a;
                    bhyk.a(gcmReceiverChimeraService);
                    if (Objects.equals(bhyk.e(intent), "gcm")) {
                        j = eiid.j(asqx.c(intent.getStringExtra("type")));
                    } else {
                        ((ejhf) ((ejhf) bcup.a.j()).ah((char) 3904)).x("Not a GCM message.");
                        j = eigb.a;
                    }
                    if (j.h()) {
                        String str = (String) j.c();
                        if (str.hashCode() == 3524210 && str.equals("scac")) {
                            asot asotVar2 = bdar.a;
                            if (fobb.a.a().v()) {
                                try {
                                    String stringExtra = intent.getStringExtra("scac");
                                    arwm.q(stringExtra);
                                    byte[] decode = Base64.decode(stringExtra, 0);
                                    fecp y = fecp.y(euiv.a, decode, 0, decode.length, febw.a());
                                    fecp.M(y);
                                    final euiv euivVar = (euiv) y;
                                    bebp a2 = bebo.a();
                                    final dwuh dwuhVar = new dwuh(bebi.b(), new bdax(bebk.b(), a2), (ensv) ((bebo) a2).b.a());
                                    eiig.x(euivVar);
                                    egmx e = egna.e(new enqb() { // from class: dwtz
                                        @Override // defpackage.enqb
                                        public final enss a() {
                                            enss h;
                                            final euiv euivVar2 = euivVar;
                                            feay feayVar = euivVar2.b;
                                            eufp eufpVar = eufp.a;
                                            febe k = feayVar.k();
                                            fecp x = eufpVar.x();
                                            dwuh dwuhVar2 = dwuh.this;
                                            febw febwVar = dwuhVar2.b;
                                            try {
                                                feex b = feep.a.b(x);
                                                b.l(x, febf.p(k), febwVar);
                                                b.g(x);
                                                k.z(0);
                                                fecp.M(x);
                                                final eufp eufpVar2 = (eufp) x;
                                                final bdax bdaxVar = dwuhVar2.d;
                                                String str2 = eufpVar2.f;
                                                arwm.q(str2);
                                                try {
                                                    eiid b2 = bfdq.b(bdaxVar.a, str2);
                                                    h = b2.h() ? ensj.i(b2.c()) : ensj.h(new IllegalStateException("Account with the OID provided in a client action command not found on this device."));
                                                } catch (IOException | unx e2) {
                                                    h = ensj.h(e2);
                                                }
                                                final dwus dwusVar = gcmReceiverChimeraService;
                                                return egnc.k(egmx.f(h).h(new eiho() { // from class: bdaw
                                                    @Override // defpackage.eiho
                                                    public final Object apply(Object obj) {
                                                        bebc a3 = ((bebb) ((bebo) bdax.this.b).i()).a((Account) obj);
                                                        bebo beboVar = a3.P;
                                                        return new dwug(eits.n(eufo.RING_DATA, beboVar.ax, eufo.TRIGGER_EID_SYNC_DATA, a3.F, eufo.TRIGGER_DEVICE_LIST_REFRESH_DATA, a3.G), new dweu(a3.s(), (ensv) beboVar.b.a()), new dwtp(a3.H, beboVar.b), (ensv) beboVar.b.a());
                                                    }
                                                }, enre.a), new enqc() { // from class: dwuc
                                                    @Override // defpackage.enqc
                                                    public final enss a(Object obj) {
                                                        euiv euivVar3 = euivVar2;
                                                        final dwug dwugVar = (dwug) obj;
                                                        eiig.x(euivVar3);
                                                        dweu dweuVar = (dweu) dwugVar.b;
                                                        dwep dwepVar = dweuVar.b;
                                                        final feay feayVar2 = euivVar3.c;
                                                        final feay feayVar3 = euivVar3.b;
                                                        egmx f = egmx.f(dwepVar.a(false));
                                                        eiho eihoVar = new eiho() { // from class: dwei
                                                            @Override // defpackage.eiho
                                                            public final Object apply(Object obj2) {
                                                                dwzb dwzbVar = ((dwzc) obj2).d;
                                                                if (dwzbVar == null) {
                                                                    dwzbVar = dwzb.a;
                                                                }
                                                                return dwzbVar.c;
                                                            }
                                                        };
                                                        enre enreVar = enre.a;
                                                        egmx f2 = egmx.f(egnc.k(f.h(eihoVar, enreVar), new enqc() { // from class: dwet
                                                            @Override // defpackage.enqc
                                                            public final enss a(Object obj2) {
                                                                return dweu.a(feay.this, feayVar3, (feay) obj2);
                                                            }
                                                        }, dweuVar.a));
                                                        final eufp eufpVar3 = eufp.this;
                                                        final dwus dwusVar2 = dwusVar;
                                                        return f2.i(new enqc() { // from class: dwue
                                                            @Override // defpackage.enqc
                                                            public final enss a(Object obj2) {
                                                                final dwtj dwuiVar;
                                                                enss h2;
                                                                eufp eufpVar4 = eufpVar3;
                                                                int i = eufpVar4.b;
                                                                dwug dwugVar2 = dwug.this;
                                                                dwus dwusVar3 = dwusVar2;
                                                                if (i == 8 || i == 11) {
                                                                    dwuiVar = new dwui();
                                                                } else {
                                                                    dwtp dwtpVar = dwugVar2.d;
                                                                    feay feayVar4 = eufpVar4.d;
                                                                    feay feayVar5 = eufpVar4.e;
                                                                    fuuq fuuqVar = dwtpVar.b;
                                                                    Object a3 = dwtpVar.a.a();
                                                                    Executor executor = (Executor) fuuqVar.a();
                                                                    executor.getClass();
                                                                    feayVar4.getClass();
                                                                    feayVar5.getClass();
                                                                    dwuiVar = new dwto((bcyg) a3, executor, feayVar4, feayVar5);
                                                                }
                                                                fuuq fuuqVar2 = (fuuq) dwugVar2.a.get(eufo.a(eufpVar4.b));
                                                                if (fuuqVar2 == null) {
                                                                    ((ejfz) ((ejfz) dwuh.a.i().r(aspc.a, 284)).ah((char) 13071)).x("Client action not provided or unsupported.");
                                                                    h2 = dwuiVar.b(dwtq.a);
                                                                } else {
                                                                    try {
                                                                        ((ejfz) ((ejfz) dwuh.a.h().r(aspc.a, 284)).ah(13070)).B("Handling command of type %s", eufo.a(eufpVar4.b));
                                                                        h2 = ((dwti) fuuqVar2.a()).b(eufpVar4, dwuiVar, dwusVar3);
                                                                    } catch (RuntimeException e3) {
                                                                        h2 = ensj.h(e3);
                                                                    }
                                                                }
                                                                return egmx.f(h2).e(Exception.class, new enqc() { // from class: dwud
                                                                    @Override // defpackage.enqc
                                                                    public final enss a(Object obj3) {
                                                                        ((ejfz) ((ejfz) ((ejfz) dwuh.a.i().r(aspc.a, 284)).s((Exception) obj3)).ah(13073)).x("Command dispatched, but failed unexpectedly.");
                                                                        return dwtj.this.b(dwtq.b);
                                                                    }
                                                                }, dwugVar2.c);
                                                            }
                                                        }, dwugVar.c).e(GeneralSecurityException.class, new enqc() { // from class: dwuf
                                                            @Override // defpackage.enqc
                                                            public final enss a(Object obj2) {
                                                                ((ejfz) ((ejfz) ((ejfz) dwuh.a.i().r(aspc.a, 284)).s((GeneralSecurityException) obj2)).ah(13072)).x("Unable to verify the signature of the command.");
                                                                return ensm.a;
                                                            }
                                                        }, enreVar);
                                                    }
                                                }, dwuhVar2.c);
                                            } catch (fedk e3) {
                                                if (e3.a) {
                                                    throw new fedk(e3);
                                                }
                                                throw e3;
                                            } catch (fefm e4) {
                                                throw e4.a();
                                            } catch (IOException e5) {
                                                if (e5.getCause() instanceof fedk) {
                                                    throw ((fedk) e5.getCause());
                                                }
                                                throw new fedk(e5);
                                            } catch (RuntimeException e6) {
                                                if (e6.getCause() instanceof fedk) {
                                                    throw ((fedk) e6.getCause());
                                                }
                                                throw e6;
                                            }
                                        }
                                    }, dwuhVar.c);
                                    enqc enqcVar = new enqc() { // from class: dwua
                                        @Override // defpackage.enqc
                                        public final enss a(Object obj) {
                                            ((ejfz) ((ejfz) ((ejfz) dwuh.a.i().r(aspc.a, 284)).s((fedk) obj)).ah(13074)).x("Unable to parse the command.");
                                            return ensm.a;
                                        }
                                    };
                                    enre enreVar = enre.a;
                                    dwup.a("Signed client action command execution", e.e(fedk.class, enqcVar, enreVar).e(Exception.class, new enqc() { // from class: dwub
                                        @Override // defpackage.enqc
                                        public final enss a(Object obj) {
                                            ((ejfz) ((ejfz) ((ejfz) dwuh.a.i().r(aspc.a, 284)).s((Exception) obj)).ah(13075)).x("An unexpected error occurred while handling a signed command.");
                                            return ensm.a;
                                        }
                                    }, enreVar));
                                } catch (fedk e2) {
                                    ((ejhf) ((ejhf) ((ejhf) bdar.a.i()).s(e2)).ah((char) 3944)).x("Error parsing signed client action command.");
                                }
                            } else {
                                ((ejhf) ((ejhf) bdar.a.j()).ah((char) 3945)).x("SPOT client actions handler is disabled.");
                            }
                        } else {
                            ((ejhf) ((ejhf) GcmReceiverChimeraService.a.j()).ah(3906)).B("Unsupported payload type '%s'.", j.c());
                        }
                    }
                    bhyb.b(intent);
                    gcmReceiverChimeraService.a();
                    return true;
                } catch (Throwable th) {
                    bhyb.b(intent);
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
        if (!bfdr.a()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 3912)).x("All Finder use cases are disabled.");
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
