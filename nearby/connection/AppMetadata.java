package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cfdx;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfdx();
    public final List a;

    public AppMetadata(List list) {
        arwm.t(list, "Must specify application identifiers");
        this.a = list;
        arwm.v(list.size(), "Application identifiers cannot be empty");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.c(parcel, a);
    }
}
