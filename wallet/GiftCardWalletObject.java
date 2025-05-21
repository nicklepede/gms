package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.arxc;
import defpackage.didp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didp();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.q(parcel, 6, this.e);
        arxc.v(parcel, 7, this.f, false);
        arxc.q(parcel, 8, this.g);
        arxc.v(parcel, 9, this.h, false);
        arxc.c(parcel, a);
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
