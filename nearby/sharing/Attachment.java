package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cllj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class Attachment extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract Bundle d();

    public abstract cllj f();

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
