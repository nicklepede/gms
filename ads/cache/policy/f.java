package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.p;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.cache.r;
import com.google.android.gms.ads.cache.s;
import defpackage.atzb;
import defpackage.bsj;
import defpackage.ekvk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f {
    public static Map a(List list) {
        String str;
        String a;
        bsj bsjVar = new bsj();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            String str2 = sVar.c;
            com.google.android.gms.ads.cache.m mVar = sVar.d;
            if (mVar == null) {
                mVar = com.google.android.gms.ads.cache.m.a;
            }
            String str3 = mVar.c;
            com.google.android.gms.ads.cache.m mVar2 = sVar.d;
            if (mVar2 == null) {
                mVar2 = com.google.android.gms.ads.cache.m.a;
            }
            String str4 = mVar2.d;
            r rVar = sVar.e;
            if (rVar == null) {
                rVar = r.a;
            }
            String str5 = rVar.c;
            q qVar = sVar.f;
            if (qVar == null) {
                qVar = q.a;
            }
            Iterator it2 = qVar.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = null;
                    break;
                }
                p pVar = (p) it2.next();
                if (pVar.c.equals("check_url")) {
                    str = pVar.d;
                    break;
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.config.p.aq.g()).booleanValue() || (str5 == null && str == null)) {
                a = com.google.android.gms.ads.cache.h.a(str2, str3, str4);
            } else {
                String b = ekvk.c(str5) ? com.google.android.gms.ads.cache.h.b(str) : com.google.android.gms.ads.cache.h.b(str5);
                if (b == null) {
                    a = com.google.android.gms.ads.cache.h.a(str2, str3, str4);
                } else {
                    atzb.s(str2);
                    atzb.s(str3);
                    atzb.s(str4);
                    a = defpackage.a.ae(b, str4, new StringBuilder(), str3, str2);
                }
            }
            bsjVar.put(a, sVar);
        }
        return bsjVar;
    }
}
