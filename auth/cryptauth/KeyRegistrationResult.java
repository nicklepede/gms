package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaqg;
import defpackage.arxc;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class KeyRegistrationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaqg();
    final int a;
    public final Status b;
    public final byte[] c;
    public final List d;

    public KeyRegistrationResult(int i, Status status, byte[] bArr, List list) {
        this.a = i;
        this.b = status;
        this.c = bArr;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public KeyRegistrationResult(Status status, byte[] bArr, List list) {
        this(1, status, bArr, list);
    }
}
