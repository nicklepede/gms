package com.google.android.gms.nearby.fastpair.service;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.telephony.TelephonyManager;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.android.gms.nearby.fastpair.triangle.NodeHolder;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.asmf;
import defpackage.asoj;
import defpackage.asok;
import defpackage.bhiz;
import defpackage.bxdd;
import defpackage.cexc;
import defpackage.cfcp;
import defpackage.cibd;
import defpackage.cida;
import defpackage.cidh;
import defpackage.cidi;
import defpackage.cidl;
import defpackage.cidy;
import defpackage.cien;
import defpackage.cigw;
import defpackage.ciqd;
import defpackage.ciqe;
import defpackage.cisf;
import defpackage.cisw;
import defpackage.citi;
import defpackage.citj;
import defpackage.citl;
import defpackage.citm;
import defpackage.citr;
import defpackage.citx;
import defpackage.citz;
import defpackage.ciud;
import defpackage.ciue;
import defpackage.ciug;
import defpackage.ciup;
import defpackage.dfaq;
import defpackage.dfau;
import defpackage.dfbl;
import defpackage.djjm;
import defpackage.dkbc;
import defpackage.dncl;
import defpackage.eiho;
import defpackage.eitj;
import defpackage.eits;
import defpackage.eixf;
import defpackage.eizo;
import defpackage.ejcg;
import defpackage.ejfg;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enre;
import defpackage.ensv;
import defpackage.excc;
import defpackage.excv;
import defpackage.exdl;
import defpackage.exfg;
import defpackage.exfm;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fqkx;
import defpackage.fqld;
import defpackage.iru;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class WearableDataListenerChimeraService extends dkbc {
    private citm B;
    private cisf C;
    private cisf D;
    public ciug c;
    public exfg d;
    public ciqd e;
    public TelephonyManager f;
    public citz g;
    public cidl l;
    private citj t;
    private cisw u;
    private volatile ciup w;
    private exfm x;
    private AudioManager y;
    public final HashMap a = new HashMap();
    private final ensv v = new asmf(1, 9);
    public final ensv b = new asmf(1, 9);
    public final citx h = new citx();
    private boolean z = false;
    public boolean i = false;
    public int j = 0;
    public int k = 0;
    private boolean A = false;
    public cfcp m = cigw.a;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.dfaq H(final java.lang.String r12, byte[] r13, final boolean r14) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.H(java.lang.String, byte[], boolean):dfaq");
    }

    private final eits I() {
        ciug h = h();
        return h == null ? ejcg.a : eizo.f(h.h, new eiho() { // from class: ciqr
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return ((citr) obj).c;
            }
        });
    }

    private final void J() {
        if (this.a.isEmpty()) {
            stopSelf();
            return;
        }
        if (!this.z) {
            ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", null);
        } else if (y()) {
            l();
        } else {
            n().c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(defpackage.cien r14, java.util.Collection r15, android.bluetooth.BluetoothDevice r16) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.K(cien, java.util.Collection, android.bluetooth.BluetoothDevice):void");
    }

    private final void L(boolean z) {
        boolean z2 = z(true);
        if (z && z2) {
            s(this.a);
        }
    }

    private final void M(String str, BluetoothDevice bluetoothDevice) {
        ((ejhf) cigw.a.d().ah(7485)).P("WDLS onStartCommand: %s: %s", str, bluetoothDevice != null ? dncl.c(bluetoothDevice) : "no active device");
        boolean z = true;
        if (!S() && !R()) {
            z = false;
        }
        L(z);
    }

    private final void N(BluetoothDevice bluetoothDevice) {
        try {
            cisf B = B(this);
            fecj v = citl.a.v();
            String address = bluetoothDevice.getAddress();
            if (!v.b.L()) {
                v.U();
            }
            citl citlVar = (citl) v.b;
            address.getClass();
            citlVar.b |= 1;
            citlVar.c = address;
            long currentTimeMillis = System.currentTimeMillis();
            if (!v.b.L()) {
                v.U();
            }
            citl citlVar2 = (citl) v.b;
            citlVar2.b |= 2;
            citlVar2.d = currentTimeMillis;
            final citl citlVar3 = (citl) v.Q();
            ((enpf) B.a.b(new eiho() { // from class: cisq
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    ciub ciubVar = (ciub) obj;
                    final fecj fecjVar = (fecj) ciubVar.iB(5, null);
                    fecjVar.X(ciubVar);
                    Objects.requireNonNull(fecjVar);
                    cisf.d(new isd() { // from class: cisl
                        @Override // defpackage.isd
                        public final Object a() {
                            return DesugarCollections.unmodifiableList(((ciub) fecj.this.b).c);
                        }
                    }, new eiho() { // from class: cism
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            return Long.valueOf(((citl) obj2).d);
                        }
                    }, new iru() { // from class: cisn
                        @Override // defpackage.iru
                        public final void a(Object obj2) {
                            fecj fecjVar2 = fecj.this;
                            List list = (List) obj2;
                            if (!fecjVar2.b.L()) {
                                fecjVar2.U();
                            }
                            ciub ciubVar2 = (ciub) fecjVar2.b;
                            ciub ciubVar3 = ciub.a;
                            ciubVar2.c = feeq.a;
                            if (!fecjVar2.b.L()) {
                                fecjVar2.U();
                            }
                            ciub ciubVar4 = (ciub) fecjVar2.b;
                            ciubVar4.b();
                            feab.E(list, ciubVar4.c);
                        }
                    });
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    citl citlVar4 = citl.this;
                    ciub ciubVar2 = (ciub) fecjVar.b;
                    ciub ciubVar3 = ciub.a;
                    citlVar4.getClass();
                    ciubVar2.b();
                    ciubVar2.c.add(citlVar4);
                    return (ciub) fecjVar.Q();
                }
            }, enre.a)).v(fqkx.Z(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) cigw.a.g().ah(7510)).B("WDLS recordA2dpActiveState: %s", e.getMessage());
        }
    }

    private final void O(BluetoothDevice bluetoothDevice) {
        for (ciug ciugVar : this.a.values()) {
            if (ciugVar.e.equals(bluetoothDevice.getAddress())) {
                try {
                    cisf C = C(this);
                    final eitj l = eitj.l(ciugVar.d);
                    ((enpf) C.a.b(new eiho() { // from class: cita
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            ciuh ciuhVar = (ciuh) obj;
                            ArrayList arrayList = new ArrayList();
                            for (ciug ciugVar2 : ciuhVar.c) {
                                List list = l;
                                if (!list.contains(ciugVar2.d)) {
                                    arrayList.add(ciugVar2);
                                }
                            }
                            fecj fecjVar = (fecj) ciuhVar.iB(5, null);
                            fecjVar.X(ciuhVar);
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            ((ciuh) fecjVar.b).c = feeq.a;
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            ciuh ciuhVar2 = (ciuh) fecjVar.b;
                            ciuhVar2.b();
                            feab.E(arrayList, ciuhVar2.c);
                            return (ciuh) fecjVar.Q();
                        }
                    }, enre.a)).v(fqkx.Z(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((ejhf) cigw.a.g().ah(7511)).B("WDLS removeWearableDevice: can't remove triangle node from db, %s", e.getMessage());
                }
                this.a.remove(ciugVar.d);
                return;
            }
        }
    }

    private final void P() {
        HashSet hashSet = new HashSet();
        ejfg listIterator = I().values().listIterator();
        while (listIterator.hasNext()) {
            citr citrVar = (citr) listIterator.next();
            if (citrVar.f.size() > 0) {
                hashSet.add(citrVar.c);
            }
        }
        C(this);
        this.A = !cisf.k(this.a.values(), hashSet).isEmpty();
    }

    private final void Q() {
        boolean isEmpty = this.a.isEmpty();
        boolean z = !isEmpty;
        try {
            boolean isEmpty2 = ((HashSet) ((enpf) C(this).f()).v(fqkx.Z(), TimeUnit.MILLISECONDS)).isEmpty();
            ((ejhf) cigw.a.d().ah(7530)).S("WDLS updateIsTriangleState: hasNearbyNodes %s, hasBondedHeadset %s", z, !isEmpty2);
            citj f = f(this);
            boolean z2 = false;
            boolean z3 = (isEmpty || isEmpty2) ? false : true;
            bxdd c = f.a.c();
            c.e("IS_TRIANGLE_STATE", z3);
            cidy.b(c);
            if (!isEmpty && !isEmpty2) {
                z2 = true;
            }
            this.i = z2;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((ejhf) cigw.a.d().ah(7531)).x("WDLS updateIsTriangleState: failed to get bonded headset addresses");
        }
    }

    private final boolean R() {
        return cidl.WEARABLE.equals(this.l) && fqkx.bC();
    }

    private final boolean S() {
        TelephonyManager telephonyManager;
        return cidi.e(this.l) && (telephonyManager = this.f) != null && cidh.k(telephonyManager);
    }

    private final boolean T(BluetoothDevice bluetoothDevice) {
        for (ciug ciugVar : this.a.values()) {
            if (ciugVar.e.equals(bluetoothDevice.getAddress())) {
                ciue ciueVar = ciugVar.g;
                if (ciueVar == null) {
                    ciueVar = ciue.a;
                }
                cidl b = cidl.b(ciueVar.c);
                if (b == null) {
                    b = cidl.UNKNOWN_DEVICE_TYPE;
                }
                if (b.equals(cidl.WEARABLE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void q(ensv ensvVar) {
        ensvVar.shutdown();
        try {
            if (ensvVar.awaitTermination(fqkx.aw(), TimeUnit.MILLISECONDS)) {
                return;
            }
            ((ejhf) cigw.a.g().ah(7427)).x("WDLS destroy timeout");
        } catch (InterruptedException e) {
            ((ejhf) ((ejhf) cigw.a.g().s(e)).ah((char) 7428)).x("WDLS destroy exception");
        }
    }

    public final citz A(MessageEventParcelable messageEventParcelable) {
        citz citzVar;
        String str;
        if (messageEventParcelable == null) {
            citzVar = this.g;
        } else {
            try {
                byte[] bArr = messageEventParcelable.c;
                fecp y = fecp.y(citz.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                citzVar = (citz) y;
            } catch (fedk e) {
                ((ejhf) ((ejhf) cigw.a.g().s(e)).ah((char) 7566)).x("MessageDataParser_parseSwitchConnectionResponse: failed to parse message data");
                citzVar = null;
            }
        }
        if (citzVar == null || citzVar.equals(citz.a) || (citzVar.b & 4) == 0) {
            ((ejhf) cigw.a.d().ah(7444)).x("WDLS handlePreCallingSwitch: no pre-switch response record");
            return null;
        }
        this.g = null;
        bhiz d = cexc.d(this, "WearableDataListenerChimeraService");
        if (d != null) {
            citr citrVar = citzVar.e;
            if (citrVar == null) {
                citrVar = citr.a;
            }
            if ((citrVar.b & 8) != 0) {
                citr citrVar2 = citzVar.e;
                if (citrVar2 == null) {
                    citrVar2 = citr.a;
                }
                if (!citi.e(citrVar2.h)) {
                    ejhf ejhfVar = (ejhf) cigw.a.d().ah(7447);
                    citr citrVar3 = citzVar.e;
                    if (citrVar3 == null) {
                        citrVar3 = citr.a;
                    }
                    String c = dncl.c(citrVar3.c);
                    citr citrVar4 = citzVar.e;
                    if (citrVar4 == null) {
                        citrVar4 = citr.a;
                    }
                    ejhfVar.P("WDLS handlePreCallingSwitch: not disconnect %s (%s)", c, citrVar4.h);
                }
            }
            ejhf ejhfVar2 = (ejhf) cigw.a.d().ah(7446);
            citr citrVar5 = citzVar.e;
            if (citrVar5 == null) {
                citrVar5 = citr.a;
            }
            String c2 = dncl.c(citrVar5.c);
            citr citrVar6 = citzVar.e;
            if (((citrVar6 == null ? citr.a : citrVar6).b & 8) != 0) {
                if (citrVar6 == null) {
                    citrVar6 = citr.a;
                }
                str = citrVar6.h;
            } else {
                str = "na";
            }
            ejhfVar2.P("WDLS handlePreCallingSwitch: disconnect %s (%s)", c2, str);
            citr citrVar7 = citzVar.e;
            if (citrVar7 == null) {
                citrVar7 = citr.a;
            }
            BluetoothDevice d2 = d.d(citrVar7.c);
            fqld.bg();
            excc.r(d, d2);
        } else {
            ejhf ejhfVar3 = (ejhf) cigw.a.g().ah(7445);
            citr citrVar8 = citzVar.e;
            if (citrVar8 == null) {
                citrVar8 = citr.a;
            }
            ejhfVar3.B("WDLS handlePreCallingSwitch: skip because bluetooth adapter is null (device=%s)", dncl.c(citrVar8.c));
        }
        return citzVar;
    }

    final synchronized cisf B(Context context) {
        if (this.D == null) {
            this.D = new cisf(context, (byte[]) null);
        }
        return this.D;
    }

    final synchronized cisf C(Context context) {
        if (this.C == null) {
            this.C = new cisf(context, (char[]) null);
        }
        return this.C;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(final MessageEventParcelable messageEventParcelable) {
        char c;
        if (!fqld.ar()) {
            ((ejhf) cigw.a.g().ah(7496)).x("WDLS onMessageReceived: wearable service is not enabled");
        }
        ejhf ejhfVar = (ejhf) cigw.a.d().ah(7493);
        String str = messageEventParcelable.d;
        String str2 = messageEventParcelable.b;
        ejhfVar.P("WDLS onMessageReceived: %s, %s", str, str2);
        ensv ensvVar = this.v;
        if (ensvVar.isShutdown()) {
            ((ejhf) cigw.a.g().ah(7495)).x("WDLS onMessageReceived: the service thread is shutdown, skip the message");
            return;
        }
        switch (str2.hashCode()) {
            case -1826827913:
                if (str2.equals("/fastpair/triangle_analytics_monitor_start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -182961032:
                if (str2.equals("/fastpair/handle_pre_calling_switch")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 6410359:
                if (str2.equals("/fastpair/triangle_notify_watch_as_active_hfp_seeker")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 39991737:
                if (str2.equals("/fastpair/update_media_status")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 589350971:
                if (str2.equals("/fastpair/switch_connection_end")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1235273604:
                if (str2.equals("/fastpair/introduction")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1672046073:
                if (str2.equals("/fastpair/triangle_analytics_switch_latency")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1856354773:
                if (str2.equals("/fastpair/triangle_analytics_peripheral_switch_back")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1895253959:
                if (str2.equals("/fastpair/triangle_analytics_switch_not_trigger")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1948899680:
                if (str2.equals("/fastpair/inform_new_device_bonded")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ensvVar.execute(new Runnable() { // from class: ciqh
                    /* JADX WARN: Removed duplicated region for block: B:100:0x02b4  */
                    /* JADX WARN: Removed duplicated region for block: B:103:0x02f4  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x035b  */
                    /* JADX WARN: Removed duplicated region for block: B:155:0x067f  */
                    /* JADX WARN: Removed duplicated region for block: B:165:0x06d3  */
                    /* JADX WARN: Removed duplicated region for block: B:170:0x06e1  */
                    /* JADX WARN: Removed duplicated region for block: B:176:0x06b2  */
                    /* JADX WARN: Removed duplicated region for block: B:178:0x06b5  */
                    /* JADX WARN: Removed duplicated region for block: B:239:0x059e  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 1814
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqh.run():void");
                    }
                });
                break;
            case 1:
                ensvVar.execute(new Runnable() { // from class: ciqs
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (cidi.e(wearableDataListenerChimeraService.l)) {
                            ciua a = citm.a(messageEventParcelable.c);
                            int i = a.b;
                            if ((i & 1) == 0 || (i & 4) == 0 || (i & 8) == 0) {
                                ((ejhf) cigw.a.g().ah(7502)).x("WDLS onTriangleAnalyticsMonitorStartReceived: invalid triangle analytics data");
                            } else {
                                ciug i2 = wearableDataListenerChimeraService.i(a.e);
                                if (i2.equals(ciug.b)) {
                                    ((ejhf) cigw.a.g().ah(7503)).B("WDLS onTriangleAnalyticsMonitorStartReceived: can't get triangle node %s", a.e);
                                } else {
                                    cien b = cien.b(a.c);
                                    if (b == null) {
                                        b = cien.UNKNOWN_REQUEST_TYPE;
                                    }
                                    wearableDataListenerChimeraService.t(b, i2, a.f);
                                }
                            }
                        } else {
                            ((ejhf) cigw.a.f().ah(7504)).B("WDLS onTriangleAnalyticsMonitorStartReceived: skip logging on %s", wearableDataListenerChimeraService.l.name());
                        }
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 2:
                ensvVar.execute(new Runnable() { // from class: ciqw
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (cidi.e(wearableDataListenerChimeraService.l)) {
                            ciua a = citm.a(messageEventParcelable.c);
                            int i = a.b;
                            if ((i & 1) == 0 || (i & 4) == 0 || (i & 8) == 0) {
                                ((ejhf) cigw.a.g().ah(7505)).x("WDLS onTriangleAnalyticsSwitchLatencyReceived: invalid triangle analytics data");
                            } else {
                                cien cienVar = cien.PHONE_WATCH_TETHERED;
                                cien b = cien.b(a.c);
                                if (b == null) {
                                    b = cien.UNKNOWN_REQUEST_TYPE;
                                }
                                if (cienVar.equals(b)) {
                                    String o = wearableDataListenerChimeraService.o();
                                    if (o != null) {
                                        cibd.c(wearableDataListenerChimeraService, o, a.d).g(a.g);
                                    } else {
                                        ((ejhf) cigw.a.g().ah(7506)).x("WDLS onTriangleAnalyticsSwitchLatencyReceived: skip logging for phone and watch tether because unknown local device address");
                                    }
                                } else {
                                    cien cienVar2 = cien.WATCH_HEADSET_AUTO_CONNECT;
                                    cien b2 = cien.b(a.c);
                                    if (b2 == null) {
                                        b2 = cien.UNKNOWN_REQUEST_TYPE;
                                    }
                                    if (cienVar2.equals(b2)) {
                                        cibd.a(wearableDataListenerChimeraService, a.d, a.f).g(a.g);
                                    }
                                }
                            }
                        } else {
                            ((ejhf) cigw.a.f().ah(7507)).B("WDLS onTriangleAnalyticsSwitchLatencyReceived: skip logging on %s", wearableDataListenerChimeraService.l.name());
                        }
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 3:
                ensvVar.execute(new Runnable() { // from class: ciqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (cidi.e(wearableDataListenerChimeraService.l)) {
                            ciua a = citm.a(messageEventParcelable.c);
                            if ((a.b & 32) != 0) {
                                citz citzVar = a.h;
                                if (citzVar == null) {
                                    citzVar = citz.a;
                                }
                                citz citzVar2 = citz.a;
                                if (!citzVar.equals(citzVar2)) {
                                    citz citzVar3 = a.h;
                                    if (citzVar3 != null) {
                                        citzVar2 = citzVar3;
                                    }
                                    wearableDataListenerChimeraService.u(citzVar2);
                                }
                            }
                            ((ejhf) cigw.a.g().ah(7508)).x("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: not found switch connection response");
                        } else {
                            ((ejhf) cigw.a.f().ah(7509)).B("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: skip logging on %s", wearableDataListenerChimeraService.l.name());
                        }
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 4:
                if (cidl.WEARABLE.equals(this.l)) {
                    ((ejhf) cigw.a.f().ah(7494)).x("WDLS schedule one off sync task for Footprints data.");
                    TaskSchedulerChimeraService.g(this, true);
                }
                ensvVar.execute(new Runnable() { // from class: ciqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 5:
                ensvVar.execute(new Runnable() { // from class: ciqz
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        wearableDataListenerChimeraService.A(messageEventParcelable);
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 6:
                ensvVar.execute(new Runnable() { // from class: cira
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        ciqe.b(wearableDataListenerChimeraService, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_TRIANGLE_SWITCH_CONNECTION_END", null);
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 7:
                ensvVar.execute(new Runnable() { // from class: cirb
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        citm g = wearableDataListenerChimeraService.g();
                        cidl cidlVar = g.a;
                        if (cidi.e(cidlVar)) {
                            ciua a = citm.a(messageEventParcelable.c);
                            if ((a.b & 8) != 0) {
                                g.b(a.f, 0);
                            } else {
                                ((ejhf) cigw.a.g().ah(7563)).x("AnalyticsHelper_logPeripheralSwitchBack: no headset address");
                            }
                        } else {
                            ((ejhf) cigw.a.f().ah(7564)).B("AnalyticsHelper_logPeripheralSwitchBack: skip %s", cidlVar.name());
                        }
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case '\b':
                ensvVar.execute(new Runnable() { // from class: circ
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (wearableDataListenerChimeraService.l.equals(cidl.WEARABLE)) {
                            MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                            cfcp cfcpVar = cigw.a;
                            ((ejhf) cfcpVar.d().ah(7468)).x("WDLS: receive message to update media status for wearable node");
                            byte[] bArr = messageEventParcelable2.c;
                            if (bArr == null || bArr.length <= 0) {
                                ((ejhf) cfcpVar.d().ah(7525)).x("WDLS: syncMediaStatus message event without data to parse");
                            } else {
                                boolean z = bArr[0] != 0;
                                ((ejhf) cfcpVar.d().ah(7526)).B("WDLS: syncMediaStatus music is active = %b", Boolean.valueOf(z));
                                ciug h = wearableDataListenerChimeraService.h();
                                if (h == null) {
                                    ((ejhf) cigw.a.g().ah(7527)).x("WDLS syncMediaStatus: local node is null");
                                } else {
                                    fecj fecjVar = (fecj) h.iB(5, null);
                                    fecjVar.X(h);
                                    ciud ciudVar = (ciud) fecjVar;
                                    fecj v = ciuf.a.v();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    ciuf ciufVar = (ciuf) v.b;
                                    ciufVar.b |= 1;
                                    ciufVar.c = z;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    ciuf ciufVar2 = (ciuf) v.b;
                                    ciufVar2.b |= 2;
                                    ciufVar2.d = currentTimeMillis;
                                    ciuf ciufVar3 = (ciuf) v.Q();
                                    if (!ciudVar.b.L()) {
                                        ciudVar.U();
                                    }
                                    ciug ciugVar = (ciug) ciudVar.b;
                                    ciufVar3.getClass();
                                    ciugVar.p = ciufVar3;
                                    ciugVar.c |= 1024;
                                    ciug ciugVar2 = (ciug) ciudVar.Q();
                                    wearableDataListenerChimeraService.x(true, ciugVar2);
                                    wearableDataListenerChimeraService.c = ciugVar2;
                                    wearableDataListenerChimeraService.s(wearableDataListenerChimeraService.a);
                                }
                            }
                            wearableDataListenerChimeraService.w(true);
                        }
                    }
                });
                break;
            case '\t':
                ensvVar.execute(new Runnable() { // from class: cird
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (cidi.e(wearableDataListenerChimeraService.l)) {
                            MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                            ((ejhf) cigw.a.d().ah(7469)).x("WDLS phone receive wear message to know watch is active hfp seeker");
                            Bundle bundle = new Bundle();
                            bundle.putByteArray("com.google.android.gms.nearby.discovery.fastpair.connectionswitch.RESUME_MEDIA_STATE", messageEventParcelable2.c);
                            ciqe.b(wearableDataListenerChimeraService, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_WATCH_AS_HFP_SEEKER", bundle);
                        }
                    }
                });
                break;
        }
    }

    @Override // defpackage.dkbc, defpackage.djjk
    public final void b(djjm djjmVar) {
        if (fqld.ar() && "fast_pair_support".equals(djjmVar.a())) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.nearby.fastpair.service.EXTRA_IS_CAPABILITY_CHANGED", true);
            bundle.putParcelableArrayList("com.google.android.gms.nearby.fastpair.service.EXTRA_NODE_HOLDER_LIST", eixf.b(NodeHolder.a(djjmVar.b())));
            ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", bundle);
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        asok.a(printWriter, strArr, new asoj() { // from class: ciql
            @Override // defpackage.asoj
            public final void a(PrintWriter printWriter2, String[] strArr2) {
                printWriter2.println("Flags:");
                printWriter2.printf("  enableTriangleAudioSwitch=%s\n", Boolean.valueOf(fqld.ah()));
                printWriter2.printf("  enableTriangleAudioSwitchForCalling=%s\n", Boolean.valueOf(fqld.ai()));
                printWriter2.printf("  enableWearablePeripheralApi=%s\n", Boolean.valueOf(fqld.aq()));
                printWriter2.printf("  enableTaskSchedulerService=%s\n", Boolean.valueOf(fqld.af()));
                printWriter2.printf("  enableTriangleAnalytics=%s\n", Boolean.valueOf(fqld.ag()));
                printWriter2.printf("  enableWearMessageMonitor=%s\n", Boolean.valueOf(fqld.ao()));
                printWriter2.printf("  checkPeripheralSupportSwitch=%s\n", Boolean.valueOf(fqld.s()));
                printWriter2.printf("  supportToggleForTriangleSwitch=%s\n", Boolean.valueOf(fqld.aX()));
                printWriter2.printf("  triangleProactiveDeliverSwitchCandidate=%s\n", Boolean.valueOf(fqkx.bC()));
                printWriter2.printf("  enableSassForTriangleCallingCase=%s\n", Boolean.valueOf(fqld.Z()));
                printWriter2.printf("  serviceDestroyTimeoutMs=%s\n", Long.valueOf(fqkx.aw()));
                printWriter2.printf("  protostoreOperationTimeoutMs=%s\n", Long.valueOf(fqkx.Z()));
                printWriter2.printf("  discoveryBindingOperationTimeoutMs=%s\n", Long.valueOf(fqkx.v()));
                printWriter2.printf("  wearApiOperationTimeoutMillis=%s\n", Long.valueOf(fqkx.aG()));
                printWriter2.printf("  refreshTriangleNodeMins=%s\n", Long.valueOf(fqkx.aa()));
                Object[] objArr = {Boolean.valueOf(fqld.h())};
                WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                printWriter2.printf("  AddSassDeviceIntoTriangleCandidate=%s\n", objArr);
                printWriter2.printf("  enableIdentityAddressMappingForTriangleCandidate=%s\n", Boolean.valueOf(fqld.Q()));
                printWriter2.println();
                printWriter2.printf("isTriangleState=%s\n", Boolean.valueOf(wearableDataListenerChimeraService.i));
                ciug h = wearableDataListenerChimeraService.h();
                printWriter2.println("selfNode:");
                if (h != null) {
                    printWriter2.printf("  %s\n", cisf.j(h));
                }
                printWriter2.println("nearbyNodes:");
                Iterator it = wearableDataListenerChimeraService.a.values().iterator();
                while (it.hasNext()) {
                    printWriter2.printf("  %s\n", cisf.j((ciug) it.next()));
                }
                printWriter2.println();
                wearableDataListenerChimeraService.m().l(printWriter2);
                if (fqld.ao()) {
                    printWriter2.println();
                    cisw e = wearableDataListenerChimeraService.e(wearableDataListenerChimeraService);
                    String format = String.format(Locale.US, "wearMessageMonitorDurationHours=%s", Long.valueOf(fqkx.aI()));
                    String format2 = String.format(Locale.US, ", wearMessageMonitorSlots=%s", Long.valueOf(fqkx.aJ()));
                    String format3 = String.format(Locale.US, ", wearMessageMonitorTotalCount=%s", Long.valueOf(fqkx.aK()));
                    String format4 = String.format(Locale.US, ", currentHour=%s UTC", Long.valueOf(e.c));
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(e.c().cardinality());
                    Integer valueOf2 = Integer.valueOf(e.a);
                    printWriter2.println("TriangleMessageMonitor{" + format + format2 + format3 + format4 + String.format(locale, ", MessageTimeSlots=%s/%s", valueOf, valueOf2) + String.format(Locale.US, ", SentCount=%s", Integer.valueOf(e.d)) + String.format(Locale.US, ", SentTimeSlots=%s/%s", Integer.valueOf(e.e.cardinality()), valueOf2) + String.format(Locale.US, ", ReceivedCount=%s", Integer.valueOf(e.f)) + String.format(Locale.US, ", ReceivedTimeSlots=%s/%s", Integer.valueOf(e.g.cardinality()), valueOf2) + String.format(Locale.US, ", EventTriggerCount=%s", Integer.valueOf(e.h)) + String.format(Locale.US, ", EventTriggerTimeSlots=%s/%s", Integer.valueOf(e.i.cardinality()), valueOf2) + "}");
                }
            }
        }, "WearableDataListenerChimeraService", fqkx.ax());
    }

    public final synchronized cisw e(Context context) {
        if (this.u == null) {
            this.u = new cisw(context);
        }
        return this.u;
    }

    public final synchronized citj f(Context context) {
        if (this.t == null) {
            this.t = new citj(context);
        }
        return this.t;
    }

    public final citm g() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService;
        if (this.B == null) {
            wearableDataListenerChimeraService = this;
            wearableDataListenerChimeraService.B = new citm(wearableDataListenerChimeraService, this.l, j(), B(this), new iru() { // from class: ciqk
                @Override // defpackage.iru
                public final void a(Object obj) {
                    long longValue = ((Long) obj).longValue();
                    WearableDataListenerChimeraService wearableDataListenerChimeraService2 = WearableDataListenerChimeraService.this;
                    TaskSchedulerChimeraService.j(wearableDataListenerChimeraService2, new cibd(wearableDataListenerChimeraService2, 1, longValue, null), false);
                }
            });
        } else {
            wearableDataListenerChimeraService = this;
        }
        return wearableDataListenerChimeraService.B;
    }

    public final ciug h() {
        if (this.c == null) {
            try {
                this.c = (ciug) ((enpf) C(this).g()).v(fqkx.Z(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((ejhf) ((ejhf) cigw.a.g().s(e)).ah((char) 7442)).x("WDLS getLocalTriangleNode: can't get local triangle node from db");
            }
        }
        return this.c;
    }

    public final ciug i(String str) {
        ciug ciugVar = (ciug) this.a.get(str);
        if (ciugVar != null) {
            return ciugVar;
        }
        try {
            return (ciug) ((enpf) C(this).h(str)).v(fqkx.Z(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) cigw.a.g().s(e)).ah((char) 7443)).B("WDLS getTriangleNode: can't get triangle node %s from db", str);
            return ciug.b;
        }
    }

    public final ciup j() {
        if (this.w == null) {
            synchronized (this) {
                if (this.w == null) {
                    this.w = new ciup(this);
                }
            }
        }
        return this.w;
    }

    @Override // defpackage.dkbc, defpackage.djkj
    public final dfaq k(final String str, String str2, final byte[] bArr) {
        char c;
        if (!fqld.ar()) {
            ((ejhf) cigw.a.g().ah(7499)).B("WDLS onRequest: service is disable, path %s", str2);
            return dfbl.d(new byte[0]);
        }
        ((ejhf) cigw.a.d().ah(7497)).P("WDLS onRequest: nodeId %s, path %s", str, str2);
        int hashCode = str2.hashCode();
        if (hashCode == 241792328) {
            if (str2.equals("/fastpair/pre_calling_switch_connection")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 881260447) {
            if (hashCode == 1810278685 && str2.equals("/fastpair/request_set_active")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str2.equals("/fastpair/switch_connection")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return H(str, bArr, false);
        }
        if (c == 1) {
            return H(str, bArr, true);
        }
        if (c != 2) {
            ((ejhf) cigw.a.g().ah(7498)).B("WDLS onRequest: unsupported path %s", str2);
            return dfbl.d(new byte[0]);
        }
        final dfau dfauVar = new dfau();
        this.b.execute(new Runnable() { // from class: ciqm
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
            
                if (r3.y() != false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
            
                r3.n().c(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
            
                if (r3.y() != false) goto L42;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 316
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqm.run():void");
            }
        });
        return dfauVar.a;
    }

    public final excv l() {
        return (excv) n().b(this, ciqe.a(this, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_TRIANGLE_SWITCH", "com.google.android.gms.nearby.discovery.service.DiscoveryService", null), fqkx.v());
    }

    public final exfg m() {
        if (this.d == null) {
            this.d = new exfg(this, cexc.d(this, "WearableDataListenerChimeraService"), eitj.m(2, 1), fqkx.a.a().fI());
        }
        return this.d;
    }

    public final exfm n() {
        if (this.x == null) {
            this.x = new exfm(new eiho() { // from class: ciqv
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDeviceStatusService");
                    return queryLocalInterface instanceof excv ? (excv) queryLocalInterface : new exct(iBinder);
                }
            });
        }
        return this.x;
    }

    public final String o() {
        ciug h = h();
        return (h == null || (h.c & 2) == 0) ? cida.a(this) : h.e;
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.l = cidi.a(this);
        this.v.execute(new Runnable() { // from class: ciqu
            @Override // java.lang.Runnable
            public final void run() {
                WearableDataListenerChimeraService.this.r();
            }
        });
        ((ejhf) cigw.a.d().ah(7486)).x("WDLS created");
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onDestroy() {
        Runnable runnable = new Runnable() { // from class: ciqt
            /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
            
                if (defpackage.cidy.b(r2) == false) goto L9;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r6 = this;
                    com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService r0 = com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.this
                    boolean r1 = defpackage.fqld.ao()
                    if (r1 == 0) goto L6f
                    cisw r1 = r0.e(r0)
                    boolean r2 = defpackage.fqld.ao()
                    if (r2 != 0) goto L13
                    goto L5c
                L13:
                    bxdf r2 = r1.j
                    bxdd r2 = r2.c()
                    long r3 = r1.c
                    java.lang.String r5 = "MESSAGE_MONITOR_CURRENT_HOUR"
                    r2.g(r5, r3)
                    int r3 = r1.d
                    java.lang.String r4 = "MESSAGE_MONITOR_SENT_COUNT"
                    r2.f(r4, r3)
                    java.util.BitSet r3 = r1.e
                    long r3 = defpackage.cisw.b(r3)
                    java.lang.String r5 = "MESSAGE_MONITOR_SENT_BITS"
                    r2.g(r5, r3)
                    int r3 = r1.f
                    java.lang.String r4 = "MESSAGE_MONITOR_RECEIVED_COUNT"
                    r2.f(r4, r3)
                    java.util.BitSet r3 = r1.g
                    long r3 = defpackage.cisw.b(r3)
                    java.lang.String r5 = "MESSAGE_MONITOR_RECEIVED_BITS"
                    r2.g(r5, r3)
                    int r3 = r1.h
                    java.lang.String r4 = "MESSAGE_MONITOR_EVENT_TRIGGER_COUNT"
                    r2.f(r4, r3)
                    java.util.BitSet r1 = r1.i
                    long r3 = defpackage.cisw.b(r1)
                    java.lang.String r1 = "MESSAGE_MONITOR_EVENT_TRIGGER_BITS"
                    r2.g(r1, r3)
                    boolean r1 = defpackage.cidy.b(r2)
                    if (r1 != 0) goto L6f
                L5c:
                    cfcp r1 = defpackage.cigw.a
                    ejhf r1 = r1.g()
                    r2 = 7434(0x1d0a, float:1.0417E-41)
                    ejgq r1 = r1.ah(r2)
                    ejhf r1 = (defpackage.ejhf) r1
                    java.lang.String r2 = "WDLS destroy: failed to store the triangle message states."
                    r1.x(r2)
                L6f:
                    exfg r1 = r0.d
                    if (r1 == 0) goto L76
                    r1.k()
                L76:
                    exfm r1 = r0.n()
                    r1.c(r0)
                    ensv r0 = r0.b
                    com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.q(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ciqt.run():void");
            }
        };
        ensv ensvVar = this.v;
        ensvVar.execute(runnable);
        q(ensvVar);
        super.onDestroy();
        ((ejhf) cigw.a.d().ah(7487)).x("WDLS destroyed");
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (!fqld.ar()) {
            return 2;
        }
        this.v.execute(new Runnable() { // from class: ciqp
            @Override // java.lang.Runnable
            public final void run() {
                WearableDataListenerChimeraService.this.v(intent);
            }
        });
        return 1;
    }

    final synchronized String p() {
        ciug h = h();
        if (h == null) {
            return null;
        }
        return h.d;
    }

    public final void r() {
        this.d = m();
        this.f = (TelephonyManager) getSystemService("phone");
        this.y = (AudioManager) getSystemService("audio");
        this.i = f(this).e();
        this.c = h();
        try {
            for (ciug ciugVar : (List) ((enpf) C(this).e()).v(fqkx.Z(), TimeUnit.MILLISECONDS)) {
                if (ciugVar.i) {
                    this.a.put(ciugVar.d, ciugVar);
                }
            }
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((ejhf) cigw.a.d().ah(7465)).x("WDLS initialize: failed to read triangle data store");
        }
        P();
        this.h.b(this.c, this.a.values());
    }

    public final void s(Map map) {
        ciug ciugVar = this.c;
        if (ciugVar == null) {
            ((ejhf) cigw.a.g().ah(7467)).x("WDLS introduceConnectedNodes: local node is null.");
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ciug ciugVar2 = (ciug) entry.getValue();
            ((ejhf) cigw.a.d().ah(7466)).B("WDLS introduceConnectedNodes: send message %s", str);
            if (j().d(str, "/fastpair/introduction", ciugVar.r())) {
                this.j++;
                if (!ciugVar2.j) {
                    fecj fecjVar = (fecj) ciugVar2.iB(5, null);
                    fecjVar.X(ciugVar2);
                    ciud ciudVar = (ciud) fecjVar;
                    if (!ciudVar.b.L()) {
                        ciudVar.U();
                    }
                    ciug ciugVar3 = (ciug) ciudVar.b;
                    ciugVar3.c |= 32;
                    ciugVar3.j = true;
                    ciug ciugVar4 = (ciug) ciudVar.Q();
                    hashMap.put(str, ciugVar4);
                    x(false, ciugVar4);
                }
            }
        }
        map.putAll(hashMap);
    }

    public final void t(cien cienVar, ciug ciugVar, String str) {
        if (!cidi.e(this.l)) {
            ((ejhf) cigw.a.f().ah(7477)).B("WDLS logTriangleStart: skip logging on %s", this.l.name());
            return;
        }
        if ((ciugVar.c & 2) == 0) {
            ((ejhf) cigw.a.g().ah(7476)).B("WDLS logTriangleStart: skip logging because unknown wearable address %s", ciugVar.e);
            return;
        }
        if (cien.PHONE_WATCH_TETHERED.equals(cienVar)) {
            String o = o();
            if (o != null) {
                TaskSchedulerChimeraService.h(this, cibd.c(this, o, ciugVar.e));
                return;
            } else {
                ((ejhf) cigw.a.g().ah(7475)).x("WDLS logTriangleStart: skip logging for phone and watch tether because unknown local device address");
                return;
            }
        }
        if (cien.WATCH_HEADSET_AUTO_CONNECT.equals(cienVar)) {
            if (str != null) {
                TaskSchedulerChimeraService.h(this, cibd.a(this, ciugVar.e, str));
            } else {
                ((ejhf) cigw.a.f().ah(7474)).x("WDLS logTriangleStart: skip logging for auto connect because headset address is unknown");
            }
        }
    }

    public final void u(citz citzVar) {
        if (!cidi.e(this.l)) {
            ((ejhf) cigw.a.f().ah(7484)).B("WDLS logTriangleSwitchResult: skip logging on %s", this.l.name());
            return;
        }
        if ((citzVar.b & 8) != 0) {
            cien cienVar = cien.UNKNOWN_REQUEST_TYPE;
            cien b = cien.b(citzVar.f);
            if (b == null) {
                b = cienVar;
            }
            if (!cienVar.equals(b)) {
                cien b2 = cien.b(citzVar.f);
                if (b2 != null) {
                    cienVar = b2;
                }
                if (cien.CALLING_ON_PHONE.equals(cienVar)) {
                    ((ejhf) cigw.a.g().ah(7483)).x("WDLS logTriangleSwitchResult: skip logging because the calling request should never sent from the watch side.");
                    return;
                }
                String str = citzVar.c;
                ciug i = i(str);
                if (i.equals(ciug.b)) {
                    ((ejhf) cigw.a.g().ah(7482)).B("WDLS logTriangleSwitchResult: can't get triangle node %s", str);
                    return;
                }
                ciug h = h();
                if (h == null) {
                    ((ejhf) cigw.a.g().ah(7481)).x("WDLS logTriangleSwitchResult: can't get local node id");
                    return;
                }
                int ordinal = cienVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    String o = o();
                    if (o == null) {
                        ((ejhf) cigw.a.g().ah(7480)).x("WDLS logTriangleSwitchResult: skip logging for phone and watch tether because unknown local device address");
                        return;
                    } else {
                        cibd.c(this, o, i.e).h(citzVar, i, h);
                        return;
                    }
                }
                if ((citzVar.b & 4) == 0) {
                    ((ejhf) cigw.a.g().ah(7479)).x("WDLS logTriangleSwitchResult: can't get peripheral address for logging auto connect.");
                    return;
                }
                String str2 = i.e;
                citr citrVar = citzVar.e;
                if (citrVar == null) {
                    citrVar = citr.a;
                }
                cibd.a(this, str2, citrVar.c).h(citzVar, i, h);
                return;
            }
        }
        ((ejhf) cigw.a.f().ah(7478)).x("WDLS logTriangleSwitchResult: skip logging because of unknown request type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x068b, code lost:
    
        if (r0.length <= 0) goto L416;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0c5f A[LOOP:8: B:377:0x0c59->B:379:0x0c5f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b5e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 3314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.v(android.content.Intent):void");
    }

    public final void w(boolean z) {
        if (this.j == 0 && this.k == 0 && !z) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.nearby.fastpair.service.EXTRA_TRIANGLE_MESSAGE_SENT_COUNT", this.j);
        bundle.putInt("com.google.android.gms.nearby.fastpair.service.EXTRA_TRIANGLE_MESSAGE_RECEIVED_COUNT", this.k);
        bundle.putInt("com.google.android.gms.nearby.fastpair.service.EXTRA_TRIANGLE_MESSAGE_TRIGGER_COUNT", z ? 1 : 0);
        ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_TRIANGLE_MESSAGE_USAGE", bundle);
        this.j = 0;
        this.k = 0;
    }

    public final void x(final boolean z, final ciug ciugVar) {
        try {
            ((enpf) C(this).a.b(new eiho() { // from class: cisz
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    ciuh ciuhVar = (ciuh) obj;
                    fecj fecjVar = (fecj) ciuhVar.iB(5, null);
                    fecjVar.X(ciuhVar);
                    ciug ciugVar2 = ciugVar;
                    if (z) {
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        ciuh ciuhVar2 = (ciuh) fecjVar.b;
                        ciuh ciuhVar3 = ciuh.a;
                        ciugVar2.getClass();
                        ciuhVar2.d = ciugVar2;
                        ciuhVar2.b |= 1;
                        return (ciuh) fecjVar.Q();
                    }
                    int i = 0;
                    while (true) {
                        if (i >= ((ciuh) fecjVar.b).c.size()) {
                            break;
                        }
                        if (ciugVar2.d.equals(((ciug) ((ciuh) fecjVar.b).c.get(i)).d)) {
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            ciuh ciuhVar4 = (ciuh) fecjVar.b;
                            ciuhVar4.b();
                            ciuhVar4.c.remove(i);
                        } else {
                            i++;
                        }
                    }
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    ciuh ciuhVar5 = (ciuh) fecjVar.b;
                    ciugVar2.getClass();
                    ciuhVar5.b();
                    ciuhVar5.c.add(ciugVar2);
                    return (ciuh) fecjVar.Q();
                }
            }, enre.a)).v(fqkx.Z(), TimeUnit.MILLISECONDS);
            if (fqld.aX() && cidi.e(this.l)) {
                exdl.c(this, "links");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) cigw.a.g().ah(7542)).B("WDLS writeTriangleNode: can't write triangle node into db, %s", e.getMessage());
        }
    }

    public final boolean y() {
        if (fqkx.a.a().gh() && this.i) {
            return !cidl.WEARABLE.equals(this.l) || this.A;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean z(boolean r28) {
        /*
            Method dump skipped, instructions count: 2061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.z(boolean):boolean");
    }
}
