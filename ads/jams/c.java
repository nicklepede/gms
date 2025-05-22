package com.google.android.gms.ads.jams;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.auuu;
import defpackage.bsup;
import defpackage.casd;
import defpackage.catb;
import defpackage.fmqp;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c {
    public final Context a;
    public final bsup b;
    public final e c;
    private final casd d;

    protected c(Context context) {
        bsup b = bsup.b(context);
        e eVar = new e(context);
        casd a = casd.a(context);
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
        return (HttpURLConnection) auuu.b(new URL(b(z)), 256, "ads-jams");
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
        long c = fmqp.c() + j;
        Bundle bundle = new Bundle();
        bundle.putString("NegotiationTaskType", a.a(i));
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.ads.jams.NegotiationService";
        catbVar.e(j, c);
        catbVar.t("jams-negotiation-task");
        catbVar.v(0);
        catbVar.u = bundle;
        this.d.f(catbVar.b());
        this.c.a.edit().putLong("scheduled_next_negotiation_timestamp", System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j)).apply();
        String w = defpackage.a.w(j, "[JAMS] Next negotiation to run in ", " seconds");
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d(w);
    }
}
