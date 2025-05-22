package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.dfec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new dfec();
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.b == 0 ? Status.b : Status.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public AuthAccountResult() {
        this(0, null);
    }

    public AuthAccountResult(int i, Intent intent) {
        this(2, i, intent);
    }
}
