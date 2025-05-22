package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.wjk;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wjk();
    final int a;
    public final List b;

    public AccountChangeEventsResponse(List list) {
        this.a = 1;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.y(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        atzb.s(list);
        this.b = list;
    }
}
