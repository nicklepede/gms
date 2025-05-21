package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bhyk;
import defpackage.dkow;
import defpackage.dkti;
import defpackage.dlad;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GcmMessageReceiver extends TracingBroadcastReceiver {
    private final dlad a;
    private final dkti b;

    public GcmMessageReceiver(dlad dladVar, dkti dktiVar) {
        super("wearable");
        this.a = dladVar;
        this.b = dktiVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        try {
            bhyk.a(context);
            if (Objects.equals(bhyk.e(intent), "gcm")) {
                String stringExtra = intent.getStringExtra("type");
                if (Objects.equals(stringExtra, "rpc")) {
                    final dlad dladVar = this.a;
                    final Bundle extras = intent.getExtras();
                    dkow.i(7, extras.getString("pkgName"));
                    dladVar.k.post(new Runnable() { // from class: dlab
                        @Override // java.lang.Runnable
                        public final void run() {
                            Bundle bundle = extras;
                            dkxa b = dlad.b(bundle.getString("path"), Objects.equals(bundle.getString("isChannel"), "1"), bundle.getString("pkgName"));
                            dlad dladVar2 = dlad.this;
                            dkxb dkxbVar = dladVar2.f;
                            dkxbVar.a(b, "chunksRecv", 1);
                            dlyo a = dladVar2.d.a(bundle);
                            if (a == null) {
                                dkpy.b(dkok.INBOUND_DROPPED, b.b);
                                dladVar2.g.c("INCHUNK", " DROPPED unable to parse");
                                return;
                            }
                            dkxbVar.a(b, "msgsRecv", 1);
                            dkxbVar.a(b, "bytesRecv", a.h.d());
                            if (!dmdj.b().F()) {
                                if (Log.isLoggable("rpctransport", 2)) {
                                    Log.v("rpctransport", "Cloud sync isn't started yet. Ignore cloud rpc: ".concat(String.valueOf(String.valueOf(bundle))));
                                }
                                dkpy.b(dkok.INBOUND_DROPPED, a.d);
                                dladVar2.g.f(dktm.a.a, a, "not connected to cloud");
                                dladVar2.l(a, 8);
                                return;
                            }
                            String str = dladVar2.i;
                            if (str != null) {
                                if (Log.isLoggable("rpctransport", 2)) {
                                    Log.v("rpctransport", String.format("Cloud sync is ignored due to active migrate node:%s, Ignore cloud rpc: %s", str, bundle));
                                }
                                dkpy.b(dkok.INBOUND_DROPPED, a.d);
                                dladVar2.g.f(dktm.a.a, a, "active migration");
                                dladVar2.l(a, 11);
                                return;
                            }
                            if (Log.isLoggable("rpctransport", 2)) {
                                bundle.size();
                                Log.v("rpctransport", "handleCloudRpc: ".concat(String.valueOf(String.valueOf(bundle))));
                            }
                            String string = bundle.getString("networkId");
                            String a2 = dladVar2.c.a();
                            if (a2 == null) {
                                Log.d("rpctransport", "handleCloudRpc: error, the cloud network isn't configured");
                                dkpy.b(dkok.INBOUND_DROPPED, a.d);
                                dladVar2.g.f(dktm.a.a, a, "cloud network not configured");
                                dladVar2.l(a, 10);
                                return;
                            }
                            if (!a2.equals(string)) {
                                Log.d("rpctransport", a.d(a2, string, "handleCloudRpc: error, the networkId (", " != the configured cloud network (", ")"));
                                dkpy.b(dkok.INBOUND_DROPPED, a.d);
                                dladVar2.g.f(dktm.a.a, a, a.i(string, a2, "the networkIds doesn't match, expected ", ", was "));
                                dladVar2.l(a, 13);
                                return;
                            }
                            if (Log.isLoggable("rpctransport", 2)) {
                                Log.v("rpctransport", "handleCloudRpc: ".concat(dlzw.a(a)));
                            }
                            if (dlad.e(a.f)) {
                                fecj fecjVar = (fecj) a.iB(5, null);
                                fecjVar.X(a);
                                String str2 = dladVar2.j.a().a;
                                if (!fecjVar.b.L()) {
                                    fecjVar.U();
                                }
                                dlyo dlyoVar = (dlyo) fecjVar.b;
                                str2.getClass();
                                dlyoVar.b = 8 | dlyoVar.b;
                                dlyoVar.f = str2;
                                a = (dlyo) fecjVar.Q();
                            }
                            dmje dmjeVar = dladVar2.g;
                            String str3 = dktm.a.a;
                            dmjeVar.d(str3, a);
                            if (dladVar2.k(str3, a)) {
                                dkpy.b(dkok.INBOUND_RECEIVED, a.d);
                            } else {
                                dkpy.b(dkok.INBOUND_DROPPED, a.d);
                            }
                        }
                    });
                } else if (Objects.equals(stringExtra, "tickle")) {
                    dkti dktiVar = this.b;
                    Bundle extras2 = intent.getExtras();
                    if (Log.isLoggable("CloudNode", 2)) {
                        extras2.size();
                        Log.v("CloudNode", "Received message from the cloud, yay, scheduling fetch".concat(String.valueOf(String.valueOf(extras2))));
                    }
                    dkow.i(2, null);
                    dktiVar.u = true;
                    dktiVar.i.e(1);
                }
            }
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (Throwable th) {
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            throw th;
        }
    }
}
