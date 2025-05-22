package com.google.android.gms.nearby.connection.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.a;
import defpackage.arwu;
import defpackage.atad;
import defpackage.atzb;
import defpackage.auti;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.chet;
import defpackage.chfc;
import defpackage.chfd;
import defpackage.chjt;
import defpackage.chkn;
import defpackage.chkv;
import defpackage.chpg;
import defpackage.chph;
import defpackage.chqh;
import defpackage.chrg;
import defpackage.chrj;
import defpackage.chsf;
import defpackage.chsl;
import defpackage.chsn;
import defpackage.chso;
import defpackage.chtj;
import defpackage.chxu;
import defpackage.cihb;
import defpackage.cllm;
import defpackage.dkbl;
import defpackage.elpp;
import defpackage.farn;
import defpackage.ftdv;
import defpackage.ftdz;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NearbyConnectionsChimeraService extends bzot {
    chfd a;
    public final Map b;
    private chqh c;
    private final chsn d;
    private chsl m;
    private atad n;

    public NearbyConnectionsChimeraService() {
        super(54, "com.google.android.gms.nearby.connection.service.START", elpp.a, 3, 10);
        this.d = new chsn();
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4 = getServiceRequest.f;
        if (TextUtils.isEmpty(str4)) {
            bzozVar.a(16, null);
            return;
        }
        Bundle bundle = getServiceRequest.i;
        if (bundle != null) {
            Long valueOf = Long.valueOf(bundle.getLong("clientId", -1L));
            String string = bundle.getString("zeroPartyIdentifier", "");
            if (true == TextUtils.isEmpty(string)) {
                string = null;
            }
            String string2 = bundle.getString("downloadsDirectory", "");
            str2 = TextUtils.isEmpty(string2) ? null : string2;
            l = valueOf;
            str = string;
        } else {
            l = null;
            str = null;
            str2 = null;
        }
        if (this.n == null) {
            this.n = dkbl.a(this);
        }
        String str5 = getServiceRequest.p;
        chsn chsnVar = this.d;
        chqh chqhVar = this.c;
        Long l2 = l;
        chfd chfdVar = this.a;
        chph chphVar = new chph(this, str4);
        atad atadVar = this.n;
        chsl chslVar = this.m;
        int i = chpg.e;
        final chpg chpgVar = new chpg(this, chqhVar, chphVar, chkv.f(), chslVar);
        chpgVar.b = new IBinder.DeathRecipient() { // from class: chor
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                chpg.this.j(true);
            }
        };
        String str6 = str;
        String str7 = str4;
        chpgVar.d = new chsf(this, str7, str6, l2, str5, chsnVar, chfdVar, chpgVar.b, atadVar, chslVar);
        this.b.put(str7, chpgVar);
        chet chetVar = chrg.a;
        chetVar.b().i("Client %d requested setting downloads directory to %s.", Long.valueOf(chpgVar.d.k()), str2);
        if (str2 != null) {
            chsf chsfVar = chpgVar.d;
            atzb.l(chrj.a(chsfVar.e, chsfVar.f, chsfVar.g));
            str3 = chkn.e(str2);
        } else {
            str3 = str2;
        }
        chpgVar.d.bf(str3);
        this.a.d.e("NearbyConnectionsConnectionStatus").a(0L, 1L, arwu.b);
        bzozVar.c(chpgVar);
        chet b = chetVar.b();
        Long valueOf2 = Long.valueOf(l2 == null ? 0L : l2.longValue());
        if (str6 != null) {
            str7 = a.i(str6, str7, "0p:", ".");
        }
        b.k("Client %s with package name %s and sdk version %s has connected, downloads dir is set to %s.", valueOf2, str7, Integer.valueOf(getServiceRequest.e), str2);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        chso chsoVar;
        super.dump(fileDescriptor, printWriter, strArr);
        try {
            for (Map.Entry entry : this.b.entrySet()) {
                printWriter.write(String.format("%s\n", entry.getKey()));
                ((chpg) entry.getValue()).dump(fileDescriptor, printWriter, strArr);
                printWriter.write("\n");
            }
            chqh chqhVar = this.c;
            chso chsoVar2 = chqhVar.b;
            if (chsoVar2 != null) {
                chtj chtjVar = ((chxu) chsoVar2).g;
                printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.connection.service.offline.BandwidthUpgradeManager"));
                Locale locale = Locale.US;
                Set keySet = chtjVar.g.keySet();
                StringBuilder sb = new StringBuilder("[ ");
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    sb.append(String.format("%s ", ((farn) it.next()).name()));
                }
                sb.append("]");
                printWriter.write(String.format(locale, "  Bandwidth Upgrade Mediums: %s\n", sb.toString()));
                Map map = chtjVar.d.e;
                for (String str : map.keySet()) {
                    printWriter.write(String.format(Locale.US, "[Endpoint ID : %s]%s\n", str, map.get(str)));
                }
                printWriter.flush();
                ((chxu) chsoVar2).a.C(printWriter);
                ((chxu) chsoVar2).h.i(printWriter);
            }
            if (ftdv.J() && (chsoVar = chqhVar.c) != null) {
                ((cihb) chsoVar).a.C(printWriter);
            }
            if (ftdv.a.lK().aj()) {
                chjt.a(new auti(printWriter, "  "), ftdz.class);
            }
            printWriter.flush();
        } catch (RuntimeException e) {
            printWriter.write("  Dump was interrupted by a runtime error: ".concat(String.valueOf(e.getMessage())));
            printWriter.flush();
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (this.a == null) {
            this.a = new chfd(getApplicationContext(), 2, new chfc() { // from class: chpi
                @Override // defpackage.chfc
                public final void a(fgrc fgrcVar, Object obj) {
                    fajt fajtVar = (fajt) obj;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    fako fakoVar = (fako) fgrcVar.b;
                    fako fakoVar2 = fako.a;
                    fajtVar.getClass();
                    fakoVar.g = fajtVar;
                    fakoVar.b |= 16;
                }
            });
        }
        this.c = new chqh(this);
        cllm.d(getApplicationContext().getCacheDir());
        getApplicationContext();
        this.m = new chsl();
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.d.a.b();
        final chqh chqhVar = this.c;
        chrg.a.b().h("Initiating shutdown of ServiceControllerRouter %s.", chqhVar);
        chqhVar.d(new Runnable() { // from class: chpo
            @Override // java.lang.Runnable
            public final void run() {
                chso chsoVar;
                chqh chqhVar2 = chqh.this;
                chso chsoVar2 = chqhVar2.b;
                if (chsoVar2 != null) {
                    chxu chxuVar = (chxu) chsoVar2;
                    chsx chsxVar = chxuVar.c;
                    ezxz ezxzVar = ezxz.AUTO_RESUME;
                    chvk chvkVar = chxuVar.e;
                    chvkVar.j(ezxzVar, chsxVar);
                    chet chetVar = chrg.a;
                    chetVar.b().p("Initiating shutdown of OfflineServiceController.", new Object[0]);
                    chxuVar.h.p();
                    chetVar.b().p("Initiating shutdown of BandwidthUpgradeManager.", new Object[0]);
                    ezxz ezxzVar2 = ezxz.BANDWIDTH_UPGRADE_NEGOTIATION;
                    chtj chtjVar = chxuVar.g;
                    chtjVar.b.j(ezxzVar2, chtjVar);
                    Map map = chtjVar.k;
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((chqx) it.next()).d();
                    }
                    map.clear();
                    chtjVar.o.clear();
                    chkv.h(chtjVar.e, "BandwidthUpgradeManager.alarmExecutor");
                    chkv.h(chtjVar.f, "BandwidthUpgradeManager.serialExecutor");
                    Map map2 = chtjVar.h;
                    Iterator it2 = map2.values().iterator();
                    while (it2.hasNext()) {
                        ((chut) it2.next()).E(6);
                    }
                    map2.clear();
                    chtjVar.i.clear();
                    ArrayList arrayList = new ArrayList(chtjVar.l.keySet());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        chtjVar.o((String) arrayList.get(i));
                    }
                    chtjVar.m.clear();
                    chtjVar.p.clear();
                    chtjVar.j.clear();
                    chts chtsVar = chtjVar.d;
                    chtsVar.c.clear();
                    chtsVar.e.clear();
                    chtsVar.d.clear();
                    Map map3 = chtjVar.g;
                    Iterator it3 = map3.values().iterator();
                    while (it3.hasNext()) {
                        ((chtn) it3.next()).b();
                    }
                    map3.clear();
                    chtjVar.q = null;
                    chetVar.b().p("BandwidthUpgradeManager has shut down.", new Object[0]);
                    chsxVar.c.clear();
                    chsxVar.d.clear();
                    chsxVar.e.clear();
                    chkv.h(chsxVar.b, "AutoResumeManager.autoResumeExecutor");
                    cies ciesVar = chxuVar.b;
                    chetVar.b().p("Initiating shutdown of ReconnectManager.", new Object[0]);
                    ciesVar.h.clear();
                    ciesVar.i.clear();
                    ciesVar.k.clear();
                    ciesVar.j.clear();
                    chkv.h(ciesVar.d, "ReconnectManager.reconnectManagerExecutor");
                    chkv.h(ciesVar.e, "ReconnectManager.alarmExecutor");
                    chkv.h(ciesVar.g, "ReconnectManager.encryptionCallbackExecutor");
                    chkv.h(ciesVar.f, "ReconnectManager.incomingConnectionCallbackExecutor");
                    ciesVar.c.b();
                    chetVar.b().p("ReconnectManager has shut down.", new Object[0]);
                    chzb chzbVar = chxuVar.f;
                    chetVar.b().p("Initiating shutdown of PayloadManager.", new Object[0]);
                    if (ftdv.O()) {
                        chra.i(chzbVar.a);
                    }
                    chzbVar.b.j(ezxz.PAYLOAD_TRANSFER, chzbVar);
                    chkv.h(chzbVar.d, "PayloadManager.readStatusExecutor");
                    chkv.h(chzbVar.e, "PayloadManager.payloadStatusUpdateExecutor");
                    chkv.h(chzbVar.g, "PayloadManager.lowPriorityExecutor");
                    eqgo eqgoVar = chzbVar.f;
                    if (eqgoVar != null) {
                        chkv.h(eqgoVar, "PayloadManager.processingOfflineFrameExecutor");
                    }
                    chyw chywVar = chzbVar.h;
                    for (chyv chyvVar : chywVar.b()) {
                        chywVar.d(chyvVar.b());
                        chyvVar.e();
                    }
                    chyr chyrVar = chzbVar.m;
                    if (chyrVar.a().size() > 0) {
                        chyrVar.a().clear();
                        chyrVar.a = 0;
                    }
                    chyq chyqVar = chzbVar.n;
                    if (chyqVar.a().size() > 0) {
                        chyqVar.a().clear();
                        chyqVar.a = 0;
                    }
                    chetVar.d().p("PayloadManager has shut down.", new Object[0]);
                    chetVar.b().p("Initiating shutdown of EndpointManager.", new Object[0]);
                    chkv.h(chvkVar.d, "EndpointManager.serialExecutor");
                    chkv.h(chvkVar.f, "EndpointManager.endpointReadersThreadPool");
                    chkv.h(chvkVar.g, "EndpointManager.endpointKeepAliveManagerThreadPool");
                    chvkVar.e.clear();
                    chetVar.b().p("EndpointManager has shut down.", new Object[0]);
                    chxuVar.d.l();
                    chxuVar.a.H();
                    chetVar.b().p("OfflineServiceController has shut down.", new Object[0]);
                }
                if (ftdv.J() && (chsoVar = chqhVar2.c) != null) {
                    chet chetVar2 = chrg.a;
                    chetVar2.b().p("Initiating shutdown of DctOfflineServiceController.", new Object[0]);
                    cihb cihbVar = (cihb) chsoVar;
                    ciil ciilVar = cihbVar.f;
                    chkv.h(ciilVar.a, "DctThreadManager.dctPcpMainExecutor");
                    chkv.h(ciilVar.b, "DctThreadManager.dctPcpCallbackExecutor");
                    chkv.h(ciilVar.c, "DctThreadManager.dctEndpointManagerExecutor");
                    chkv.h(ciilVar.d, "DctThreadManager.dctBandwidthUpgradeManagerExecutor");
                    chkv.h(ciilVar.e, "DctThreadManager.dctBandwidthUpgradeCallbackExecutor");
                    chkv.h(ciilVar.f, "DctThreadManager.dctPayloadStatusUpdateExecutor");
                    chetVar2.b().p("Initiating shutdown of DctPcpManager.", new Object[0]);
                    boolean x = ftdv.x();
                    ciic ciicVar = cihbVar.e;
                    if (x) {
                        cigz cigzVar = ciicVar.b;
                        cigy cigyVar = ciicVar.i;
                        cigzVar.g(ezum.DEVICE_CAPABILITY_REQUEST, cigyVar);
                        cigy cigyVar2 = ciicVar.j;
                        cigzVar.g(ezum.DEVICE_CAPABILITY_RESPONSE, cigyVar2);
                        cigy cigyVar3 = ciicVar.k;
                        cigzVar.g(ezum.DEVICE_INFO_REQUEST, cigyVar3);
                        cigy cigyVar4 = ciicVar.l;
                        cigzVar.g(ezum.DEVICE_INFO_RESPONSE, cigyVar4);
                        cigy cigyVar5 = ciicVar.m;
                        cigzVar.g(ezum.MEDIUM_NEGOTIATION_REQUEST, cigyVar5);
                        cigy cigyVar6 = ciicVar.n;
                        cigzVar.g(ezum.MEDIUM_NEGOTIATION_RESPONSE, cigyVar6);
                        ezum ezumVar = ezum.DISCONNECTION_REQUEST;
                        cigy cigyVar7 = cigzVar.f;
                        cigzVar.g(ezumVar, cigyVar7);
                        ezum ezumVar2 = ezum.DISCONNECTION_RESPONSE;
                        cigy cigyVar8 = cigzVar.g;
                        cigzVar.g(ezumVar2, cigyVar8);
                        cigy cigyVar9 = ciicVar.o;
                        cigzVar.g(ezum.MEDIUM_CLOSURE_REQUEST, cigyVar9);
                        cigy cigyVar10 = ciicVar.p;
                        cigzVar.g(ezum.MEDIUM_CLOSURE_RESPONSE, cigyVar10);
                        cigyVar.d();
                        cigyVar2.d();
                        cigyVar3.d();
                        cigyVar4.d();
                        cigyVar5.d();
                        cigyVar6.d();
                        cigyVar7.d();
                        cigyVar8.d();
                        cigyVar9.d();
                        cigyVar10.d();
                        if (ftdv.C()) {
                            cigy cigyVar11 = ciicVar.q;
                            cigzVar.g(ezum.WIFI_CREDENTIAL_REQUEST, cigyVar11);
                            cigy cigyVar12 = ciicVar.r;
                            cigzVar.g(ezum.WIFI_CREDENTIAL_RESPONSE, cigyVar12);
                            cigyVar11.d();
                            cigyVar12.d();
                        }
                        if (ftdv.y()) {
                            cigy cigyVar13 = ciicVar.s;
                            cigzVar.g(ezum.DEVICE_INTEGRITY_START_REQUEST, cigyVar13);
                            cigy cigyVar14 = ciicVar.t;
                            cigzVar.g(ezum.DEVICE_INTEGRITY_START_RESPONSE, cigyVar14);
                            cigy cigyVar15 = ciicVar.u;
                            cigzVar.g(ezum.DEVICE_INTEGRITY_ATTESTATION, cigyVar15);
                            cigy cigyVar16 = ciicVar.v;
                            cigzVar.g(ezum.DEVICE_INTEGRITY_ATTESTATION_ACK, cigyVar16);
                            cigyVar13.d();
                            cigyVar14.d();
                            cigyVar15.d();
                            cigyVar16.d();
                        }
                    }
                    Map map4 = ciicVar.e;
                    Iterator it4 = map4.values().iterator();
                    while (it4.hasNext()) {
                        ((ciih) it4.next()).a.clear();
                    }
                    map4.clear();
                    ciicVar.f.clear();
                    Map map5 = ciicVar.g;
                    Iterator it5 = map5.values().iterator();
                    while (it5.hasNext()) {
                        ((ciii) it5.next()).c.d(1, true);
                    }
                    map5.clear();
                    final cigg ciggVar = cihbVar.d;
                    final cigz cigzVar2 = ciggVar.c;
                    cigzVar2.b.d(new Runnable() { // from class: cigk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set = cigz.this.e;
                            cigg ciggVar2 = ciggVar;
                            if (set.contains(ciggVar2)) {
                                set.remove(ciggVar2);
                            } else {
                                chrg.a.b().i("%s received request to unregister EndpointTeardownProcessor %s, but it is not registered.", "[DctEndpointManager]", ciggVar2);
                            }
                        }
                    });
                    ciggVar.d.clear();
                    cigz cigzVar3 = cihbVar.b;
                    chetVar2.b().p("Initiating shutdown of DctEndpointManager.", new Object[0]);
                    cigzVar3.g(ezum.DISCONNECTION_REQUEST, cigzVar3.f);
                    cigzVar3.g(ezum.DISCONNECTION_RESPONSE, cigzVar3.g);
                    Map map6 = cigzVar3.c;
                    Iterator it6 = map6.values().iterator();
                    while (it6.hasNext()) {
                        ((cigh) it6.next()).d(1, true);
                    }
                    map6.clear();
                    cigzVar3.d.clear();
                    cihbVar.a.H();
                    chetVar2.b().p("DctOfflineServiceController has shut down.", new Object[0]);
                }
                chrg.a.b().h("Completed shutdown of ServiceControllerRouter %s.", chqhVar2);
            }
        });
        chkv.h(chqhVar.a, "ServiceControllerRouter.offBinderSerializer");
        this.m.d.clear();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
