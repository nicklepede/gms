package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cntr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class Attachment extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract Bundle d();

    public abstract cntr f();

    public boolean g() {
        return false;
    }

    public abstract int h();

    public final boolean i() {
        return h() == 5;
    }

    public final boolean j() {
        return h() == 2;
    }

    public final boolean k() {
        return h() == 6;
    }

    public final boolean l() {
        return h() == 3;
    }

    public final boolean m() {
        return h() == 4;
    }
}
