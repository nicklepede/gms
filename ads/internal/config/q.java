package com.google.android.gms.ads.internal.config;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.flag.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class q {
    public static List a() {
        ArrayList arrayList = new ArrayList();
        b(arrayList, u.a);
        return arrayList;
    }

    public static void b(List list, com.google.android.gms.ads.internal.flag.a aVar) {
        String str = (String) aVar.d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
