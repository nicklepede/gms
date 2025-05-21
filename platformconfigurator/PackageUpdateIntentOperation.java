package com.google.android.gms.platformconfigurator;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.platformconfigurator.PackageUpdateIntentOperation;
import defpackage.anyc;
import defpackage.asej;
import defpackage.asot;
import defpackage.cwhx;
import defpackage.cwia;
import defpackage.cwig;
import defpackage.cwih;
import defpackage.cwij;
import defpackage.eiho;
import defpackage.eiif;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejfg;
import defpackage.ejhf;
import defpackage.froa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PackageUpdateIntentOperation extends anyc {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("PlatformConfigurator", asej.PLATFORM_CONFIGURATOR);
    private final cwij c;

    public PackageUpdateIntentOperation() {
        super(false);
        this.c = cwij.b();
    }

    private static eitj g() {
        eite eiteVar = new eite();
        eiteVar.k(froa.a.a().f().b);
        eiteVar.k(froa.a.a().e().b);
        return eiteVar.g();
    }

    @Override // defpackage.anyc
    protected final void a(String str, Intent intent) {
        final eiuu f = this.c.f(str);
        try {
            new cwig().a(new eiho() { // from class: cwib
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = PackageUpdateIntentOperation.a;
                    HashMap hashMap = new HashMap((eits) obj);
                    ejfg listIterator = eiuu.this.listIterator();
                    while (listIterator.hasNext()) {
                        hashMap.remove(((cwih) listIterator.next()).a);
                    }
                    return eits.k(hashMap);
                }
            });
        } catch (InterruptedException | ExecutionException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 8798)).x("failed to invalidate namespace registration data, check PersistedNamespaceListProtoDataStore configuration.");
        }
    }

    @Override // defpackage.anyc
    protected final void b(String str) {
        eitj f = f(str);
        int i = ((ejcb) f).c;
        for (int i2 = 0; i2 < i; i2++) {
            cwhx.f((String) f.get(i2), str, this);
        }
    }

    @Override // defpackage.anyc
    protected final void d(String str, Intent intent) {
        eitj f = f(str);
        int i = ((ejcb) f).c;
        for (int i2 = 0; i2 < i; i2++) {
            cwhx.f((String) f.get(i2), str, this);
        }
    }

    final eitj f(String str) {
        if (str.isEmpty()) {
            int i = eitj.d;
            return ejcb.a;
        }
        eite eiteVar = new eite();
        if (froa.j()) {
            ejfg listIterator = this.c.f(str).listIterator();
            while (listIterator.hasNext()) {
                eiteVar.i(((cwih) listIterator.next()).b);
            }
        } else {
            eitj g = g();
            int i2 = ((ejcb) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                String str2 = (String) g.get(i3);
                if (str.equals(cwhx.c(str2))) {
                    eiteVar.i(cwia.a(str2.split(":", -1)[0]));
                }
            }
        }
        return eiteVar.g();
    }

    @Override // defpackage.anyc, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Map map;
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (!cwia.b() || eiif.c(schemeSpecificPart)) {
            return;
        }
        if (!froa.j()) {
            eitj g = g();
            int i = ((ejcb) g).c;
            int i2 = 0;
            while (i2 < i) {
                boolean equals = schemeSpecificPart.equals(cwhx.c((String) g.get(i2)));
                i2++;
                if (equals) {
                }
            }
            return;
        }
        cwij cwijVar = this.c;
        if (eiif.c(schemeSpecificPart) || (map = cwijVar.a) == null || !map.containsKey(schemeSpecificPart)) {
            return;
        }
        super.onHandleIntent(intent);
    }
}
