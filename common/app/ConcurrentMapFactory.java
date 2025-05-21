package com.google.android.gms.common.app;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
final class ConcurrentMapFactory {
    private ConcurrentMapFactory() {
    }

    static ConcurrentMap newConcurrentHashMap() {
        return new ConcurrentHashMap();
    }
}
