package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.eitj;
import defpackage.xtt;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountCredentialSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xtt();
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public AccountCredentialSettings(boolean z, boolean z2, List list, boolean z3) {
        this.a = z;
        this.b = z2;
        arwm.s(list);
        this.c = eitj.i(list);
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.x(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
