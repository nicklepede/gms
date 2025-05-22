package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wln;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class Oauth2TokenMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wln();
    public final Long a;
    public final List b;

    public Oauth2TokenMetadata(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = atzr.a(parcel);
        atzr.I(parcel, 1, l);
        atzr.x(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
