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
import defpackage.dbrr;
import defpackage.eqex;
import defpackage.eqgo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class WifiScanReceiver$1 extends TracingBroadcastReceiver {
    final /* synthetic */ eqgo a;
    public final /* synthetic */ dbrr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiScanReceiver$1(dbrr dbrrVar, Context context, eqgo eqgoVar) {
        super(context);
        this.a = eqgoVar;
        this.b = dbrrVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        this.a.submit(new Runnable() { // from class: dbrp
            @Override // java.lang.Runnable
            public final void run() {
                List<ScanResult> scanResults;
                final dcfh dcfhVar;
                if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                    Context a = AppContextProvider.a();
                    if (auub.g()) {
                        a = ModuleManager.requireSubmoduleContext(a, "current_semantic_location");
                    }
                    WifiManager wifiManager = (WifiManager) a.getSystemService("wifi");
                    if (wifiManager == null || (scanResults = wifiManager.getScanResults()) == null || scanResults.isEmpty()) {
                        return;
                    }
                    WifiScanReceiver$1 wifiScanReceiver$1 = WifiScanReceiver$1.this;
                    scanResults.size();
                    dbrr dbrrVar = wifiScanReceiver$1.b;
                    dbrrVar.a.e("SemanticLocationPassiveWifiScan");
                    long j = 0;
                    if (dbrrVar.b != 0 && SystemClock.elapsedRealtime() - dbrrVar.b <= 15000) {
                        return;
                    }
                    dbrrVar.b = SystemClock.elapsedRealtime();
                    if (scanResults.isEmpty()) {
                        dcfhVar = dcfh.a;
                    } else {
                        eyol a2 = eyol.b((int) fush.i()).a();
                        for (ScanResult scanResult : scanResults) {
                            if (a2.size() >= fush.i()) {
                                break;
                            }
                            if (scanResult != null && scanResult.BSSID != null && (scanResult.SSID == null || !dykt.a(scanResult.SSID))) {
                                long c = ezpr.c(scanResult.BSSID);
                                if (a2.j(c)) {
                                    Integer num = (Integer) a2.h(c, true);
                                    ekvl.y(num);
                                    if (num.intValue() < scanResult.level) {
                                    }
                                }
                                a2.i(c, Integer.valueOf(scanResult.level));
                            }
                        }
                        dcff dcffVar = (dcff) dcfh.a.v();
                        eyog it = a2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry next = it.next();
                            dcffVar.a(((Long) next.getKey()).longValue());
                            dcffVar.k((byte) ((Integer) next.getValue()).intValue());
                        }
                        long currentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + TimeUnit.MICROSECONDS.toMillis(scanResults.get(0).timestamp);
                        if (!dcffVar.b.L()) {
                            dcffVar.U();
                        }
                        dcfh dcfhVar2 = (dcfh) dcffVar.b;
                        dcfhVar2.b |= 1;
                        dcfhVar2.c = currentTimeMillis;
                        dcfhVar = (dcfh) dcffVar.Q();
                    }
                    if (furk.c() || furk.e()) {
                        fgrc fgrcVar = (fgrc) dcfhVar.iQ(5, null);
                        fgrcVar.X(dcfhVar);
                        dcff dcffVar2 = (dcff) fgrcVar;
                        if (!dcffVar2.b.L()) {
                            dcffVar2.U();
                        }
                        dcfh dcfhVar3 = (dcfh) dcffVar2.b;
                        dcfhVar3.g = 2;
                        dcfhVar3.b = 2 | dcfhVar3.b;
                        dcfhVar = (dcfh) dcffVar2.Q();
                    }
                    dckl dcklVar = dbrrVar.d;
                    Deque deque = dcklVar.b;
                    synchronized (deque) {
                        if (!deque.isEmpty()) {
                            dcfh dcfhVar4 = (dcfh) deque.peekLast();
                            ekvl.y(dcfhVar4);
                            j = dcfhVar4.c;
                        }
                        deque.addLast(dcfhVar);
                        if (deque.size() != 1) {
                            if (((dcfh) elja.p(deque)).c < j) {
                                ((eluo) ((eluo) dbsp.a.h()).ai(9936)).x("New WiFi scan out of order; sorting");
                                dcklVar.d.e("CSLWifiScanOutOfOrder");
                                ArrayList arrayList = new ArrayList(deque);
                                deque.clear();
                                Collections.sort(arrayList, new Comparator() { // from class: dckj
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj, Object obj2) {
                                        return Long.compare(((dcfh) obj).c, ((dcfh) obj2).c);
                                    }
                                });
                                deque.addAll(arrayList);
                                arrayList.clear();
                            }
                        }
                    }
                    dckf dckfVar = dbrrVar.c;
                    if (dckfVar != null) {
                        dckfVar.c(new ekut() { // from class: dcjx
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                fgrc fgrcVar2 = (fgrc) obj;
                                int i = dckf.b;
                                if (!fgrcVar2.b.L()) {
                                    fgrcVar2.U();
                                }
                                dcfh dcfhVar5 = dcfh.this;
                                dccc dcccVar = (dccc) fgrcVar2.b;
                                dccc dcccVar2 = dccc.a;
                                dcfhVar5.getClass();
                                dcccVar.g = dcfhVar5;
                                dcccVar.b |= 16;
                                return fgrcVar2;
                            }
                        });
                    }
                }
            }
        }).hD(new Runnable() { // from class: dbrq
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, eqex.a);
    }
}
