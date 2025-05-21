package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.p;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.cache.r;
import com.google.android.gms.ads.cache.s;
import defpackage.arwm;
import defpackage.bry;
import defpackage.eiif;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f {
    public static Map a(List list) {
        String str;
        String a;
        bry bryVar = new bry();
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
                String b = eiif.c(str5) ? com.google.android.gms.ads.cache.h.b(str) : com.google.android.gms.ads.cache.h.b(str5);
                if (b == null) {
                    a = com.google.android.gms.ads.cache.h.a(str2, str3, str4);
                } else {
                    arwm.s(str2);
                    arwm.s(str3);
                    arwm.s(str4);
                    a = defpackage.a.ad(b, str4, new StringBuilder(), str3, str2);
                }
            }
            bryVar.put(a, sVar);
        }
        return bryVar;
    }
}
