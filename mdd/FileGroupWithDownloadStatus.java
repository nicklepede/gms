package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ccgn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FileGroupWithDownloadStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccgn();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.d);
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
