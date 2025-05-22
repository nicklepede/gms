package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acqg;
import defpackage.atzr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class KeyRegistrationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acqg();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public KeyRegistrationResult(Status status, byte[] bArr, List list) {
        this(1, status, bArr, list);
    }
}
