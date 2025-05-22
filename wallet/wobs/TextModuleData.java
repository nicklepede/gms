package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dluv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dluv();
    public String a;
    public String b;

    TextModuleData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }

    public TextModuleData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
