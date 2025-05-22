package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.auur;
import defpackage.bcgc;
import defpackage.esfu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ContactPickerOptionsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bcgc();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public int g;
    public int[] h;
    private final String i;
    private final String j;
    private final String k;

    public ContactPickerOptionsData(esfu esfuVar) {
        this.a = esfuVar.b;
        this.b = esfuVar.c;
        this.i = esfuVar.d;
        this.j = esfuVar.e;
        this.k = esfuVar.f;
        this.c = esfuVar.g;
        this.d = esfuVar.h;
        this.e = esfuVar.i;
        this.f = esfuVar.j;
    }

    public final void a(int[] iArr) {
        this.h = Arrays.copyOf(iArr, 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeIntArray(this.h);
    }

    public ContactPickerOptionsData(Parcel parcel) {
        this.a = auur.c(parcel.readString());
        this.b = auur.c(parcel.readString());
        this.i = auur.c(parcel.readString());
        this.j = auur.c(parcel.readString());
        this.k = auur.c(parcel.readString());
        this.c = auur.c(parcel.readString());
        this.d = auur.c(parcel.readString());
        this.e = auur.c(parcel.readString());
        this.f = auur.c(parcel.readString());
        this.g = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        this.h = createIntArray == null ? new int[0] : createIntArray;
    }
}
