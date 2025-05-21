package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.unl;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new unl();
    final int a;
    public final List b;

    public AccountChangeEventsResponse(List list) {
        this.a = 1;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.y(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        arwm.s(list);
        this.b = list;
    }
}
