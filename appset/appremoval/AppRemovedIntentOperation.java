package com.google.android.gms.appset.appremoval;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.fkan;
import defpackage.ugq;
import defpackage.uhk;
import defpackage.uhr;
import defpackage.uhv;
import defpackage.ujf;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppRemovedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Uri data;
        final String schemeSpecificPart;
        AppContextProvider.a();
        if (fkan.a.a().l() && "android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction()) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
            final Context a = AppContextProvider.a();
            final uhk b = uhk.b(a);
            final uhr uhrVar = new uhr(new uhv(a, getClass().getName()));
            ensj.t(b.c.c(new enqc() { // from class: ugx
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    uio uioVar = (uio) obj;
                    final fecj fecjVar = (fecj) uioVar.iB(5, null);
                    fecjVar.X(uioVar);
                    String str = schemeSpecificPart;
                    uij bd = fecjVar.bd(str, uij.a);
                    if ((bd.b & 1) == 0) {
                        return ensj.i(uioVar);
                    }
                    fecjVar.bi(str);
                    final String str2 = bd.c;
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((uio) fecjVar.b).c)).keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(uhrVar.a((String) it.next()));
                    }
                    final Context context = a;
                    final uhk uhkVar = uhk.this;
                    return ensj.a(arrayList).a(new Callable() { // from class: ugz
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            fecj fecjVar2;
                            String str3;
                            Iterator it2 = arrayList.iterator();
                            do {
                                fecjVar2 = fecjVar;
                                str3 = str2;
                                if (!it2.hasNext()) {
                                    Context context2 = context;
                                    uhk.this.a.b(context2, str3);
                                    fecjVar2.bj(str3);
                                    if (fkan.h()) {
                                        d.d(context2, "PvidReset", "PVID reset because all apps with that PVID were uninstalled from the device.");
                                    }
                                    for (Map.Entry entry : DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((uio) fecjVar2.b).c)).entrySet()) {
                                        if (str3.equals(((uij) entry.getValue()).c)) {
                                            fecjVar2.bi((String) entry.getKey());
                                        }
                                    }
                                    return (uio) fecjVar2.Q();
                                }
                            } while (!str3.equals(((uhs) ensj.r((enss) it2.next())).a));
                            return (uio) fecjVar2.Q();
                        }
                    }, uhkVar.b);
                }
            }, b.b), new ugq(a, uhrVar), ujf.a());
        }
    }
}
