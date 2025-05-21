package com.google.android.gms.semanticlocation.collectors;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.semanticlocation.collectors.WifiScanReceiver$1;
import defpackage.czht;
import defpackage.enre;
import defpackage.ensv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class WifiScanReceiver$1 extends TracingBroadcastReceiver {
    final /* synthetic */ ensv a;
    public final /* synthetic */ czht b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiScanReceiver$1(czht czhtVar, Context context, ensv ensvVar) {
        super(context);
        this.a = ensvVar;
        this.b = czhtVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.submit(new Runnable() { // from class: czhr
            @Override // java.lang.Runnable
            public final void run() {
                List<ScanResult> scanResults;
                final czvg czvgVar;
                if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                    Context a = AppContextProvider.a();
                    if (asqh.g()) {
                        a = ModuleManager.requireSubmoduleContext(a, "current_semantic_location");
                    }
                    WifiManager wifiManager = (WifiManager) a.getSystemService("wifi");
                    if (wifiManager == null || (scanResults = wifiManager.getScanResults()) == null || scanResults.isEmpty()) {
                        return;
                    }
                    WifiScanReceiver$1 wifiScanReceiver$1 = WifiScanReceiver$1.this;
                    scanResults.size();
                    czht czhtVar = wifiScanReceiver$1.b;
                    czhtVar.a.e("SemanticLocationPassiveWifiScan");
                    long j = 0;
                    if (czhtVar.b != 0 && SystemClock.elapsedRealtime() - czhtVar.b <= 15000) {
                        return;
                    }
                    czhtVar.b = SystemClock.elapsedRealtime();
                    if (scanResults.isEmpty()) {
                        czvgVar = czvg.a;
                    } else {
                        evyr a2 = evyr.c((int) frxn.i()).a();
                        for (ScanResult scanResult : scanResults) {
                            if (a2.size() >= frxn.i()) {
                                break;
                            }
                            if (scanResult != null && scanResult.BSSID != null && (scanResult.SSID == null || !dvys.a(scanResult.SSID))) {
                                long c = exbi.c(scanResult.BSSID);
                                if (a2.q(c)) {
                                    Integer num = (Integer) a2.l(c);
                                    eiig.x(num);
                                    if (num.intValue() < scanResult.level) {
                                    }
                                }
                                a2.n(c, Integer.valueOf(scanResult.level));
                            }
                        }
                        czve czveVar = (czve) czvg.a.v();
                        evym it = a2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry next = it.next();
                            czveVar.a(((Long) next.getKey()).longValue());
                            czveVar.k((byte) ((Integer) next.getValue()).intValue());
                        }
                        long currentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + TimeUnit.MICROSECONDS.toMillis(scanResults.get(0).timestamp);
                        if (!czveVar.b.L()) {
                            czveVar.U();
                        }
                        czvg czvgVar2 = (czvg) czveVar.b;
                        czvgVar2.b |= 1;
                        czvgVar2.c = currentTimeMillis;
                        czvgVar = (czvg) czveVar.Q();
                    }
                    if (frwq.c() || frwq.e()) {
                        fecj fecjVar = (fecj) czvgVar.iB(5, null);
                        fecjVar.X(czvgVar);
                        czve czveVar2 = (czve) fecjVar;
                        if (!czveVar2.b.L()) {
                            czveVar2.U();
                        }
                        czvg czvgVar3 = (czvg) czveVar2.b;
                        czvgVar3.g = 2;
                        czvgVar3.b = 2 | czvgVar3.b;
                        czvgVar = (czvg) czveVar2.Q();
                    }
                    daak daakVar = czhtVar.d;
                    Deque deque = daakVar.b;
                    synchronized (deque) {
                        if (!deque.isEmpty()) {
                            czvg czvgVar4 = (czvg) deque.peekLast();
                            eiig.x(czvgVar4);
                            j = czvgVar4.c;
                        }
                        deque.addLast(czvgVar);
                        if (deque.size() != 1) {
                            if (((czvg) eivv.p(deque)).c < j) {
                                ((ejhf) ((ejhf) czir.a.h()).ah(9933)).x("New WiFi scan out of order; sorting");
                                daakVar.d.e("CSLWifiScanOutOfOrder");
                                ArrayList arrayList = new ArrayList(deque);
                                deque.clear();
                                Collections.sort(arrayList, new Comparator() { // from class: daai
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj, Object obj2) {
                                        return Long.compare(((czvg) obj).c, ((czvg) obj2).c);
                                    }
                                });
                                deque.addAll(arrayList);
                                arrayList.clear();
                            }
                        }
                    }
                    daae daaeVar = czhtVar.c;
                    if (daaeVar != null) {
                        daaeVar.c(new eiho() { // from class: czzw
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                fecj fecjVar2 = (fecj) obj;
                                int i = daae.b;
                                if (!fecjVar2.b.L()) {
                                    fecjVar2.U();
                                }
                                czvg czvgVar5 = czvg.this;
                                czsb czsbVar = (czsb) fecjVar2.b;
                                czsb czsbVar2 = czsb.a;
                                czvgVar5.getClass();
                                czsbVar.g = czvgVar5;
                                czsbVar.b |= 16;
                                return fecjVar2;
                            }
                        });
                    }
                }
            }
        }).hn(new Runnable() { // from class: czhs
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, enre.a);
    }
}
