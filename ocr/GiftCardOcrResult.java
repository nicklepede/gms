package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.csfy;
import defpackage.csfz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GiftCardOcrResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new csfy();
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

    public GiftCardOcrResult(csfz csfzVar) {
        this.a = csfzVar.a;
        this.b = csfzVar.b;
        this.c = csfzVar.c;
        this.d = csfzVar.d;
        this.e = csfzVar.e;
        this.f = csfzVar.f;
        this.g = csfzVar.g;
        this.h = csfzVar.h;
        this.i = csfzVar.i;
        this.j = csfzVar.j;
    }

    public final csfz a() {
        csfz csfzVar = new csfz();
        csfzVar.a = this.a;
        csfzVar.b = this.b;
        csfzVar.c = this.c;
        csfzVar.d = this.d;
        csfzVar.e = this.e;
        csfzVar.f = this.f;
        csfzVar.g = this.g;
        csfzVar.h = this.h;
        csfzVar.i = this.i;
        csfzVar.j = this.j;
        return csfzVar;
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
