package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ceph;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FileGroupWithDownloadStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceph();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public FileGroupWithDownloadStatus(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.d);
        atzr.o(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}
