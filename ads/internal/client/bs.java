package com.google.android.gms.ads.internal.client;

import defpackage.tbv;
import defpackage.tdi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bs {
    private static bs b;
    public final tdi a = new tdi(new ArrayList());

    static {
        new HashSet(Arrays.asList(tbv.APP_OPEN_AD, tbv.INTERSTITIAL, tbv.REWARDED));
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
