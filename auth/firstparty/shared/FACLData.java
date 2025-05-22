package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adao;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adao();
    final int a;
    public final FACLConfig b;
    public final String c;
    public final boolean d;
    final String e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.a = i;
        this.b = fACLConfig;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public FACLData(FACLConfig fACLConfig, String str, String str2, boolean z) {
        this.a = 1;
        this.b = fACLConfig;
        this.c = str;
        this.e = str2;
        this.d = z;
    }
}
