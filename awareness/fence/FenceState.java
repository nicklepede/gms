package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class FenceState extends AbstractSafeParcelable {
    public static int a(boolean z) {
        return z ? 2 : 1;
    }

    public abstract int b();

    public abstract String c();
}
