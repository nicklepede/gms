package com.google.android.gms.platformconfigurator;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.platformconfigurator.PackageUpdateIntentOperation;
import defpackage.apzu;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cyru;
import defpackage.cyrx;
import defpackage.cysd;
import defpackage.cyse;
import defpackage.cysg;
import defpackage.ekut;
import defpackage.ekvk;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.elsn;
import defpackage.eluo;
import defpackage.fuib;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PackageUpdateIntentOperation extends apzu {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("PlatformConfigurator", auid.PLATFORM_CONFIGURATOR);
    private final cysg c;

    public PackageUpdateIntentOperation() {
        super(false);
        this.c = cysg.b();
    }

    private static elgo g() {
        elgj elgjVar = new elgj();
        fuib fuibVar = fuib.a;
        elgjVar.k(fuibVar.lK().f().b);
        elgjVar.k(fuibVar.lK().e().b);
        return elgjVar.g();
    }

    @Override // defpackage.apzu
    protected final void a(String str, Intent intent) {
        final elhz f = this.c.f(str);
        try {
            new cysd().a(new ekut() { // from class: cyry
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = PackageUpdateIntentOperation.a;
                    HashMap hashMap = new HashMap((elgx) obj);
                    elsn listIterator = elhz.this.listIterator();
                    while (listIterator.hasNext()) {
                        hashMap.remove(((cyse) listIterator.next()).a);
                    }
                    return elgx.k(hashMap);
                }
            });
        } catch (InterruptedException | ExecutionException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 8796)).x("failed to invalidate namespace registration data, check PersistedNamespaceListProtoDataStore configuration.");
        }
    }

    @Override // defpackage.apzu
    protected final void b(String str) {
        elgo f = f(str);
        int i = ((elpg) f).c;
        for (int i2 = 0; i2 < i; i2++) {
            cyru.f((String) f.get(i2), str, this);
        }
    }

    @Override // defpackage.apzu
    protected final void d(String str, Intent intent) {
        elgo f = f(str);
        int i = ((elpg) f).c;
        for (int i2 = 0; i2 < i; i2++) {
            cyru.f((String) f.get(i2), str, this);
        }
    }

    final elgo f(String str) {
        if (str.isEmpty()) {
            int i = elgo.d;
            return elpg.a;
        }
        elgj elgjVar = new elgj();
        if (fuib.j()) {
            elsn listIterator = this.c.f(str).listIterator();
            while (listIterator.hasNext()) {
                elgjVar.i(((cyse) listIterator.next()).b);
            }
        } else {
            elgo g = g();
            int i2 = ((elpg) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                String str2 = (String) g.get(i3);
                if (str.equals(cyru.c(str2))) {
                    elgjVar.i(cyrx.a(str2.split(":", -1)[0]));
                }
            }
        }
        return elgjVar.g();
    }

    @Override // defpackage.apzu, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Map map;
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (!cyrx.b() || ekvk.c(schemeSpecificPart)) {
            return;
        }
        if (!fuib.j()) {
            elgo g = g();
            int i = ((elpg) g).c;
            int i2 = 0;
            while (i2 < i) {
                boolean equals = schemeSpecificPart.equals(cyru.c((String) g.get(i2)));
                i2++;
                if (equals) {
                }
            }
            return;
        }
        cysg cysgVar = this.c;
        if (ekvk.c(schemeSpecificPart) || (map = cysgVar.a) == null || !map.containsKey(schemeSpecificPart)) {
            return;
        }
        super.onHandleIntent(intent);
    }
}
