package com.google.android.gms.appset.appremoval;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.fmqs;
import defpackage.wcp;
import defpackage.wdj;
import defpackage.wdq;
import defpackage.wdu;
import defpackage.wfe;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppRemovedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Uri data;
        final String schemeSpecificPart;
        AppContextProvider.a();
        if (fmqs.a.lK().l() && "android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction()) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
            final Context a = AppContextProvider.a();
            final wdj b = wdj.b(a);
            final wdq wdqVar = new wdq(new wdu(a, getClass().getName()));
            eqgc.t(b.c.c(new eqdv() { // from class: wcw
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    wen wenVar = (wen) obj;
                    final fgrc fgrcVar = (fgrc) wenVar.iQ(5, null);
                    fgrcVar.X(wenVar);
                    String str = schemeSpecificPart;
                    wei bd = fgrcVar.bd(str, wei.a);
                    if ((bd.b & 1) == 0) {
                        return eqgc.i(wenVar);
                    }
                    fgrcVar.bi(str);
                    final String str2 = bd.c;
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((wen) fgrcVar.b).c)).keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(wdqVar.a((String) it.next()));
                    }
                    final Context context = a;
                    final wdj wdjVar = wdj.this;
                    return eqgc.a(arrayList).a(new Callable() { // from class: wcy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            fgrc fgrcVar2;
                            String str3;
                            Iterator it2 = arrayList.iterator();
                            do {
                                fgrcVar2 = fgrcVar;
                                str3 = str2;
                                if (!it2.hasNext()) {
                                    Context context2 = context;
                                    wdj.this.a.b(context2, str3);
                                    fgrcVar2.bj(str3);
                                    if (fmqs.h()) {
                                        d.d(context2, "PvidReset", "PVID reset because all apps with that PVID were uninstalled from the device.");
                                    }
                                    for (Map.Entry entry : DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((wen) fgrcVar2.b).c)).entrySet()) {
                                        if (str3.equals(((wei) entry.getValue()).c)) {
                                            fgrcVar2.bi((String) entry.getKey());
                                        }
                                    }
                                    return (wen) fgrcVar2.Q();
                                }
                            } while (!str3.equals(((wdr) eqgc.r((eqgl) it2.next())).a));
                            return (wen) fgrcVar2.Q();
                        }
                    }, wdjVar.b);
                }
            }, b.b), new wcp(a, wdqVar), wfe.a());
        }
    }
}
