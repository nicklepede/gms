package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazx;
import defpackage.aszm;
import defpackage.aszo;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FidoInternalApiOptions extends AbstractSafeParcelable implements aszm, aszo {
    public static final Parcelable.Creator CREATOR = new aazx();

    public final boolean equals(Object obj) {
        return obj instanceof FidoInternalApiOptions;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{FidoInternalApiOptions.class});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzr.c(parcel, atzr.a(parcel));
    }
}
