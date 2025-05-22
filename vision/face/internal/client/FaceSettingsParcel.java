package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkno;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkno();
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    public FaceSettingsParcel() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.e(parcel, 5, this.d);
        atzr.e(parcel, 6, this.e);
        atzr.l(parcel, 7, this.f);
        atzr.c(parcel, a);
    }

    public FaceSettingsParcel(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = f;
    }
}
