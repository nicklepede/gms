package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abcm;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.elgo;
import defpackage.elpg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FetchVerifiedPhoneNumbersResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abcm();
    public final List a;
    public final String b;
    public final int c;

    public FetchVerifiedPhoneNumbersResult(List list, String str, int i) {
        atzb.s(list);
        this.a = list;
        this.b = str;
        this.c = i;
    }

    public static FetchVerifiedPhoneNumbersResult a() {
        int i = elgo.d;
        return new FetchVerifiedPhoneNumbersResult(elpg.a, null, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.x(parcel, 1, list, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
