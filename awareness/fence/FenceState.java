package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class FenceState extends AbstractSafeParcelable {
    public static int a(boolean z) {
        return z ? 2 : 1;
    }

    public abstract int b();

    public abstract String c();
}
