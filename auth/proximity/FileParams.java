package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aefa;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FileParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aefa();
    public final String a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final long d;

    public FileParams(String str, String str2, ParcelFileDescriptor parcelFileDescriptor, long j) {
        this.a = str;
        this.b = str2;
        this.c = parcelFileDescriptor;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
