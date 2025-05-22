package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czmu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AccountState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czmu();
    public final boolean[] a;
    public final boolean[] b;

    public AccountState(boolean[] zArr, boolean[] zArr2) {
        this.a = zArr;
        this.b = zArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean[] zArr = this.a;
        int a = atzr.a(parcel);
        atzr.f(parcel, 2, zArr, false);
        atzr.f(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
