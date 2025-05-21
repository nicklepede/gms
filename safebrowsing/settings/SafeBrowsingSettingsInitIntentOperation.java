package com.google.android.gms.safebrowsing.settings;

import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.anya;
import defpackage.asng;
import defpackage.asqh;
import defpackage.fuvb;
import defpackage.fuwt;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SafeBrowsingSettingsInitIntentOperation extends anya {
    private static final String a;
    private static final List b;
    private static final List c;
    private static final List d;

    static {
        int i = fvcc.a;
        a = new fvbi(SafeBrowsingSettingsInitIntentOperation.class).c();
        List f = fuwt.f("AdvancedSecurity", "AdvancedSecuritySafetyCenter", "AdvancedSettings");
        b = f;
        List b2 = fuwt.b("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivity");
        ArrayList arrayList = new ArrayList(fuwt.o(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivity".concat(String.valueOf((String) it.next())));
        }
        c = fuwt.X(b2, arrayList);
        d = fuwt.f("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivitySecurity", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSettings", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSecurity", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSecuritySafetyCenter");
    }

    private final void e(String str) {
        g(str, 2);
    }

    private final void f(String str) {
        g(str, 1);
    }

    private final void g(String str, int i) {
        try {
            if (Integer.valueOf(asng.a(this, str)).equals(Integer.valueOf(i))) {
                return;
            }
            asng.M(str, i);
        } catch (Exception unused) {
            Log.e(a, a.n(i, str, "Exception toggling ", " enabled state to "));
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            return;
        }
        if (!asqh.c()) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                e((String) it.next());
            }
            return;
        }
        List list = d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (fuwt.f("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSettings", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivitySecurity").contains((String) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        fuvb fuvbVar = new fuvb(arrayList, arrayList2);
        Object obj2 = fuvbVar.a;
        List list2 = (List) fuvbVar.b;
        f("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivity");
        Iterator it2 = ((List) obj2).iterator();
        while (it2.hasNext()) {
            f((String) it2.next());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            e((String) it3.next());
        }
    }
}
