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
import defpackage.aupz;
import defpackage.ausd;
import defpackage.ause;
import defpackage.bjno;
import defpackage.bzlt;
import defpackage.chen;
import defpackage.chkb;
import defpackage.ckji;
import defpackage.cklf;
import defpackage.cklm;
import defpackage.ckln;
import defpackage.cklq;
import defpackage.ckmd;
import defpackage.ckms;
import defpackage.ckpb;
import defpackage.ckyi;
import defpackage.ckyj;
import defpackage.clak;
import defpackage.clbb;
import defpackage.clbn;
import defpackage.clbo;
import defpackage.clbq;
import defpackage.clbr;
import defpackage.clbw;
import defpackage.clcc;
import defpackage.clce;
import defpackage.clci;
import defpackage.clcj;
import defpackage.clcl;
import defpackage.clcu;
import defpackage.dhlw;
import defpackage.dhma;
import defpackage.dhmr;
import defpackage.dlvf;
import defpackage.dmmv;
import defpackage.dpmu;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elkk;
import defpackage.elmt;
import defpackage.elpl;
import defpackage.elsn;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.eqgo;
import defpackage.ezql;
import defpackage.ezre;
import defpackage.ezru;
import defpackage.eztp;
import defpackage.eztv;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.ftes;
import defpackage.ftey;
import defpackage.itk;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WearableDataListenerChimeraService extends dmmv {
    private clbr B;
    private clak C;
    private clak D;
    public clcl c;
    public eztp d;
    public ckyi e;
    public TelephonyManager f;
    public clce g;
    public cklq l;
    private clbo t;
    private clbb u;
    private volatile clcu w;
    private eztv x;
    private AudioManager y;
    public final HashMap a = new HashMap();
    private final eqgo v = new aupz(1, 9);
    public final eqgo b = new aupz(1, 9);
    public final clcc h = new clcc();
    private boolean z = false;
    public boolean i = false;
    public int j = 0;
    public int k = 0;
    private boolean A = false;
    public chkb m = ckpb.a;

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
    private final defpackage.dhlw H(final java.lang.String r12, byte[] r13, final boolean r14) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.H(java.lang.String, byte[], boolean):dhlw");
    }

    private final elgx I() {
        clcl h = h();
        return h == null ? elpl.a : elmt.f(h.h, new ekut() { // from class: ckyw
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ((clbw) obj).c;
            }
        });
    }

    private final void J() {
        if (this.a.isEmpty()) {
            stopSelf();
            return;
        }
        if (!this.z) {
            ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", null);
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
    private final void K(defpackage.ckms r14, java.util.Collection r15, android.bluetooth.BluetoothDevice r16) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.K(ckms, java.util.Collection, android.bluetooth.BluetoothDevice):void");
    }

    private final void L(boolean z) {
        boolean z2 = z(true);
        if (z && z2) {
            s(this.a);
        }
    }

    private final void M(String str, BluetoothDevice bluetoothDevice) {
        ((eluo) ckpb.a.d().ai(7434)).P("WDLS onStartCommand: %s: %s", str, bluetoothDevice != null ? dpmu.c(bluetoothDevice) : "no active device");
        boolean z = true;
        if (!S() && !R()) {
            z = false;
        }
        L(z);
    }

    private final void N(BluetoothDevice bluetoothDevice) {
        try {
            clak B = B(this);
            fgrc v = clbq.a.v();
            String address = bluetoothDevice.getAddress();
            if (!v.b.L()) {
                v.U();
            }
            clbq clbqVar = (clbq) v.b;
            address.getClass();
            clbqVar.b |= 1;
            clbqVar.c = address;
            long currentTimeMillis = System.currentTimeMillis();
            if (!v.b.L()) {
                v.U();
            }
            clbq clbqVar2 = (clbq) v.b;
            clbqVar2.b |= 2;
            clbqVar2.d = currentTimeMillis;
            final clbq clbqVar3 = (clbq) v.Q();
            ((eqcy) B.a.b(new ekut() { // from class: clav
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    clcg clcgVar = (clcg) obj;
                    final fgrc fgrcVar = (fgrc) clcgVar.iQ(5, null);
                    fgrcVar.X(clcgVar);
                    Objects.requireNonNull(fgrcVar);
                    clak.d(new itt() { // from class: claq
                        @Override // defpackage.itt
                        public final Object a() {
                            return DesugarCollections.unmodifiableList(((clcg) fgrc.this.b).c);
                        }
                    }, new ekut() { // from class: clar
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            return Long.valueOf(((clbq) obj2).d);
                        }
                    }, new itk() { // from class: clas
                        @Override // defpackage.itk
                        public final void a(Object obj2) {
                            fgrc fgrcVar2 = fgrc.this;
                            List list = (List) obj2;
                            if (!fgrcVar2.b.L()) {
                                fgrcVar2.U();
                            }
                            clcg clcgVar2 = (clcg) fgrcVar2.b;
                            clcg clcgVar3 = clcg.a;
                            clcgVar2.c = fgtj.a;
                            if (!fgrcVar2.b.L()) {
                                fgrcVar2.U();
                            }
                            clcg clcgVar4 = (clcg) fgrcVar2.b;
                            clcgVar4.b();
                            fgou.E(list, clcgVar4.c);
                        }
                    });
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    clbq clbqVar4 = clbq.this;
                    clcg clcgVar2 = (clcg) fgrcVar.b;
                    clcg clcgVar3 = clcg.a;
                    clbqVar4.getClass();
                    clcgVar2.b();
                    clcgVar2.c.add(clbqVar4);
                    return (clcg) fgrcVar.Q();
                }
            }, eqex.a)).v(ftes.Z(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ckpb.a.g().ai(7459)).B("WDLS recordA2dpActiveState: %s", e.getMessage());
        }
    }

    private final void O(BluetoothDevice bluetoothDevice) {
        for (clcl clclVar : this.a.values()) {
            if (clclVar.e.equals(bluetoothDevice.getAddress())) {
                try {
                    clak C = C(this);
                    final elgo l = elgo.l(clclVar.d);
                    ((eqcy) C.a.b(new ekut() { // from class: clbf
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            clcm clcmVar = (clcm) obj;
                            ArrayList arrayList = new ArrayList();
                            for (clcl clclVar2 : clcmVar.c) {
                                List list = l;
                                if (!list.contains(clclVar2.d)) {
                                    arrayList.add(clclVar2);
                                }
                            }
                            fgrc fgrcVar = (fgrc) clcmVar.iQ(5, null);
                            fgrcVar.X(clcmVar);
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            ((clcm) fgrcVar.b).c = fgtj.a;
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            clcm clcmVar2 = (clcm) fgrcVar.b;
                            clcmVar2.b();
                            fgou.E(arrayList, clcmVar2.c);
                            return (clcm) fgrcVar.Q();
                        }
                    }, eqex.a)).v(ftes.Z(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((eluo) ckpb.a.g().ai(7460)).B("WDLS removeWearableDevice: can't remove triangle node from db, %s", e.getMessage());
                }
                this.a.remove(clclVar.d);
                return;
            }
        }
    }

    private final void P() {
        HashSet hashSet = new HashSet();
        elsn listIterator = I().values().listIterator();
        while (listIterator.hasNext()) {
            clbw clbwVar = (clbw) listIterator.next();
            if (clbwVar.f.size() > 0) {
                hashSet.add(clbwVar.c);
            }
        }
        C(this);
        this.A = !clak.k(this.a.values(), hashSet).isEmpty();
    }

    private final void Q() {
        boolean isEmpty = this.a.isEmpty();
        boolean z = !isEmpty;
        try {
            boolean isEmpty2 = ((HashSet) ((eqcy) C(this).f()).v(ftes.Z(), TimeUnit.MILLISECONDS)).isEmpty();
            ((eluo) ckpb.a.d().ai(7479)).S("WDLS updateIsTriangleState: hasNearbyNodes %s, hasBondedHeadset %s", z, !isEmpty2);
            clbo f = f(this);
            boolean z2 = false;
            boolean z3 = (isEmpty || isEmpty2) ? false : true;
            bzlt c = f.a.c();
            c.e("IS_TRIANGLE_STATE", z3);
            ckmd.b(c);
            if (!isEmpty && !isEmpty2) {
                z2 = true;
            }
            this.i = z2;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((eluo) ckpb.a.d().ai(7480)).x("WDLS updateIsTriangleState: failed to get bonded headset addresses");
        }
    }

    private final boolean R() {
        return cklq.WEARABLE.equals(this.l);
    }

    private final boolean S() {
        TelephonyManager telephonyManager;
        return ckln.e(this.l) && (telephonyManager = this.f) != null && cklm.k(telephonyManager);
    }

    private final boolean T(BluetoothDevice bluetoothDevice) {
        for (clcl clclVar : this.a.values()) {
            if (clclVar.e.equals(bluetoothDevice.getAddress())) {
                clcj clcjVar = clclVar.g;
                if (clcjVar == null) {
                    clcjVar = clcj.a;
                }
                cklq b = cklq.b(clcjVar.c);
                if (b == null) {
                    b = cklq.UNKNOWN_DEVICE_TYPE;
                }
                if (b.equals(cklq.WEARABLE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void q(eqgo eqgoVar) {
        eqgoVar.shutdown();
        try {
            if (eqgoVar.awaitTermination(ftes.aw(), TimeUnit.MILLISECONDS)) {
                return;
            }
            ((eluo) ckpb.a.g().ai(7376)).x("WDLS destroy timeout");
        } catch (InterruptedException e) {
            ((eluo) ((eluo) ckpb.a.g().s(e)).ai((char) 7377)).x("WDLS destroy exception");
        }
    }

    public final clce A(MessageEventParcelable messageEventParcelable) {
        clce clceVar;
        String str;
        if (messageEventParcelable == null) {
            clceVar = this.g;
        } else {
            try {
                byte[] bArr = messageEventParcelable.c;
                fgri y = fgri.y(clce.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                clceVar = (clce) y;
            } catch (fgsd e) {
                ((eluo) ((eluo) ckpb.a.g().s(e)).ai((char) 7515)).x("MessageDataParser_parseSwitchConnectionResponse: failed to parse message data");
                clceVar = null;
            }
        }
        if (clceVar == null || clceVar.equals(clce.a) || (clceVar.b & 4) == 0) {
            ((eluo) ckpb.a.d().ai(7393)).x("WDLS handlePreCallingSwitch: no pre-switch response record");
            return null;
        }
        this.g = null;
        bjno e2 = chen.e(this, "WearableDataListenerChimeraService");
        if (e2 != null) {
            clbw clbwVar = clceVar.e;
            if (clbwVar == null) {
                clbwVar = clbw.a;
            }
            if ((clbwVar.b & 8) != 0) {
                clbw clbwVar2 = clceVar.e;
                if (clbwVar2 == null) {
                    clbwVar2 = clbw.a;
                }
                if (!clbn.e(clbwVar2.h)) {
                    eluo eluoVar = (eluo) ckpb.a.d().ai(7396);
                    clbw clbwVar3 = clceVar.e;
                    if (clbwVar3 == null) {
                        clbwVar3 = clbw.a;
                    }
                    String c = dpmu.c(clbwVar3.c);
                    clbw clbwVar4 = clceVar.e;
                    if (clbwVar4 == null) {
                        clbwVar4 = clbw.a;
                    }
                    eluoVar.P("WDLS handlePreCallingSwitch: not disconnect %s (%s)", c, clbwVar4.h);
                }
            }
            eluo eluoVar2 = (eluo) ckpb.a.d().ai(7395);
            clbw clbwVar5 = clceVar.e;
            if (clbwVar5 == null) {
                clbwVar5 = clbw.a;
            }
            String c2 = dpmu.c(clbwVar5.c);
            clbw clbwVar6 = clceVar.e;
            if (((clbwVar6 == null ? clbw.a : clbwVar6).b & 8) != 0) {
                if (clbwVar6 == null) {
                    clbwVar6 = clbw.a;
                }
                str = clbwVar6.h;
            } else {
                str = "na";
            }
            eluoVar2.P("WDLS handlePreCallingSwitch: disconnect %s (%s)", c2, str);
            clbw clbwVar7 = clceVar.e;
            if (clbwVar7 == null) {
                clbwVar7 = clbw.a;
            }
            BluetoothDevice d = e2.d(clbwVar7.c);
            ftey.bg();
            ezql.r(e2, d);
        } else {
            eluo eluoVar3 = (eluo) ckpb.a.g().ai(7394);
            clbw clbwVar8 = clceVar.e;
            if (clbwVar8 == null) {
                clbwVar8 = clbw.a;
            }
            eluoVar3.B("WDLS handlePreCallingSwitch: skip because bluetooth adapter is null (device=%s)", dpmu.c(clbwVar8.c));
        }
        return clceVar;
    }

    final synchronized clak B(Context context) {
        if (this.D == null) {
            this.D = new clak(context, (byte[]) null);
        }
        return this.D;
    }

    final synchronized clak C(Context context) {
        if (this.C == null) {
            this.C = new clak(context, (char[]) null);
        }
        return this.C;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(final MessageEventParcelable messageEventParcelable) {
        char c;
        if (!ftey.as()) {
            ((eluo) ckpb.a.g().ai(7445)).x("WDLS onMessageReceived: wearable service is not enabled");
        }
        chkb chkbVar = ckpb.a;
        eluo eluoVar = (eluo) chkbVar.d().ai(7442);
        String str = messageEventParcelable.d;
        String str2 = messageEventParcelable.b;
        eluoVar.P("WDLS onMessageReceived: %s, %s", str, str2);
        eqgo eqgoVar = this.v;
        if (eqgoVar.isShutdown()) {
            ((eluo) chkbVar.g().ai(7444)).x("WDLS onMessageReceived: the service thread is shutdown, skip the message");
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
                eqgoVar.execute(new Runnable() { // from class: ckym
                    /* JADX WARN: Removed duplicated region for block: B:103:0x02b2  */
                    /* JADX WARN: Removed duplicated region for block: B:106:0x02f2  */
                    /* JADX WARN: Removed duplicated region for block: B:115:0x0359  */
                    /* JADX WARN: Removed duplicated region for block: B:158:0x067d  */
                    /* JADX WARN: Removed duplicated region for block: B:168:0x06d1  */
                    /* JADX WARN: Removed duplicated region for block: B:173:0x06df  */
                    /* JADX WARN: Removed duplicated region for block: B:179:0x06b0  */
                    /* JADX WARN: Removed duplicated region for block: B:181:0x06b3  */
                    /* JADX WARN: Removed duplicated region for block: B:242:0x059c  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 1812
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckym.run():void");
                    }
                });
                break;
            case 1:
                eqgoVar.execute(new Runnable() { // from class: ckyx
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (ckln.e(wearableDataListenerChimeraService.l)) {
                            clcf a = clbr.a(messageEventParcelable.c);
                            int i = a.b;
                            if ((i & 1) == 0 || (i & 4) == 0 || (i & 8) == 0) {
                                ((eluo) ckpb.a.g().ai(7451)).x("WDLS onTriangleAnalyticsMonitorStartReceived: invalid triangle analytics data");
                            } else {
                                clcl i2 = wearableDataListenerChimeraService.i(a.e);
                                if (i2.equals(clcl.b)) {
                                    ((eluo) ckpb.a.g().ai(7452)).B("WDLS onTriangleAnalyticsMonitorStartReceived: can't get triangle node %s", a.e);
                                } else {
                                    ckms b = ckms.b(a.c);
                                    if (b == null) {
                                        b = ckms.UNKNOWN_REQUEST_TYPE;
                                    }
                                    wearableDataListenerChimeraService.t(b, i2, a.f);
                                }
                            }
                        } else {
                            ((eluo) ckpb.a.f().ai(7453)).B("WDLS onTriangleAnalyticsMonitorStartReceived: skip logging on %s", wearableDataListenerChimeraService.l.name());
                        }
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 2:
                eqgoVar.execute(new Runnable() { // from class: ckzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (ckln.e(wearableDataListenerChimeraService.l)) {
                            clcf a = clbr.a(messageEventParcelable.c);
                            int i = a.b;
                            if ((i & 1) == 0 || (i & 4) == 0 || (i & 8) == 0) {
                                ((eluo) ckpb.a.g().ai(7454)).x("WDLS onTriangleAnalyticsSwitchLatencyReceived: invalid triangle analytics data");
                            } else {
                                ckms ckmsVar = ckms.PHONE_WATCH_TETHERED;
                                ckms b = ckms.b(a.c);
                                if (b == null) {
                                    b = ckms.UNKNOWN_REQUEST_TYPE;
                                }
                                if (ckmsVar.equals(b)) {
                                    String o = wearableDataListenerChimeraService.o();
                                    if (o != null) {
                                        ckji.c(wearableDataListenerChimeraService, o, a.d).g(a.g);
                                    } else {
                                        ((eluo) ckpb.a.g().ai(7455)).x("WDLS onTriangleAnalyticsSwitchLatencyReceived: skip logging for phone and watch tether because unknown local device address");
                                    }
                                } else {
                                    ckms ckmsVar2 = ckms.WATCH_HEADSET_AUTO_CONNECT;
                                    ckms b2 = ckms.b(a.c);
                                    if (b2 == null) {
                                        b2 = ckms.UNKNOWN_REQUEST_TYPE;
                                    }
                                    if (ckmsVar2.equals(b2)) {
                                        ckji.a(wearableDataListenerChimeraService, a.d, a.f).g(a.g);
                                    }
                                }
                            }
                        } else {
                            ((eluo) ckpb.a.f().ai(7456)).B("WDLS onTriangleAnalyticsSwitchLatencyReceived: skip logging on %s", wearableDataListenerChimeraService.l.name());
                        }
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 3:
                eqgoVar.execute(new Runnable() { // from class: ckzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (ckln.e(wearableDataListenerChimeraService.l)) {
                            clcf a = clbr.a(messageEventParcelable.c);
                            if ((a.b & 32) != 0) {
                                clce clceVar = a.h;
                                if (clceVar == null) {
                                    clceVar = clce.a;
                                }
                                clce clceVar2 = clce.a;
                                if (!clceVar.equals(clceVar2)) {
                                    clce clceVar3 = a.h;
                                    if (clceVar3 != null) {
                                        clceVar2 = clceVar3;
                                    }
                                    wearableDataListenerChimeraService.u(clceVar2);
                                }
                            }
                            ((eluo) ckpb.a.g().ai(7457)).x("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: not found switch connection response");
                        } else {
                            ((eluo) ckpb.a.f().ai(7458)).B("WDLS onTriangleAnalyticsSwitchNotTriggerReceived: skip logging on %s", wearableDataListenerChimeraService.l.name());
                        }
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 4:
                if (cklq.WEARABLE.equals(this.l)) {
                    ((eluo) chkbVar.f().ai(7443)).x("WDLS schedule one off sync task for Footprints data.");
                    TaskSchedulerChimeraService.g(this, true);
                }
                eqgoVar.execute(new Runnable() { // from class: ckzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 5:
                eqgoVar.execute(new Runnable() { // from class: ckze
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
                eqgoVar.execute(new Runnable() { // from class: ckzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        ckyj.b(wearableDataListenerChimeraService, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_TRIANGLE_SWITCH_CONNECTION_END", null);
                        wearableDataListenerChimeraService.k++;
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case 7:
                eqgoVar.execute(new Runnable() { // from class: ckzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        clbr g = wearableDataListenerChimeraService.g();
                        cklq cklqVar = g.a;
                        if (ckln.e(cklqVar)) {
                            clcf a = clbr.a(messageEventParcelable.c);
                            if ((a.b & 8) != 0) {
                                g.b(a.f, 0);
                            } else {
                                ((eluo) ckpb.a.g().ai(7512)).x("AnalyticsHelper_logPeripheralSwitchBack: no headset address");
                            }
                        } else {
                            ((eluo) ckpb.a.f().ai(7513)).B("AnalyticsHelper_logPeripheralSwitchBack: skip %s", cklqVar.name());
                        }
                        wearableDataListenerChimeraService.w(true);
                    }
                });
                break;
            case '\b':
                eqgoVar.execute(new Runnable() { // from class: ckzh
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (wearableDataListenerChimeraService.l.equals(cklq.WEARABLE)) {
                            MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                            chkb chkbVar2 = ckpb.a;
                            ((eluo) chkbVar2.d().ai(7417)).x("WDLS: receive message to update media status for wearable node");
                            byte[] bArr = messageEventParcelable2.c;
                            if (bArr == null || bArr.length <= 0) {
                                ((eluo) chkbVar2.d().ai(7474)).x("WDLS: syncMediaStatus message event without data to parse");
                            } else {
                                boolean z = bArr[0] != 0;
                                ((eluo) chkbVar2.d().ai(7475)).B("WDLS: syncMediaStatus music is active = %b", Boolean.valueOf(z));
                                clcl h = wearableDataListenerChimeraService.h();
                                if (h == null) {
                                    ((eluo) chkbVar2.g().ai(7476)).x("WDLS syncMediaStatus: local node is null");
                                } else {
                                    fgrc fgrcVar = (fgrc) h.iQ(5, null);
                                    fgrcVar.X(h);
                                    clci clciVar = (clci) fgrcVar;
                                    fgrc v = clck.a.v();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    clck clckVar = (clck) v.b;
                                    clckVar.b |= 1;
                                    clckVar.c = z;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    clck clckVar2 = (clck) v.b;
                                    clckVar2.b |= 2;
                                    clckVar2.d = currentTimeMillis;
                                    clck clckVar3 = (clck) v.Q();
                                    if (!clciVar.b.L()) {
                                        clciVar.U();
                                    }
                                    clcl clclVar = (clcl) clciVar.b;
                                    clckVar3.getClass();
                                    clclVar.p = clckVar3;
                                    clclVar.c |= 1024;
                                    clcl clclVar2 = (clcl) clciVar.Q();
                                    wearableDataListenerChimeraService.x(true, clclVar2);
                                    wearableDataListenerChimeraService.c = clclVar2;
                                    wearableDataListenerChimeraService.s(wearableDataListenerChimeraService.a);
                                }
                            }
                            wearableDataListenerChimeraService.w(true);
                        }
                    }
                });
                break;
            case '\t':
                eqgoVar.execute(new Runnable() { // from class: ckzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                        if (ckln.e(wearableDataListenerChimeraService.l)) {
                            MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                            ((eluo) ckpb.a.d().ai(7418)).x("WDLS phone receive wear message to know watch is active hfp seeker");
                            Bundle bundle = new Bundle();
                            bundle.putByteArray("com.google.android.gms.nearby.discovery.fastpair.connectionswitch.RESUME_MEDIA_STATE", messageEventParcelable2.c);
                            ckyj.b(wearableDataListenerChimeraService, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_WATCH_AS_HFP_SEEKER", bundle);
                        }
                    }
                });
                break;
        }
    }

    @Override // defpackage.dmmv, defpackage.dlvd
    public final void b(dlvf dlvfVar) {
        if (ftey.as() && "fast_pair_support".equals(dlvfVar.a())) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.nearby.fastpair.service.EXTRA_IS_CAPABILITY_CHANGED", true);
            bundle.putParcelableArrayList("com.google.android.gms.nearby.fastpair.service.EXTRA_NODE_HOLDER_LIST", elkk.b(NodeHolder.a(dlvfVar.b())));
            ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", bundle);
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ause.a(printWriter, strArr, new ausd() { // from class: ckyq
            @Override // defpackage.ausd
            public final void a(PrintWriter printWriter2, String[] strArr2) {
                printWriter2.println("Flags:");
                printWriter2.printf("  enableTriangleAudioSwitch=%s\n", Boolean.valueOf(ftey.ai()));
                printWriter2.printf("  enableTriangleAudioSwitchForCalling=%s\n", Boolean.valueOf(ftey.aj()));
                printWriter2.printf("  enableWearablePeripheralApi=%s\n", Boolean.valueOf(ftey.ar()));
                printWriter2.printf("  enableTaskSchedulerService=%s\n", Boolean.valueOf(ftey.ag()));
                printWriter2.printf("  enableTriangleAnalytics=%s\n", Boolean.valueOf(ftey.ah()));
                printWriter2.printf("  enableWearMessageMonitor=%s\n", Boolean.valueOf(ftey.ap()));
                printWriter2.printf("  checkPeripheralSupportSwitch=%s\n", Boolean.valueOf(ftey.t()));
                printWriter2.printf("  supportToggleForTriangleSwitch=%s\n", Boolean.valueOf(ftey.aX()));
                printWriter2.printf("  enableSassForTriangleCallingCase=%s\n", Boolean.valueOf(ftey.aa()));
                printWriter2.printf("  serviceDestroyTimeoutMs=%s\n", Long.valueOf(ftes.aw()));
                printWriter2.printf("  protostoreOperationTimeoutMs=%s\n", Long.valueOf(ftes.Z()));
                printWriter2.printf("  discoveryBindingOperationTimeoutMs=%s\n", Long.valueOf(ftes.v()));
                printWriter2.printf("  wearApiOperationTimeoutMillis=%s\n", Long.valueOf(ftes.aG()));
                printWriter2.printf("  refreshTriangleNodeMins=%s\n", Long.valueOf(ftes.aa()));
                printWriter2.printf("  AddSassDeviceIntoTriangleCandidate=%s\n", Boolean.valueOf(ftey.h()));
                Object[] objArr = {Boolean.valueOf(ftey.R())};
                WearableDataListenerChimeraService wearableDataListenerChimeraService = WearableDataListenerChimeraService.this;
                printWriter2.printf("  enableIdentityAddressMappingForTriangleCandidate=%s\n", objArr);
                printWriter2.println();
                printWriter2.printf("isTriangleState=%s\n", Boolean.valueOf(wearableDataListenerChimeraService.i));
                clcl h = wearableDataListenerChimeraService.h();
                printWriter2.println("selfNode:");
                if (h != null) {
                    printWriter2.printf("  %s\n", clak.j(h));
                }
                printWriter2.println("nearbyNodes:");
                Iterator it = wearableDataListenerChimeraService.a.values().iterator();
                while (it.hasNext()) {
                    printWriter2.printf("  %s\n", clak.j((clcl) it.next()));
                }
                printWriter2.println();
                wearableDataListenerChimeraService.m().l(printWriter2);
                if (ftey.ap()) {
                    printWriter2.println();
                    clbb e = wearableDataListenerChimeraService.e(wearableDataListenerChimeraService);
                    String format = String.format(Locale.US, "wearMessageMonitorDurationHours=%s", Long.valueOf(ftes.aI()));
                    String format2 = String.format(Locale.US, ", wearMessageMonitorSlots=%s", Long.valueOf(ftes.aJ()));
                    String format3 = String.format(Locale.US, ", wearMessageMonitorTotalCount=%s", Long.valueOf(ftes.aK()));
                    String format4 = String.format(Locale.US, ", currentHour=%s UTC", Long.valueOf(e.c));
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(e.c().cardinality());
                    Integer valueOf2 = Integer.valueOf(e.a);
                    printWriter2.println("TriangleMessageMonitor{" + format + format2 + format3 + format4 + String.format(locale, ", MessageTimeSlots=%s/%s", valueOf, valueOf2) + String.format(Locale.US, ", SentCount=%s", Integer.valueOf(e.d)) + String.format(Locale.US, ", SentTimeSlots=%s/%s", Integer.valueOf(e.e.cardinality()), valueOf2) + String.format(Locale.US, ", ReceivedCount=%s", Integer.valueOf(e.f)) + String.format(Locale.US, ", ReceivedTimeSlots=%s/%s", Integer.valueOf(e.g.cardinality()), valueOf2) + String.format(Locale.US, ", EventTriggerCount=%s", Integer.valueOf(e.h)) + String.format(Locale.US, ", EventTriggerTimeSlots=%s/%s", Integer.valueOf(e.i.cardinality()), valueOf2) + "}");
                }
            }
        }, "WearableDataListenerChimeraService", ftes.ax());
    }

    public final synchronized clbb e(Context context) {
        if (this.u == null) {
            this.u = new clbb(context);
        }
        return this.u;
    }

    public final synchronized clbo f(Context context) {
        if (this.t == null) {
            this.t = new clbo(context);
        }
        return this.t;
    }

    public final clbr g() {
        WearableDataListenerChimeraService wearableDataListenerChimeraService;
        if (this.B == null) {
            wearableDataListenerChimeraService = this;
            wearableDataListenerChimeraService.B = new clbr(wearableDataListenerChimeraService, this.l, j(), B(this), new itk() { // from class: ckyp
                @Override // defpackage.itk
                public final void a(Object obj) {
                    long longValue = ((Long) obj).longValue();
                    WearableDataListenerChimeraService wearableDataListenerChimeraService2 = WearableDataListenerChimeraService.this;
                    TaskSchedulerChimeraService.j(wearableDataListenerChimeraService2, new ckji(wearableDataListenerChimeraService2, 1, longValue, null), false);
                }
            });
        } else {
            wearableDataListenerChimeraService = this;
        }
        return wearableDataListenerChimeraService.B;
    }

    public final clcl h() {
        if (this.c == null) {
            try {
                this.c = (clcl) ((eqcy) C(this).g()).v(ftes.Z(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((eluo) ((eluo) ckpb.a.g().s(e)).ai((char) 7391)).x("WDLS getLocalTriangleNode: can't get local triangle node from db");
            }
        }
        return this.c;
    }

    public final clcl i(String str) {
        clcl clclVar = (clcl) this.a.get(str);
        if (clclVar != null) {
            return clclVar;
        }
        try {
            return (clcl) ((eqcy) C(this).h(str)).v(ftes.Z(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ckpb.a.g().s(e)).ai((char) 7392)).B("WDLS getTriangleNode: can't get triangle node %s from db", str);
            return clcl.b;
        }
    }

    public final clcu j() {
        if (this.w == null) {
            synchronized (this) {
                if (this.w == null) {
                    this.w = new clcu(this);
                }
            }
        }
        return this.w;
    }

    @Override // defpackage.dmmv, defpackage.dlwc
    public final dhlw k(final String str, String str2, final byte[] bArr) {
        char c;
        if (!ftey.as()) {
            ((eluo) ckpb.a.g().ai(7448)).B("WDLS onRequest: service is disable, path %s", str2);
            return dhmr.d(new byte[0]);
        }
        chkb chkbVar = ckpb.a;
        ((eluo) chkbVar.d().ai(7446)).P("WDLS onRequest: nodeId %s, path %s", str, str2);
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
            ((eluo) chkbVar.g().ai(7447)).B("WDLS onRequest: unsupported path %s", str2);
            return dhmr.d(new byte[0]);
        }
        final dhma dhmaVar = new dhma();
        this.b.execute(new Runnable() { // from class: ckyr
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
            
                if (r4.y() != false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
            
                r4.n().c(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
            
                if (r4.y() != false) goto L44;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 313
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ckyr.run():void");
            }
        });
        return dhmaVar.a;
    }

    public final ezre l() {
        return (ezre) n().b(this, ckyj.a(this, "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_TRIANGLE_SWITCH", "com.google.android.gms.nearby.discovery.service.DiscoveryService", null), ftes.v());
    }

    public final eztp m() {
        if (this.d == null) {
            this.d = new eztp(this, chen.e(this, "WearableDataListenerChimeraService"), elgo.m(2, 1), ftes.a.lK().fI());
        }
        return this.d;
    }

    public final eztv n() {
        if (this.x == null) {
            this.x = new eztv(new ekut() { // from class: ckza
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDeviceStatusService");
                    return queryLocalInterface instanceof ezre ? (ezre) queryLocalInterface : new ezrc(iBinder);
                }
            });
        }
        return this.x;
    }

    public final String o() {
        clcl h = h();
        return (h == null || (h.c & 2) == 0) ? cklf.a(this) : h.e;
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.l = ckln.a(this);
        this.v.execute(new Runnable() { // from class: ckyz
            @Override // java.lang.Runnable
            public final void run() {
                WearableDataListenerChimeraService.this.r();
            }
        });
        ((eluo) ckpb.a.d().ai(7435)).x("WDLS created");
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onDestroy() {
        Runnable runnable = new Runnable() { // from class: ckyy
            /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
            
                if (defpackage.ckmd.b(r2) == false) goto L9;
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
                    boolean r1 = defpackage.ftey.ap()
                    if (r1 == 0) goto L6f
                    clbb r1 = r0.e(r0)
                    boolean r2 = defpackage.ftey.ap()
                    if (r2 != 0) goto L13
                    goto L5c
                L13:
                    bzlv r2 = r1.j
                    bzlt r2 = r2.c()
                    long r3 = r1.c
                    java.lang.String r5 = "MESSAGE_MONITOR_CURRENT_HOUR"
                    r2.g(r5, r3)
                    int r3 = r1.d
                    java.lang.String r4 = "MESSAGE_MONITOR_SENT_COUNT"
                    r2.f(r4, r3)
                    java.util.BitSet r3 = r1.e
                    long r3 = defpackage.clbb.b(r3)
                    java.lang.String r5 = "MESSAGE_MONITOR_SENT_BITS"
                    r2.g(r5, r3)
                    int r3 = r1.f
                    java.lang.String r4 = "MESSAGE_MONITOR_RECEIVED_COUNT"
                    r2.f(r4, r3)
                    java.util.BitSet r3 = r1.g
                    long r3 = defpackage.clbb.b(r3)
                    java.lang.String r5 = "MESSAGE_MONITOR_RECEIVED_BITS"
                    r2.g(r5, r3)
                    int r3 = r1.h
                    java.lang.String r4 = "MESSAGE_MONITOR_EVENT_TRIGGER_COUNT"
                    r2.f(r4, r3)
                    java.util.BitSet r1 = r1.i
                    long r3 = defpackage.clbb.b(r1)
                    java.lang.String r1 = "MESSAGE_MONITOR_EVENT_TRIGGER_BITS"
                    r2.g(r1, r3)
                    boolean r1 = defpackage.ckmd.b(r2)
                    if (r1 != 0) goto L6f
                L5c:
                    chkb r1 = defpackage.ckpb.a
                    eluo r1 = r1.g()
                    r2 = 7383(0x1cd7, float:1.0346E-41)
                    eltz r1 = r1.ai(r2)
                    eluo r1 = (defpackage.eluo) r1
                    java.lang.String r2 = "WDLS destroy: failed to store the triangle message states."
                    r1.x(r2)
                L6f:
                    eztp r1 = r0.d
                    if (r1 == 0) goto L76
                    r1.k()
                L76:
                    eztv r1 = r0.n()
                    r1.c(r0)
                    eqgo r0 = r0.b
                    com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.q(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ckyy.run():void");
            }
        };
        eqgo eqgoVar = this.v;
        eqgoVar.execute(runnable);
        q(eqgoVar);
        super.onDestroy();
        ((eluo) ckpb.a.d().ai(7436)).x("WDLS destroyed");
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (!ftey.as()) {
            return 2;
        }
        this.v.execute(new Runnable() { // from class: ckyu
            @Override // java.lang.Runnable
            public final void run() {
                WearableDataListenerChimeraService.this.v(intent);
            }
        });
        return 1;
    }

    final synchronized String p() {
        clcl h = h();
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
            for (clcl clclVar : (List) ((eqcy) C(this).e()).v(ftes.Z(), TimeUnit.MILLISECONDS)) {
                if (clclVar.i) {
                    this.a.put(clclVar.d, clclVar);
                }
            }
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((eluo) ckpb.a.d().ai(7414)).x("WDLS initialize: failed to read triangle data store");
        }
        P();
        this.h.b(this.c, this.a.values());
    }

    public final void s(Map map) {
        clcl clclVar = this.c;
        if (clclVar == null) {
            ((eluo) ckpb.a.g().ai(7416)).x("WDLS introduceConnectedNodes: local node is null.");
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            clcl clclVar2 = (clcl) entry.getValue();
            ((eluo) ckpb.a.d().ai(7415)).B("WDLS introduceConnectedNodes: send message %s", str);
            if (j().d(str, "/fastpair/introduction", clclVar.r())) {
                this.j++;
                if (!clclVar2.j) {
                    fgrc fgrcVar = (fgrc) clclVar2.iQ(5, null);
                    fgrcVar.X(clclVar2);
                    clci clciVar = (clci) fgrcVar;
                    if (!clciVar.b.L()) {
                        clciVar.U();
                    }
                    clcl clclVar3 = (clcl) clciVar.b;
                    clclVar3.c |= 32;
                    clclVar3.j = true;
                    clcl clclVar4 = (clcl) clciVar.Q();
                    hashMap.put(str, clclVar4);
                    x(false, clclVar4);
                }
            }
        }
        map.putAll(hashMap);
    }

    public final void t(ckms ckmsVar, clcl clclVar, String str) {
        if (!ckln.e(this.l)) {
            ((eluo) ckpb.a.f().ai(7426)).B("WDLS logTriangleStart: skip logging on %s", this.l.name());
            return;
        }
        if ((clclVar.c & 2) == 0) {
            ((eluo) ckpb.a.g().ai(7425)).B("WDLS logTriangleStart: skip logging because unknown wearable address %s", clclVar.e);
            return;
        }
        if (ckms.PHONE_WATCH_TETHERED.equals(ckmsVar)) {
            String o = o();
            if (o != null) {
                TaskSchedulerChimeraService.h(this, ckji.c(this, o, clclVar.e));
                return;
            } else {
                ((eluo) ckpb.a.g().ai(7424)).x("WDLS logTriangleStart: skip logging for phone and watch tether because unknown local device address");
                return;
            }
        }
        if (ckms.WATCH_HEADSET_AUTO_CONNECT.equals(ckmsVar)) {
            if (str != null) {
                TaskSchedulerChimeraService.h(this, ckji.a(this, clclVar.e, str));
            } else {
                ((eluo) ckpb.a.f().ai(7423)).x("WDLS logTriangleStart: skip logging for auto connect because headset address is unknown");
            }
        }
    }

    public final void u(clce clceVar) {
        if (!ckln.e(this.l)) {
            ((eluo) ckpb.a.f().ai(7433)).B("WDLS logTriangleSwitchResult: skip logging on %s", this.l.name());
            return;
        }
        if ((clceVar.b & 8) != 0) {
            ckms ckmsVar = ckms.UNKNOWN_REQUEST_TYPE;
            ckms b = ckms.b(clceVar.f);
            if (b == null) {
                b = ckmsVar;
            }
            if (!ckmsVar.equals(b)) {
                ckms b2 = ckms.b(clceVar.f);
                if (b2 != null) {
                    ckmsVar = b2;
                }
                if (ckms.CALLING_ON_PHONE.equals(ckmsVar)) {
                    ((eluo) ckpb.a.g().ai(7432)).x("WDLS logTriangleSwitchResult: skip logging because the calling request should never sent from the watch side.");
                    return;
                }
                String str = clceVar.c;
                clcl i = i(str);
                if (i.equals(clcl.b)) {
                    ((eluo) ckpb.a.g().ai(7431)).B("WDLS logTriangleSwitchResult: can't get triangle node %s", str);
                    return;
                }
                clcl h = h();
                if (h == null) {
                    ((eluo) ckpb.a.g().ai(7430)).x("WDLS logTriangleSwitchResult: can't get local node id");
                    return;
                }
                int ordinal = ckmsVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    String o = o();
                    if (o == null) {
                        ((eluo) ckpb.a.g().ai(7429)).x("WDLS logTriangleSwitchResult: skip logging for phone and watch tether because unknown local device address");
                        return;
                    } else {
                        ckji.c(this, o, i.e).h(clceVar, i, h);
                        return;
                    }
                }
                if ((clceVar.b & 4) == 0) {
                    ((eluo) ckpb.a.g().ai(7428)).x("WDLS logTriangleSwitchResult: can't get peripheral address for logging auto connect.");
                    return;
                }
                String str2 = i.e;
                clbw clbwVar = clceVar.e;
                if (clbwVar == null) {
                    clbwVar = clbw.a;
                }
                ckji.a(this, str2, clbwVar.c).h(clceVar, i, h);
                return;
            }
        }
        ((eluo) ckpb.a.f().ai(7427)).x("WDLS logTriangleSwitchResult: skip logging because of unknown request type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0683, code lost:
    
        if (r0.length <= 0) goto L416;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0c4f A[LOOP:8: B:377:0x0c49->B:379:0x0c4f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b4e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 3298
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
        ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_TRIANGLE_MESSAGE_USAGE", bundle);
        this.j = 0;
        this.k = 0;
    }

    public final void x(final boolean z, final clcl clclVar) {
        try {
            ((eqcy) C(this).a.b(new ekut() { // from class: clbe
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    clcm clcmVar = (clcm) obj;
                    fgrc fgrcVar = (fgrc) clcmVar.iQ(5, null);
                    fgrcVar.X(clcmVar);
                    clcl clclVar2 = clclVar;
                    if (z) {
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        clcm clcmVar2 = (clcm) fgrcVar.b;
                        clcm clcmVar3 = clcm.a;
                        clclVar2.getClass();
                        clcmVar2.d = clclVar2;
                        clcmVar2.b |= 1;
                        return (clcm) fgrcVar.Q();
                    }
                    int i = 0;
                    while (true) {
                        if (i >= ((clcm) fgrcVar.b).c.size()) {
                            break;
                        }
                        if (clclVar2.d.equals(((clcl) ((clcm) fgrcVar.b).c.get(i)).d)) {
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            clcm clcmVar4 = (clcm) fgrcVar.b;
                            clcmVar4.b();
                            clcmVar4.c.remove(i);
                        } else {
                            i++;
                        }
                    }
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    clcm clcmVar5 = (clcm) fgrcVar.b;
                    clclVar2.getClass();
                    clcmVar5.b();
                    clcmVar5.c.add(clclVar2);
                    return (clcm) fgrcVar.Q();
                }
            }, eqex.a)).v(ftes.Z(), TimeUnit.MILLISECONDS);
            if (ftey.aX() && ckln.e(this.l)) {
                ezru.c(this, "links");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ckpb.a.g().ai(7491)).B("WDLS writeTriangleNode: can't write triangle node into db, %s", e.getMessage());
        }
    }

    public final boolean y() {
        if (ftes.a.lK().gg() && this.i) {
            return !cklq.WEARABLE.equals(this.l) || this.A;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean z(boolean r28) {
        /*
            Method dump skipped, instructions count: 2051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService.z(boolean):boolean");
    }
}
