package com.google.android.gms.accountsettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.fxxm;
import defpackage.tjn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PrewarmingParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tjn();
    public final String a;
    public final byte[] b;
    public final int c;
    public final boolean d;

    public PrewarmingParameters(String str, byte[] bArr, int i, boolean z) {
        fxxm.f(str, "accountName");
        fxxm.f(bArr, "resourceKeyByteArray");
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
