package com.google.android.gms.ads.internal.client;

import defpackage.uxv;
import defpackage.uzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class bs {
    private static bs b;
    public final uzi a = new uzi(new ArrayList());

    static {
        new HashSet(Arrays.asList(uxv.APP_OPEN_AD, uxv.INTERSTITIAL, uxv.REWARDED));
    }

    private bs() {
        new ArrayList();
    }

    public static bs a() {
        bs bsVar;
        synchronized (bs.class) {
            if (b == null) {
                b = new bs();
            }
            bsVar = b;
        }
        return bsVar;
    }
}
