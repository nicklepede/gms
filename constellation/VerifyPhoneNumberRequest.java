package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avau;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new avau();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.g(parcel, 4, this.d, false);
        atzr.y(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.E(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
