package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaxy;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CheckFactoryResetPolicyComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaxy();
    final int a;

    @Deprecated
    public final boolean b;
    public final int c;

    public CheckFactoryResetPolicyComplianceResponse(int i, int i2) {
        this.a = i;
        this.b = i2 == 1;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
