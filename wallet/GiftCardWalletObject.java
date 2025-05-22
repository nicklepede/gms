package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.atzr;
import defpackage.dkpa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpa();
    public final CommonWalletObject a;
    public String b;
    public String c;

    @Deprecated
    String d;
    public long e;
    public String f;
    public long g;
    public String h;

    GiftCardWalletObject() {
        this.a = CommonWalletObject.a().a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.q(parcel, 6, this.e);
        atzr.v(parcel, 7, this.f, false);
        atzr.q(parcel, 8, this.g);
        atzr.v(parcel, 9, this.h, false);
        atzr.c(parcel, a);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.a();
        this.a = commonWalletObject;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.f = str4;
        this.g = j2;
        this.h = str5;
        this.d = str3;
    }
}
