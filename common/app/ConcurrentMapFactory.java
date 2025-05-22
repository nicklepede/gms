package com.google.android.gms.common.app;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
final class ConcurrentMapFactory {
    private ConcurrentMapFactory() {
    }

    static ConcurrentMap newConcurrentHashMap() {
        return new ConcurrentHashMap();
    }
}
