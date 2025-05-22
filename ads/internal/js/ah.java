package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ah {
    public final Context b;
    public final String c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.nonagon.util.logging.cui.n e;
    public final com.google.android.gms.ads.internal.util.u f;
    public ag g;
    private final com.google.android.gms.ads.internal.util.u i;
    public final Object a = new Object();
    public int h = 1;

    public ah(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.u uVar, com.google.android.gms.ads.internal.util.u uVar2, com.google.android.gms.ads.nonagon.util.logging.cui.n nVar) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = versionInfoParcel;
        this.e = nVar;
        this.f = uVar;
        this.i = uVar2;
    }

    public final ag a() {
        com.google.android.gms.ads.nonagon.util.logging.cui.b a = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(this.b, 6);
        a.k();
        final ag agVar = new ag(this.i);
        com.google.android.gms.ads.internal.util.future.e.c.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.js.r
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.c.j();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ah ahVar = ah.this;
                ag agVar2 = agVar;
                try {
                    final k kVar = new k(ahVar.b, ahVar.d);
                    n nVar = new n(ahVar, arrayList, currentTimeMillis, agVar2, kVar);
                    com.google.android.gms.ads.internal.webview.n m = kVar.a.m();
                    Objects.requireNonNull(nVar);
                    m.e = new f(nVar);
                    kVar.f("/jsLoaded", new s(ahVar, agVar2, kVar));
                    com.google.android.gms.ads.internal.util.ae aeVar = new com.google.android.gms.ads.internal.util.ae();
                    t tVar = new t(ahVar, kVar, aeVar);
                    aeVar.a = tVar;
                    kVar.f("/requestReload", tVar);
                    final String str = ahVar.c;
                    if (str.endsWith(".js")) {
                        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
                        k.h(new Runnable() { // from class: com.google.android.gms.ads.internal.js.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.this.a.loadData(format, "text/html", "UTF-8");
                            }
                        });
                    } else if (str.startsWith("<html>")) {
                        k.h(new Runnable() { // from class: com.google.android.gms.ads.internal.js.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.this.a.loadData(str, "text/html", "UTF-8");
                            }
                        });
                    } else {
                        k.h(new Runnable() { // from class: com.google.android.gms.ads.internal.js.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((com.google.android.gms.ads.internal.webview.r) k.this.a).a.loadUrl(str);
                            }
                        });
                    }
                    com.google.android.gms.ads.internal.util.m.a.postDelayed(new v(ahVar, agVar2, kVar, arrayList), ((Integer) com.google.android.gms.ads.internal.config.p.d.g()).intValue());
                } catch (Throwable th) {
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.h("Error creating webview.", th);
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.aZ.g()).booleanValue()) {
                        agVar2.g(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                    } else if (((Boolean) com.google.android.gms.ads.internal.config.p.bb.g()).booleanValue()) {
                        com.google.android.gms.ads.internal.c.d().c(th, "SdkJavascriptFactory.loadJavascriptEngine");
                        agVar2.f();
                    } else {
                        com.google.android.gms.ads.internal.c.d().d(th, "SdkJavascriptFactory.loadJavascriptEngine");
                        agVar2.f();
                    }
                }
            }
        });
        agVar.i(new w(this, agVar, a), new x(this, agVar, a));
        return agVar;
    }
}
