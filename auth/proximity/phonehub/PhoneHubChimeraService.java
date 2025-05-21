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
import defpackage.acek;
import defpackage.acgs;
import defpackage.acih;
import defpackage.acjm;
import defpackage.acku;
import defpackage.acqe;
import defpackage.actj;
import defpackage.actt;
import defpackage.acuh;
import defpackage.acwa;
import defpackage.acwb;
import defpackage.acwc;
import defpackage.acxl;
import defpackage.acxm;
import defpackage.acyi;
import defpackage.acyl;
import defpackage.acyq;
import defpackage.acyr;
import defpackage.acyy;
import defpackage.aczz;
import defpackage.adaa;
import defpackage.adab;
import defpackage.adak;
import defpackage.adal;
import defpackage.adam;
import defpackage.adan;
import defpackage.adao;
import defpackage.adaq;
import defpackage.adar;
import defpackage.adat;
import defpackage.adav;
import defpackage.adaw;
import defpackage.adax;
import defpackage.adaz;
import defpackage.adba;
import defpackage.adbb;
import defpackage.adbe;
import defpackage.adbo;
import defpackage.adbp;
import defpackage.adbw;
import defpackage.adbx;
import defpackage.adby;
import defpackage.adbz;
import defpackage.adcd;
import defpackage.adce;
import defpackage.adcf;
import defpackage.adcg;
import defpackage.adci;
import defpackage.adcj;
import defpackage.adck;
import defpackage.adcl;
import defpackage.adcm;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.asng;
import defpackage.byjl;
import defpackage.ensv;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feeg;
import defpackage.flcm;
import defpackage.flcw;
import defpackage.fwac;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneHubChimeraService extends Service implements acgs {
    public static final arxo a = new arxo("ProximityAuth", "PhoneHubService");
    public static ChargingStateBroadcastReceiver b;
    public static InterruptionFilterBroadcastReceiver c;
    public static PhoneHubChimeraService d;
    public static WorkProfileStateBroadcastReceiver e;
    public final acih f;
    public final acyl g;
    public final acyi h;
    public final acwb i;
    public final acuh j;
    String k;
    private final ensv l;
    private final acku m;
    private final actj n;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class BluetoothAdapterStateChangeIntentOperation extends IntentOperation {
        @Override // com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            PhoneHubChimeraService.a.d("Received Bluetooth event: %s.", intent);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                PhoneHubChimeraService.a.h("Bluetooth state has changed. Calling startService.", new Object[0]);
                startService(PhoneHubChimeraService.a(this));
            }
        }
    }

    public PhoneHubChimeraService() {
        this(new acih("phone_hub"), new acyl(), new acyi(), acwb.b(), flcw.a.a().ai() ? new asmf(new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy()) : new asmf(1, 10), flcw.p() ? new acuh(AppContextProvider.a()) : null, acku.a(AppContextProvider.a()), actj.a(AppContextProvider.a()));
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.proximity.phonehub.PhoneHubService");
    }

    private final void f() {
        a.h("All devices have disconnected. Performing cleanup...", new Object[0]);
        acyi.a(this);
        int i = PhoneStatusGmsTaskBoundService.a;
        byjl.a(this).d("PhoneHubStatusUpdate", PhoneStatusGmsTaskBoundService.class.getName());
        PhoneGalleryGmsTaskBoundService.e(this);
    }

    public final void b() {
        Iterator it = this.i.d().iterator();
        while (it.hasNext()) {
            if (((acwa) it.next()).e) {
                PhoneGalleryGmsTaskBoundService.f(this);
                return;
            }
        }
        PhoneGalleryGmsTaskBoundService.e(this);
    }

    public final void c(boolean z) {
        if (flcw.J()) {
            asng.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", z);
        }
    }

    @Override // defpackage.acgs
    public final void d(String str, int i, int i2, int i3) {
        if (i != 5) {
            return;
        }
        String a2 = ConnectionInfo.a(i2);
        arxo arxoVar = a;
        String a3 = ConnectionInfo.a(i3);
        String a4 = acek.a(str);
        acwb acwbVar = this.i;
        arxoVar.h("Connection status changed from %s to %s for %s. Existing message processor state: %s", a2, a3, a4, acwbVar.c());
        if (i3 != 3) {
            if (i3 == 0) {
                acwa a5 = acwbVar.a(str);
                if (a5 != null) {
                    if (acyr.a()) {
                        acwbVar.g(str);
                        a5.c();
                    } else {
                        a5.c();
                        acwbVar.g(str);
                    }
                }
                if (flcw.p() || flcw.h()) {
                    this.l.execute(new Runnable() { // from class: acxk
                        @Override // java.lang.Runnable
                        public final void run() {
                            PhoneHubChimeraService phoneHubChimeraService = PhoneHubChimeraService.this;
                            acyi.b(phoneHubChimeraService, phoneHubChimeraService.g);
                        }
                    });
                } else {
                    acyi.b(this, this.g);
                }
                if (acwbVar.d().isEmpty()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        acyl acylVar = this.g;
        final acwa acwaVar = new acwa(this, str, acylVar, this.h, new acxl(str), new acyq(), new LruCache((int) flcw.a.a().d()), this.n, new actt(this), new asmf(1, 10));
        acwbVar.a.put(str, acwaVar);
        if (acyr.a()) {
            acwaVar.g.execute(new Runnable() { // from class: acvu
                @Override // java.lang.Runnable
                public final void run() {
                    acyy.c(acwa.this.b).k();
                }
            });
        } else {
            acwaVar.c.e.add(acwaVar);
        }
        acwaVar.j = true;
        adci adciVar = adci.a;
        if (flcw.p() || flcw.h()) {
            this.l.execute(new Runnable() { // from class: acxj
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneHubChimeraService phoneHubChimeraService = PhoneHubChimeraService.this;
                    acyi.b(phoneHubChimeraService, phoneHubChimeraService.g);
                }
            });
        } else {
            acyi.b(this, acylVar);
        }
        PhoneStatusGmsTaskBoundService.d(this);
        b();
        acqe acqeVar = new acqe();
        acqeVar.b("phone_hub_session_start_count");
        acqeVar.c();
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
            printWriter.append((CharSequence) String.valueOf(acek.a((String) it2.next())).concat("\n"));
        }
        if (flcm.a.a().d()) {
            acjm.b();
            printWriter.append("\nisExoAvailable false\n");
        }
        printWriter.append((CharSequence) ("\nEnable Cross-Profile Connector: " + flcw.p() + "\n"));
        printWriter.append((CharSequence) ("\nAlways off-thread: " + flcw.h() + "\n"));
        printWriter.append((CharSequence) ("\nSimplified Notification Infra: " + acyr.a() + "\n"));
    }

    @Override // defpackage.acgs
    public final void e(final String str, String str2, byte[] bArr) {
        final feeg feegVar;
        if ("phone_hub".equals(str2)) {
            final acwa a2 = this.i.a(str);
            if (a2 == null) {
                a.m("Received message for %s but no messageProcessor was registered for it!", new Object[0]);
                return;
            }
            try {
                arxo arxoVar = acwc.a;
                byte[] copyOf = Arrays.copyOf(bArr, 2);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 2, bArr.length);
                short s = ByteBuffer.wrap(copyOf).getShort();
                int b2 = adbe.b(s);
                if (b2 == 0) {
                    throw new fedk(a.j(s, "Unknown message type "));
                }
                switch (b2 - 2) {
                    case 0:
                        fecp y = fecp.y(adak.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y);
                        feegVar = (adak) y;
                        break;
                    case 1:
                        fecp y2 = fecp.y(adbw.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y2);
                        feegVar = (adbw) y2;
                        break;
                    case 2:
                        fecp y3 = fecp.y(adbx.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y3);
                        feegVar = (adbx) y3;
                        break;
                    case 3:
                        fecp y4 = fecp.y(adcl.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y4);
                        feegVar = (adcl) y4;
                        break;
                    case 4:
                        fecp y5 = fecp.y(adcm.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y5);
                        feegVar = (adcm) y5;
                        break;
                    case 5:
                        fecp y6 = fecp.y(adcd.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y6);
                        feegVar = (adcd) y6;
                        break;
                    case 6:
                        fecp y7 = fecp.y(adce.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y7);
                        feegVar = (adce) y7;
                        break;
                    case 7:
                        fecp y8 = fecp.y(adcj.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y8);
                        feegVar = (adcj) y8;
                        break;
                    case 8:
                        fecp y9 = fecp.y(adck.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y9);
                        feegVar = (adck) y9;
                        break;
                    case 9:
                        fecp y10 = fecp.y(adan.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y10);
                        feegVar = (adan) y10;
                        break;
                    case 10:
                        fecp y11 = fecp.y(adao.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y11);
                        feegVar = (adao) y11;
                        break;
                    case 11:
                        fecp y12 = fecp.y(adbo.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y12);
                        feegVar = (adbo) y12;
                        break;
                    case 12:
                        fecp y13 = fecp.y(adbp.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y13);
                        feegVar = (adbp) y13;
                        break;
                    case 13:
                        fecp y14 = fecp.y(adcf.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y14);
                        feegVar = (adcf) y14;
                        break;
                    case 14:
                        fecp y15 = fecp.y(adcg.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y15);
                        feegVar = (adcg) y15;
                        break;
                    case 15:
                        fecp y16 = fecp.y(adaw.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y16);
                        feegVar = (adaw) y16;
                        break;
                    case 16:
                        fecp y17 = fecp.y(adax.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y17);
                        feegVar = (adax) y17;
                        break;
                    case fwac.q /* 17 */:
                        fecp y18 = fecp.y(adat.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y18);
                        feegVar = (adat) y18;
                        break;
                    case 18:
                        fecp y19 = fecp.y(adav.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y19);
                        feegVar = (adav) y19;
                        break;
                    case 19:
                        fecp y20 = fecp.y(adbb.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y20);
                        feegVar = (adbb) y20;
                        break;
                    case fwac.t /* 20 */:
                        fecp y21 = fecp.y(adal.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y21);
                        feegVar = (adal) y21;
                        break;
                    case fwac.u /* 21 */:
                        fecp y22 = fecp.y(adam.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y22);
                        feegVar = (adam) y22;
                        break;
                    case fwac.v /* 22 */:
                        fecp y23 = fecp.y(adaz.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y23);
                        feegVar = (adaz) y23;
                        break;
                    case fwac.w /* 23 */:
                        fecp y24 = fecp.y(adba.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y24);
                        feegVar = (adba) y24;
                        break;
                    case fwac.x /* 24 */:
                        fecp y25 = fecp.y(adaq.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y25);
                        feegVar = (adaq) y25;
                        break;
                    case fwac.y /* 25 */:
                        fecp y26 = fecp.y(adar.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y26);
                        feegVar = (adar) y26;
                        break;
                    case 26:
                        fecp y27 = fecp.y(adby.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y27);
                        feegVar = (adby) y27;
                        break;
                    case fwac.A /* 27 */:
                        fecp y28 = fecp.y(adbz.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y28);
                        feegVar = (adbz) y28;
                        break;
                    case fwac.B /* 28 */:
                        fecp y29 = fecp.y(adab.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y29);
                        feegVar = (adab) y29;
                        break;
                    case fwac.C /* 29 */:
                        fecp y30 = fecp.y(adaa.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y30);
                        feegVar = (adaa) y30;
                        break;
                    case fwac.D /* 30 */:
                        fecp y31 = fecp.y(aczz.a, copyOfRange, 0, copyOfRange.length, febw.a());
                        fecp.M(y31);
                        feegVar = (aczz) y31;
                        break;
                    default:
                        throw new fedk("Invalid message type: " + adbe.a(b2));
                }
                arwm.s(feegVar);
                acwc.a(feegVar);
                if (!flcw.p() && !flcw.h()) {
                    a2.g(feegVar, str);
                    if (feegVar instanceof adak) {
                        b();
                        return;
                    }
                    return;
                }
                this.l.execute(new Runnable() { // from class: acxi
                    @Override // java.lang.Runnable
                    public final void run() {
                        acwa acwaVar = a2;
                        feeg feegVar2 = feegVar;
                        acwaVar.g(feegVar2, str);
                        if (feegVar2 instanceof adak) {
                            PhoneHubChimeraService.this.b();
                        }
                    }
                });
            } catch (fedk e2) {
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
        if (flcw.C()) {
            a.h("Destroying PhoneHubChimeraService.", new Object[0]);
            acyl acylVar = this.g;
            synchronized (acyl.class) {
                if (acylVar.c != null) {
                    if (acyr.a()) {
                        acyy.c(acylVar.c).c.g();
                    } else if (flcw.p()) {
                        acylVar.f = null;
                    } else {
                        acylVar.c.unbindService(acylVar.b);
                        acylVar.b = null;
                    }
                    acylVar.c = null;
                } else {
                    acyl.a.m("shutdown(): context is null.", new Object[0]);
                }
            }
            acwb acwbVar = this.i;
            Iterator it = acwbVar.d().iterator();
            while (it.hasNext()) {
                ((acwa) it.next()).c();
            }
            acwbVar.a.clear();
            f();
        }
        this.f.c(this);
        d = null;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (flcw.C()) {
            a.h("Handling intent for PhoneHubChimeraService.", new Object[0]);
            this.l.execute(new acxm(this));
            return 1;
        }
        new acqe().T(1);
        if (flcw.J()) {
            asng.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", false);
        }
        stopSelf();
        return 2;
    }

    public PhoneHubChimeraService(acih acihVar, acyl acylVar, acyi acyiVar, acwb acwbVar, ensv ensvVar, acuh acuhVar, acku ackuVar, actj actjVar) {
        this.k = null;
        this.f = acihVar;
        this.g = acylVar;
        this.h = acyiVar;
        this.i = acwbVar;
        this.l = ensvVar;
        this.j = acuhVar;
        this.m = ackuVar;
        this.n = actjVar;
        acjm.b();
        d = true == flcw.H() ? this : null;
    }

    PhoneHubChimeraService(acih acihVar, acyl acylVar, acyi acyiVar, acwb acwbVar, ensv ensvVar, acuh acuhVar, acku ackuVar, actj actjVar, String str) {
        this(acihVar, acylVar, acyiVar, acwbVar, ensvVar, acuhVar, ackuVar, actjVar);
        this.k = str;
    }
}
