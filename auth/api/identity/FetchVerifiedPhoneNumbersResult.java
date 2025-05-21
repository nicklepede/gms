package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.zcr;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FetchVerifiedPhoneNumbersResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcr();
    public final List a;
    public final String b;
    public final int c;

    public FetchVerifiedPhoneNumbersResult(List list, String str, int i) {
        arwm.s(list);
        this.a = list;
        this.b = str;
        this.c = i;
    }

    public static FetchVerifiedPhoneNumbersResult a() {
        int i = eitj.d;
        return new FetchVerifiedPhoneNumbersResult(ejcb.a, null, 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
