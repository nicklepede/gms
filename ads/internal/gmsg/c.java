package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.client.h;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class c implements e {
    @Override // com.google.android.gms.ads.internal.gmsg.e
    public final void a(Object obj, Map map) {
        String valueOf = String.valueOf((String) map.get("string"));
        int i = com.google.android.gms.ads.internal.util.c.a;
        h.i("Received log message: ".concat(valueOf));
    }
}
