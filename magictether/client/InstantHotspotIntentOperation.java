package com.google.android.gms.magictether.client;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.magictether.logging.MetricTaskDurationTimerIntentOperation;
import defpackage.a;
import defpackage.ausn;
import defpackage.cdub;
import defpackage.cduo;
import defpackage.cduu;
import defpackage.cduy;
import defpackage.cdwr;
import defpackage.cdws;
import defpackage.cdxb;
import defpackage.cdxc;
import defpackage.cdxf;
import defpackage.cdxm;
import defpackage.cdyn;
import defpackage.cdyo;
import defpackage.cebs;
import defpackage.cebt;
import defpackage.cedc;
import defpackage.cede;
import defpackage.dhlk;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.ekvj;
import defpackage.eluo;
import defpackage.fgrt;
import defpackage.fstc;
import defpackage.fstg;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class InstantHotspotIntentOperation extends IntentOperation {
    private static final ausn a = cebs.a("InstantHotspotIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        dhlw dhlwVar;
        if (!cdyn.c(fstg.i())) {
            ((eluo) a.h()).x("NearbyTether client flag is off");
            return;
        }
        if (!intent.hasExtra("EXTRA_DEVICE_ID")) {
            ((eluo) a.h()).B("Missing extras in: %s", intent);
        }
        final cduo a2 = cduo.a();
        if (a2 == null) {
            ((eluo) a.i()).x("ClientOrchestrator was null, dropping intent");
            return;
        }
        ArrayList arrayList = null;
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CONNECT_TO_HOTSPOT_NETWORK")) {
            final long a3 = cdwr.a(intent);
            if (fstc.e()) {
                new cdyo(AppContextProvider.a(), (short[]) null).g("KEY_CLIENT_LAST_ACTIVE_TIMESTAMP", System.currentTimeMillis());
            }
            cebt.w();
            synchronized (a2.f) {
                ausn ausnVar = cduo.a;
                ((eluo) ausnVar.h()).A("Trying to handleConnectToHotspot with device %s ", a3);
                cdxb b = a2.b(a3, 2, 3, 6);
                if (b == null) {
                    ((eluo) ausnVar.j()).A("Failed to handleConnectToHotspot with device %s ", a3);
                    return;
                }
                b.c(4);
                MetricTaskDurationTimerIntentOperation.c(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                final cdub cdubVar = a2.e;
                ((eluo) cdub.a.h()).A("requestConnectToHotspot(%s)", a3);
                cduy cduyVar = cdubVar.b;
                synchronized (cduyVar) {
                    cduu a4 = cduyVar.a(a3);
                    if (a4 == null) {
                        dhlwVar = dhmr.c(new IllegalStateException(a.C(a3, "ERROR: No PresenceDevice found for id: ")));
                    } else {
                        final cdxm cdxmVar = new cdxm(cdubVar.d, a4.b, cdubVar.c);
                        a4.a(cdxmVar);
                        dhlw h = cdxmVar.h();
                        h.x(new dhlk() { // from class: cdtu
                            @Override // defpackage.dhlk
                            public final void hH(dhlw dhlwVar2) {
                                cduy cduyVar2 = cdub.this.b;
                                long j = a3;
                                cdxm cdxmVar2 = cdxmVar;
                                synchronized (cduyVar2) {
                                    cduu a5 = cduyVar2.a(j);
                                    if (a5 == null) {
                                        ((eluo) cdub.a.j()).A("Got ConnectTethering result for device that is not discovered: deviceId=%s", j);
                                    } else {
                                        a5.b(cdxmVar2);
                                    }
                                }
                            }
                        });
                        dhlwVar = h;
                    }
                }
                dhlwVar.x(new dhlk() { // from class: cdud
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.dhlk
                    public final void hH(dhlw dhlwVar2) {
                        ausn ausnVar2 = cduo.a;
                        ((eluo) ausnVar2.h()).x("Request to connect to hotspot completed");
                        cduo cduoVar = cduo.this;
                        long j = a3;
                        if (!dhlwVar2.m()) {
                            if (dhlwVar2.h() instanceof cdyd) {
                                ((eluo) ausnVar2.h()).x("Cancelled connecting to hotspot due to duplicate worker added.");
                                return;
                            }
                            ((eluo) ausnVar2.j()).A("Failed to request connection to hotspot for %s", j);
                            MetricTaskDurationTimerIntentOperation.a(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                            synchronized (cduoVar.f) {
                                cdxb b2 = cduoVar.b(j, 4);
                                if (b2 != null) {
                                    ((eluo) ausnVar2.h()).A("Updating device %s to error state", j);
                                    b2.e();
                                } else {
                                    ((eluo) ausnVar2.j()).A("Cannot find device %s  to update to error state", j);
                                }
                            }
                            cduoVar.o();
                            return;
                        }
                        cecp cecpVar = (cecp) dhlwVar2.i();
                        if ((cecpVar.b & 16) != 0) {
                            cecw cecwVar = cecpVar.g;
                            if (cecwVar == null) {
                                cecwVar = cecw.a;
                            }
                            int i = cecwVar.b;
                            if ((i & 1) != 0) {
                                int i2 = cecwVar.c;
                                cecv b3 = cecv.b(i2);
                                if (b3 == null) {
                                    b3 = cecv.STATUS_CODE_UNKNOWN;
                                }
                                if (b3 != cecv.HOTSPOT_ACTIVE) {
                                    eluo eluoVar = (eluo) cduo.a.j();
                                    cecv b4 = cecv.b(i2);
                                    if (b4 == null) {
                                        b4 = cecv.STATUS_CODE_UNKNOWN;
                                    }
                                    eluoVar.z("Received connectTetheringResponse with invalid status code %s", b4.f);
                                } else if ((i & 8) == 0) {
                                    ((eluo) cduo.a.j()).x("Received connectTetheringResponse with no hotspot ssid");
                                } else if ((i & 32) == 0 && !fstg.q()) {
                                    ((eluo) cduo.a.j()).x("Received connectTetheringResponse with no hotspot password");
                                } else if (cecwVar.h.size() == 0) {
                                    ((eluo) cduo.a.j()).x("Received connectTetheringResponse with no hotspot security type");
                                } else {
                                    cede b5 = cede.b(cecwVar.h.d(0));
                                    if (b5 == null) {
                                        b5 = cede.SECURITY_TYPE_UNKNOWN;
                                    }
                                    Map map = cduoVar.f;
                                    int a5 = cdws.a(b5);
                                    synchronized (map) {
                                        cdxb b6 = cduoVar.b(j, 4);
                                        if (b6 == null) {
                                            ((eluo) cduo.a.j()).x("Received connectTetheringResponse in invalid network state");
                                        } else {
                                            b6.g = cecwVar;
                                            cduoVar.p.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                                            boolean m = fstg.x() ? cduoVar.d.m(cecwVar.f, cecwVar.i, cecwVar.j, a5, j) : cduoVar.d.l(cecwVar.f, cecwVar.i, cecwVar.j, a5);
                                            ((eluo) cduo.a.h()).B("Result of trying to connect to hotspot: %s", Boolean.valueOf(m));
                                            cduoVar.g.d("magictether_nearby_connect_to_hotspot_success", !m);
                                            if (m != 0) {
                                                Timer timer = cduoVar.i;
                                                synchronized (timer) {
                                                    TimerTask timerTask = cduoVar.m;
                                                    if (timerTask != null) {
                                                        timerTask.cancel();
                                                    }
                                                    cduoVar.m = new cduh(cduoVar, j);
                                                    timer.schedule(cduoVar.m, fstg.a.lK().c());
                                                }
                                                MetricTaskDurationTimerIntentOperation.e(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                                                cduoVar.o();
                                            }
                                        }
                                    }
                                }
                            } else {
                                ((eluo) cduo.a.j()).x("Received connectTetheringResponse with no status code");
                            }
                        } else {
                            ((eluo) cduo.a.j()).x("Received connectTetheringResponse with no hotspot status");
                        }
                        MetricTaskDurationTimerIntentOperation.a(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                        synchronized (cduoVar.f) {
                            cdxb b7 = cduoVar.b(j, 4);
                            if (b7 == null) {
                                ((eluo) cduo.a.j()).A("Failed to find valid connecting device with id %s ", j);
                            } else if ((cecpVar.b & 16) != 0) {
                                cecw cecwVar2 = cecpVar.g;
                                if (cecwVar2 == null) {
                                    cecwVar2 = cecw.a;
                                }
                                if ((cecwVar2.b & 1) != 0) {
                                    elhz elhzVar = cduo.b;
                                    cecv b8 = cecv.b(cecwVar2.c);
                                    if (b8 == null) {
                                        b8 = cecv.STATUS_CODE_UNKNOWN;
                                    }
                                    if (elhzVar.contains(b8)) {
                                        b7.f();
                                    } else {
                                        elhz elhzVar2 = cduo.c;
                                        cecv b9 = cecv.b(cecwVar2.c);
                                        if (b9 == null) {
                                            b9 = cecv.STATUS_CODE_UNKNOWN;
                                        }
                                        if (elhzVar2.contains(b9)) {
                                            b7.h = 2;
                                            b7.c = 3;
                                        } else {
                                            eluo eluoVar2 = (eluo) cduo.a.j();
                                            cecv b10 = cecv.b(cecwVar2.c);
                                            if (b10 == null) {
                                                b10 = cecv.STATUS_CODE_UNKNOWN;
                                            }
                                            eluoVar2.z("Failed to handle InstantHotspotStatusCode %s", b10.f);
                                            b7.f();
                                        }
                                    }
                                } else {
                                    b7.e();
                                }
                            } else {
                                ((eluo) cduo.a.j()).A("ConnectTetheringResponse for %s has no instant hotspot status", j);
                                b7.e();
                            }
                        }
                        cduoVar.p.remove(Long.valueOf(j));
                        MetricTaskDurationTimerIntentOperation.e(AppContextProvider.a(), "magictether_performance_nearby_connect_to_hotspot_duration");
                        cduoVar.o();
                    }
                });
                a2.o();
                return;
            }
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.DISCONNECT_FROM_HOTSPOT_NETWORK")) {
            a2.e(cdwr.a(intent));
            return;
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CANCEL_CONNECT_TO_HOTSPOT_NETWORK")) {
            long a5 = cdwr.a(intent);
            synchronized (a2.i) {
                TimerTask timerTask = a2.m;
                if (timerTask != null) {
                    timerTask.cancel();
                    a2.m = null;
                }
            }
            synchronized (a2.f) {
                ausn ausnVar2 = cduo.a;
                ((eluo) ausnVar2.h()).A("Trying to handleCancelConnectToHotspot with device %s ", a5);
                cdxb b2 = a2.b(a5, 5, 4);
                if (b2 == null) {
                    ((eluo) ausnVar2.j()).A("Failed to handleCancelConnectToHotspot with device %s ", a5);
                    return;
                }
                int i = b2.c;
                if (i != 4) {
                    if (i != 5) {
                        ((eluo) ausnVar2.i()).z("Got invalid connectionState when trying to cancel: %s", i);
                        return;
                    } else {
                        a2.e(a5);
                        return;
                    }
                }
                if (fstg.x()) {
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
            ((eluo) cduo.a.h()).x("User dismiss the hotspot available notification!");
            if (fstg.l()) {
                a2.k.c(cduo.p());
                return;
            } else {
                a2.j.c(System.currentTimeMillis());
                return;
            }
        }
        if (cdyn.b() && Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CONNECT_TO_KNOWN_NETWORK")) {
            long a6 = cdwr.a(intent);
            if (!cdyn.b()) {
                ((eluo) cduo.a.i()).x("Wifi sharing is not enabled in connectToKnownNetwork");
                return;
            }
            a2.g.l(1);
            synchronized (a2.f) {
                ausn ausnVar3 = cduo.a;
                ((eluo) ausnVar3.h()).A("Trying to connectToKnownNetwork with deviceId %s ", a6);
                cdxc c = a2.c(a6, 2, 3, 6);
                if (c == null) {
                    ((eluo) ausnVar3.j()).A("Failed to find network with deviceId %s ", a6);
                    return;
                }
                String e = c.e();
                cedc cedcVar = c.g;
                String str = (cedcVar == null || (cedcVar.c & 4) == 0) ? null : cedcVar.f;
                if (cedcVar != null) {
                    arrayList = new ArrayList();
                    Iterator<E> it = new fgrt(c.g.g, cedc.a).iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(cdws.a((cede) it.next())));
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
        if (!cdyn.b() || !Objects.equals(intent.getAction(), "com.google.android.gms.magictether.CANCEL_CONNECT_TO_KNOWN_NETWORK")) {
            if (!cdyn.b() || !Objects.equals(intent.getAction(), "com.google.android.gms.magictether.DISMISS_WIFI_AVAILABLE_NOTIFICATION")) {
                ((eluo) a.j()).B("Unknown intent action in: %s", intent);
                return;
            }
            if (!cdyn.b()) {
                ((eluo) cduo.a.i()).x("Wifi sharing is not enabled in handleDismissWifiAvailableNotification");
                return;
            }
            ((eluo) cduo.a.h()).x("User dismiss the wifi available notification!");
            if (fstg.l()) {
                a2.l.c(cduo.p());
                return;
            } else {
                a2.j.c(System.currentTimeMillis());
                return;
            }
        }
        long a7 = cdwr.a(intent);
        if (!cdyn.b()) {
            ((eluo) cduo.a.i()).x("Wifi sharing is not enabled in handleCancelConnectToKnownNetwork");
            return;
        }
        synchronized (a2.f) {
            ausn ausnVar4 = cduo.a;
            ((eluo) ausnVar4.h()).A("Trying to handleCancelConnectToKnownNetwork with deviceId %s ", a7);
            cdxc c2 = a2.c(a7, 4, 5);
            if (c2 == null) {
                ((eluo) ausnVar4.j()).A("Failed to find network with deviceId %s ", a7);
                return;
            }
            cdxf cdxfVar = a2.d;
            ekvj ekvjVar = cdxfVar.f;
            ekvj ekvjVar2 = cdxf.a;
            if (ekvjVar.equals(ekvjVar2)) {
                ((eluo) ((eluo) cdxf.b.j()).ai((char) 6075)).x("No connected wifi network when trying to cancel");
            } else if (((Long) ekvjVar.b).longValue() != a7) {
                ((eluo) ((eluo) cdxf.b.j()).ai((char) 6074)).x("Tried to cancel connection with invalid deviceId");
            } else {
                cdxfVar.f = ekvjVar2;
                if (cdxfVar.t(((Integer) ekvjVar.a).intValue())) {
                    c2.c = 6;
                    MetricTaskDurationTimerIntentOperation.a(AppContextProvider.a(), "magictether_performance_nearby_connect_to_wifi_duration");
                }
            }
            a2.o();
        }
    }
}
