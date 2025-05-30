package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cepf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cepf();
    public final String a;
    public final String b;

    @Deprecated
    public final Account c;

    public FileGroupRequest(String str, String str2, Account account) {
        this.a = str;
        this.b = str2;
        this.c = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
