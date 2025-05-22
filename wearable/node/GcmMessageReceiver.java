package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bkcz;
import defpackage.dnap;
import defpackage.dnfb;
import defpackage.dnlw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GcmMessageReceiver extends TracingBroadcastReceiver {
    private final dnlw a;
    private final dnfb b;

    public GcmMessageReceiver(dnlw dnlwVar, dnfb dnfbVar) {
        super("wearable");
        this.a = dnlwVar;
        this.b = dnfbVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        try {
            bkcz.a(context);
            if (Objects.equals(bkcz.e(intent), "gcm")) {
                String stringExtra = intent.getStringExtra("type");
                if (Objects.equals(stringExtra, "rpc")) {
                    final dnlw dnlwVar = this.a;
                    final Bundle extras = intent.getExtras();
                    dnap.i(7, extras.getString("pkgName"));
                    dnlwVar.k.post(new Runnable() { // from class: dnlu
                        @Override // java.lang.Runnable
                        public final void run() {
                            Bundle bundle = extras;
                            dnit b = dnlw.b(bundle.getString("path"), Objects.equals(bundle.getString("isChannel"), "1"), bundle.getString("pkgName"));
                            dnlw dnlwVar2 = dnlw.this;
                            dniu dniuVar = dnlwVar2.f;
                            dniuVar.a(b, "chunksRecv", 1);
                            dokf a = dnlwVar2.d.a(bundle);
                            if (a == null) {
                                dnbr.b(dnad.INBOUND_DROPPED, b.b);
                                dnlwVar2.g.c("INCHUNK", " DROPPED unable to parse");
                                return;
                            }
                            dniuVar.a(b, "msgsRecv", 1);
                            dniuVar.a(b, "bytesRecv", a.h.d());
                            if (!doov.b().E()) {
                                if (Log.isLoggable("rpctransport", 2)) {
                                    Log.v("rpctransport", "Cloud sync isn't started yet. Ignore cloud rpc: ".concat(String.valueOf(String.valueOf(bundle))));
                                }
                                dnbr.b(dnad.INBOUND_DROPPED, a.d);
                                dnlwVar2.g.f(dnff.a.a, a, "not connected to cloud");
                                dnlwVar2.l(a, 8);
                                return;
                            }
                            String str = dnlwVar2.i;
                            if (str != null) {
                                if (Log.isLoggable("rpctransport", 2)) {
                                    Log.v("rpctransport", String.format("Cloud sync is ignored due to active migrate node:%s, Ignore cloud rpc: %s", str, bundle));
                                }
                                dnbr.b(dnad.INBOUND_DROPPED, a.d);
                                dnlwVar2.g.f(dnff.a.a, a, "active migration");
                                dnlwVar2.l(a, 11);
                                return;
                            }
                            if (Log.isLoggable("rpctransport", 2)) {
                                bundle.size();
                                Log.v("rpctransport", "handleCloudRpc: ".concat(String.valueOf(String.valueOf(bundle))));
                            }
                            String string = bundle.getString("networkId");
                            String a2 = dnlwVar2.c.a();
                            if (a2 == null) {
                                Log.d("rpctransport", "handleCloudRpc: error, the cloud network isn't configured");
                                dnbr.b(dnad.INBOUND_DROPPED, a.d);
                                dnlwVar2.g.f(dnff.a.a, a, "cloud network not configured");
                                dnlwVar2.l(a, 10);
                                return;
                            }
                            if (!a2.equals(string)) {
                                Log.d("rpctransport", a.d(a2, string, "handleCloudRpc: error, the networkId (", " != the configured cloud network (", ")"));
                                dnbr.b(dnad.INBOUND_DROPPED, a.d);
                                dnlwVar2.g.f(dnff.a.a, a, a.i(string, a2, "the networkIds doesn't match, expected ", ", was "));
                                dnlwVar2.l(a, 13);
                                return;
                            }
                            if (Log.isLoggable("rpctransport", 2)) {
                                Log.v("rpctransport", "handleCloudRpc: ".concat(doli.a(a)));
                            }
                            if (dnlw.e(a.f)) {
                                fgrc fgrcVar = (fgrc) a.iQ(5, null);
                                fgrcVar.X(a);
                                String str2 = dnlwVar2.j.a().a;
                                if (!fgrcVar.b.L()) {
                                    fgrcVar.U();
                                }
                                dokf dokfVar = (dokf) fgrcVar.b;
                                str2.getClass();
                                dokfVar.b = 8 | dokfVar.b;
                                dokfVar.f = str2;
                                a = (dokf) fgrcVar.Q();
                            }
                            dous dousVar = dnlwVar2.g;
                            String str3 = dnff.a.a;
                            dousVar.d(str3, a);
                            if (dnlwVar2.k(str3, a)) {
                                dnbr.b(dnad.INBOUND_RECEIVED, a.d);
                            } else {
                                dnbr.b(dnad.INBOUND_DROPPED, a.d);
                            }
                        }
                    });
                } else if (Objects.equals(stringExtra, "tickle")) {
                    dnfb dnfbVar = this.b;
                    Bundle extras2 = intent.getExtras();
                    if (Log.isLoggable("CloudNode", 2)) {
                        extras2.size();
                        Log.v("CloudNode", "Received message from the cloud, yay, scheduling fetch".concat(String.valueOf(String.valueOf(extras2))));
                    }
                    dnap.i(2, null);
                    dnfbVar.u = true;
                    dnfbVar.i.e(1);
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
