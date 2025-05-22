package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abdf;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abdf();
    public final PendingIntent a;

    public SavePasswordResult(PendingIntent pendingIntent) {
        atzb.s(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return atyq.b(this.a, ((SavePasswordResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, pendingIntent, i, false);
        atzr.c(parcel, a);
    }
}
