package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ceqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class OverrideFileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceqn();
    public final String a;
    public final String b;
    public final String[] c;
    public final String[] d;
    public final ParcelFileDescriptor[] e;
    public final Account f;

    public OverrideFileGroupRequest(String str, String str2, String[] strArr, String[] strArr2, ParcelFileDescriptor[] parcelFileDescriptorArr, Account account) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
        this.e = parcelFileDescriptorArr;
        this.f = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.w(parcel, 4, this.d, false);
        atzr.J(parcel, 5, this.e, i);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }
}
