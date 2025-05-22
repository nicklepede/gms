package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dfjf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ManagedAccountSetupInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfjf();
    public final String a;
    public final int b;
    public final String c;

    public ManagedAccountSetupInfo(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
