package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dfqa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class VerificationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfqa();
    public String a;
    public final int b;
    public boolean c;

    public VerificationInfo(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.o(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public VerificationInfo(String str, int i) {
        this(str, i, false);
    }
}
