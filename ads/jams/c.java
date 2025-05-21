package com.google.android.gms.ads.jams;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.asra;
import defpackage.bqna;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.fkak;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c {
    public final Context a;
    public final bqna b;
    public final e c;
    private final byjl d;

    protected c(Context context) {
        bqna b = bqna.b(context);
        e eVar = new e(context);
        byjl a = byjl.a(context);
        this.a = context;
        this.b = b;
        this.c = eVar;
        this.d = a;
    }

    protected final Boolean a() {
        return Boolean.valueOf(this.c.a() > 0);
    }

    public final String b(boolean z) {
        return (!a().booleanValue() || z) ? "https://www.googleapis.com/adsmeasurement/v1/measurement/transmit?key=AIzaSyAF4QL5fUEwz9gUpsIySsmqqr9pVow3MuU" : "https://www.googleapis.com/adsmeasurement/v1/measurement/transmit";
    }

    public final HttpURLConnection c(boolean z) {
        return (HttpURLConnection) asra.b(new URL(b(z)), 256, "ads-jams");
    }

    public final boolean d() {
        if (this.c.g()) {
            return false;
        }
        int i = com.google.android.gms.ads.internal.util.c.a;
        h.d("[JAMS] Negotiation has been disabled");
        return true;
    }

    public final void e(long j, int i) {
        long c = fkak.c() + j;
        Bundle bundle = new Bundle();
        bundle.putString("NegotiationTaskType", a.a(i));
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.ads.jams.NegotiationService";
        bykjVar.e(j, c);
        bykjVar.t("jams-negotiation-task");
        bykjVar.v(0);
        bykjVar.u = bundle;
        this.d.f(bykjVar.b());
        this.c.a.edit().putLong("scheduled_next_negotiation_timestamp", System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j)).apply();
        String w = defpackage.a.w(j, "[JAMS] Next negotiation to run in ", " seconds");
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d(w);
    }
}
