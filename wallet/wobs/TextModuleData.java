package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.djjc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djjc();
    public String a;
    public String b;

    TextModuleData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public TextModuleData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
