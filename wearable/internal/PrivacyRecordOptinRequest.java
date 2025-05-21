package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkmb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PrivacyRecordOptinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmb();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
