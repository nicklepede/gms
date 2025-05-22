package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cupd;
import defpackage.cupe;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GiftCardOcrResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cupd();
    public final List a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public GiftCardOcrResult(cupe cupeVar) {
        this.a = cupeVar.a;
        this.b = cupeVar.b;
        this.c = cupeVar.c;
        this.d = cupeVar.d;
        this.e = cupeVar.e;
        this.f = cupeVar.f;
        this.g = cupeVar.g;
        this.h = cupeVar.h;
        this.i = cupeVar.i;
        this.j = cupeVar.j;
    }

    public final cupe a() {
        cupe cupeVar = new cupe();
        cupeVar.a = this.a;
        cupeVar.b = this.b;
        cupeVar.c = this.c;
        cupeVar.d = this.d;
        cupeVar.e = this.e;
        cupeVar.f = this.f;
        cupeVar.g = this.g;
        cupeVar.h = this.h;
        cupeVar.i = this.i;
        cupeVar.j = this.j;
        return cupeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
    }

    public GiftCardOcrResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readStringList(arrayList);
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
    }
}
