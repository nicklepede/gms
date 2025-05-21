package com.google.android.gms.ads.config;

import android.os.Environment;
import com.google.android.gms.ads.internal.util.client.h;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class b {
    public static final String a = String.valueOf(Environment.getExternalStorageDirectory().getPath()).concat("/flags_override.cert");

    static final Date a(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() >= 2) {
            String str = (String) arrayList.get(arrayList.size() - 2);
            try {
                return new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str);
            } catch (ParseException unused) {
                String valueOf = String.valueOf(str);
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.f("Malformed flag override expiration date: ".concat(valueOf));
            }
        }
        return null;
    }

    static final List b(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() < 2) {
            return null;
        }
        return arrayList.subList(0, arrayList.size() - 2);
    }
}
