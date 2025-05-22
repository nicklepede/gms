package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wlb;
import defpackage.wlc;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wlc();
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;

    public GetAccountsRequest(String str, List list, List list2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public static wlb a() {
        wlb wlbVar = new wlb();
        wlbVar.b = (byte) 1;
        return wlbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.x(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
