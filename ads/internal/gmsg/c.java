package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.client.h;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class c implements e {
    @Override // com.google.android.gms.ads.internal.gmsg.e
    public final void a(Object obj, Map map) {
        String valueOf = String.valueOf((String) map.get("string"));
        int i = com.google.android.gms.ads.internal.util.c.a;
        h.i("Received log message: ".concat(valueOf));
    }
}
