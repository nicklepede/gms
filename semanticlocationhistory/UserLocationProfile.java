package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dcnj;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class UserLocationProfile extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcnj();
    public final List a;
    public final List b;
    public final Persona c;
    public final long d;

    public UserLocationProfile(List list, List list2, Persona persona, long j) {
        this.a = list;
        this.b = list2;
        this.c = persona;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
