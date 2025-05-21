package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ccht;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OverrideFileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccht();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.w(parcel, 4, this.d, false);
        arxc.J(parcel, 5, this.e, i);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }
}
