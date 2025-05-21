package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.asqx;
import defpackage.bacg;
import defpackage.eprv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ContactPickerOptionsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bacg();
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

    public ContactPickerOptionsData(eprv eprvVar) {
        this.a = eprvVar.b;
        this.b = eprvVar.c;
        this.i = eprvVar.d;
        this.j = eprvVar.e;
        this.k = eprvVar.f;
        this.c = eprvVar.g;
        this.d = eprvVar.h;
        this.e = eprvVar.i;
        this.f = eprvVar.j;
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
        this.a = asqx.c(parcel.readString());
        this.b = asqx.c(parcel.readString());
        this.i = asqx.c(parcel.readString());
        this.j = asqx.c(parcel.readString());
        this.k = asqx.c(parcel.readString());
        this.c = asqx.c(parcel.readString());
        this.d = asqx.c(parcel.readString());
        this.e = asqx.c(parcel.readString());
        this.f = asqx.c(parcel.readString());
        this.g = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        this.h = createIntArray == null ? new int[0] : createIntArray;
    }
}
