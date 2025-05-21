package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.dipy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SecurePaymentsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dipy();
    public final int a;
    public final String b;

    public SecurePaymentsData(int i, String str) {
        this.a = i;
        this.b = str;
        arwm.c(i > 0, "SecurePaymentsData.key must be > 0");
        arwm.c(str != null, "SecurePaymentsData.value must not be null");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
