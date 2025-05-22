package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.elgo;
import defpackage.zrq;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountCredentialSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zrq();
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public AccountCredentialSettings(boolean z, boolean z2, List list, boolean z3) {
        this.a = z;
        this.b = z2;
        atzb.s(list);
        this.c = elgo.i(list);
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.x(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
