package com.google.android.gms.ads.internal.state;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.config.p;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h {
    public final g a;
    final f b;
    private final com.google.android.gms.ads.internal.util.g c;

    public h(com.google.android.gms.ads.internal.util.g gVar) {
        new HashSet();
        new HashSet();
        this.b = new f();
        this.c = gVar;
        this.a = new g();
    }

    public final void a(boolean z) {
        long j;
        int i;
        com.google.android.gms.ads.internal.c.j();
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            com.google.android.gms.ads.internal.util.g gVar = this.c;
            gVar.a();
            synchronized (gVar.a) {
                j = gVar.o;
            }
            if (currentTimeMillis - j > ((Long) p.I.g()).longValue()) {
                this.b.a = -1;
                return;
            }
            f fVar = this.b;
            com.google.android.gms.ads.internal.util.g gVar2 = this.c;
            gVar2.a();
            synchronized (gVar2.a) {
                i = gVar2.q;
            }
            fVar.a = i;
            return;
        }
        com.google.android.gms.ads.internal.util.g gVar3 = this.c;
        gVar3.a();
        synchronized (gVar3.a) {
            if (gVar3.o != currentTimeMillis) {
                gVar3.o = currentTimeMillis;
                SharedPreferences.Editor editor = gVar3.g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", currentTimeMillis);
                    gVar3.g.apply();
                }
                gVar3.b();
            }
        }
        com.google.android.gms.ads.internal.util.g gVar4 = this.c;
        int i2 = this.b.a;
        gVar4.a();
        synchronized (gVar4.a) {
            if (gVar4.q == i2) {
                return;
            }
            gVar4.q = i2;
            SharedPreferences.Editor editor2 = gVar4.g;
            if (editor2 != null) {
                editor2.putInt("request_in_session_count", i2);
                gVar4.g.apply();
            }
            gVar4.b();
        }
    }
}
