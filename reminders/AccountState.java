package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxcy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AccountState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxcy();
    public final boolean[] a;
    public final boolean[] b;

    public AccountState(boolean[] zArr, boolean[] zArr2) {
        this.a = zArr;
        this.b = zArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean[] zArr = this.a;
        int a = arxc.a(parcel);
        arxc.f(parcel, 2, zArr, false);
        arxc.f(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
