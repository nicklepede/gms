package com.google.android.gms.magictether.client;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.magictether.logging.MetricTaskDurationTimerIntentOperation;
import defpackage.a;
import defpackage.asot;
import defpackage.cblj;
import defpackage.cblw;
import defpackage.cbmc;
import defpackage.cbmg;
import defpackage.cbnz;
import defpackage.cboa;
import defpackage.cboj;
import defpackage.cbok;
import defpackage.cbon;
import defpackage.cbou;
import defpackage.cbpv;
import defpackage.cbpw;
import defpackage.cbta;
import defpackage.cbtb;
import defpackage.cbuk;
import defpackage.cbum;
import defpackage.dfae;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.eiie;
import defpackage.ejhf;
import defpackage.feda;
import defpackage.fpzg;
import defpackage.fpzk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class InstantHotspotIntentOperation extends IntentOperation {
    private static final asot a = cbta.a("InstantHotspotIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        dfaq dfaqVar;
        if (!cbpv.c(fpzk.i())) {
            ((ejhf) a.h()).x("NearbyTether client flag is off");
            return;
        }
        if (!intent.hasExtra("EXTRA_DEVICE_ID")) {
            ((ejhf) a.h()).B("Missing extras in: %s", intent);
        }
        final cblw a2 = cblw.a();
        if (a2 == null) {
            ((ejhf) a.i()).x("ClientOrchestrator was null, dropping intent");
            return;
        }
        ArrayList arrayList = null;
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CONNECT_TO_HOTSPOT_NETWORK")) {
            final long a3 = cbnz.a(intent);
            if (fpzg.f()) {
                new cbpw(AppContextProvider.a(), (short[]) null).g("KEY_CLIENT_LAST_ACTIVE_TIMESTAMP", System.currentTimeMillis());
            }
            cbtb.w();
            synchronized (a2.f) {
                asot asotVar = cblw.a;
                ((ejhf) asotVar.h()).A("Trying to handleConnectToHotspot with device %s ", a3);
                cboj b = a2.b(a3, 2, 3, 6);
                if (b == null) {
                    ((ejhf) asotVar.j()).A("Failed to handleConnectToHotspot with device %s ", a3);
                    return;
                }
                b.c(4);
                MetricTaskDurationTimerIntentOperation.c(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                final cblj cbljVar = a2.e;
                ((ejhf) cblj.a.h()).A("requestConnectToHotspot(%s)", a3);
                cbmg cbmgVar = cbljVar.b;
                synchronized (cbmgVar) {
                    cbmc a4 = cbmgVar.a(a3);
                    if (a4 == null) {
                        dfaqVar = dfbl.c(new IllegalStateException(a.D(a3, "ERROR: No PresenceDevice found for id: ")));
                    } else {
                        final cbou cbouVar = new cbou(cbljVar.d, a4.b, cbljVar.c);
                        a4.a(cbouVar);
                        dfaq h = cbouVar.h();
                        h.x(new dfae() { // from class: cblc
                            @Override // defpackage.dfae
                            public final void hr(dfaq dfaqVar2) {
                                cbmg cbmgVar2 = cblj.this.b;
                                long j = a3;
                                cbou cbouVar2 = cbouVar;
                                synchronized (cbmgVar2) {
                                    cbmc a5 = cbmgVar2.a(j);
                                    if (a5 == null) {
                                        ((ejhf) cblj.a.j()).A("Got ConnectTethering result for device that is not discovered: deviceId=%s", j);
                                    } else {
                                        a5.b(cbouVar2);
                                    }
                                }
                            }
                        });
                        dfaqVar = h;
                    }
                }
                dfaqVar.x(new dfae() { // from class: cbll
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.dfae
                    public final void hr(dfaq dfaqVar2) {
                        asot asotVar2 = cblw.a;
                        ((ejhf) asotVar2.h()).x("Request to connect to hotspot completed");
                        cblw cblwVar = cblw.this;
                        long j = a3;
                        if (!dfaqVar2.m()) {
                            if (dfaqVar2.h() instanceof cbpl) {
                                ((ejhf) asotVar2.h()).x("Cancelled connecting to hotspot due to duplicate worker added.");
                                return;
                            }
                            ((ejhf) asotVar2.j()).A("Failed to request connection to hotspot for %s", j);
                            MetricTaskDurationTimerIntentOperation.a(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                            synchronized (cblwVar.f) {
                                cboj b2 = cblwVar.b(j, 4);
                                if (b2 != null) {
                                    ((ejhf) asotVar2.h()).A("Updating device %s to error state", j);
                                    b2.e();
                                } else {
                                    ((ejhf) asotVar2.j()).A("Cannot find device %s  to update to error state", j);
                                }
                            }
                            cblwVar.o();
                            return;
                        }
                        cbtx cbtxVar = (cbtx) dfaqVar2.i();
                        if ((cbtxVar.b & 16) != 0) {
                            cbue cbueVar = cbtxVar.g;
                            if (cbueVar == null) {
                                cbueVar = cbue.a;
                            }
                            int i = cbueVar.b;
                            if ((i & 1) != 0) {
                                int i2 = cbueVar.c;
                                cbud b3 = cbud.b(i2);
                                if (b3 == null) {
                                    b3 = cbud.STATUS_CODE_UNKNOWN;
                                }
                                if (b3 != cbud.HOTSPOT_ACTIVE) {
                                    ejhf ejhfVar = (ejhf) cblw.a.j();
                                    cbud b4 = cbud.b(i2);
                                    if (b4 == null) {
                                        b4 = cbud.STATUS_CODE_UNKNOWN;
                                    }
                                    ejhfVar.z("Received connectTetheringResponse with invalid status code %s", b4.f);
                                } else if ((i & 8) == 0) {
                                    ((ejhf) cblw.a.j()).x("Received connectTetheringResponse with no hotspot ssid");
                                } else if ((i & 32) == 0 && !fpzk.q()) {
                                    ((ejhf) cblw.a.j()).x("Received connectTetheringResponse with no hotspot password");
                                } else if (cbueVar.h.size() == 0) {
                                    ((ejhf) cblw.a.j()).x("Received connectTetheringResponse with no hotspot security type");
                                } else {
                                    cbum b5 = cbum.b(cbueVar.h.d(0));
                                    if (b5 == null) {
                                        b5 = cbum.SECURITY_TYPE_UNKNOWN;
                                    }
                                    Map map = cblwVar.f;
                                    int a5 = cboa.a(b5);
                                    synchronized (map) {
                                        cboj b6 = cblwVar.b(j, 4);
                                        if (b6 == null) {
                                            ((ejhf) cblw.a.j()).x("Received connectTetheringResponse in invalid network state");
                                        } else {
                                            b6.g = cbueVar;
                                            cblwVar.p.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                                            boolean m = fpzk.x() ? cblwVar.d.m(cbueVar.f, cbueVar.i, cbueVar.j, a5, j) : cblwVar.d.l(cbueVar.f, cbueVar.i, cbueVar.j, a5);
                                            ((ejhf) cblw.a.h()).B("Result of trying to connect to hotspot: %s", Boolean.valueOf(m));
                                            cblwVar.g.d("magictether_nearby_connect_to_hotspot_success", !m);
                                            if (m != 0) {
                                                Timer timer = cblwVar.i;
                                                synchronized (timer) {
                                                    TimerTask timerTask = cblwVar.m;
                                                    if (timerTask != null) {
                                                        timerTask.cancel();
                                                    }
                                                    cblwVar.m = new cblp(cblwVar, j);
                                                    timer.schedule(cblwVar.m, fpzk.a.a().c());
                                                }
                                                MetricTaskDurationTimerIntentOperation.e(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                                                cblwVar.o();
                                            }
                                        }
                                    }
                                }
                            } else {
                                ((ejhf) cblw.a.j()).x("Received connectTetheringResponse with no status code");
                            }
                        } else {
                            ((ejhf) cblw.a.j()).x("Received connectTetheringResponse with no hotspot status");
                        }
                        MetricTaskDurationTimerIntentOperation.a(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                        synchronized (cblwVar.f) {
                            cboj b7 = cblwVar.b(j, 4);
                            if (b7 == null) {
                                ((ejhf) cblw.a.j()).A("Failed to find valid connecting device with id %s ", j);
                            } else if ((cbtxVar.b & 16) != 0) {
                                cbue cbueVar2 = cbtxVar.g;
                                if (cbueVar2 == null) {
                                    cbueVar2 = cbue.a;
                                }
                                if ((cbueVar2.b & 1) != 0) {
                                    eiuu eiuuVar = cblw.b;
                                    cbud b8 = cbud.b(cbueVar2.c);
                                    if (b8 == null) {
                                        b8 = cbud.STATUS_CODE_UNKNOWN;
                                    }
                                    if (eiuuVar.contains(b8)) {
                                        b7.f();
                                    } else {
                                        eiuu eiuuVar2 = cblw.c;
                                        cbud b9 = cbud.b(cbueVar2.c);
                                        if (b9 == null) {
                                            b9 = cbud.STATUS_CODE_UNKNOWN;
                                        }
                                        if (eiuuVar2.contains(b9)) {
                                            b7.h = 2;
                                            b7.c = 3;
                                        } else {
                                            ejhf ejhfVar2 = (ejhf) cblw.a.j();
                                            cbud b10 = cbud.b(cbueVar2.c);
                                            if (b10 == null) {
                                                b10 = cbud.STATUS_CODE_UNKNOWN;
                                            }
                                            ejhfVar2.z("Failed to handle InstantHotspotStatusCode %s", b10.f);
                                            b7.f();
                                        }
                                    }
                                } else {
                                    b7.e();
                                }
                            } else {
                                ((ejhf) cblw.a.j()).A("ConnectTetheringResponse for %s has no instant hotspot status", j);
                                b7.e();
                            }
                        }
                        cblwVar.p.remove(Long.valueOf(j));
                        MetricTaskDurationTimerIntentOperation.e(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                        cblwVar.o();
                    }
                });
                a2.o();
                return;
            }
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.DISCONNECT_FROM_HOTSPOT_NETWORK")) {
            a2.e(cbnz.a(intent));
            return;
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CANCEL_CONNECT_TO_HOTSPOT_NETWORK")) {
            long a5 = cbnz.a(intent);
            synchronized (a2.i) {
                TimerTask timerTask = a2.m;
                if (timerTask != null) {
                    timerTask.cancel();
                    a2.m = null;
                }
            }
            synchronized (a2.f) {
                asot asotVar2 = cblw.a;
                ((ejhf) asotVar2.h()).A("Trying to handleCancelConnectToHotspot with device %s ", a5);
                cboj b2 = a2.b(a5, 5, 4);
                if (b2 == null) {
                    ((ejhf) asotVar2.j()).A("Failed to handleCancelConnectToHotspot with device %s ", a5);
                    return;
                }
                int i = b2.c;
                if (i != 4) {
                    if (i != 5) {
                        ((ejhf) asotVar2.i()).z("Got invalid connectionState when trying to cancel: %s", i);
                        return;
                    } else {
                        a2.e(a5);
                        return;
                    }
                }
                if (fpzk.x()) {
                    a2.d.i(a5);
                } else {
                    a2.d.j();
                }
                b2.c(6);
                a2.d(a5);
                a2.o();
                return;
            }
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.ACTION_CLIENT_DISMISS_HOTSPOT_AVAILABLE_NOTIFICATION")) {
            ((ejhf) cblw.a.h()).x("User dismiss the hotspot available notification!");
            if (fpzk.l()) {
                a2.k.c(cblw.p());
                return;
            } else {
                a2.j.c(System.currentTimeMillis());
                return;
            }
        }
        if (cbpv.b() && Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CONNECT_TO_KNOWN_NETWORK")) {
            long a6 = cbnz.a(intent);
            if (!cbpv.b()) {
                ((ejhf) cblw.a.i()).x("Wifi sharing is not enabled in connectToKnownNetwork");
                return;
            }
            a2.g.l(1);
            synchronized (a2.f) {
                asot asotVar3 = cblw.a;
                ((ejhf) asotVar3.h()).A("Trying to connectToKnownNetwork with deviceId %s ", a6);
                cbok c = a2.c(a6, 2, 3, 6);
                if (c == null) {
                    ((ejhf) asotVar3.j()).A("Failed to find network with deviceId %s ", a6);
                    return;
                }
                String e = c.e();
                cbuk cbukVar = c.g;
                String str = (cbukVar == null || (cbukVar.c & 4) == 0) ? null : cbukVar.f;
                if (cbukVar != null) {
                    arrayList = new ArrayList();
                    Iterator<E> it = new feda(c.g.g, cbuk.a).iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(cboa.a((cbum) it.next())));
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (e != null && str != null && a2.d.n(e, str, arrayList2, a6)) {
                    MetricTaskDurationTimerIntentOperation.c(AppContextProvider.a(), "magictether_performance_nearby_connect_to_wifi_duration");
                    c.c = 4;
                    a2.o();
                    return;
                }
                c.c = 3;
                a2.o();
                return;
            }
        }
        if (!cbpv.b() || !Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CANCEL_CONNECT_TO_KNOWN_NETWORK")) {
            if (!cbpv.b() || !Objects.equals(intent.getAction(), "com.google.android.gms.magictether.DISMISS_WIFI_AVAILABLE_NOTIFICATION")) {
                ((ejhf) a.j()).B("Unknown intent action in: %s", intent);
                return;
            }
            if (!cbpv.b()) {
                ((ejhf) cblw.a.i()).x("Wifi sharing is not enabled in handleDismissWifiAvailableNotification");
                return;
            }
            ((ejhf) cblw.a.h()).x("User dismiss the wifi available notification!");
            if (fpzk.l()) {
                a2.l.c(cblw.p());
                return;
            } else {
                a2.j.c(System.currentTimeMillis());
                return;
            }
        }
        long a7 = cbnz.a(intent);
        if (!cbpv.b()) {
            ((ejhf) cblw.a.i()).x("Wifi sharing is not enabled in handleCancelConnectToKnownNetwork");
            return;
        }
        synchronized (a2.f) {
            asot asotVar4 = cblw.a;
            ((ejhf) asotVar4.h()).A("Trying to handleCancelConnectToKnownNetwork with deviceId %s ", a7);
            cbok c2 = a2.c(a7, 4, 5);
            if (c2 == null) {
                ((ejhf) asotVar4.j()).A("Failed to find network with deviceId %s ", a7);
                return;
            }
            cbon cbonVar = a2.d;
            eiie eiieVar = cbonVar.f;
            eiie eiieVar2 = cbon.a;
            if (eiieVar.equals(eiieVar2)) {
                ((ejhf) ((ejhf) cbon.b.j()).ah((char) 6056)).x("No connected wifi network when trying to cancel");
            } else if (((Long) eiieVar.b).longValue() != a7) {
                ((ejhf) ((ejhf) cbon.b.j()).ah((char) 6055)).x("Tried to cancel connection with invalid deviceId");
            } else {
                cbonVar.f = eiieVar2;
                if (cbonVar.t(((Integer) eiieVar.a).intValue())) {
                    c2.c = 6;
                    MetricTaskDurationTimerIntentOperation.a(AppContextProvider.a(), "magictether_performance_nearby_connect_to_wifi_duration");
                }
            }
            a2.o();
        }
    }
}
