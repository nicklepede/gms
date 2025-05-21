package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfbt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SettingsLookupResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfbt();
    public final int a;
    public final boolean b;

    public SettingsLookupResult(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public SettingsLookupResult(boolean z) {
        this.a = 1;
        this.b = z;
    }
}
