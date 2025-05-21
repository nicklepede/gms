package com.google.android.gms.nearby.connection.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.a;
import defpackage.apud;
import defpackage.aqxo;
import defpackage.arwm;
import defpackage.aspo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cexi;
import defpackage.cexr;
import defpackage.cexs;
import defpackage.cfch;
import defpackage.cfdb;
import defpackage.cfdj;
import defpackage.cfhu;
import defpackage.cfhv;
import defpackage.cfiv;
import defpackage.cfju;
import defpackage.cfjx;
import defpackage.cfkt;
import defpackage.cfkz;
import defpackage.cflb;
import defpackage.cflc;
import defpackage.cflz;
import defpackage.cfqk;
import defpackage.cfzp;
import defpackage.cjdh;
import defpackage.dhqf;
import defpackage.ejck;
import defpackage.eydb;
import defpackage.fqkd;
import defpackage.fqkh;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearbyConnectionsChimeraService extends bxgd {
    cexs a;
    public final Map b;
    private cfiv c;
    private final cflb d;
    private cfkz m;
    private aqxo n;

    public NearbyConnectionsChimeraService() {
        super(54, "com.google.android.gms.nearby.connection.service.START", ejck.a, 3, 10);
        this.d = new cflb();
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        Long l;
        String str;
        String str2;
        String str3;
        String str4 = getServiceRequest.f;
        if (TextUtils.isEmpty(str4)) {
            bxgjVar.a(16, null);
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
            this.n = dhqf.a(this);
        }
        String str5 = getServiceRequest.p;
        cflb cflbVar = this.d;
        cfiv cfivVar = this.c;
        Long l2 = l;
        cexs cexsVar = this.a;
        cfhv cfhvVar = new cfhv(this, str4);
        aqxo aqxoVar = this.n;
        cfkz cfkzVar = this.m;
        int i = cfhu.e;
        final cfhu cfhuVar = new cfhu(this, cfivVar, cfhvVar, cfdj.f(), cfkzVar);
        cfhuVar.b = new IBinder.DeathRecipient() { // from class: cfhf
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                cfhu.this.j(true);
            }
        };
        String str6 = str;
        String str7 = str4;
        cfhuVar.d = new cfkt(this, str7, str6, l2, str5, cflbVar, cexsVar, cfhuVar.b, aqxoVar, cfkzVar);
        this.b.put(str7, cfhuVar);
        cexi cexiVar = cfju.a;
        cexiVar.b().i("Client %d requested setting downloads directory to %s.", Long.valueOf(cfhuVar.d.k()), str2);
        if (str2 != null) {
            cfkt cfktVar = cfhuVar.d;
            arwm.l(cfjx.a(cfktVar.e, cfktVar.f, cfktVar.g));
            str3 = cfdb.e(str2);
        } else {
            str3 = str2;
        }
        cfhuVar.d.be(str3);
        this.a.d.e("NearbyConnectionsConnectionStatus").a(0L, 1L, apud.b);
        bxgjVar.c(cfhuVar);
        cexi b = cexiVar.b();
        Long valueOf2 = Long.valueOf(l2 == null ? 0L : l2.longValue());
        if (str6 != null) {
            str7 = a.i(str6, str7, "0p:", ".");
        }
        b.k("Client %s with package name %s and sdk version %s has connected, downloads dir is set to %s.", valueOf2, str7, Integer.valueOf(getServiceRequest.e), str2);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cflc cflcVar;
        super.dump(fileDescriptor, printWriter, strArr);
        try {
            for (Map.Entry entry : this.b.entrySet()) {
                printWriter.write(String.format("%s\n", entry.getKey()));
                ((cfhu) entry.getValue()).dump(fileDescriptor, printWriter, strArr);
                printWriter.write("\n");
            }
            cfiv cfivVar = this.c;
            cflc cflcVar2 = cfivVar.b;
            if (cflcVar2 != null) {
                cflz cflzVar = ((cfqk) cflcVar2).g;
                printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.connection.service.offline.BandwidthUpgradeManager"));
                Locale locale = Locale.US;
                Set keySet = cflzVar.g.keySet();
                StringBuilder sb = new StringBuilder("[ ");
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    sb.append(String.format("%s ", ((eydb) it.next()).name()));
                }
                sb.append("]");
                printWriter.write(String.format(locale, "  Bandwidth Upgrade Mediums: %s\n", sb.toString()));
                Map map = cflzVar.d.e;
                for (String str : map.keySet()) {
                    printWriter.write(String.format(Locale.US, "[Endpoint ID : %s]%s\n", str, map.get(str)));
                }
                printWriter.flush();
                ((cfqk) cflcVar2).a.B(printWriter);
                ((cfqk) cflcVar2).h.i(printWriter);
            }
            if (fqkd.F() && (cflcVar = cfivVar.c) != null) {
                ((cfzp) cflcVar).a.B(printWriter);
            }
            if (fqkd.a.a().ad()) {
                cfch.a(new aspo(printWriter, "  "), fqkh.class);
            }
            printWriter.flush();
        } catch (RuntimeException e) {
            printWriter.write("  Dump was interrupted by a runtime error: ".concat(String.valueOf(e.getMessage())));
            printWriter.flush();
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (this.a == null) {
            this.a = new cexs(getApplicationContext(), 2, new cexr() { // from class: cfhw
                @Override // defpackage.cexr
                public final void a(fecj fecjVar, Object obj) {
                    exvh exvhVar = (exvh) obj;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    exwc exwcVar = (exwc) fecjVar.b;
                    exwc exwcVar2 = exwc.a;
                    exvhVar.getClass();
                    exwcVar.g = exvhVar;
                    exwcVar.b |= 16;
                }
            });
        }
        this.c = new cfiv(this);
        cjdh.d(getApplicationContext().getCacheDir());
        getApplicationContext();
        this.m = new cfkz();
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.d.a.b();
        final cfiv cfivVar = this.c;
        cfju.a.b().h("Initiating shutdown of ServiceControllerRouter %s.", cfivVar);
        cfivVar.d(new Runnable() { // from class: cfic
            @Override // java.lang.Runnable
            public final void run() {
                cflc cflcVar;
                cfiv cfivVar2 = cfiv.this;
                cflc cflcVar2 = cfivVar2.b;
                if (cflcVar2 != null) {
                    cfqk cfqkVar = (cfqk) cflcVar2;
                    cfln cflnVar = cfqkVar.c;
                    exjo exjoVar = exjo.AUTO_RESUME;
                    cfoa cfoaVar = cfqkVar.e;
                    cfoaVar.j(exjoVar, cflnVar);
                    cexi cexiVar = cfju.a;
                    cexiVar.b().p("Initiating shutdown of OfflineServiceController.", new Object[0]);
                    cfqkVar.h.p();
                    cexiVar.b().p("Initiating shutdown of BandwidthUpgradeManager.", new Object[0]);
                    exjo exjoVar2 = exjo.BANDWIDTH_UPGRADE_NEGOTIATION;
                    cflz cflzVar = cfqkVar.g;
                    cflzVar.b.j(exjoVar2, cflzVar);
                    Map map = cflzVar.k;
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((cfjl) it.next()).d();
                    }
                    map.clear();
                    cflzVar.o.clear();
                    cfdj.h(cflzVar.e, "BandwidthUpgradeManager.alarmExecutor");
                    cfdj.h(cflzVar.f, "BandwidthUpgradeManager.serialExecutor");
                    Map map2 = cflzVar.h;
                    Iterator it2 = map2.values().iterator();
                    while (it2.hasNext()) {
                        ((cfnj) it2.next()).E(6);
                    }
                    map2.clear();
                    cflzVar.i.clear();
                    ArrayList arrayList = new ArrayList(cflzVar.l.keySet());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        cflzVar.o((String) arrayList.get(i));
                    }
                    cflzVar.m.clear();
                    cflzVar.p.clear();
                    cflzVar.j.clear();
                    cfmi cfmiVar = cflzVar.d;
                    cfmiVar.c.clear();
                    cfmiVar.e.clear();
                    cfmiVar.d.clear();
                    Map map3 = cflzVar.g;
                    Iterator it3 = map3.values().iterator();
                    while (it3.hasNext()) {
                        ((cfmd) it3.next()).b();
                    }
                    map3.clear();
                    cflzVar.q = null;
                    cexi cexiVar2 = cfju.a;
                    cexiVar2.b().p("BandwidthUpgradeManager has shut down.", new Object[0]);
                    cflnVar.c.clear();
                    cflnVar.d.clear();
                    cflnVar.e.clear();
                    cfdj.h(cflnVar.b, "AutoResumeManager.autoResumeExecutor");
                    cfxi cfxiVar = cfqkVar.b;
                    cexiVar2.b().p("Initiating shutdown of ReconnectManager.", new Object[0]);
                    cfxiVar.h.clear();
                    cfxiVar.i.clear();
                    cfxiVar.k.clear();
                    cfxiVar.j.clear();
                    cfdj.h(cfxiVar.d, "ReconnectManager.reconnectManagerExecutor");
                    cfdj.h(cfxiVar.e, "ReconnectManager.alarmExecutor");
                    cfdj.h(cfxiVar.g, "ReconnectManager.encryptionCallbackExecutor");
                    cfdj.h(cfxiVar.f, "ReconnectManager.incomingConnectionCallbackExecutor");
                    cfxiVar.c.b();
                    cexiVar2.b().p("ReconnectManager has shut down.", new Object[0]);
                    cfrr cfrrVar = cfqkVar.f;
                    cexiVar2.b().p("Initiating shutdown of PayloadManager.", new Object[0]);
                    if (fqkd.K()) {
                        cfjo.i(cfrrVar.a);
                    }
                    cfrrVar.b.j(exjo.PAYLOAD_TRANSFER, cfrrVar);
                    cfdj.h(cfrrVar.d, "PayloadManager.readStatusExecutor");
                    cfdj.h(cfrrVar.e, "PayloadManager.payloadStatusUpdateExecutor");
                    cfdj.h(cfrrVar.g, "PayloadManager.lowPriorityExecutor");
                    ensv ensvVar = cfrrVar.f;
                    if (ensvVar != null) {
                        cfdj.h(ensvVar, "PayloadManager.processingOfflineFrameExecutor");
                    }
                    cfrm cfrmVar = cfrrVar.h;
                    for (cfrl cfrlVar : cfrmVar.b()) {
                        cfrmVar.d(cfrlVar.b());
                        cfrlVar.e();
                    }
                    cfrh cfrhVar = cfrrVar.m;
                    if (cfrhVar.a().size() > 0) {
                        cfrhVar.a().clear();
                        cfrhVar.a = 0;
                    }
                    cfrg cfrgVar = cfrrVar.n;
                    if (cfrgVar.a().size() > 0) {
                        cfrgVar.a().clear();
                        cfrgVar.a = 0;
                    }
                    cexiVar2.d().p("PayloadManager has shut down.", new Object[0]);
                    cexiVar2.b().p("Initiating shutdown of EndpointManager.", new Object[0]);
                    cfdj.h(cfoaVar.d, "EndpointManager.serialExecutor");
                    cfdj.h(cfoaVar.f, "EndpointManager.endpointReadersThreadPool");
                    cfdj.h(cfoaVar.g, "EndpointManager.endpointKeepAliveManagerThreadPool");
                    cfoaVar.e.clear();
                    cexiVar2.b().p("EndpointManager has shut down.", new Object[0]);
                    cfqkVar.d.l();
                    cfqkVar.a.G();
                    cexiVar2.b().p("OfflineServiceController has shut down.", new Object[0]);
                }
                if (fqkd.F() && (cflcVar = cfivVar2.c) != null) {
                    cexi cexiVar3 = cfju.a;
                    cexiVar3.b().p("Initiating shutdown of DctOfflineServiceController.", new Object[0]);
                    cfzp cfzpVar = (cfzp) cflcVar;
                    cgav cgavVar = cfzpVar.f;
                    cfdj.h(cgavVar.a, "DctThreadManager.dctPcpMainExecutor");
                    cfdj.h(cgavVar.b, "DctThreadManager.dctPcpCallbackExecutor");
                    cfdj.h(cgavVar.c, "DctThreadManager.dctEndpointManagerExecutor");
                    cfdj.h(cgavVar.d, "DctThreadManager.dctBandwidthUpgradeManagerExecutor");
                    cfdj.h(cgavVar.e, "DctThreadManager.dctBandwidthUpgradeCallbackExecutor");
                    cexiVar3.b().p("Initiating shutdown of DctPcpManager.", new Object[0]);
                    boolean u = fqkd.u();
                    cgam cgamVar = cfzpVar.e;
                    if (u) {
                        cfzn cfznVar = cgamVar.b;
                        cfzm cfzmVar = cgamVar.j;
                        cfznVar.f(exgd.DEVICE_CAPABILITY_REQUEST, cfzmVar);
                        cfzm cfzmVar2 = cgamVar.k;
                        cfznVar.f(exgd.DEVICE_CAPABILITY_RESPONSE, cfzmVar2);
                        cfzm cfzmVar3 = cgamVar.l;
                        cfznVar.f(exgd.DEVICE_INFO_REQUEST, cfzmVar3);
                        cfzm cfzmVar4 = cgamVar.m;
                        cfznVar.f(exgd.DEVICE_INFO_RESPONSE, cfzmVar4);
                        cfzm cfzmVar5 = cgamVar.n;
                        cfznVar.f(exgd.MEDIUM_NEGOTIATION_REQUEST, cfzmVar5);
                        cfzm cfzmVar6 = cgamVar.o;
                        cfznVar.f(exgd.MEDIUM_NEGOTIATION_RESPONSE, cfzmVar6);
                        cfzmVar.c();
                        cfzmVar2.c();
                        cfzmVar3.c();
                        cfzmVar4.c();
                        cfzmVar5.c();
                        cfzmVar6.c();
                        if (fqkd.v()) {
                            cfzm cfzmVar7 = cgamVar.p;
                            cfznVar.f(exgd.DEVICE_INTEGRITY_START_REQUEST, cfzmVar7);
                            cfzm cfzmVar8 = cgamVar.q;
                            cfznVar.f(exgd.DEVICE_INTEGRITY_START_RESPONSE, cfzmVar8);
                            cfzm cfzmVar9 = cgamVar.r;
                            cfznVar.f(exgd.DEVICE_INTEGRITY_ATTESTATION, cfzmVar9);
                            cfzm cfzmVar10 = cgamVar.s;
                            cfznVar.f(exgd.DEVICE_INTEGRITY_ATTESTATION_ACK, cfzmVar10);
                            cfzmVar7.c();
                            cfzmVar8.c();
                            cfzmVar9.c();
                            cfzmVar10.c();
                        }
                    }
                    Map map4 = cgamVar.e;
                    Iterator it4 = map4.values().iterator();
                    while (it4.hasNext()) {
                        ((cgar) it4.next()).a.clear();
                    }
                    map4.clear();
                    cgamVar.f.clear();
                    Map map5 = cgamVar.g;
                    Iterator it5 = map5.values().iterator();
                    while (it5.hasNext()) {
                        ((cgas) it5.next()).c.c(1, true);
                    }
                    map5.clear();
                    final cfyx cfyxVar = cfzpVar.d;
                    final cfzn cfznVar2 = cfyxVar.c;
                    cfznVar2.b.c(new Runnable() { // from class: cfzb
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set = cfzn.this.e;
                            cfyx cfyxVar2 = cfyxVar;
                            if (set.contains(cfyxVar2)) {
                                set.remove(cfyxVar2);
                            } else {
                                cfju.a.b().i("%s received request to unregister EndpointTeardownProcessor %s, but it is not registered.", "[DctEndpointManager]", cfyxVar2);
                            }
                        }
                    });
                    cfyxVar.d.clear();
                    cfzn cfznVar3 = cfzpVar.b;
                    cexi cexiVar4 = cfju.a;
                    cexiVar4.b().p("Initiating shutdown of DctEndpointManager.", new Object[0]);
                    cfznVar3.f(exgd.DISCONNECTION_REQUEST, cfznVar3.f);
                    cfznVar3.f(exgd.DISCONNECTION_RESPONSE, cfznVar3.g);
                    Map map6 = cfznVar3.c;
                    Iterator it6 = map6.values().iterator();
                    while (it6.hasNext()) {
                        ((cfyy) it6.next()).c(1, true);
                    }
                    map6.clear();
                    cfznVar3.d.clear();
                    cfzpVar.a.G();
                    cexiVar4.b().p("DctOfflineServiceController has shut down.", new Object[0]);
                }
                cfju.a.b().h("Completed shutdown of ServiceControllerRouter %s.", cfivVar2);
            }
        });
        cfdj.h(cfivVar.a, "ServiceControllerRouter.offBinderSerializer");
        this.m.d.clear();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
