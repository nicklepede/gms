package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczd;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class OtpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aczd();
    final int a;
    public final String b;
    public final AppDescription c;
    public final byte[] d;
    public final boolean e;

    public OtpRequest(int i, String str, AppDescription appDescription, byte[] bArr, boolean z) {
        this.a = i;
        this.b = str;
        this.d = bArr;
        atzb.t(appDescription, "Caller's app description cannot be null!");
        this.c = appDescription;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
