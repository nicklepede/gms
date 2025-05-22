package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmxu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PrivacyRecordOptinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmxu();
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public PrivacyRecordOptinRequest(String str, int i, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
