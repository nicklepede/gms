package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cucn;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cucn();
    public final int a;
    public final int b;
    public final boolean c;

    public ParcelableLoadImageOptions(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("imageSize", Integer.valueOf(this.a), arrayList);
        arwa.b("avatarOptions", Integer.valueOf(this.b), arrayList);
        arwa.b("useLargePictureForCp2Images", Boolean.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
