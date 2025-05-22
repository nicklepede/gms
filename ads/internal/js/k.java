package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Looper;
import android.os.StrictMode;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.auuc;
import defpackage.ekww;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class k implements c, ai {
    public final com.google.android.gms.ads.internal.webview.i a;

    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.ads.internal.webview.i, java.lang.Object] */
    public k(final Context context, final VersionInfoParcel versionInfoParcel) {
        com.google.android.gms.ads.internal.webview.q qVar = com.google.android.gms.ads.internal.c.a.d;
        final com.google.android.gms.ads.internal.webview.af afVar = new com.google.android.gms.ads.internal.webview.af();
        final com.google.android.gms.ads.internal.clearcut.b bVar = new com.google.android.gms.ads.internal.clearcut.b();
        com.google.android.gms.ads.internal.config.p.c(context);
        try {
            ekww ekwwVar = new ekww() { // from class: com.google.android.gms.ads.internal.webview.o
                @Override // defpackage.ekww
                public final Object lK() {
                    af afVar2 = afVar;
                    VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
                    Context context2 = context;
                    com.google.android.gms.ads.internal.clearcut.b bVar2 = bVar;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = x.h;
                        r rVar = new r(new x(new ae(context2), afVar2, versionInfoParcel2, bVar2));
                        n b = com.google.android.gms.ads.internal.c.f().b(rVar, bVar2);
                        i iVar = rVar.a;
                        iVar.setWebViewClient(b);
                        iVar.setWebChromeClient(new h(rVar));
                        return rVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                ?? lK = ekwwVar.lK();
                this.a = lK;
                ((View) lK).setWillNotDraw(true);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new com.google.android.gms.ads.internal.webview.p(th);
        }
    }

    public static final void h(Runnable runnable) {
        com.google.android.gms.ads.internal.client.u.b();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            if (com.google.android.gms.ads.internal.util.m.a.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.h.k("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.ads.internal.js.a
    public final /* synthetic */ void b(String str, JSONObject jSONObject) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.js.c
    public final /* synthetic */ void c(String str, String str2) {
        b.a(this, str, str2);
    }

    public final void d() {
        com.google.android.gms.ads.internal.webview.i iVar = ((com.google.android.gms.ads.internal.webview.r) this.a).a;
        iVar.p();
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aE.g()).booleanValue()) {
            iVar.o();
        }
        iVar.destroy();
    }

    @Override // com.google.android.gms.ads.internal.js.l
    public final /* synthetic */ void e(String str, JSONObject jSONObject) {
        b.b(this, str, jSONObject);
    }

    public final void f(String str, com.google.android.gms.ads.internal.gmsg.e eVar) {
        j jVar = new j(this, eVar);
        com.google.android.gms.ads.internal.webview.n nVar = ((com.google.android.gms.ads.internal.webview.x) ((com.google.android.gms.ads.internal.webview.r) this.a).a).b;
        if (nVar != null) {
            synchronized (nVar.c) {
                HashMap hashMap = nVar.b;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(jVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.js.ai
    public final void g(String str, final com.google.android.gms.ads.internal.gmsg.e eVar) {
        auuc auucVar = new auuc() { // from class: com.google.android.gms.ads.internal.js.d
            @Override // defpackage.auuc
            public final boolean a(Object obj) {
                com.google.android.gms.ads.internal.gmsg.e eVar2 = (com.google.android.gms.ads.internal.gmsg.e) obj;
                if (eVar2 instanceof j) {
                    return ((j) eVar2).a.equals(com.google.android.gms.ads.internal.gmsg.e.this);
                }
                return false;
            }
        };
        com.google.android.gms.ads.internal.webview.n nVar = ((com.google.android.gms.ads.internal.webview.x) ((com.google.android.gms.ads.internal.webview.r) this.a).a).b;
        if (nVar != null) {
            synchronized (nVar.c) {
                List<com.google.android.gms.ads.internal.gmsg.e> list = (List) nVar.b.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.ads.internal.gmsg.e eVar2 : list) {
                    if (auucVar.a(eVar2)) {
                        arrayList.add(eVar2);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.js.c, com.google.android.gms.ads.internal.js.l
    public final void gl(final String str) {
        h(new Runnable() { // from class: com.google.android.gms.ads.internal.js.g
            @Override // java.lang.Runnable
            public final void run() {
                ((com.google.android.gms.ads.internal.webview.x) ((com.google.android.gms.ads.internal.webview.r) k.this.a).a).u(str);
            }
        });
    }
}
