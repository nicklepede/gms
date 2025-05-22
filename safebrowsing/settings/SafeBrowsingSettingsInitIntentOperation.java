package com.google.android.gms.safebrowsing.settings;

import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.apzs;
import defpackage.aura;
import defpackage.auub;
import defpackage.fxqz;
import defpackage.fxsr;
import defpackage.fxto;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingSettingsInitIntentOperation extends apzs {
    private static final String a;
    private static final List b;
    private static final List c;
    private static final List d;

    static {
        int i = fxya.a;
        a = new fxxg(SafeBrowsingSettingsInitIntentOperation.class).c();
        List f = fxsr.f("AdvancedSecurity", "AdvancedSecuritySafetyCenter", "AdvancedSettings", "AapmUnused");
        b = f;
        List b2 = fxsr.b("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivity");
        ArrayList arrayList = new ArrayList(fxsr.o(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivity".concat(String.valueOf((String) it.next())));
        }
        c = fxsr.X(b2, arrayList);
        d = fxsr.f("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivitySecurity", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSettings", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSecurity", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSecuritySafetyCenter", "com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAapm");
    }

    private final void e(String str) {
        g(str, 2);
    }

    private final void f(String str) {
        g(str, 1);
    }

    private final void g(String str, int i) {
        try {
            if (Integer.valueOf(aura.a(this, str)).equals(Integer.valueOf(i))) {
                return;
            }
            aura.M(str, i);
        } catch (Exception unused) {
            Log.e(a, a.n(i, str, "Exception toggling ", " enabled state to "));
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            return;
        }
        if (!auub.c()) {
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
            fxto fxtoVar = new fxto((byte[]) null);
            fxtoVar.add("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivityAdvancedSettings");
            fxtoVar.add("com.google.android.gms.safebrowsing.settings.SafeBrowsingSettingsActivitySecurity");
            if (fxsr.a(fxtoVar).contains((String) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        fxqz fxqzVar = new fxqz(arrayList, arrayList2);
        Object obj2 = fxqzVar.a;
        List list2 = (List) fxqzVar.b;
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
