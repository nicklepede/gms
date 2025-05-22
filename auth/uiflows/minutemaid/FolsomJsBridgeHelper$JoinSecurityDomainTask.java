package com.google.android.gms.auth.uiflows.minutemaid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.afmv;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomJsBridgeHelper$JoinSecurityDomainTask extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afmv();
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public FolsomJsBridgeHelper$JoinSecurityDomainTask(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
