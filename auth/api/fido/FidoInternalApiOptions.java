package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqwx;
import defpackage.aqwz;
import defpackage.arxc;
import defpackage.zah;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FidoInternalApiOptions extends AbstractSafeParcelable implements aqwx, aqwz {
    public static final Parcelable.Creator CREATOR = new zah();

    public final boolean equals(Object obj) {
        return obj instanceof FidoInternalApiOptions;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{FidoInternalApiOptions.class});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arxc.c(parcel, arxc.a(parcel));
    }
}
