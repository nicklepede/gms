package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.LruCache;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.NearbyConnectionsIntentOperation;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import defpackage.a;
import defpackage.aeek;
import defpackage.aegs;
import defpackage.aeih;
import defpackage.aejm;
import defpackage.aeku;
import defpackage.aeqe;
import defpackage.aetj;
import defpackage.aett;
import defpackage.aeuh;
import defpackage.aewa;
import defpackage.aewb;
import defpackage.aewc;
import defpackage.aexl;
import defpackage.aexm;
import defpackage.aeyi;
import defpackage.aeyl;
import defpackage.aeyq;
import defpackage.aeyr;
import defpackage.aeyy;
import defpackage.aezz;
import defpackage.afaa;
import defpackage.afab;
import defpackage.afak;
import defpackage.afal;
import defpackage.afam;
import defpackage.afan;
import defpackage.afao;
import defpackage.afaq;
import defpackage.afar;
import defpackage.afat;
import defpackage.afav;
import defpackage.afaw;
import defpackage.afax;
import defpackage.afaz;
import defpackage.afba;
import defpackage.afbb;
import defpackage.afbe;
import defpackage.afbo;
import defpackage.afbp;
import defpackage.afbw;
import defpackage.afbx;
import defpackage.afby;
import defpackage.afbz;
import defpackage.afcd;
import defpackage.afce;
import defpackage.afcf;
import defpackage.afcg;
import defpackage.afci;
import defpackage.afcj;
import defpackage.afck;
import defpackage.afcl;
import defpackage.afcm;
import defpackage.atzb;
import defpackage.auad;
import defpackage.aupz;
import defpackage.aura;
import defpackage.casd;
import defpackage.eqgo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgsz;
import defpackage.fntv;
import defpackage.fnuf;
import defpackage.fywe;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneHubChimeraService extends Service implements aegs {
    public static final auad a = new auad("ProximityAuth", "PhoneHubService");
    public static ChargingStateBroadcastReceiver b;
    public static InterruptionFilterBroadcastReceiver c;
    public static PhoneHubChimeraService d;
    public static WorkProfileStateBroadcastReceiver e;
    public final aeih f;
    public final aeyl g;
    public final aeyi h;
    public final aewb i;
    public final aeuh j;
    String k;
    private final eqgo l;
    private final aeku m;
    private final aetj n;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class BluetoothAdapterStateChangeIntentOperation extends IntentOperation {
        @Override // com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            auad auadVar = PhoneHubChimeraService.a;
            auadVar.d("Received Bluetooth event: %s.", intent);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                auadVar.h("Bluetooth state has changed. Calling startService.", new Object[0]);
                startService(PhoneHubChimeraService.a(this));
            }
        }
    }

    public PhoneHubChimeraService() {
        this(new aeih("phone_hub"), new aeyl(), new aeyi(), aewb.b(), fnuf.a.lK().ah() ? new aupz(new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy()) : new aupz(1, 10), fnuf.p() ? new aeuh(AppContextProvider.a()) : null, aeku.a(AppContextProvider.a()), aetj.a(AppContextProvider.a()));
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.proximity.phonehub.PhoneHubService");
    }

    private final void f() {
        a.h("All devices have disconnected. Performing cleanup...", new Object[0]);
        aeyi.a(this);
        int i = PhoneStatusGmsTaskBoundService.a;
        casd.a(this).d("PhoneHubStatusUpdate", PhoneStatusGmsTaskBoundService.class.getName());
        PhoneGalleryGmsTaskBoundService.e(this);
    }

    public final void b() {
        Iterator it = this.i.d().iterator();
        while (it.hasNext()) {
            if (((aewa) it.next()).e) {
                PhoneGalleryGmsTaskBoundService.f(this);
                return;
            }
        }
        PhoneGalleryGmsTaskBoundService.e(this);
    }

    public final void c(boolean z) {
        if (fnuf.J()) {
            aura.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", z);
        }
    }

    @Override // defpackage.aegs
    public final void d(String str, int i, int i2, int i3) {
        if (i != 5) {
            return;
        }
        String a2 = ConnectionInfo.a(i2);
        auad auadVar = a;
        String a3 = ConnectionInfo.a(i3);
        String a4 = aeek.a(str);
        aewb aewbVar = this.i;
        auadVar.h("Connection status changed from %s to %s for %s. Existing message processor state: %s", a2, a3, a4, aewbVar.c());
        if (i3 != 3) {
            if (i3 == 0) {
                aewa a5 = aewbVar.a(str);
                if (a5 != null) {
                    if (aeyr.a()) {
                        aewbVar.g(str);
                        a5.c();
                    } else {
                        a5.c();
                        aewbVar.g(str);
                    }
                }
                if (fnuf.p() || fnuf.h()) {
                    this.l.execute(new Runnable() { // from class: aexk
                        @Override // java.lang.Runnable
                        public final void run() {
                            PhoneHubChimeraService phoneHubChimeraService = PhoneHubChimeraService.this;
                            aeyi.b(phoneHubChimeraService, phoneHubChimeraService.g);
                        }
                    });
                } else {
                    aeyi.b(this, this.g);
                }
                if (aewbVar.d().isEmpty()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        aeyl aeylVar = this.g;
        final aewa aewaVar = new aewa(this, str, aeylVar, this.h, new aexl(str), new aeyq(), new LruCache((int) fnuf.a.lK().d()), this.n, new aett(this), new aupz(1, 10));
        aewbVar.a.put(str, aewaVar);
        if (aeyr.a()) {
            aewaVar.g.execute(new Runnable() { // from class: aevu
                @Override // java.lang.Runnable
                public final void run() {
                    aeyy.c(aewa.this.b).k();
                }
            });
        } else {
            aewaVar.c.e.add(aewaVar);
        }
        aewaVar.j = true;
        afci afciVar = afci.a;
        if (fnuf.p() || fnuf.h()) {
            this.l.execute(new Runnable() { // from class: aexj
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneHubChimeraService phoneHubChimeraService = PhoneHubChimeraService.this;
                    aeyi.b(phoneHubChimeraService, phoneHubChimeraService.g);
                }
            });
        } else {
            aeyi.b(this, aeylVar);
        }
        PhoneStatusGmsTaskBoundService.d(this);
        b();
        aeqe aeqeVar = new aeqe();
        aeqeVar.b("phone_hub_session_start_count");
        aeqeVar.c();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== PhoneHubService Dump ====\n");
        printWriter.append((CharSequence) ("\nIs Advertising: " + NearbyConnectionsIntentOperation.b + "\n"));
        printWriter.append("\nPhone Hub Registered Devices: \n\n");
        Iterator it = this.f.b().iterator();
        while (it.hasNext()) {
            printWriter.append((CharSequence) String.valueOf(String.valueOf((RemoteDevice) it.next())).concat("\n"));
        }
        printWriter.append("\nPhone Hub Connected Clients: \n\n");
        Iterator it2 = this.i.c().iterator();
        while (it2.hasNext()) {
            printWriter.append((CharSequence) String.valueOf(aeek.a((String) it2.next())).concat("\n"));
        }
        if (fntv.a.lK().d()) {
            aejm.b();
            printWriter.append("\nisExoAvailable false\n");
        }
        printWriter.append((CharSequence) ("\nEnable Cross-Profile Connector: " + fnuf.p() + "\n"));
        printWriter.append((CharSequence) ("\nAlways off-thread: " + fnuf.h() + "\n"));
        printWriter.append((CharSequence) ("\nSimplified Notification Infra: " + aeyr.a() + "\n"));
    }

    @Override // defpackage.aegs
    public final void e(final String str, String str2, byte[] bArr) {
        final fgsz fgszVar;
        if ("phone_hub".equals(str2)) {
            final aewa a2 = this.i.a(str);
            if (a2 == null) {
                a.m("Received message for %s but no messageProcessor was registered for it!", new Object[0]);
                return;
            }
            try {
                auad auadVar = aewc.a;
                byte[] copyOf = Arrays.copyOf(bArr, 2);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 2, bArr.length);
                short s = ByteBuffer.wrap(copyOf).getShort();
                int b2 = afbe.b(s);
                if (b2 == 0) {
                    throw new fgsd(a.j(s, "Unknown message type "));
                }
                switch (b2 - 2) {
                    case 0:
                        fgri y = fgri.y(afak.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y);
                        fgszVar = (afak) y;
                        break;
                    case 1:
                        fgri y2 = fgri.y(afbw.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y2);
                        fgszVar = (afbw) y2;
                        break;
                    case 2:
                        fgri y3 = fgri.y(afbx.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y3);
                        fgszVar = (afbx) y3;
                        break;
                    case 3:
                        fgri y4 = fgri.y(afcl.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y4);
                        fgszVar = (afcl) y4;
                        break;
                    case 4:
                        fgri y5 = fgri.y(afcm.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y5);
                        fgszVar = (afcm) y5;
                        break;
                    case 5:
                        fgri y6 = fgri.y(afcd.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y6);
                        fgszVar = (afcd) y6;
                        break;
                    case 6:
                        fgri y7 = fgri.y(afce.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y7);
                        fgszVar = (afce) y7;
                        break;
                    case 7:
                        fgri y8 = fgri.y(afcj.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y8);
                        fgszVar = (afcj) y8;
                        break;
                    case 8:
                        fgri y9 = fgri.y(afck.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y9);
                        fgszVar = (afck) y9;
                        break;
                    case 9:
                        fgri y10 = fgri.y(afan.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y10);
                        fgszVar = (afan) y10;
                        break;
                    case 10:
                        fgri y11 = fgri.y(afao.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y11);
                        fgszVar = (afao) y11;
                        break;
                    case 11:
                        fgri y12 = fgri.y(afbo.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y12);
                        fgszVar = (afbo) y12;
                        break;
                    case 12:
                        fgri y13 = fgri.y(afbp.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y13);
                        fgszVar = (afbp) y13;
                        break;
                    case 13:
                        fgri y14 = fgri.y(afcf.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y14);
                        fgszVar = (afcf) y14;
                        break;
                    case 14:
                        fgri y15 = fgri.y(afcg.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y15);
                        fgszVar = (afcg) y15;
                        break;
                    case 15:
                        fgri y16 = fgri.y(afaw.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y16);
                        fgszVar = (afaw) y16;
                        break;
                    case 16:
                        fgri y17 = fgri.y(afax.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y17);
                        fgszVar = (afax) y17;
                        break;
                    case fywe.q /* 17 */:
                        fgri y18 = fgri.y(afat.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y18);
                        fgszVar = (afat) y18;
                        break;
                    case 18:
                        fgri y19 = fgri.y(afav.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y19);
                        fgszVar = (afav) y19;
                        break;
                    case 19:
                        fgri y20 = fgri.y(afbb.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y20);
                        fgszVar = (afbb) y20;
                        break;
                    case fywe.t /* 20 */:
                        fgri y21 = fgri.y(afal.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y21);
                        fgszVar = (afal) y21;
                        break;
                    case fywe.u /* 21 */:
                        fgri y22 = fgri.y(afam.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y22);
                        fgszVar = (afam) y22;
                        break;
                    case fywe.v /* 22 */:
                        fgri y23 = fgri.y(afaz.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y23);
                        fgszVar = (afaz) y23;
                        break;
                    case fywe.w /* 23 */:
                        fgri y24 = fgri.y(afba.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y24);
                        fgszVar = (afba) y24;
                        break;
                    case fywe.x /* 24 */:
                        fgri y25 = fgri.y(afaq.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y25);
                        fgszVar = (afaq) y25;
                        break;
                    case fywe.y /* 25 */:
                        fgri y26 = fgri.y(afar.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y26);
                        fgszVar = (afar) y26;
                        break;
                    case 26:
                        fgri y27 = fgri.y(afby.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y27);
                        fgszVar = (afby) y27;
                        break;
                    case fywe.A /* 27 */:
                        fgri y28 = fgri.y(afbz.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y28);
                        fgszVar = (afbz) y28;
                        break;
                    case fywe.B /* 28 */:
                        fgri y29 = fgri.y(afab.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y29);
                        fgszVar = (afab) y29;
                        break;
                    case fywe.C /* 29 */:
                        fgri y30 = fgri.y(afaa.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y30);
                        fgszVar = (afaa) y30;
                        break;
                    case fywe.D /* 30 */:
                        fgri y31 = fgri.y(aezz.a, copyOfRange, 0, copyOfRange.length, fgqp.a());
                        fgri.M(y31);
                        fgszVar = (aezz) y31;
                        break;
                    default:
                        throw new fgsd("Invalid message type: " + afbe.a(b2));
                }
                atzb.s(fgszVar);
                aewc.a(fgszVar);
                if (!fnuf.p() && !fnuf.h()) {
                    a2.g(fgszVar, str);
                    if (fgszVar instanceof afak) {
                        b();
                        return;
                    }
                    return;
                }
                this.l.execute(new Runnable() { // from class: aexi
                    @Override // java.lang.Runnable
                    public final void run() {
                        aewa aewaVar = a2;
                        fgsz fgszVar2 = fgszVar;
                        aewaVar.g(fgszVar2, str);
                        if (fgszVar2 instanceof afak) {
                            PhoneHubChimeraService.this.b();
                        }
                    }
                });
            } catch (fgsd e2) {
                a.n("Couldn't decode received message from ".concat(String.valueOf(str)), e2, new Object[0]);
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getAttributionTag() {
        String str = this.k;
        return str != null ? str : super.getAttributionTag();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.l.shutdown();
        if (fnuf.C()) {
            a.h("Destroying PhoneHubChimeraService.", new Object[0]);
            aeyl aeylVar = this.g;
            synchronized (aeyl.class) {
                if (aeylVar.c != null) {
                    if (aeyr.a()) {
                        aeyy.c(aeylVar.c).c.g();
                    } else if (fnuf.p()) {
                        aeylVar.f = null;
                    } else {
                        aeylVar.c.unbindService(aeylVar.b);
                        aeylVar.b = null;
                    }
                    aeylVar.c = null;
                } else {
                    aeyl.a.m("shutdown(): context is null.", new Object[0]);
                }
            }
            aewb aewbVar = this.i;
            Iterator it = aewbVar.d().iterator();
            while (it.hasNext()) {
                ((aewa) it.next()).c();
            }
            aewbVar.a.clear();
            f();
        }
        this.f.c(this);
        d = null;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (fnuf.C()) {
            a.h("Handling intent for PhoneHubChimeraService.", new Object[0]);
            this.l.execute(new aexm(this));
            return 1;
        }
        new aeqe().T(1);
        if (fnuf.J()) {
            aura.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", false);
        }
        stopSelf();
        return 2;
    }

    public PhoneHubChimeraService(aeih aeihVar, aeyl aeylVar, aeyi aeyiVar, aewb aewbVar, eqgo eqgoVar, aeuh aeuhVar, aeku aekuVar, aetj aetjVar) {
        this.k = null;
        this.f = aeihVar;
        this.g = aeylVar;
        this.h = aeyiVar;
        this.i = aewbVar;
        this.l = eqgoVar;
        this.j = aeuhVar;
        this.m = aekuVar;
        this.n = aetjVar;
        aejm.b();
        d = true == fnuf.H() ? this : null;
    }

    PhoneHubChimeraService(aeih aeihVar, aeyl aeylVar, aeyi aeyiVar, aewb aewbVar, eqgo eqgoVar, aeuh aeuhVar, aeku aekuVar, aetj aetjVar, String str) {
        this(aeihVar, aeylVar, aeyiVar, aewbVar, eqgoVar, aeuhVar, aekuVar, aetjVar);
        this.k = str;
    }
}
