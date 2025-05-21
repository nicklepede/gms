package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.dcsx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new dcsx();
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.b == 0 ? Status.b : Status.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public AuthAccountResult() {
        this(0, null);
    }

    public AuthAccountResult(int i, Intent intent) {
        this(2, i, intent);
    }
}
