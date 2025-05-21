package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.asws;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new asws();
    public final String a;
    public final long b;
    public final IdTokenRequest c;
    public final Bundle d;
    public final List e;
    public final boolean f;
    public final int g;
    public final List h;

    public VerifyPhoneNumberRequest(String str, long j, IdTokenRequest idTokenRequest, Bundle bundle, List list, boolean z, int i, List list2) {
        this.a = str;
        this.b = j;
        this.c = idTokenRequest;
        this.d = bundle;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.y(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.E(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
